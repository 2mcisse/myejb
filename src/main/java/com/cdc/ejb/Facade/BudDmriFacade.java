/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.BudDmri;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.BudDmri_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.BudBudget;
import com.cdc.ejb.entities.Ordresdepaiement;
import com.cdc.ejb.entities.BudLiquidation;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class BudDmriFacade extends AbstractFacade<BudDmri> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudDmriFacade() {
        super(BudDmri.class);
    }

    public boolean isIDBUDBudgetEmpty(BudDmri entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudDmri> budDmri = cq.from(BudDmri.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budDmri, entity), cb.isNotNull(budDmri.get(BudDmri_.iDBUDBudget)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudBudget findIDBUDBudget(BudDmri entity) {
        return this.getMergedEntity(entity).getIDBUDBudget();
    }

    public boolean isOrdresdepaiementListEmpty(BudDmri entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudDmri> budDmri = cq.from(BudDmri.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budDmri, entity), cb.isNotEmpty(budDmri.get(BudDmri_.ordresdepaiementList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Ordresdepaiement> findOrdresdepaiementList(BudDmri entity) {
        BudDmri mergedEntity = this.getMergedEntity(entity);
        List<Ordresdepaiement> ordresdepaiementList = mergedEntity.getOrdresdepaiementList();
        ordresdepaiementList.size();
        return ordresdepaiementList;
    }

    public boolean isBudLiquidationListEmpty(BudDmri entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudDmri> budDmri = cq.from(BudDmri.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budDmri, entity), cb.isNotEmpty(budDmri.get(BudDmri_.budLiquidationList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<BudLiquidation> findBudLiquidationList(BudDmri entity) {
        BudDmri mergedEntity = this.getMergedEntity(entity);
        List<BudLiquidation> budLiquidationList = mergedEntity.getBudLiquidationList();
        budLiquidationList.size();
        return budLiquidationList;
    }
    
}
