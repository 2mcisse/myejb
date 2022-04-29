/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.DecAutorisationderestitution;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.DecAutorisationderestitution_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.RestitutionSurAffaireAr;
import com.cdc.ejb.entities.DecRestitution;
import com.cdc.ejb.entities.DecNatureoperation;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.DemandesRestitution;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DecAutorisationderestitutionFacade extends AbstractFacade<DecAutorisationderestitution> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DecAutorisationderestitutionFacade() {
        super(DecAutorisationderestitution.class);
    }

    public boolean isRestitutionSurAffaireArListEmpty(DecAutorisationderestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecAutorisationderestitution> decAutorisationderestitution = cq.from(DecAutorisationderestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decAutorisationderestitution, entity), cb.isNotEmpty(decAutorisationderestitution.get(DecAutorisationderestitution_.restitutionSurAffaireArList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<RestitutionSurAffaireAr> findRestitutionSurAffaireArList(DecAutorisationderestitution entity) {
        DecAutorisationderestitution mergedEntity = this.getMergedEntity(entity);
        List<RestitutionSurAffaireAr> restitutionSurAffaireArList = mergedEntity.getRestitutionSurAffaireArList();
        restitutionSurAffaireArList.size();
        return restitutionSurAffaireArList;
    }

    public boolean isIDDECReceptionEmpty(DecAutorisationderestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecAutorisationderestitution> decAutorisationderestitution = cq.from(DecAutorisationderestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decAutorisationderestitution, entity), cb.isNotNull(decAutorisationderestitution.get(DecAutorisationderestitution_.iDDECReception)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecRestitution findIDDECReception(DecAutorisationderestitution entity) {
        return this.getMergedEntity(entity).getIDDECReception();
    }

    public boolean isIdnatureoperationEmpty(DecAutorisationderestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecAutorisationderestitution> decAutorisationderestitution = cq.from(DecAutorisationderestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decAutorisationderestitution, entity), cb.isNotNull(decAutorisationderestitution.get(DecAutorisationderestitution_.idnatureoperation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecNatureoperation findIdnatureoperation(DecAutorisationderestitution entity) {
        return this.getMergedEntity(entity).getIdnatureoperation();
    }

    public boolean isNumTiersEmpty(DecAutorisationderestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecAutorisationderestitution> decAutorisationderestitution = cq.from(DecAutorisationderestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decAutorisationderestitution, entity), cb.isNotNull(decAutorisationderestitution.get(DecAutorisationderestitution_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(DecAutorisationderestitution entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }

    public boolean isCodeDemRestEmpty(DecAutorisationderestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecAutorisationderestitution> decAutorisationderestitution = cq.from(DecAutorisationderestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decAutorisationderestitution, entity), cb.isNotNull(decAutorisationderestitution.get(DecAutorisationderestitution_.codeDemRest)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DemandesRestitution findCodeDemRest(DecAutorisationderestitution entity) {
        return this.getMergedEntity(entity).getCodeDemRest();
    }
    
}
