/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.RestitutionSurAffaireAr;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.RestitutionSurAffaireAr_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.DecAffaires;
import com.cdc.ejb.entities.DecAutorisationderestitution;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class RestitutionSurAffaireArFacade extends AbstractFacade<RestitutionSurAffaireAr> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RestitutionSurAffaireArFacade() {
        super(RestitutionSurAffaireAr.class);
    }

    public boolean isIdaffairesEmpty(RestitutionSurAffaireAr entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<RestitutionSurAffaireAr> restitutionSurAffaireAr = cq.from(RestitutionSurAffaireAr.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(restitutionSurAffaireAr, entity), cb.isNotNull(restitutionSurAffaireAr.get(RestitutionSurAffaireAr_.idaffaires)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecAffaires findIdaffaires(RestitutionSurAffaireAr entity) {
        return this.getMergedEntity(entity).getIdaffaires();
    }

    public boolean isIDDECAutorisationDeRestitutionEmpty(RestitutionSurAffaireAr entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<RestitutionSurAffaireAr> restitutionSurAffaireAr = cq.from(RestitutionSurAffaireAr.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(restitutionSurAffaireAr, entity), cb.isNotNull(restitutionSurAffaireAr.get(RestitutionSurAffaireAr_.iDDECAutorisationDeRestitution)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecAutorisationderestitution findIDDECAutorisationDeRestitution(RestitutionSurAffaireAr entity) {
        return this.getMergedEntity(entity).getIDDECAutorisationDeRestitution();
    }
    
}
