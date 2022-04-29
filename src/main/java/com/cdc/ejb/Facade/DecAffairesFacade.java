/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.DecAffaires;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.DecAffaires_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Encaissements;
import com.cdc.ejb.entities.RestitutionSurAffaireAr;
import com.cdc.ejb.entities.DecReception;
import com.cdc.ejb.entities.DecTitredeperception;
import com.cdc.ejb.entities.RestitutionSurAffraire;
import com.cdc.ejb.entities.DecMouvements;
import com.cdc.ejb.entities.Decaissements;
import com.cdc.ejb.entities.DecRestitution;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.DecNatureoperation;
import com.cdc.ejb.entities.DecTypeaffaire;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DecAffairesFacade extends AbstractFacade<DecAffaires> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DecAffairesFacade() {
        super(DecAffaires.class);
    }

    public boolean isEncaissementsListEmpty(DecAffaires entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecAffaires> decAffaires = cq.from(DecAffaires.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decAffaires, entity), cb.isNotEmpty(decAffaires.get(DecAffaires_.encaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Encaissements> findEncaissementsList(DecAffaires entity) {
        DecAffaires mergedEntity = this.getMergedEntity(entity);
        List<Encaissements> encaissementsList = mergedEntity.getEncaissementsList();
        encaissementsList.size();
        return encaissementsList;
    }

    public boolean isRestitutionSurAffaireArListEmpty(DecAffaires entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecAffaires> decAffaires = cq.from(DecAffaires.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decAffaires, entity), cb.isNotEmpty(decAffaires.get(DecAffaires_.restitutionSurAffaireArList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<RestitutionSurAffaireAr> findRestitutionSurAffaireArList(DecAffaires entity) {
        DecAffaires mergedEntity = this.getMergedEntity(entity);
        List<RestitutionSurAffaireAr> restitutionSurAffaireArList = mergedEntity.getRestitutionSurAffaireArList();
        restitutionSurAffaireArList.size();
        return restitutionSurAffaireArList;
    }

    public boolean isDecReceptionListEmpty(DecAffaires entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecAffaires> decAffaires = cq.from(DecAffaires.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decAffaires, entity), cb.isNotEmpty(decAffaires.get(DecAffaires_.decReceptionList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecReception> findDecReceptionList(DecAffaires entity) {
        DecAffaires mergedEntity = this.getMergedEntity(entity);
        List<DecReception> decReceptionList = mergedEntity.getDecReceptionList();
        decReceptionList.size();
        return decReceptionList;
    }

    public boolean isDecTitredeperceptionListEmpty(DecAffaires entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecAffaires> decAffaires = cq.from(DecAffaires.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decAffaires, entity), cb.isNotEmpty(decAffaires.get(DecAffaires_.decTitredeperceptionList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecTitredeperception> findDecTitredeperceptionList(DecAffaires entity) {
        DecAffaires mergedEntity = this.getMergedEntity(entity);
        List<DecTitredeperception> decTitredeperceptionList = mergedEntity.getDecTitredeperceptionList();
        decTitredeperceptionList.size();
        return decTitredeperceptionList;
    }

    public boolean isRestitutionSurAffraireListEmpty(DecAffaires entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecAffaires> decAffaires = cq.from(DecAffaires.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decAffaires, entity), cb.isNotEmpty(decAffaires.get(DecAffaires_.restitutionSurAffraireList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<RestitutionSurAffraire> findRestitutionSurAffraireList(DecAffaires entity) {
        DecAffaires mergedEntity = this.getMergedEntity(entity);
        List<RestitutionSurAffraire> restitutionSurAffraireList = mergedEntity.getRestitutionSurAffraireList();
        restitutionSurAffraireList.size();
        return restitutionSurAffraireList;
    }

    public boolean isDecMouvementsListEmpty(DecAffaires entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecAffaires> decAffaires = cq.from(DecAffaires.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decAffaires, entity), cb.isNotEmpty(decAffaires.get(DecAffaires_.decMouvementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecMouvements> findDecMouvementsList(DecAffaires entity) {
        DecAffaires mergedEntity = this.getMergedEntity(entity);
        List<DecMouvements> decMouvementsList = mergedEntity.getDecMouvementsList();
        decMouvementsList.size();
        return decMouvementsList;
    }

    public boolean isDecaissementsListEmpty(DecAffaires entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecAffaires> decAffaires = cq.from(DecAffaires.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decAffaires, entity), cb.isNotEmpty(decAffaires.get(DecAffaires_.decaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Decaissements> findDecaissementsList(DecAffaires entity) {
        DecAffaires mergedEntity = this.getMergedEntity(entity);
        List<Decaissements> decaissementsList = mergedEntity.getDecaissementsList();
        decaissementsList.size();
        return decaissementsList;
    }

    public boolean isDecRestitutionListEmpty(DecAffaires entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecAffaires> decAffaires = cq.from(DecAffaires.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decAffaires, entity), cb.isNotEmpty(decAffaires.get(DecAffaires_.decRestitutionList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecRestitution> findDecRestitutionList(DecAffaires entity) {
        DecAffaires mergedEntity = this.getMergedEntity(entity);
        List<DecRestitution> decRestitutionList = mergedEntity.getDecRestitutionList();
        decRestitutionList.size();
        return decRestitutionList;
    }

    public boolean isNumTiersEmpty(DecAffaires entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecAffaires> decAffaires = cq.from(DecAffaires.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decAffaires, entity), cb.isNotNull(decAffaires.get(DecAffaires_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(DecAffaires entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }

    public boolean isIdnatureoperationEmpty(DecAffaires entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecAffaires> decAffaires = cq.from(DecAffaires.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decAffaires, entity), cb.isNotNull(decAffaires.get(DecAffaires_.idnatureoperation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecNatureoperation findIdnatureoperation(DecAffaires entity) {
        return this.getMergedEntity(entity).getIdnatureoperation();
    }

    public boolean isIdtypeaffaireEmpty(DecAffaires entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecAffaires> decAffaires = cq.from(DecAffaires.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decAffaires, entity), cb.isNotNull(decAffaires.get(DecAffaires_.idtypeaffaire)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecTypeaffaire findIdtypeaffaire(DecAffaires entity) {
        return this.getMergedEntity(entity).getIdtypeaffaire();
    }
    
}
