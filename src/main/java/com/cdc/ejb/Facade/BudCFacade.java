/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.BudC;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.BudC_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.BudBudget;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class BudCFacade extends AbstractFacade<BudC> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudCFacade() {
        super(BudC.class);
    }

    public boolean isBudBudgetListEmpty(BudC entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudC> budC = cq.from(BudC.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budC, entity), cb.isNotEmpty(budC.get(BudC_.budBudgetList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<BudBudget> findBudBudgetList(BudC entity) {
        BudC mergedEntity = this.getMergedEntity(entity);
        List<BudBudget> budBudgetList = mergedEntity.getBudBudgetList();
        budBudgetList.size();
        return budBudgetList;
    }
    
}
