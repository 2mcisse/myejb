/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.BudEngagement;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.BudEngagement_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Pieces;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.BudLiquidation;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class BudEngagementFacade extends AbstractFacade<BudEngagement> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudEngagementFacade() {
        super(BudEngagement.class);
    }

    public boolean isPiecesListEmpty(BudEngagement entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudEngagement> budEngagement = cq.from(BudEngagement.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budEngagement, entity), cb.isNotEmpty(budEngagement.get(BudEngagement_.piecesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Pieces> findPiecesList(BudEngagement entity) {
        BudEngagement mergedEntity = this.getMergedEntity(entity);
        List<Pieces> piecesList = mergedEntity.getPiecesList();
        piecesList.size();
        return piecesList;
    }

    public boolean isNumTiersEmpty(BudEngagement entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudEngagement> budEngagement = cq.from(BudEngagement.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budEngagement, entity), cb.isNotNull(budEngagement.get(BudEngagement_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(BudEngagement entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }

    public boolean isBudLiquidationListEmpty(BudEngagement entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudEngagement> budEngagement = cq.from(BudEngagement.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budEngagement, entity), cb.isNotEmpty(budEngagement.get(BudEngagement_.budLiquidationList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<BudLiquidation> findBudLiquidationList(BudEngagement entity) {
        BudEngagement mergedEntity = this.getMergedEntity(entity);
        List<BudLiquidation> budLiquidationList = mergedEntity.getBudLiquidationList();
        budLiquidationList.size();
        return budLiquidationList;
    }
    
}
