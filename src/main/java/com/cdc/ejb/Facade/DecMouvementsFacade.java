/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.DecMouvements;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.DecMouvements_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.DecDetailsarretes;
import com.cdc.ejb.entities.DecAffaires;
import com.cdc.ejb.entities.InteretsCompte;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DecMouvementsFacade extends AbstractFacade<DecMouvements> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DecMouvementsFacade() {
        super(DecMouvements.class);
    }

    public boolean isNumTiersEmpty(DecMouvements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecMouvements> decMouvements = cq.from(DecMouvements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decMouvements, entity), cb.isNotNull(decMouvements.get(DecMouvements_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(DecMouvements entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }

    public boolean isIDDetailsArretesEmpty(DecMouvements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecMouvements> decMouvements = cq.from(DecMouvements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decMouvements, entity), cb.isNotNull(decMouvements.get(DecMouvements_.iDDetailsArretes)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecDetailsarretes findIDDetailsArretes(DecMouvements entity) {
        return this.getMergedEntity(entity).getIDDetailsArretes();
    }

    public boolean isIdaffairesEmpty(DecMouvements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecMouvements> decMouvements = cq.from(DecMouvements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decMouvements, entity), cb.isNotNull(decMouvements.get(DecMouvements_.idaffaires)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecAffaires findIdaffaires(DecMouvements entity) {
        return this.getMergedEntity(entity).getIdaffaires();
    }

    public boolean isInteretsCompteListEmpty(DecMouvements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecMouvements> decMouvements = cq.from(DecMouvements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decMouvements, entity), cb.isNotEmpty(decMouvements.get(DecMouvements_.interetsCompteList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<InteretsCompte> findInteretsCompteList(DecMouvements entity) {
        DecMouvements mergedEntity = this.getMergedEntity(entity);
        List<InteretsCompte> interetsCompteList = mergedEntity.getInteretsCompteList();
        interetsCompteList.size();
        return interetsCompteList;
    }
    
}
