/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Categorie;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Categorie_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Produit;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class CategorieFacade extends AbstractFacade<Categorie> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategorieFacade() {
        super(Categorie.class);
    }

    public boolean isProduitListEmpty(Categorie entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Categorie> categorie = cq.from(Categorie.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(categorie, entity), cb.isNotEmpty(categorie.get(Categorie_.produitList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Produit> findProduitList(Categorie entity) {
        Categorie mergedEntity = this.getMergedEntity(entity);
        List<Produit> produitList = mergedEntity.getProduitList();
        produitList.size();
        return produitList;
    }
    
}
