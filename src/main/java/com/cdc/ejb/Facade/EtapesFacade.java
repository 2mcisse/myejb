/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Etapes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Etapes_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.AchMarches;
import com.cdc.ejb.entities.Contentieux;
import com.cdc.ejb.entities.Contrats;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class EtapesFacade extends AbstractFacade<Etapes> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EtapesFacade() {
        super(Etapes.class);
    }

    public boolean isIDMarcheEmpty(Etapes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Etapes> etapes = cq.from(Etapes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(etapes, entity), cb.isNotNull(etapes.get(Etapes_.iDMarche)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public AchMarches findIDMarche(Etapes entity) {
        return this.getMergedEntity(entity).getIDMarche();
    }

    public boolean isIDContentieuxEmpty(Etapes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Etapes> etapes = cq.from(Etapes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(etapes, entity), cb.isNotNull(etapes.get(Etapes_.iDContentieux)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Contentieux findIDContentieux(Etapes entity) {
        return this.getMergedEntity(entity).getIDContentieux();
    }

    public boolean isNumContratEmpty(Etapes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Etapes> etapes = cq.from(Etapes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(etapes, entity), cb.isNotNull(etapes.get(Etapes_.numContrat)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Contrats findNumContrat(Etapes entity) {
        return this.getMergedEntity(entity).getNumContrat();
    }
    
}
