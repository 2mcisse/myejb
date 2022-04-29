/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.PfTableauAmo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.PfTableauAmo_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PfDecaissements;
import com.cdc.ejb.entities.PfNatureEnc;
import com.cdc.ejb.entities.PfNatureDec;
import com.cdc.ejb.entities.PfTypeEnc;
import com.cdc.ejb.entities.PfSupports;
import com.cdc.ejb.entities.PfTypeDec;
import com.cdc.ejb.entities.PfEncaissements;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PfTableauAmoFacade extends AbstractFacade<PfTableauAmo> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PfTableauAmoFacade() {
        super(PfTableauAmo.class);
    }

    public boolean isPfDecaissementsListEmpty(PfTableauAmo entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTableauAmo> pfTableauAmo = cq.from(PfTableauAmo.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTableauAmo, entity), cb.isNotEmpty(pfTableauAmo.get(PfTableauAmo_.pfDecaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfDecaissements> findPfDecaissementsList(PfTableauAmo entity) {
        PfTableauAmo mergedEntity = this.getMergedEntity(entity);
        List<PfDecaissements> pfDecaissementsList = mergedEntity.getPfDecaissementsList();
        pfDecaissementsList.size();
        return pfDecaissementsList;
    }

    public boolean isIdnatureEncEmpty(PfTableauAmo entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTableauAmo> pfTableauAmo = cq.from(PfTableauAmo.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTableauAmo, entity), cb.isNotNull(pfTableauAmo.get(PfTableauAmo_.idnatureEnc)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfNatureEnc findIdnatureEnc(PfTableauAmo entity) {
        return this.getMergedEntity(entity).getIdnatureEnc();
    }

    public boolean isIdnatureDecEmpty(PfTableauAmo entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTableauAmo> pfTableauAmo = cq.from(PfTableauAmo.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTableauAmo, entity), cb.isNotNull(pfTableauAmo.get(PfTableauAmo_.idnatureDec)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfNatureDec findIdnatureDec(PfTableauAmo entity) {
        return this.getMergedEntity(entity).getIdnatureDec();
    }

    public boolean isIdtypeEncEmpty(PfTableauAmo entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTableauAmo> pfTableauAmo = cq.from(PfTableauAmo.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTableauAmo, entity), cb.isNotNull(pfTableauAmo.get(PfTableauAmo_.idtypeEnc)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfTypeEnc findIdtypeEnc(PfTableauAmo entity) {
        return this.getMergedEntity(entity).getIdtypeEnc();
    }

    public boolean isIdpfSupportsEmpty(PfTableauAmo entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTableauAmo> pfTableauAmo = cq.from(PfTableauAmo.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTableauAmo, entity), cb.isNotNull(pfTableauAmo.get(PfTableauAmo_.idpfSupports)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfSupports findIdpfSupports(PfTableauAmo entity) {
        return this.getMergedEntity(entity).getIdpfSupports();
    }

    public boolean isIdtypeDecEmpty(PfTableauAmo entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTableauAmo> pfTableauAmo = cq.from(PfTableauAmo.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTableauAmo, entity), cb.isNotNull(pfTableauAmo.get(PfTableauAmo_.idtypeDec)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfTypeDec findIdtypeDec(PfTableauAmo entity) {
        return this.getMergedEntity(entity).getIdtypeDec();
    }

    public boolean isPfEncaissementsListEmpty(PfTableauAmo entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTableauAmo> pfTableauAmo = cq.from(PfTableauAmo.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTableauAmo, entity), cb.isNotEmpty(pfTableauAmo.get(PfTableauAmo_.pfEncaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfEncaissements> findPfEncaissementsList(PfTableauAmo entity) {
        PfTableauAmo mergedEntity = this.getMergedEntity(entity);
        List<PfEncaissements> pfEncaissementsList = mergedEntity.getPfEncaissementsList();
        pfEncaissementsList.size();
        return pfEncaissementsList;
    }
    
}
