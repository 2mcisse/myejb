/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.BudTyperetenues;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.BudTyperetenues_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Compte;
import com.cdc.ejb.entities.BudRetenues;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class BudTyperetenuesFacade extends AbstractFacade<BudTyperetenues> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudTyperetenuesFacade() {
        super(BudTyperetenues.class);
    }

    public boolean isNumeroCompteEmpty(BudTyperetenues entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudTyperetenues> budTyperetenues = cq.from(BudTyperetenues.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budTyperetenues, entity), cb.isNotNull(budTyperetenues.get(BudTyperetenues_.numeroCompte)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Compte findNumeroCompte(BudTyperetenues entity) {
        return this.getMergedEntity(entity).getNumeroCompte();
    }

    public boolean isBudRetenuesListEmpty(BudTyperetenues entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudTyperetenues> budTyperetenues = cq.from(BudTyperetenues.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budTyperetenues, entity), cb.isNotEmpty(budTyperetenues.get(BudTyperetenues_.budRetenuesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<BudRetenues> findBudRetenuesList(BudTyperetenues entity) {
        BudTyperetenues mergedEntity = this.getMergedEntity(entity);
        List<BudRetenues> budRetenuesList = mergedEntity.getBudRetenuesList();
        budRetenuesList.size();
        return budRetenuesList;
    }
    
}
