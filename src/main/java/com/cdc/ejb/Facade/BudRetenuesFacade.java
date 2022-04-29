/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.BudRetenues;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.BudRetenues_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.BudLiquidation;
import com.cdc.ejb.entities.BudTyperetenues;
import com.cdc.ejb.entities.Ordresdepaiement;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class BudRetenuesFacade extends AbstractFacade<BudRetenues> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudRetenuesFacade() {
        super(BudRetenues.class);
    }

    public boolean isIDBUDLiquidationEmpty(BudRetenues entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudRetenues> budRetenues = cq.from(BudRetenues.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budRetenues, entity), cb.isNotNull(budRetenues.get(BudRetenues_.iDBUDLiquidation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudLiquidation findIDBUDLiquidation(BudRetenues entity) {
        return this.getMergedEntity(entity).getIDBUDLiquidation();
    }

    public boolean isIDBUDTypeRetenuesEmpty(BudRetenues entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudRetenues> budRetenues = cq.from(BudRetenues.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budRetenues, entity), cb.isNotNull(budRetenues.get(BudRetenues_.iDBUDTypeRetenues)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudTyperetenues findIDBUDTypeRetenues(BudRetenues entity) {
        return this.getMergedEntity(entity).getIDBUDTypeRetenues();
    }

    public boolean isIDOrdresDePaiementEmpty(BudRetenues entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudRetenues> budRetenues = cq.from(BudRetenues.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budRetenues, entity), cb.isNotNull(budRetenues.get(BudRetenues_.iDOrdresDePaiement)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Ordresdepaiement findIDOrdresDePaiement(BudRetenues entity) {
        return this.getMergedEntity(entity).getIDOrdresDePaiement();
    }
    
}
