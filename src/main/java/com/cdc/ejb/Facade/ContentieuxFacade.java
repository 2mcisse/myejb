/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Contentieux;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Contentieux_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Pieces;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.Etapes;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class ContentieuxFacade extends AbstractFacade<Contentieux> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContentieuxFacade() {
        super(Contentieux.class);
    }

    public boolean isPiecesListEmpty(Contentieux entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Contentieux> contentieux = cq.from(Contentieux.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(contentieux, entity), cb.isNotEmpty(contentieux.get(Contentieux_.piecesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Pieces> findPiecesList(Contentieux entity) {
        Contentieux mergedEntity = this.getMergedEntity(entity);
        List<Pieces> piecesList = mergedEntity.getPiecesList();
        piecesList.size();
        return piecesList;
    }

    public boolean isNumTiersEmpty(Contentieux entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Contentieux> contentieux = cq.from(Contentieux.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(contentieux, entity), cb.isNotNull(contentieux.get(Contentieux_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(Contentieux entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }

    public boolean isEtapesListEmpty(Contentieux entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Contentieux> contentieux = cq.from(Contentieux.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(contentieux, entity), cb.isNotEmpty(contentieux.get(Contentieux_.etapesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Etapes> findEtapesList(Contentieux entity) {
        Contentieux mergedEntity = this.getMergedEntity(entity);
        List<Etapes> etapesList = mergedEntity.getEtapesList();
        etapesList.size();
        return etapesList;
    }
    
}
