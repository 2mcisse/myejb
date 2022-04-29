/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Ordresdepaiement;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Ordresdepaiement_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Decaissements;
import com.cdc.ejb.entities.BudBudget;
import com.cdc.ejb.entities.BudLiquidation;
import com.cdc.ejb.entities.BudDmri;
import com.cdc.ejb.entities.DecRestitution;
import com.cdc.ejb.entities.BudRetenues;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class OrdresdepaiementFacade extends AbstractFacade<Ordresdepaiement> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdresdepaiementFacade() {
        super(Ordresdepaiement.class);
    }

    public boolean isDecaissementsListEmpty(Ordresdepaiement entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Ordresdepaiement> ordresdepaiement = cq.from(Ordresdepaiement.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(ordresdepaiement, entity), cb.isNotEmpty(ordresdepaiement.get(Ordresdepaiement_.decaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Decaissements> findDecaissementsList(Ordresdepaiement entity) {
        Ordresdepaiement mergedEntity = this.getMergedEntity(entity);
        List<Decaissements> decaissementsList = mergedEntity.getDecaissementsList();
        decaissementsList.size();
        return decaissementsList;
    }

    public boolean isIDBUDBudgetEmpty(Ordresdepaiement entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Ordresdepaiement> ordresdepaiement = cq.from(Ordresdepaiement.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(ordresdepaiement, entity), cb.isNotNull(ordresdepaiement.get(Ordresdepaiement_.iDBUDBudget)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudBudget findIDBUDBudget(Ordresdepaiement entity) {
        return this.getMergedEntity(entity).getIDBUDBudget();
    }

    public boolean isIDBUDLiquidationEmpty(Ordresdepaiement entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Ordresdepaiement> ordresdepaiement = cq.from(Ordresdepaiement.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(ordresdepaiement, entity), cb.isNotNull(ordresdepaiement.get(Ordresdepaiement_.iDBUDLiquidation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudLiquidation findIDBUDLiquidation(Ordresdepaiement entity) {
        return this.getMergedEntity(entity).getIDBUDLiquidation();
    }

    public boolean isIdbudDmriEmpty(Ordresdepaiement entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Ordresdepaiement> ordresdepaiement = cq.from(Ordresdepaiement.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(ordresdepaiement, entity), cb.isNotNull(ordresdepaiement.get(Ordresdepaiement_.idbudDmri)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudDmri findIdbudDmri(Ordresdepaiement entity) {
        return this.getMergedEntity(entity).getIdbudDmri();
    }

    public boolean isIDDECRestitutionEmpty(Ordresdepaiement entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Ordresdepaiement> ordresdepaiement = cq.from(Ordresdepaiement.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(ordresdepaiement, entity), cb.isNotNull(ordresdepaiement.get(Ordresdepaiement_.iDDECRestitution)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecRestitution findIDDECRestitution(Ordresdepaiement entity) {
        return this.getMergedEntity(entity).getIDDECRestitution();
    }

    public boolean isBudRetenuesListEmpty(Ordresdepaiement entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Ordresdepaiement> ordresdepaiement = cq.from(Ordresdepaiement.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(ordresdepaiement, entity), cb.isNotEmpty(ordresdepaiement.get(Ordresdepaiement_.budRetenuesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<BudRetenues> findBudRetenuesList(Ordresdepaiement entity) {
        Ordresdepaiement mergedEntity = this.getMergedEntity(entity);
        List<BudRetenues> budRetenuesList = mergedEntity.getBudRetenuesList();
        budRetenuesList.size();
        return budRetenuesList;
    }
    
}
