/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Produit;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Produit_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.Categorie;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class ProduitFacade extends AbstractFacade<Produit> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProduitFacade() {
        super(Produit.class);
    }

    public boolean isNumTiersEmpty(Produit entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Produit> produit = cq.from(Produit.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(produit, entity), cb.isNotNull(produit.get(Produit_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(Produit entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }

    public boolean isLibcategorieEmpty(Produit entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Produit> produit = cq.from(Produit.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(produit, entity), cb.isNotNull(produit.get(Produit_.libcategorie)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Categorie findLibcategorie(Produit entity) {
        return this.getMergedEntity(entity).getLibcategorie();
    }
    
}
