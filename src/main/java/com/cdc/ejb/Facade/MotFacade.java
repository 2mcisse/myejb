/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Mot;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Mot_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Index;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class MotFacade extends AbstractFacade<Mot> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MotFacade() {
        super(Mot.class);
    }

    public boolean isIndexListEmpty(Mot entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Mot> mot = cq.from(Mot.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(mot, entity), cb.isNotEmpty(mot.get(Mot_.indexList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Index> findIndexList(Mot entity) {
        Mot mergedEntity = this.getMergedEntity(entity);
        List<Index> indexList = mergedEntity.getIndexList();
        indexList.size();
        return indexList;
    }
    
}
