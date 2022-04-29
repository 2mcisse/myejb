/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Pieces;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Pieces_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Encaissements;
import com.cdc.ejb.entities.TypePieces;
import com.cdc.ejb.entities.DecReception;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.AchMarches;
import com.cdc.ejb.entities.Courriers;
import com.cdc.ejb.entities.Contrats;
import com.cdc.ejb.entities.Contentieux;
import com.cdc.ejb.entities.BudEngagement;
import com.cdc.ejb.entities.BudLiquidation;
import com.cdc.ejb.entities.DecRestitution;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PiecesFacade extends AbstractFacade<Pieces> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PiecesFacade() {
        super(Pieces.class);
    }

    public boolean isEncaissementsListEmpty(Pieces entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Pieces> pieces = cq.from(Pieces.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pieces, entity), cb.isNotEmpty(pieces.get(Pieces_.encaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Encaissements> findEncaissementsList(Pieces entity) {
        Pieces mergedEntity = this.getMergedEntity(entity);
        List<Encaissements> encaissementsList = mergedEntity.getEncaissementsList();
        encaissementsList.size();
        return encaissementsList;
    }

    public boolean isCodePieceEmpty(Pieces entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Pieces> pieces = cq.from(Pieces.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pieces, entity), cb.isNotNull(pieces.get(Pieces_.codePiece)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public TypePieces findCodePiece(Pieces entity) {
        return this.getMergedEntity(entity).getCodePiece();
    }

    public boolean isIDDECReceptionEmpty(Pieces entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Pieces> pieces = cq.from(Pieces.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pieces, entity), cb.isNotNull(pieces.get(Pieces_.iDDECReception)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecReception findIDDECReception(Pieces entity) {
        return this.getMergedEntity(entity).getIDDECReception();
    }

    public boolean isNumFournisseurEmpty(Pieces entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Pieces> pieces = cq.from(Pieces.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pieces, entity), cb.isNotNull(pieces.get(Pieces_.numFournisseur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumFournisseur(Pieces entity) {
        return this.getMergedEntity(entity).getNumFournisseur();
    }

    public boolean isIDMarcheEmpty(Pieces entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Pieces> pieces = cq.from(Pieces.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pieces, entity), cb.isNotNull(pieces.get(Pieces_.iDMarche)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public AchMarches findIDMarche(Pieces entity) {
        return this.getMergedEntity(entity).getIDMarche();
    }

    public boolean isIDDocumentsEmpty(Pieces entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Pieces> pieces = cq.from(Pieces.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pieces, entity), cb.isNotNull(pieces.get(Pieces_.iDDocuments)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Courriers findIDDocuments(Pieces entity) {
        return this.getMergedEntity(entity).getIDDocuments();
    }

    public boolean isNumContratEmpty(Pieces entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Pieces> pieces = cq.from(Pieces.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pieces, entity), cb.isNotNull(pieces.get(Pieces_.numContrat)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Contrats findNumContrat(Pieces entity) {
        return this.getMergedEntity(entity).getNumContrat();
    }

    public boolean isIDContentieuxEmpty(Pieces entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Pieces> pieces = cq.from(Pieces.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pieces, entity), cb.isNotNull(pieces.get(Pieces_.iDContentieux)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Contentieux findIDContentieux(Pieces entity) {
        return this.getMergedEntity(entity).getIDContentieux();
    }

    public boolean isIDBUDEngagementEmpty(Pieces entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Pieces> pieces = cq.from(Pieces.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pieces, entity), cb.isNotNull(pieces.get(Pieces_.iDBUDEngagement)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudEngagement findIDBUDEngagement(Pieces entity) {
        return this.getMergedEntity(entity).getIDBUDEngagement();
    }

    public boolean isIDBUDLiquidationEmpty(Pieces entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Pieces> pieces = cq.from(Pieces.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pieces, entity), cb.isNotNull(pieces.get(Pieces_.iDBUDLiquidation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public BudLiquidation findIDBUDLiquidation(Pieces entity) {
        return this.getMergedEntity(entity).getIDBUDLiquidation();
    }

    public boolean isIDDECRestitutionEmpty(Pieces entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Pieces> pieces = cq.from(Pieces.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pieces, entity), cb.isNotNull(pieces.get(Pieces_.iDDECRestitution)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecRestitution findIDDECRestitution(Pieces entity) {
        return this.getMergedEntity(entity).getIDDECRestitution();
    }
    
}
