/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Decaissements;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Decaissements_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PiecesTresoreries;
import com.cdc.ejb.entities.Situationdocument;
import com.cdc.ejb.entities.DecDetailsarretes;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.Etablissementfinancier;
import com.cdc.ejb.entities.Caisses;
import com.cdc.ejb.entities.SysMode;
import com.cdc.ejb.entities.DecRestitution;
import com.cdc.ejb.entities.DecReception;
import com.cdc.ejb.entities.DecAffaires;
import com.cdc.ejb.entities.Ordresdepaiement;
import com.cdc.ejb.entities.Demandes;
import com.cdc.ejb.entities.Mouvement;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DecaissementsFacade extends AbstractFacade<Decaissements> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DecaissementsFacade() {
        super(Decaissements.class);
    }

    public boolean isPiecesTresoreriesListEmpty(Decaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Decaissements> decaissements = cq.from(Decaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decaissements, entity), cb.isNotEmpty(decaissements.get(Decaissements_.piecesTresoreriesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PiecesTresoreries> findPiecesTresoreriesList(Decaissements entity) {
        Decaissements mergedEntity = this.getMergedEntity(entity);
        List<PiecesTresoreries> piecesTresoreriesList = mergedEntity.getPiecesTresoreriesList();
        piecesTresoreriesList.size();
        return piecesTresoreriesList;
    }

    public boolean isSituationdocumentListEmpty(Decaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Decaissements> decaissements = cq.from(Decaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decaissements, entity), cb.isNotEmpty(decaissements.get(Decaissements_.situationdocumentList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Situationdocument> findSituationdocumentList(Decaissements entity) {
        Decaissements mergedEntity = this.getMergedEntity(entity);
        List<Situationdocument> situationdocumentList = mergedEntity.getSituationdocumentList();
        situationdocumentList.size();
        return situationdocumentList;
    }

    public boolean isDecDetailsarretesListEmpty(Decaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Decaissements> decaissements = cq.from(Decaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decaissements, entity), cb.isNotEmpty(decaissements.get(Decaissements_.decDetailsarretesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecDetailsarretes> findDecDetailsarretesList(Decaissements entity) {
        Decaissements mergedEntity = this.getMergedEntity(entity);
        List<DecDetailsarretes> decDetailsarretesList = mergedEntity.getDecDetailsarretesList();
        decDetailsarretesList.size();
        return decDetailsarretesList;
    }

    public boolean isNumTiersEmpty(Decaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Decaissements> decaissements = cq.from(Decaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decaissements, entity), cb.isNotNull(decaissements.get(Decaissements_.numTiers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Tiers findNumTiers(Decaissements entity) {
        return this.getMergedEntity(entity).getNumTiers();
    }

    public boolean isIDEtablissementFinancierDepartEmpty(Decaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Decaissements> decaissements = cq.from(Decaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decaissements, entity), cb.isNotNull(decaissements.get(Decaissements_.iDEtablissementFinancierDepart)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Etablissementfinancier findIDEtablissementFinancierDepart(Decaissements entity) {
        return this.getMergedEntity(entity).getIDEtablissementFinancierDepart();
    }

    public boolean isNumeroCaisseEmpty(Decaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Decaissements> decaissements = cq.from(Decaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decaissements, entity), cb.isNotNull(decaissements.get(Decaissements_.numeroCaisse)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Caisses findNumeroCaisse(Decaissements entity) {
        return this.getMergedEntity(entity).getNumeroCaisse();
    }

    public boolean isIDSYSModeEmpty(Decaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Decaissements> decaissements = cq.from(Decaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decaissements, entity), cb.isNotNull(decaissements.get(Decaissements_.iDSYSMode)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public SysMode findIDSYSMode(Decaissements entity) {
        return this.getMergedEntity(entity).getIDSYSMode();
    }

    public boolean isIDDECRestitutionEmpty(Decaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Decaissements> decaissements = cq.from(Decaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decaissements, entity), cb.isNotNull(decaissements.get(Decaissements_.iDDECRestitution)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecRestitution findIDDECRestitution(Decaissements entity) {
        return this.getMergedEntity(entity).getIDDECRestitution();
    }

    public boolean isIDDECReceptionEmpty(Decaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Decaissements> decaissements = cq.from(Decaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decaissements, entity), cb.isNotNull(decaissements.get(Decaissements_.iDDECReception)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecReception findIDDECReception(Decaissements entity) {
        return this.getMergedEntity(entity).getIDDECReception();
    }

    public boolean isIdaffairesEmpty(Decaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Decaissements> decaissements = cq.from(Decaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decaissements, entity), cb.isNotNull(decaissements.get(Decaissements_.idaffaires)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecAffaires findIdaffaires(Decaissements entity) {
        return this.getMergedEntity(entity).getIdaffaires();
    }

    public boolean isIDOrdresDePaiementEmpty(Decaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Decaissements> decaissements = cq.from(Decaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decaissements, entity), cb.isNotNull(decaissements.get(Decaissements_.iDOrdresDePaiement)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Ordresdepaiement findIDOrdresDePaiement(Decaissements entity) {
        return this.getMergedEntity(entity).getIDOrdresDePaiement();
    }

    public boolean isIddemandesEmpty(Decaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Decaissements> decaissements = cq.from(Decaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decaissements, entity), cb.isNotNull(decaissements.get(Decaissements_.iddemandes)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Demandes findIddemandes(Decaissements entity) {
        return this.getMergedEntity(entity).getIddemandes();
    }

    public boolean isMouvementListEmpty(Decaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Decaissements> decaissements = cq.from(Decaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decaissements, entity), cb.isNotEmpty(decaissements.get(Decaissements_.mouvementList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Mouvement> findMouvementList(Decaissements entity) {
        Decaissements mergedEntity = this.getMergedEntity(entity);
        List<Mouvement> mouvementList = mergedEntity.getMouvementList();
        mouvementList.size();
        return mouvementList;
    }
    
}
