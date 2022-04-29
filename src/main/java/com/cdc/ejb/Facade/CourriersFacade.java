/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Courriers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Courriers_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Representantsgroupe;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.Typecourriers;
import com.cdc.ejb.entities.Actions;
import com.cdc.ejb.entities.Naturecourrier;
import com.cdc.ejb.entities.Services;
import com.cdc.ejb.entities.Pieces;
import com.cdc.ejb.entities.Situationdocument;
import com.cdc.ejb.entities.Journalcourriers;
import com.cdc.ejb.entities.Remarques;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class CourriersFacade extends AbstractFacade<Courriers> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CourriersFacade() {
        super(Courriers.class);
    }

    public boolean isRepresentantsgroupeListEmpty(Courriers entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Courriers> courriers = cq.from(Courriers.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(courriers, entity), cb.isNotEmpty(courriers.get(Courriers_.representantsgroupeList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Representantsgroupe> findRepresentantsgroupeList(Courriers entity) {
        Courriers mergedEntity = this.getMergedEntity(entity);
        List<Representantsgroupe> representantsgroupeList = mergedEntity.getRepresentantsgroupeList();
        representantsgroupeList.size();
        return representantsgroupeList;
    }

    public boolean isNumTiersEmpty(Courriers entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Courriers> courriers = cq.from(Courriers.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(courriers, entity), cb.isNotNull(courriers.get(Courriers_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(Courriers entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }

    public boolean isIDTypeCourriersEmpty(Courriers entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Courriers> courriers = cq.from(Courriers.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(courriers, entity), cb.isNotNull(courriers.get(Courriers_.iDTypeCourriers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Typecourriers findIDTypeCourriers(Courriers entity) {
        return this.getMergedEntity(entity).getIDTypeCourriers();
    }

    public boolean isIdactionsEmpty(Courriers entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Courriers> courriers = cq.from(Courriers.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(courriers, entity), cb.isNotNull(courriers.get(Courriers_.idactions)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Actions findIdactions(Courriers entity) {
        return this.getMergedEntity(entity).getIdactions();
    }

    public boolean isIDNatureCourrierEmpty(Courriers entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Courriers> courriers = cq.from(Courriers.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(courriers, entity), cb.isNotNull(courriers.get(Courriers_.iDNatureCourrier)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Naturecourrier findIDNatureCourrier(Courriers entity) {
        return this.getMergedEntity(entity).getIDNatureCourrier();
    }

    public boolean isIdservicesEmpty(Courriers entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Courriers> courriers = cq.from(Courriers.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(courriers, entity), cb.isNotNull(courriers.get(Courriers_.idservices)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Services findIdservices(Courriers entity) {
        return this.getMergedEntity(entity).getIdservices();
    }

    public boolean isPiecesListEmpty(Courriers entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Courriers> courriers = cq.from(Courriers.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(courriers, entity), cb.isNotEmpty(courriers.get(Courriers_.piecesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Pieces> findPiecesList(Courriers entity) {
        Courriers mergedEntity = this.getMergedEntity(entity);
        List<Pieces> piecesList = mergedEntity.getPiecesList();
        piecesList.size();
        return piecesList;
    }

    public boolean isSituationdocumentListEmpty(Courriers entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Courriers> courriers = cq.from(Courriers.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(courriers, entity), cb.isNotEmpty(courriers.get(Courriers_.situationdocumentList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Situationdocument> findSituationdocumentList(Courriers entity) {
        Courriers mergedEntity = this.getMergedEntity(entity);
        List<Situationdocument> situationdocumentList = mergedEntity.getSituationdocumentList();
        situationdocumentList.size();
        return situationdocumentList;
    }

    public boolean isJournalcourriersListEmpty(Courriers entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Courriers> courriers = cq.from(Courriers.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(courriers, entity), cb.isNotEmpty(courriers.get(Courriers_.journalcourriersList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Journalcourriers> findJournalcourriersList(Courriers entity) {
        Courriers mergedEntity = this.getMergedEntity(entity);
        List<Journalcourriers> journalcourriersList = mergedEntity.getJournalcourriersList();
        journalcourriersList.size();
        return journalcourriersList;
    }

    public boolean isRemarquesListEmpty(Courriers entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Courriers> courriers = cq.from(Courriers.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(courriers, entity), cb.isNotEmpty(courriers.get(Courriers_.remarquesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Remarques> findRemarquesList(Courriers entity) {
        Courriers mergedEntity = this.getMergedEntity(entity);
        List<Remarques> remarquesList = mergedEntity.getRemarquesList();
        remarquesList.size();
        return remarquesList;
    }
    
}
