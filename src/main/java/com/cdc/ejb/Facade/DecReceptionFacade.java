/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.DecReception;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.DecReception_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Encaissements;
import com.cdc.ejb.entities.Pieces;
import com.cdc.ejb.entities.TreQuittance;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.DecNatureoperation;
import com.cdc.ejb.entities.DecAffaires;
import com.cdc.ejb.entities.DecTitredeperception;
import com.cdc.ejb.entities.Decaissements;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DecReceptionFacade extends AbstractFacade<DecReception> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DecReceptionFacade() {
        super(DecReception.class);
    }

    public boolean isEncaissementsListEmpty(DecReception entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecReception> decReception = cq.from(DecReception.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decReception, entity), cb.isNotEmpty(decReception.get(DecReception_.encaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Encaissements> findEncaissementsList(DecReception entity) {
        DecReception mergedEntity = this.getMergedEntity(entity);
        List<Encaissements> encaissementsList = mergedEntity.getEncaissementsList();
        encaissementsList.size();
        return encaissementsList;
    }

    public boolean isPiecesListEmpty(DecReception entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecReception> decReception = cq.from(DecReception.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decReception, entity), cb.isNotEmpty(decReception.get(DecReception_.piecesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Pieces> findPiecesList(DecReception entity) {
        DecReception mergedEntity = this.getMergedEntity(entity);
        List<Pieces> piecesList = mergedEntity.getPiecesList();
        piecesList.size();
        return piecesList;
    }

    public boolean isIDTREQuittanceEmpty(DecReception entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecReception> decReception = cq.from(DecReception.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decReception, entity), cb.isNotNull(decReception.get(DecReception_.iDTREQuittance)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public TreQuittance findIDTREQuittance(DecReception entity) {
        return this.getMergedEntity(entity).getIDTREQuittance();
    }

    public boolean isNumTiersEmpty(DecReception entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecReception> decReception = cq.from(DecReception.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decReception, entity), cb.isNotNull(decReception.get(DecReception_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(DecReception entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }

    public boolean isIdnatureoperationEmpty(DecReception entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecReception> decReception = cq.from(DecReception.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decReception, entity), cb.isNotNull(decReception.get(DecReception_.idnatureoperation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecNatureoperation findIdnatureoperation(DecReception entity) {
        return this.getMergedEntity(entity).getIdnatureoperation();
    }

    public boolean isIdaffairesEmpty(DecReception entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecReception> decReception = cq.from(DecReception.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decReception, entity), cb.isNotNull(decReception.get(DecReception_.idaffaires)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecAffaires findIdaffaires(DecReception entity) {
        return this.getMergedEntity(entity).getIdaffaires();
    }

    public boolean isDecTitredeperceptionListEmpty(DecReception entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecReception> decReception = cq.from(DecReception.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decReception, entity), cb.isNotEmpty(decReception.get(DecReception_.decTitredeperceptionList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecTitredeperception> findDecTitredeperceptionList(DecReception entity) {
        DecReception mergedEntity = this.getMergedEntity(entity);
        List<DecTitredeperception> decTitredeperceptionList = mergedEntity.getDecTitredeperceptionList();
        decTitredeperceptionList.size();
        return decTitredeperceptionList;
    }

    public boolean isDecaissementsListEmpty(DecReception entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecReception> decReception = cq.from(DecReception.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decReception, entity), cb.isNotEmpty(decReception.get(DecReception_.decaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Decaissements> findDecaissementsList(DecReception entity) {
        DecReception mergedEntity = this.getMergedEntity(entity);
        List<Decaissements> decaissementsList = mergedEntity.getDecaissementsList();
        decaissementsList.size();
        return decaissementsList;
    }
    
}
