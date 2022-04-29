/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.AchMarches;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.AchMarches_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Preselection;
import com.cdc.ejb.entities.AchNatureMarche;
import com.cdc.ejb.entities.AchLignesplanPassation;
import com.cdc.ejb.entities.AchTypemarche;
import com.cdc.ejb.entities.AchModeEvaluation;
import com.cdc.ejb.entities.Pieces;
import com.cdc.ejb.entities.Reunions;
import com.cdc.ejb.entities.Etapes;
import com.cdc.ejb.entities.AchComites;
import com.cdc.ejb.entities.Offres;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class AchMarchesFacade extends AbstractFacade<AchMarches> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AchMarchesFacade() {
        super(AchMarches.class);
    }

    public boolean isPreselectionListEmpty(AchMarches entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchMarches> achMarches = cq.from(AchMarches.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achMarches, entity), cb.isNotEmpty(achMarches.get(AchMarches_.preselectionList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Preselection> findPreselectionList(AchMarches entity) {
        AchMarches mergedEntity = this.getMergedEntity(entity);
        List<Preselection> preselectionList = mergedEntity.getPreselectionList();
        preselectionList.size();
        return preselectionList;
    }

    public boolean isIdnatureMarcheEmpty(AchMarches entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchMarches> achMarches = cq.from(AchMarches.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achMarches, entity), cb.isNotNull(achMarches.get(AchMarches_.idnatureMarche)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public AchNatureMarche findIdnatureMarche(AchMarches entity) {
        return this.getMergedEntity(entity).getIdnatureMarche();
    }

    public boolean isIdachLignesplanPassationEmpty(AchMarches entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchMarches> achMarches = cq.from(AchMarches.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achMarches, entity), cb.isNotNull(achMarches.get(AchMarches_.idachLignesplanPassation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public AchLignesplanPassation findIdachLignesplanPassation(AchMarches entity) {
        return this.getMergedEntity(entity).getIdachLignesplanPassation();
    }

    public boolean isIDTypeEmpty(AchMarches entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchMarches> achMarches = cq.from(AchMarches.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achMarches, entity), cb.isNotNull(achMarches.get(AchMarches_.iDType)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public AchTypemarche findIDType(AchMarches entity) {
        return this.getMergedEntity(entity).getIDType();
    }

    public boolean isIdachModeEvaluationEmpty(AchMarches entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchMarches> achMarches = cq.from(AchMarches.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achMarches, entity), cb.isNotNull(achMarches.get(AchMarches_.idachModeEvaluation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public AchModeEvaluation findIdachModeEvaluation(AchMarches entity) {
        return this.getMergedEntity(entity).getIdachModeEvaluation();
    }

    public boolean isPiecesListEmpty(AchMarches entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchMarches> achMarches = cq.from(AchMarches.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achMarches, entity), cb.isNotEmpty(achMarches.get(AchMarches_.piecesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Pieces> findPiecesList(AchMarches entity) {
        AchMarches mergedEntity = this.getMergedEntity(entity);
        List<Pieces> piecesList = mergedEntity.getPiecesList();
        piecesList.size();
        return piecesList;
    }

    public boolean isReunionsListEmpty(AchMarches entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchMarches> achMarches = cq.from(AchMarches.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achMarches, entity), cb.isNotEmpty(achMarches.get(AchMarches_.reunionsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Reunions> findReunionsList(AchMarches entity) {
        AchMarches mergedEntity = this.getMergedEntity(entity);
        List<Reunions> reunionsList = mergedEntity.getReunionsList();
        reunionsList.size();
        return reunionsList;
    }

    public boolean isEtapesListEmpty(AchMarches entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchMarches> achMarches = cq.from(AchMarches.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achMarches, entity), cb.isNotEmpty(achMarches.get(AchMarches_.etapesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Etapes> findEtapesList(AchMarches entity) {
        AchMarches mergedEntity = this.getMergedEntity(entity);
        List<Etapes> etapesList = mergedEntity.getEtapesList();
        etapesList.size();
        return etapesList;
    }

    public boolean isAchComitesListEmpty(AchMarches entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchMarches> achMarches = cq.from(AchMarches.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achMarches, entity), cb.isNotEmpty(achMarches.get(AchMarches_.achComitesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<AchComites> findAchComitesList(AchMarches entity) {
        AchMarches mergedEntity = this.getMergedEntity(entity);
        List<AchComites> achComitesList = mergedEntity.getAchComitesList();
        achComitesList.size();
        return achComitesList;
    }

    public boolean isOffresListEmpty(AchMarches entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchMarches> achMarches = cq.from(AchMarches.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achMarches, entity), cb.isNotEmpty(achMarches.get(AchMarches_.offresList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Offres> findOffresList(AchMarches entity) {
        AchMarches mergedEntity = this.getMergedEntity(entity);
        List<Offres> offresList = mergedEntity.getOffresList();
        offresList.size();
        return offresList;
    }
    
}
