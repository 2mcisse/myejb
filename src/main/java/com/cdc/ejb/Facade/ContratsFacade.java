/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Contrats;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Contrats_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Pieces;
import com.cdc.ejb.entities.Etapes;
import com.cdc.ejb.entities.Typecontrat;
import com.cdc.ejb.entities.Tiers;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class ContratsFacade extends AbstractFacade<Contrats> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContratsFacade() {
        super(Contrats.class);
    }

    public boolean isPiecesListEmpty(Contrats entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Contrats> contrats = cq.from(Contrats.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(contrats, entity), cb.isNotEmpty(contrats.get(Contrats_.piecesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Pieces> findPiecesList(Contrats entity) {
        Contrats mergedEntity = this.getMergedEntity(entity);
        List<Pieces> piecesList = mergedEntity.getPiecesList();
        piecesList.size();
        return piecesList;
    }

    public boolean isEtapesListEmpty(Contrats entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Contrats> contrats = cq.from(Contrats.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(contrats, entity), cb.isNotEmpty(contrats.get(Contrats_.etapesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Etapes> findEtapesList(Contrats entity) {
        Contrats mergedEntity = this.getMergedEntity(entity);
        List<Etapes> etapesList = mergedEntity.getEtapesList();
        etapesList.size();
        return etapesList;
    }

    public boolean isIDTypeContratEmpty(Contrats entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Contrats> contrats = cq.from(Contrats.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(contrats, entity), cb.isNotNull(contrats.get(Contrats_.iDTypeContrat)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Typecontrat findIDTypeContrat(Contrats entity) {
        return this.getMergedEntity(entity).getIDTypeContrat();
    }

    public boolean isNumTiersEmpty(Contrats entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Contrats> contrats = cq.from(Contrats.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(contrats, entity), cb.isNotNull(contrats.get(Contrats_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(Contrats entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }
    
}
