/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Categoriestiers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Categoriestiers_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.DecTypeaffaire;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class CategoriestiersFacade extends AbstractFacade<Categoriestiers> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoriestiersFacade() {
        super(Categoriestiers.class);
    }

    public boolean isTiersListEmpty(Categoriestiers entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Categoriestiers> categoriestiers = cq.from(Categoriestiers.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(categoriestiers, entity), cb.isNotEmpty(categoriestiers.get(Categoriestiers_.tiersList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Tiers> findTiersList(Categoriestiers entity) {
        Categoriestiers mergedEntity = this.getMergedEntity(entity);
        List<Tiers> tiersList = mergedEntity.getTiersList();
        tiersList.size();
        return tiersList;
    }

    public boolean isDecTypeaffaireListEmpty(Categoriestiers entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Categoriestiers> categoriestiers = cq.from(Categoriestiers.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(categoriestiers, entity), cb.isNotEmpty(categoriestiers.get(Categoriestiers_.decTypeaffaireList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecTypeaffaire> findDecTypeaffaireList(Categoriestiers entity) {
        Categoriestiers mergedEntity = this.getMergedEntity(entity);
        List<DecTypeaffaire> decTypeaffaireList = mergedEntity.getDecTypeaffaireList();
        decTypeaffaireList.size();
        return decTypeaffaireList;
    }
    
}
