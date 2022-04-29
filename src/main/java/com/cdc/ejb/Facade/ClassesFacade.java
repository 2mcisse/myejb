/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Classes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Classes_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Compte;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class ClassesFacade extends AbstractFacade<Classes> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClassesFacade() {
        super(Classes.class);
    }

    public boolean isCompteListEmpty(Classes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Classes> classes = cq.from(Classes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(classes, entity), cb.isNotEmpty(classes.get(Classes_.compteList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Compte> findCompteList(Classes entity) {
        Classes mergedEntity = this.getMergedEntity(entity);
        List<Compte> compteList = mergedEntity.getCompteList();
        compteList.size();
        return compteList;
    }
    
}
