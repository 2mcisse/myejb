/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.BudEngagementannule;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.BudEngagementannule_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.BudBudget;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class BudEngagementannuleFacade extends AbstractFacade<BudEngagementannule> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudEngagementannuleFacade() {
        super(BudEngagementannule.class);
    }

    public boolean isIDBUDBudgetEmpty(BudEngagementannule entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudEngagementannule> budEngagementannule = cq.from(BudEngagementannule.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budEngagementannule, entity), cb.isNotNull(budEngagementannule.get(BudEngagementannule_.iDBUDBudget)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudBudget findIDBUDBudget(BudEngagementannule entity) {
        return this.getMergedEntity(entity).getIDBUDBudget();
    }
    
}
