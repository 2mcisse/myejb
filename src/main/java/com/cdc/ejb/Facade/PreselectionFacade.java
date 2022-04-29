/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Preselection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Preselection_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.AchMarches;
import com.cdc.ejb.entities.Tiers;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PreselectionFacade extends AbstractFacade<Preselection> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PreselectionFacade() {
        super(Preselection.class);
    }

    public boolean isIDMarcheEmpty(Preselection entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Preselection> preselection = cq.from(Preselection.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(preselection, entity), cb.isNotNull(preselection.get(Preselection_.iDMarche)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public AchMarches findIDMarche(Preselection entity) {
        return this.getMergedEntity(entity).getIDMarche();
    }

    public boolean isNumTiersEmpty(Preselection entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Preselection> preselection = cq.from(Preselection.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(preselection, entity), cb.isNotNull(preselection.get(Preselection_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(Preselection entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }
    
}
