/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Remarques;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Remarques_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Courriers;
import com.cdc.ejb.entities.Tiers;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class RemarquesFacade extends AbstractFacade<Remarques> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RemarquesFacade() {
        super(Remarques.class);
    }

    public boolean isIDDocumentsEmpty(Remarques entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Remarques> remarques = cq.from(Remarques.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(remarques, entity), cb.isNotNull(remarques.get(Remarques_.iDDocuments)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Courriers findIDDocuments(Remarques entity) {
        return this.getMergedEntity(entity).getIDDocuments();
    }

    public boolean isNumTiersEmpty(Remarques entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Remarques> remarques = cq.from(Remarques.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(remarques, entity), cb.isNotNull(remarques.get(Remarques_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(Remarques entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }
    
}
