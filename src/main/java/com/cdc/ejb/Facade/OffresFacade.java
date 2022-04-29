/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Offres;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Offres_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.AchMarches;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class OffresFacade extends AbstractFacade<Offres> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OffresFacade() {
        super(Offres.class);
    }

    public boolean isNumTiersEmpty(Offres entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Offres> offres = cq.from(Offres.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(offres, entity), cb.isNotNull(offres.get(Offres_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(Offres entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }

    public boolean isIDMarcheEmpty(Offres entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Offres> offres = cq.from(Offres.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(offres, entity), cb.isNotNull(offres.get(Offres_.iDMarche)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public AchMarches findIDMarche(Offres entity) {
        return this.getMergedEntity(entity).getIDMarche();
    }
    
}
