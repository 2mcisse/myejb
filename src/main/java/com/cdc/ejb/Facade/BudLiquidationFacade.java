/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.BudLiquidation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.BudLiquidation_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Pieces;
import com.cdc.ejb.entities.SysContenubordereau;
import com.cdc.ejb.entities.Ordresdepaiement;
import com.cdc.ejb.entities.BudEngagement;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.BudDmri;
import com.cdc.ejb.entities.BudRetenues;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class BudLiquidationFacade extends AbstractFacade<BudLiquidation> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudLiquidationFacade() {
        super(BudLiquidation.class);
    }

    public boolean isPiecesListEmpty(BudLiquidation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudLiquidation> budLiquidation = cq.from(BudLiquidation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budLiquidation, entity), cb.isNotEmpty(budLiquidation.get(BudLiquidation_.piecesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Pieces> findPiecesList(BudLiquidation entity) {
        BudLiquidation mergedEntity = this.getMergedEntity(entity);
        List<Pieces> piecesList = mergedEntity.getPiecesList();
        piecesList.size();
        return piecesList;
    }

    public boolean isSysContenubordereauListEmpty(BudLiquidation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudLiquidation> budLiquidation = cq.from(BudLiquidation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budLiquidation, entity), cb.isNotEmpty(budLiquidation.get(BudLiquidation_.sysContenubordereauList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<SysContenubordereau> findSysContenubordereauList(BudLiquidation entity) {
        BudLiquidation mergedEntity = this.getMergedEntity(entity);
        List<SysContenubordereau> sysContenubordereauList = mergedEntity.getSysContenubordereauList();
        sysContenubordereauList.size();
        return sysContenubordereauList;
    }

    public boolean isOrdresdepaiementListEmpty(BudLiquidation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudLiquidation> budLiquidation = cq.from(BudLiquidation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budLiquidation, entity), cb.isNotEmpty(budLiquidation.get(BudLiquidation_.ordresdepaiementList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Ordresdepaiement> findOrdresdepaiementList(BudLiquidation entity) {
        BudLiquidation mergedEntity = this.getMergedEntity(entity);
        List<Ordresdepaiement> ordresdepaiementList = mergedEntity.getOrdresdepaiementList();
        ordresdepaiementList.size();
        return ordresdepaiementList;
    }

    public boolean isIDBUDEngagementEmpty(BudLiquidation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudLiquidation> budLiquidation = cq.from(BudLiquidation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budLiquidation, entity), cb.isNotNull(budLiquidation.get(BudLiquidation_.iDBUDEngagement)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudEngagement findIDBUDEngagement(BudLiquidation entity) {
        return this.getMergedEntity(entity).getIDBUDEngagement();
    }

    public boolean isNumTiersEmpty(BudLiquidation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudLiquidation> budLiquidation = cq.from(BudLiquidation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budLiquidation, entity), cb.isNotNull(budLiquidation.get(BudLiquidation_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(BudLiquidation entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }

    public boolean isIdbudDmriEmpty(BudLiquidation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudLiquidation> budLiquidation = cq.from(BudLiquidation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budLiquidation, entity), cb.isNotNull(budLiquidation.get(BudLiquidation_.idbudDmri)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudDmri findIdbudDmri(BudLiquidation entity) {
        return this.getMergedEntity(entity).getIdbudDmri();
    }

    public boolean isBudRetenuesListEmpty(BudLiquidation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudLiquidation> budLiquidation = cq.from(BudLiquidation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budLiquidation, entity), cb.isNotEmpty(budLiquidation.get(BudLiquidation_.budRetenuesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<BudRetenues> findBudRetenuesList(BudLiquidation entity) {
        BudLiquidation mergedEntity = this.getMergedEntity(entity);
        List<BudRetenues> budRetenuesList = mergedEntity.getBudRetenuesList();
        budRetenuesList.size();
        return budRetenuesList;
    }
    
}
