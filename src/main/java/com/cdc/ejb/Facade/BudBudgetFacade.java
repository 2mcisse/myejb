/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.BudBudget;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.BudBudget_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.BudA;
import com.cdc.ejb.entities.BudB;
import com.cdc.ejb.entities.Compte;
import com.cdc.ejb.entities.BudC;
import com.cdc.ejb.entities.BudDmri;
import com.cdc.ejb.entities.BudMvtbud;
import com.cdc.ejb.entities.BudEngagementannule;
import com.cdc.ejb.entities.Ordresdepaiement;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class BudBudgetFacade extends AbstractFacade<BudBudget> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BudBudgetFacade() {
        super(BudBudget.class);
    }

    public boolean isIdbudAEmpty(BudBudget entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudBudget> budBudget = cq.from(BudBudget.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budBudget, entity), cb.isNotNull(budBudget.get(BudBudget_.idbudA)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudA findIdbudA(BudBudget entity) {
        return this.getMergedEntity(entity).getIdbudA();
    }

    public boolean isIdbudBEmpty(BudBudget entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudBudget> budBudget = cq.from(BudBudget.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budBudget, entity), cb.isNotNull(budBudget.get(BudBudget_.idbudB)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudB findIdbudB(BudBudget entity) {
        return this.getMergedEntity(entity).getIdbudB();
    }

    public boolean isNumeroCompteEmpty(BudBudget entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudBudget> budBudget = cq.from(BudBudget.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budBudget, entity), cb.isNotNull(budBudget.get(BudBudget_.numeroCompte)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Compte findNumeroCompte(BudBudget entity) {
        return this.getMergedEntity(entity).getNumeroCompte();
    }

    public boolean isIdbudCEmpty(BudBudget entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudBudget> budBudget = cq.from(BudBudget.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budBudget, entity), cb.isNotNull(budBudget.get(BudBudget_.idbudC)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudC findIdbudC(BudBudget entity) {
        return this.getMergedEntity(entity).getIdbudC();
    }

    public boolean isBudDmriListEmpty(BudBudget entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudBudget> budBudget = cq.from(BudBudget.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budBudget, entity), cb.isNotEmpty(budBudget.get(BudBudget_.budDmriList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<BudDmri> findBudDmriList(BudBudget entity) {
        BudBudget mergedEntity = this.getMergedEntity(entity);
        List<BudDmri> budDmriList = mergedEntity.getBudDmriList();
        budDmriList.size();
        return budDmriList;
    }

    public boolean isBudMvtbudListEmpty(BudBudget entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudBudget> budBudget = cq.from(BudBudget.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budBudget, entity), cb.isNotEmpty(budBudget.get(BudBudget_.budMvtbudList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<BudMvtbud> findBudMvtbudList(BudBudget entity) {
        BudBudget mergedEntity = this.getMergedEntity(entity);
        List<BudMvtbud> budMvtbudList = mergedEntity.getBudMvtbudList();
        budMvtbudList.size();
        return budMvtbudList;
    }

    public boolean isBudEngagementannuleListEmpty(BudBudget entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudBudget> budBudget = cq.from(BudBudget.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budBudget, entity), cb.isNotEmpty(budBudget.get(BudBudget_.budEngagementannuleList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<BudEngagementannule> findBudEngagementannuleList(BudBudget entity) {
        BudBudget mergedEntity = this.getMergedEntity(entity);
        List<BudEngagementannule> budEngagementannuleList = mergedEntity.getBudEngagementannuleList();
        budEngagementannuleList.size();
        return budEngagementannuleList;
    }

    public boolean isOrdresdepaiementListEmpty(BudBudget entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<BudBudget> budBudget = cq.from(BudBudget.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(budBudget, entity), cb.isNotEmpty(budBudget.get(BudBudget_.ordresdepaiementList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Ordresdepaiement> findOrdresdepaiementList(BudBudget entity) {
        BudBudget mergedEntity = this.getMergedEntity(entity);
        List<Ordresdepaiement> ordresdepaiementList = mergedEntity.getOrdresdepaiementList();
        ordresdepaiementList.size();
        return ordresdepaiementList;
    }
    
}
