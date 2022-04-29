/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Mandataires;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Mandataires_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Tiers;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class MandatairesFacade extends AbstractFacade<Mandataires> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MandatairesFacade() {
        super(Mandataires.class);
    }

    public boolean isNumTiersEmpty(Mandataires entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Mandataires> mandataires = cq.from(Mandataires.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(mandataires, entity), cb.isNotNull(mandataires.get(Mandataires_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(Mandataires entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }
    
}
