/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.BudB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.BudB_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.BudBudget;
import com.cdc.ejb.entities.BudA;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class BudBFacade extends AbstractFacade<BudB> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudBFacade() {
        super(BudB.class);
    }

    public boolean isBudBudgetListEmpty(BudB entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudB> budB = cq.from(BudB.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budB, entity), cb.isNotEmpty(budB.get(BudB_.budBudgetList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<BudBudget> findBudBudgetList(BudB entity) {
        BudB mergedEntity = this.getMergedEntity(entity);
        List<BudBudget> budBudgetList = mergedEntity.getBudBudgetList();
        budBudgetList.size();
        return budBudgetList;
    }

    public boolean isIdbudAEmpty(BudB entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudB> budB = cq.from(BudB.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budB, entity), cb.isNotNull(budB.get(BudB_.idbudA)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudA findIdbudA(BudB entity) {
        return this.getMergedEntity(entity).getIdbudA();
    }
    
}
