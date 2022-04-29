/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.DecTitredeperception;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.DecTitredeperception_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.DecReception;
import com.cdc.ejb.entities.DecNatureoperation;
import com.cdc.ejb.entities.DecAffaires;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DecTitredeperceptionFacade extends AbstractFacade<DecTitredeperception> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DecTitredeperceptionFacade() {
        super(DecTitredeperception.class);
    }

    public boolean isIDDECReceptionEmpty(DecTitredeperception entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecTitredeperception> decTitredeperception = cq.from(DecTitredeperception.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decTitredeperception, entity), cb.isNotNull(decTitredeperception.get(DecTitredeperception_.iDDECReception)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecReception findIDDECReception(DecTitredeperception entity) {
        return this.getMergedEntity(entity).getIDDECReception();
    }

    public boolean isIdnatureoperationEmpty(DecTitredeperception entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecTitredeperception> decTitredeperception = cq.from(DecTitredeperception.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decTitredeperception, entity), cb.isNotNull(decTitredeperception.get(DecTitredeperception_.idnatureoperation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecNatureoperation findIdnatureoperation(DecTitredeperception entity) {
        return this.getMergedEntity(entity).getIdnatureoperation();
    }

    public boolean isIdaffairesEmpty(DecTitredeperception entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecTitredeperception> decTitredeperception = cq.from(DecTitredeperception.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decTitredeperception, entity), cb.isNotNull(decTitredeperception.get(DecTitredeperception_.idaffaires)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecAffaires findIdaffaires(DecTitredeperception entity) {
        return this.getMergedEntity(entity).getIdaffaires();
    }
    
}
