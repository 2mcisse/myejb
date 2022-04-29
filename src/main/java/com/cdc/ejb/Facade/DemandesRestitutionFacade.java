/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.DemandesRestitution;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.DemandesRestitution_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.DecNatureoperation;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.RestitutionSurAffraire;
import com.cdc.ejb.entities.DecAutorisationderestitution;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DemandesRestitutionFacade extends AbstractFacade<DemandesRestitution> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DemandesRestitutionFacade() {
        super(DemandesRestitution.class);
    }

    public boolean isIdnatureoperationEmpty(DemandesRestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DemandesRestitution> demandesRestitution = cq.from(DemandesRestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(demandesRestitution, entity), cb.isNotNull(demandesRestitution.get(DemandesRestitution_.idnatureoperation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecNatureoperation findIdnatureoperation(DemandesRestitution entity) {
        return this.getMergedEntity(entity).getIdnatureoperation();
    }

    public boolean isNumTiersEmpty(DemandesRestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DemandesRestitution> demandesRestitution = cq.from(DemandesRestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(demandesRestitution, entity), cb.isNotNull(demandesRestitution.get(DemandesRestitution_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(DemandesRestitution entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }

    public boolean isRestitutionSurAffraireListEmpty(DemandesRestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DemandesRestitution> demandesRestitution = cq.from(DemandesRestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(demandesRestitution, entity), cb.isNotEmpty(demandesRestitution.get(DemandesRestitution_.restitutionSurAffraireList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<RestitutionSurAffraire> findRestitutionSurAffraireList(DemandesRestitution entity) {
        DemandesRestitution mergedEntity = this.getMergedEntity(entity);
        List<RestitutionSurAffraire> restitutionSurAffraireList = mergedEntity.getRestitutionSurAffraireList();
        restitutionSurAffraireList.size();
        return restitutionSurAffraireList;
    }

    public boolean isDecAutorisationderestitutionListEmpty(DemandesRestitution entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DemandesRestitution> demandesRestitution = cq.from(DemandesRestitution.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(demandesRestitution, entity), cb.isNotEmpty(demandesRestitution.get(DemandesRestitution_.decAutorisationderestitutionList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecAutorisationderestitution> findDecAutorisationderestitutionList(DemandesRestitution entity) {
        DemandesRestitution mergedEntity = this.getMergedEntity(entity);
        List<DecAutorisationderestitution> decAutorisationderestitutionList = mergedEntity.getDecAutorisationderestitutionList();
        decAutorisationderestitutionList.size();
        return decAutorisationderestitutionList;
    }
    
}
