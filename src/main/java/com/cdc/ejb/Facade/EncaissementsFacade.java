/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Encaissements;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Encaissements_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Pieces;
import com.cdc.ejb.entities.Demandes;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.Caisses;
import com.cdc.ejb.entities.Etablissementfinancier;
import com.cdc.ejb.entities.SysMode;
import com.cdc.ejb.entities.DecNatureoperation;
import com.cdc.ejb.entities.DecRestitution;
import com.cdc.ejb.entities.DecReception;
import com.cdc.ejb.entities.DecAffaires;
import com.cdc.ejb.entities.PiecesTresoreries;
import com.cdc.ejb.entities.Situationdocument;
import com.cdc.ejb.entities.DecDetailsarretes;
import com.cdc.ejb.entities.LigneBdo;
import com.cdc.ejb.entities.Billetage;
import com.cdc.ejb.entities.TreQuittance;
import com.cdc.ejb.entities.Mouvement;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class EncaissementsFacade extends AbstractFacade<Encaissements> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EncaissementsFacade() {
        super(Encaissements.class);
    }

    public boolean isIdPiecesEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotNull(encaissements.get(Encaissements_.idPieces)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Pieces findIdPieces(Encaissements entity) {
        return this.getMergedEntity(entity).getIdPieces();
    }

    public boolean isIddemandesEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotNull(encaissements.get(Encaissements_.iddemandes)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Demandes findIddemandes(Encaissements entity) {
        return this.getMergedEntity(entity).getIddemandes();
    }

    public boolean isNumTiersEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotNull(encaissements.get(Encaissements_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(Encaissements entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }

    public boolean isNumeroCaisseEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotNull(encaissements.get(Encaissements_.numeroCaisse)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Caisses findNumeroCaisse(Encaissements entity) {
        return this.getMergedEntity(entity).getNumeroCaisse();
    }

    public boolean isIDEtablissementFinancierDepartEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotNull(encaissements.get(Encaissements_.iDEtablissementFinancierDepart)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Etablissementfinancier findIDEtablissementFinancierDepart(Encaissements entity) {
        return this.getMergedEntity(entity).getIDEtablissementFinancierDepart();
    }

    public boolean isIDSYSModeEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotNull(encaissements.get(Encaissements_.iDSYSMode)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public SysMode findIDSYSMode(Encaissements entity) {
        return this.getMergedEntity(entity).getIDSYSMode();
    }

    public boolean isIdnatureoperationEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotNull(encaissements.get(Encaissements_.idnatureoperation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecNatureoperation findIdnatureoperation(Encaissements entity) {
        return this.getMergedEntity(entity).getIdnatureoperation();
    }

    public boolean isIDDECRestitutionEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotNull(encaissements.get(Encaissements_.iDDECRestitution)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecRestitution findIDDECRestitution(Encaissements entity) {
        return this.getMergedEntity(entity).getIDDECRestitution();
    }

    public boolean isIDDECReceptionEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotNull(encaissements.get(Encaissements_.iDDECReception)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecReception findIDDECReception(Encaissements entity) {
        return this.getMergedEntity(entity).getIDDECReception();
    }

    public boolean isIdaffairesEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotNull(encaissements.get(Encaissements_.idaffaires)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecAffaires findIdaffaires(Encaissements entity) {
        return this.getMergedEntity(entity).getIdaffaires();
    }

    public boolean isPiecesTresoreriesListEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotEmpty(encaissements.get(Encaissements_.piecesTresoreriesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PiecesTresoreries> findPiecesTresoreriesList(Encaissements entity) {
        Encaissements mergedEntity = this.getMergedEntity(entity);
        List<PiecesTresoreries> piecesTresoreriesList = mergedEntity.getPiecesTresoreriesList();
        piecesTresoreriesList.size();
        return piecesTresoreriesList;
    }

    public boolean isSituationdocumentListEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotEmpty(encaissements.get(Encaissements_.situationdocumentList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Situationdocument> findSituationdocumentList(Encaissements entity) {
        Encaissements mergedEntity = this.getMergedEntity(entity);
        List<Situationdocument> situationdocumentList = mergedEntity.getSituationdocumentList();
        situationdocumentList.size();
        return situationdocumentList;
    }

    public boolean isDecDetailsarretesListEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotEmpty(encaissements.get(Encaissements_.decDetailsarretesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecDetailsarretes> findDecDetailsarretesList(Encaissements entity) {
        Encaissements mergedEntity = this.getMergedEntity(entity);
        List<DecDetailsarretes> decDetailsarretesList = mergedEntity.getDecDetailsarretesList();
        decDetailsarretesList.size();
        return decDetailsarretesList;
    }

    public boolean isLigneBdoListEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotEmpty(encaissements.get(Encaissements_.ligneBdoList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<LigneBdo> findLigneBdoList(Encaissements entity) {
        Encaissements mergedEntity = this.getMergedEntity(entity);
        List<LigneBdo> ligneBdoList = mergedEntity.getLigneBdoList();
        ligneBdoList.size();
        return ligneBdoList;
    }

    public boolean isBilletageListEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotEmpty(encaissements.get(Encaissements_.billetageList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Billetage> findBilletageList(Encaissements entity) {
        Encaissements mergedEntity = this.getMergedEntity(entity);
        List<Billetage> billetageList = mergedEntity.getBilletageList();
        billetageList.size();
        return billetageList;
    }

    public boolean isTreQuittanceListEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotEmpty(encaissements.get(Encaissements_.treQuittanceList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<TreQuittance> findTreQuittanceList(Encaissements entity) {
        Encaissements mergedEntity = this.getMergedEntity(entity);
        List<TreQuittance> treQuittanceList = mergedEntity.getTreQuittanceList();
        treQuittanceList.size();
        return treQuittanceList;
    }

    public boolean isMouvementListEmpty(Encaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Encaissements> encaissements = cq.from(Encaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(encaissements, entity), cb.isNotEmpty(encaissements.get(Encaissements_.mouvementList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Mouvement> findMouvementList(Encaissements entity) {
        Encaissements mergedEntity = this.getMergedEntity(entity);
        List<Mouvement> mouvementList = mergedEntity.getMouvementList();
        mouvementList.size();
        return mouvementList;
    }
    
}
