/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.BudMvtbud;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.BudMvtbud_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.BudVirements;
import com.cdc.ejb.entities.BudBudget;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class BudMvtbudFacade extends AbstractFacade<BudMvtbud> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudMvtbudFacade() {
        super(BudMvtbud.class);
    }

    public boolean isIDBUDVirementEmpty(BudMvtbud entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudMvtbud> budMvtbud = cq.from(BudMvtbud.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budMvtbud, entity), cb.isNotNull(budMvtbud.get(BudMvtbud_.iDBUDVirement)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudVirements findIDBUDVirement(BudMvtbud entity) {
        return this.getMergedEntity(entity).getIDBUDVirement();
    }

    public boolean isIDBUDBudgetEmpty(BudMvtbud entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudMvtbud> budMvtbud = cq.from(BudMvtbud.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budMvtbud, entity), cb.isNotNull(budMvtbud.get(BudMvtbud_.iDBUDBudget)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudBudget findIDBUDBudget(BudMvtbud entity) {
        return this.getMergedEntity(entity).getIDBUDBudget();
    }
    
}
