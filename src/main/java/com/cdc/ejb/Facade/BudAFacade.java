/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.BudA;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.BudA_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.BudBudget;
import com.cdc.ejb.entities.BudB;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class BudAFacade extends AbstractFacade<BudA> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudAFacade() {
        super(BudA.class);
    }

    public boolean isBudBudgetListEmpty(BudA entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudA> budA = cq.from(BudA.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budA, entity), cb.isNotEmpty(budA.get(BudA_.budBudgetList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<BudBudget> findBudBudgetList(BudA entity) {
        BudA mergedEntity = this.getMergedEntity(entity);
        List<BudBudget> budBudgetList = mergedEntity.getBudBudgetList();
        budBudgetList.size();
        return budBudgetList;
    }

    public boolean isBudBListEmpty(BudA entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudA> budA = cq.from(BudA.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budA, entity), cb.isNotEmpty(budA.get(BudA_.budBList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<BudB> findBudBList(BudA entity) {
        BudA mergedEntity = this.getMergedEntity(entity);
        List<BudB> budBList = mergedEntity.getBudBList();
        budBList.size();
        return budBList;
    }
    
}
