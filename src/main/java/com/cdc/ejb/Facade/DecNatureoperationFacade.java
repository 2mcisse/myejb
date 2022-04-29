/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.DecNatureoperation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.DecNatureoperation_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.Encaissements;
import com.cdc.ejb.entities.DemandesRestitution;
import com.cdc.ejb.entities.DecReception;
import com.cdc.ejb.entities.DecTitredeperception;
import com.cdc.ejb.entities.DecSousnatureoperation;
import com.cdc.ejb.entities.DecRestitution;
import com.cdc.ejb.entities.DecAutorisationderestitution;
import com.cdc.ejb.entities.DecGroupeEtapes;
import com.cdc.ejb.entities.Compte;
import com.cdc.ejb.entities.Portefeuilles;
import com.cdc.ejb.entities.DecAffaires;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DecNatureoperationFacade extends AbstractFacade<DecNatureoperation> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DecNatureoperationFacade() {
        super(DecNatureoperation.class);
    }

    public boolean isTiersListEmpty(DecNatureoperation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecNatureoperation> decNatureoperation = cq.from(DecNatureoperation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decNatureoperation, entity), cb.isNotEmpty(decNatureoperation.get(DecNatureoperation_.tiersList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Tiers> findTiersList(DecNatureoperation entity) {
        DecNatureoperation mergedEntity = this.getMergedEntity(entity);
        List<Tiers> tiersList = mergedEntity.getTiersList();
        tiersList.size();
        return tiersList;
    }

    public boolean isEncaissementsListEmpty(DecNatureoperation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecNatureoperation> decNatureoperation = cq.from(DecNatureoperation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decNatureoperation, entity), cb.isNotEmpty(decNatureoperation.get(DecNatureoperation_.encaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Encaissements> findEncaissementsList(DecNatureoperation entity) {
        DecNatureoperation mergedEntity = this.getMergedEntity(entity);
        List<Encaissements> encaissementsList = mergedEntity.getEncaissementsList();
        encaissementsList.size();
        return encaissementsList;
    }

    public boolean isDemandesRestitutionListEmpty(DecNatureoperation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecNatureoperation> decNatureoperation = cq.from(DecNatureoperation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decNatureoperation, entity), cb.isNotEmpty(decNatureoperation.get(DecNatureoperation_.demandesRestitutionList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DemandesRestitution> findDemandesRestitutionList(DecNatureoperation entity) {
        DecNatureoperation mergedEntity = this.getMergedEntity(entity);
        List<DemandesRestitution> demandesRestitutionList = mergedEntity.getDemandesRestitutionList();
        demandesRestitutionList.size();
        return demandesRestitutionList;
    }

    public boolean isDecReceptionListEmpty(DecNatureoperation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecNatureoperation> decNatureoperation = cq.from(DecNatureoperation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decNatureoperation, entity), cb.isNotEmpty(decNatureoperation.get(DecNatureoperation_.decReceptionList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecReception> findDecReceptionList(DecNatureoperation entity) {
        DecNatureoperation mergedEntity = this.getMergedEntity(entity);
        List<DecReception> decReceptionList = mergedEntity.getDecReceptionList();
        decReceptionList.size();
        return decReceptionList;
    }

    public boolean isDecTitredeperceptionListEmpty(DecNatureoperation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecNatureoperation> decNatureoperation = cq.from(DecNatureoperation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decNatureoperation, entity), cb.isNotEmpty(decNatureoperation.get(DecNatureoperation_.decTitredeperceptionList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecTitredeperception> findDecTitredeperceptionList(DecNatureoperation entity) {
        DecNatureoperation mergedEntity = this.getMergedEntity(entity);
        List<DecTitredeperception> decTitredeperceptionList = mergedEntity.getDecTitredeperceptionList();
        decTitredeperceptionList.size();
        return decTitredeperceptionList;
    }

    public boolean isDecSousnatureoperationListEmpty(DecNatureoperation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecNatureoperation> decNatureoperation = cq.from(DecNatureoperation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decNatureoperation, entity), cb.isNotEmpty(decNatureoperation.get(DecNatureoperation_.decSousnatureoperationList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecSousnatureoperation> findDecSousnatureoperationList(DecNatureoperation entity) {
        DecNatureoperation mergedEntity = this.getMergedEntity(entity);
        List<DecSousnatureoperation> decSousnatureoperationList = mergedEntity.getDecSousnatureoperationList();
        decSousnatureoperationList.size();
        return decSousnatureoperationList;
    }

    public boolean isDecRestitutionListEmpty(DecNatureoperation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecNatureoperation> decNatureoperation = cq.from(DecNatureoperation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decNatureoperation, entity), cb.isNotEmpty(decNatureoperation.get(DecNatureoperation_.decRestitutionList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecRestitution> findDecRestitutionList(DecNatureoperation entity) {
        DecNatureoperation mergedEntity = this.getMergedEntity(entity);
        List<DecRestitution> decRestitutionList = mergedEntity.getDecRestitutionList();
        decRestitutionList.size();
        return decRestitutionList;
    }

    public boolean isDecAutorisationderestitutionListEmpty(DecNatureoperation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecNatureoperation> decNatureoperation = cq.from(DecNatureoperation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decNatureoperation, entity), cb.isNotEmpty(decNatureoperation.get(DecNatureoperation_.decAutorisationderestitutionList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecAutorisationderestitution> findDecAutorisationderestitutionList(DecNatureoperation entity) {
        DecNatureoperation mergedEntity = this.getMergedEntity(entity);
        List<DecAutorisationderestitution> decAutorisationderestitutionList = mergedEntity.getDecAutorisationderestitutionList();
        decAutorisationderestitutionList.size();
        return decAutorisationderestitutionList;
    }

    public boolean isDecGroupeEtapesListEmpty(DecNatureoperation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecNatureoperation> decNatureoperation = cq.from(DecNatureoperation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decNatureoperation, entity), cb.isNotEmpty(decNatureoperation.get(DecNatureoperation_.decGroupeEtapesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecGroupeEtapes> findDecGroupeEtapesList(DecNatureoperation entity) {
        DecNatureoperation mergedEntity = this.getMergedEntity(entity);
        List<DecGroupeEtapes> decGroupeEtapesList = mergedEntity.getDecGroupeEtapesList();
        decGroupeEtapesList.size();
        return decGroupeEtapesList;
    }

    public boolean isNumeroCompteEmpty(DecNatureoperation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecNatureoperation> decNatureoperation = cq.from(DecNatureoperation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decNatureoperation, entity), cb.isNotNull(decNatureoperation.get(DecNatureoperation_.numeroCompte)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Compte findNumeroCompte(DecNatureoperation entity) {
        return this.getMergedEntity(entity).getNumeroCompte();
    }

    public boolean isIDPortefeuillesEmpty(DecNatureoperation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecNatureoperation> decNatureoperation = cq.from(DecNatureoperation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decNatureoperation, entity), cb.isNotNull(decNatureoperation.get(DecNatureoperation_.iDPortefeuilles)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Portefeuilles findIDPortefeuilles(DecNatureoperation entity) {
        return this.getMergedEntity(entity).getIDPortefeuilles();
    }

    public boolean isDecAffairesListEmpty(DecNatureoperation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecNatureoperation> decNatureoperation = cq.from(DecNatureoperation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decNatureoperation, entity), cb.isNotEmpty(decNatureoperation.get(DecNatureoperation_.decAffairesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecAffaires> findDecAffairesList(DecNatureoperation entity) {
        DecNatureoperation mergedEntity = this.getMergedEntity(entity);
        List<DecAffaires> decAffairesList = mergedEntity.getDecAffairesList();
        decAffairesList.size();
        return decAffairesList;
    }

    @Override
    public DecNatureoperation findWithParents(DecNatureoperation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<DecNatureoperation> cq = cb.createQuery(DecNatureoperation.class);
        Root<DecNatureoperation> decNatureoperation = cq.from(DecNatureoperation.class);
        decNatureoperation.fetch(DecNatureoperation_.tiersList, JoinType.LEFT);
        cq.select(decNatureoperation).where(cb.equal(decNatureoperation, entity));
        try {
            return em.createQuery(cq).getSingleResult();
        } catch (Exception e) {
            return entity;
        }
    }
    
}
