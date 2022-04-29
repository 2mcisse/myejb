/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Compte;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Compte_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.BudTyperetenues;
import com.cdc.ejb.entities.BudBudget;
import com.cdc.ejb.entities.Classes;
import com.cdc.ejb.entities.Ligneecriture;
import com.cdc.ejb.entities.DecNatureoperation;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class CompteFacade extends AbstractFacade<Compte> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompteFacade() {
        super(Compte.class);
    }

    public boolean isBudTyperetenuesListEmpty(Compte entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Compte> compte = cq.from(Compte.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(compte, entity), cb.isNotEmpty(compte.get(Compte_.budTyperetenuesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<BudTyperetenues> findBudTyperetenuesList(Compte entity) {
        Compte mergedEntity = this.getMergedEntity(entity);
        List<BudTyperetenues> budTyperetenuesList = mergedEntity.getBudTyperetenuesList();
        budTyperetenuesList.size();
        return budTyperetenuesList;
    }

    public boolean isBudBudgetListEmpty(Compte entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Compte> compte = cq.from(Compte.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(compte, entity), cb.isNotEmpty(compte.get(Compte_.budBudgetList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<BudBudget> findBudBudgetList(Compte entity) {
        Compte mergedEntity = this.getMergedEntity(entity);
        List<BudBudget> budBudgetList = mergedEntity.getBudBudgetList();
        budBudgetList.size();
        return budBudgetList;
    }

    public boolean isCodeClasseEmpty(Compte entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Compte> compte = cq.from(Compte.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(compte, entity), cb.isNotNull(compte.get(Compte_.codeClasse)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Classes findCodeClasse(Compte entity) {
        return this.getMergedEntity(entity).getCodeClasse();
    }

    public boolean isLigneecritureListEmpty(Compte entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Compte> compte = cq.from(Compte.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(compte, entity), cb.isNotEmpty(compte.get(Compte_.ligneecritureList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Ligneecriture> findLigneecritureList(Compte entity) {
        Compte mergedEntity = this.getMergedEntity(entity);
        List<Ligneecriture> ligneecritureList = mergedEntity.getLigneecritureList();
        ligneecritureList.size();
        return ligneecritureList;
    }

    public boolean isDecNatureoperationListEmpty(Compte entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Compte> compte = cq.from(Compte.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(compte, entity), cb.isNotEmpty(compte.get(Compte_.decNatureoperationList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecNatureoperation> findDecNatureoperationList(Compte entity) {
        Compte mergedEntity = this.getMergedEntity(entity);
        List<DecNatureoperation> decNatureoperationList = mergedEntity.getDecNatureoperationList();
        decNatureoperationList.size();
        return decNatureoperationList;
    }
    
}
