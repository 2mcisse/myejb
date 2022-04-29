/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.DecRestitution;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.DecRestitution_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Encaissements;
import com.cdc.ejb.entities.Pieces;
import com.cdc.ejb.entities.Decaissements;
import com.cdc.ejb.entities.Ordresdepaiement;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.DecNatureoperation;
import com.cdc.ejb.entities.DecAffaires;
import com.cdc.ejb.entities.DecAutorisationderestitution;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DecRestitutionFacade extends AbstractFacade<DecRestitution> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DecRestitutionFacade() {
        super(DecRestitution.class);
    }

    public boolean isEncaissementsListEmpty(DecRestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecRestitution> decRestitution = cq.from(DecRestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decRestitution, entity), cb.isNotEmpty(decRestitution.get(DecRestitution_.encaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Encaissements> findEncaissementsList(DecRestitution entity) {
        DecRestitution mergedEntity = this.getMergedEntity(entity);
        List<Encaissements> encaissementsList = mergedEntity.getEncaissementsList();
        encaissementsList.size();
        return encaissementsList;
    }

    public boolean isPiecesListEmpty(DecRestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecRestitution> decRestitution = cq.from(DecRestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decRestitution, entity), cb.isNotEmpty(decRestitution.get(DecRestitution_.piecesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Pieces> findPiecesList(DecRestitution entity) {
        DecRestitution mergedEntity = this.getMergedEntity(entity);
        List<Pieces> piecesList = mergedEntity.getPiecesList();
        piecesList.size();
        return piecesList;
    }

    public boolean isDecaissementsListEmpty(DecRestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecRestitution> decRestitution = cq.from(DecRestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decRestitution, entity), cb.isNotEmpty(decRestitution.get(DecRestitution_.decaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Decaissements> findDecaissementsList(DecRestitution entity) {
        DecRestitution mergedEntity = this.getMergedEntity(entity);
        List<Decaissements> decaissementsList = mergedEntity.getDecaissementsList();
        decaissementsList.size();
        return decaissementsList;
    }

    public boolean isOrdresdepaiementListEmpty(DecRestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecRestitution> decRestitution = cq.from(DecRestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decRestitution, entity), cb.isNotEmpty(decRestitution.get(DecRestitution_.ordresdepaiementList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Ordresdepaiement> findOrdresdepaiementList(DecRestitution entity) {
        DecRestitution mergedEntity = this.getMergedEntity(entity);
        List<Ordresdepaiement> ordresdepaiementList = mergedEntity.getOrdresdepaiementList();
        ordresdepaiementList.size();
        return ordresdepaiementList;
    }

    public boolean isNumTiersEmpty(DecRestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecRestitution> decRestitution = cq.from(DecRestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decRestitution, entity), cb.isNotNull(decRestitution.get(DecRestitution_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(DecRestitution entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }

    public boolean isIdnatureoperationEmpty(DecRestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecRestitution> decRestitution = cq.from(DecRestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decRestitution, entity), cb.isNotNull(decRestitution.get(DecRestitution_.idnatureoperation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecNatureoperation findIdnatureoperation(DecRestitution entity) {
        return this.getMergedEntity(entity).getIdnatureoperation();
    }

    public boolean isIdaffairesEmpty(DecRestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecRestitution> decRestitution = cq.from(DecRestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decRestitution, entity), cb.isNotNull(decRestitution.get(DecRestitution_.idaffaires)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecAffaires findIdaffaires(DecRestitution entity) {
        return this.getMergedEntity(entity).getIdaffaires();
    }

    public boolean isDecAutorisationderestitutionListEmpty(DecRestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecRestitution> decRestitution = cq.from(DecRestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decRestitution, entity), cb.isNotEmpty(decRestitution.get(DecRestitution_.decAutorisationderestitutionList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecAutorisationderestitution> findDecAutorisationderestitutionList(DecRestitution entity) {
        DecRestitution mergedEntity = this.getMergedEntity(entity);
        List<DecAutorisationderestitution> decAutorisationderestitutionList = mergedEntity.getDecAutorisationderestitutionList();
        decAutorisationderestitutionList.size();
        return decAutorisationderestitutionList;
    }
    
}
