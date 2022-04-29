/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Caisses;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Caisses_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Encaissements;
import com.cdc.ejb.entities.Demandes;
import com.cdc.ejb.entities.Affectation;
import com.cdc.ejb.entities.Billetage;
import com.cdc.ejb.entities.Decaissements;
import com.cdc.ejb.entities.SoldeCaisse;
import com.cdc.ejb.entities.ApproDeg;
import com.cdc.ejb.entities.Actionsccaisses;
import com.cdc.ejb.entities.Guichets;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class CaissesFacade extends AbstractFacade<Caisses> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CaissesFacade() {
        super(Caisses.class);
    }

    public boolean isEncaissementsListEmpty(Caisses entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Caisses> caisses = cq.from(Caisses.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(caisses, entity), cb.isNotEmpty(caisses.get(Caisses_.encaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Encaissements> findEncaissementsList(Caisses entity) {
        Caisses mergedEntity = this.getMergedEntity(entity);
        List<Encaissements> encaissementsList = mergedEntity.getEncaissementsList();
        encaissementsList.size();
        return encaissementsList;
    }

    public boolean isDemandesListEmpty(Caisses entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Caisses> caisses = cq.from(Caisses.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(caisses, entity), cb.isNotEmpty(caisses.get(Caisses_.demandesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Demandes> findDemandesList(Caisses entity) {
        Caisses mergedEntity = this.getMergedEntity(entity);
        List<Demandes> demandesList = mergedEntity.getDemandesList();
        demandesList.size();
        return demandesList;
    }

    public boolean isAffectationListEmpty(Caisses entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Caisses> caisses = cq.from(Caisses.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(caisses, entity), cb.isNotEmpty(caisses.get(Caisses_.affectationList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Affectation> findAffectationList(Caisses entity) {
        Caisses mergedEntity = this.getMergedEntity(entity);
        List<Affectation> affectationList = mergedEntity.getAffectationList();
        affectationList.size();
        return affectationList;
    }

    public boolean isBilletageListEmpty(Caisses entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Caisses> caisses = cq.from(Caisses.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(caisses, entity), cb.isNotEmpty(caisses.get(Caisses_.billetageList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Billetage> findBilletageList(Caisses entity) {
        Caisses mergedEntity = this.getMergedEntity(entity);
        List<Billetage> billetageList = mergedEntity.getBilletageList();
        billetageList.size();
        return billetageList;
    }

    public boolean isDecaissementsListEmpty(Caisses entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Caisses> caisses = cq.from(Caisses.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(caisses, entity), cb.isNotEmpty(caisses.get(Caisses_.decaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Decaissements> findDecaissementsList(Caisses entity) {
        Caisses mergedEntity = this.getMergedEntity(entity);
        List<Decaissements> decaissementsList = mergedEntity.getDecaissementsList();
        decaissementsList.size();
        return decaissementsList;
    }

    public boolean isSoldeCaisseListEmpty(Caisses entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Caisses> caisses = cq.from(Caisses.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(caisses, entity), cb.isNotEmpty(caisses.get(Caisses_.soldeCaisseList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<SoldeCaisse> findSoldeCaisseList(Caisses entity) {
        Caisses mergedEntity = this.getMergedEntity(entity);
        List<SoldeCaisse> soldeCaisseList = mergedEntity.getSoldeCaisseList();
        soldeCaisseList.size();
        return soldeCaisseList;
    }

    public boolean isApproDegListEmpty(Caisses entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Caisses> caisses = cq.from(Caisses.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(caisses, entity), cb.isNotEmpty(caisses.get(Caisses_.approDegList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<ApproDeg> findApproDegList(Caisses entity) {
        Caisses mergedEntity = this.getMergedEntity(entity);
        List<ApproDeg> approDegList = mergedEntity.getApproDegList();
        approDegList.size();
        return approDegList;
    }

    public boolean isActionsccaissesListEmpty(Caisses entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Caisses> caisses = cq.from(Caisses.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(caisses, entity), cb.isNotEmpty(caisses.get(Caisses_.actionsccaissesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Actionsccaisses> findActionsccaissesList(Caisses entity) {
        Caisses mergedEntity = this.getMergedEntity(entity);
        List<Actionsccaisses> actionsccaissesList = mergedEntity.getActionsccaissesList();
        actionsccaissesList.size();
        return actionsccaissesList;
    }

    public boolean isCodeGEmpty(Caisses entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Caisses> caisses = cq.from(Caisses.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(caisses, entity), cb.isNotNull(caisses.get(Caisses_.codeG)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Guichets findCodeG(Caisses entity) {
        return this.getMergedEntity(entity).getCodeG();
    }
    
}
