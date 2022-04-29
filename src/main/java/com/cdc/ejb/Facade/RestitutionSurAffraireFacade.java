/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.RestitutionSurAffraire;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.RestitutionSurAffraire_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.DecAffaires;
import com.cdc.ejb.entities.DemandesRestitution;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class RestitutionSurAffraireFacade extends AbstractFacade<RestitutionSurAffraire> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RestitutionSurAffraireFacade() {
        super(RestitutionSurAffraire.class);
    }

    public boolean isIdaffairesEmpty(RestitutionSurAffraire entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<RestitutionSurAffraire> restitutionSurAffraire = cq.from(RestitutionSurAffraire.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(restitutionSurAffraire, entity), cb.isNotNull(restitutionSurAffraire.get(RestitutionSurAffraire_.idaffaires)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecAffaires findIdaffaires(RestitutionSurAffraire entity) {
        return this.getMergedEntity(entity).getIdaffaires();
    }

    public boolean isCodeDemRestEmpty(RestitutionSurAffraire entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<RestitutionSurAffraire> restitutionSurAffraire = cq.from(RestitutionSurAffraire.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(restitutionSurAffraire, entity), cb.isNotNull(restitutionSurAffraire.get(RestitutionSurAffraire_.codeDemRest)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DemandesRestitution findCodeDemRest(RestitutionSurAffraire entity) {
        return this.getMergedEntity(entity).getCodeDemRest();
    }
    
}
