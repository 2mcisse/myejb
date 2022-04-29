/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Gerer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Gerer_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.Portefeuilles;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class GererFacade extends AbstractFacade<Gerer> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GererFacade() {
        super(Gerer.class);
    }

    public boolean isNumTiersEmpty(Gerer entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Gerer> gerer = cq.from(Gerer.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(gerer, entity), cb.isNotNull(gerer.get(Gerer_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(Gerer entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }

    public boolean isIDPortefeuillesEmpty(Gerer entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Gerer> gerer = cq.from(Gerer.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(gerer, entity), cb.isNotNull(gerer.get(Gerer_.iDPortefeuilles)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Portefeuilles findIDPortefeuilles(Gerer entity) {
        return this.getMergedEntity(entity).getIDPortefeuilles();
    }
    
}
