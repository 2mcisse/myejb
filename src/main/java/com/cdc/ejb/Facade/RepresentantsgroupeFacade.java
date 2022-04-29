/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Representantsgroupe;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Representantsgroupe_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Courriers;
import com.cdc.ejb.entities.Groupes;
import com.cdc.ejb.entities.Tiers;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class RepresentantsgroupeFacade extends AbstractFacade<Representantsgroupe> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RepresentantsgroupeFacade() {
        super(Representantsgroupe.class);
    }

    public boolean isIDDocumentsEmpty(Representantsgroupe entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Representantsgroupe> representantsgroupe = cq.from(Representantsgroupe.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(representantsgroupe, entity), cb.isNotNull(representantsgroupe.get(Representantsgroupe_.iDDocuments)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Courriers findIDDocuments(Representantsgroupe entity) {
        return this.getMergedEntity(entity).getIDDocuments();
    }

    public boolean isNomGroupeEmpty(Representantsgroupe entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Representantsgroupe> representantsgroupe = cq.from(Representantsgroupe.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(representantsgroupe, entity), cb.isNotNull(representantsgroupe.get(Representantsgroupe_.nomGroupe)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Groupes findNomGroupe(Representantsgroupe entity) {
        return this.getMergedEntity(entity).getNomGroupe();
    }

    public boolean isNumTiersEmpty(Representantsgroupe entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Representantsgroupe> representantsgroupe = cq.from(Representantsgroupe.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(representantsgroupe, entity), cb.isNotNull(representantsgroupe.get(Representantsgroupe_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(Representantsgroupe entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }
    
}
