/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.BudVirements;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.BudVirements_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.BudMvtbud;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class BudVirementsFacade extends AbstractFacade<BudVirements> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudVirementsFacade() {
        super(BudVirements.class);
    }

    public boolean isBudMvtbudListEmpty(BudVirements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudVirements> budVirements = cq.from(BudVirements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budVirements, entity), cb.isNotEmpty(budVirements.get(BudVirements_.budMvtbudList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<BudMvtbud> findBudMvtbudList(BudVirements entity) {
        BudVirements mergedEntity = this.getMergedEntity(entity);
        List<BudMvtbud> budMvtbudList = mergedEntity.getBudMvtbudList();
        budMvtbudList.size();
        return budMvtbudList;
    }
    
}
