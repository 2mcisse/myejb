/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Actionsccaisses;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Actionsccaisses_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Caisses;
import com.cdc.ejb.entities.Tiers;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class ActionsccaissesFacade extends AbstractFacade<Actionsccaisses> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ActionsccaissesFacade() {
        super(Actionsccaisses.class);
    }

    public boolean isNumeroCaisseEmpty(Actionsccaisses entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Actionsccaisses> actionsccaisses = cq.from(Actionsccaisses.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(actionsccaisses, entity), cb.isNotNull(actionsccaisses.get(Actionsccaisses_.numeroCaisse)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Caisses findNumeroCaisse(Actionsccaisses entity) {
        return this.getMergedEntity(entity).getNumeroCaisse();
    }

    public boolean isNumTiersEmpty(Actionsccaisses entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Actionsccaisses> actionsccaisses = cq.from(Actionsccaisses.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(actionsccaisses, entity), cb.isNotNull(actionsccaisses.get(Actionsccaisses_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(Actionsccaisses entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }
    
}
