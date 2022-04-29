/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Bdo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Bdo_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.LigneBdo;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class BdoFacade extends AbstractFacade<Bdo> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BdoFacade() {
        super(Bdo.class);
    }

    public boolean isLigneBdoListEmpty(Bdo entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Bdo> bdo = cq.from(Bdo.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(bdo, entity), cb.isNotEmpty(bdo.get(Bdo_.ligneBdoList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<LigneBdo> findLigneBdoList(Bdo entity) {
        Bdo mergedEntity = this.getMergedEntity(entity);
        List<LigneBdo> ligneBdoList = mergedEntity.getLigneBdoList();
        ligneBdoList.size();
        return ligneBdoList;
    }
    
}
