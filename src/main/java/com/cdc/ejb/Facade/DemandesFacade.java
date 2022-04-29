/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Demandes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Demandes_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Encaissements;
import com.cdc.ejb.entities.Caisses;
import com.cdc.ejb.entities.Billetage;
import com.cdc.ejb.entities.Decaissements;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DemandesFacade extends AbstractFacade<Demandes> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DemandesFacade() {
        super(Demandes.class);
    }

    public boolean isEncaissementsListEmpty(Demandes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Demandes> demandes = cq.from(Demandes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(demandes, entity), cb.isNotEmpty(demandes.get(Demandes_.encaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Encaissements> findEncaissementsList(Demandes entity) {
        Demandes mergedEntity = this.getMergedEntity(entity);
        List<Encaissements> encaissementsList = mergedEntity.getEncaissementsList();
        encaissementsList.size();
        return encaissementsList;
    }

    public boolean isNumeroCaisseEmpty(Demandes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Demandes> demandes = cq.from(Demandes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(demandes, entity), cb.isNotNull(demandes.get(Demandes_.numeroCaisse)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Caisses findNumeroCaisse(Demandes entity) {
        return this.getMergedEntity(entity).getNumeroCaisse();
    }

    public boolean isBilletageListEmpty(Demandes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Demandes> demandes = cq.from(Demandes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(demandes, entity), cb.isNotEmpty(demandes.get(Demandes_.billetageList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Billetage> findBilletageList(Demandes entity) {
        Demandes mergedEntity = this.getMergedEntity(entity);
        List<Billetage> billetageList = mergedEntity.getBilletageList();
        billetageList.size();
        return billetageList;
    }

    public boolean isDecaissementsListEmpty(Demandes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Demandes> demandes = cq.from(Demandes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(demandes, entity), cb.isNotEmpty(demandes.get(Demandes_.decaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Decaissements> findDecaissementsList(Demandes entity) {
        Demandes mergedEntity = this.getMergedEntity(entity);
        List<Decaissements> decaissementsList = mergedEntity.getDecaissementsList();
        decaissementsList.size();
        return decaissementsList;
    }
    
}
