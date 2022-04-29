/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.PiecesTresoreries;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.PiecesTresoreries_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Decaissements;
import com.cdc.ejb.entities.Encaissements;
import com.cdc.ejb.entities.Etablissementfinancier;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PiecesTresoreriesFacade extends AbstractFacade<PiecesTresoreries> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PiecesTresoreriesFacade() {
        super(PiecesTresoreries.class);
    }

    public boolean isCodeDecEmpty(PiecesTresoreries entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PiecesTresoreries> piecesTresoreries = cq.from(PiecesTresoreries.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(piecesTresoreries, entity), cb.isNotNull(piecesTresoreries.get(PiecesTresoreries_.codeDec)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Decaissements findCodeDec(PiecesTresoreries entity) {
        return this.getMergedEntity(entity).getCodeDec();
    }

    public boolean isCodeEncEmpty(PiecesTresoreries entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PiecesTresoreries> piecesTresoreries = cq.from(PiecesTresoreries.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(piecesTresoreries, entity), cb.isNotNull(piecesTresoreries.get(PiecesTresoreries_.codeEnc)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Encaissements findCodeEnc(PiecesTresoreries entity) {
        return this.getMergedEntity(entity).getCodeEnc();
    }

    public boolean isIDEtablissementFinancierDepartEmpty(PiecesTresoreries entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PiecesTresoreries> piecesTresoreries = cq.from(PiecesTresoreries.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(piecesTresoreries, entity), cb.isNotNull(piecesTresoreries.get(PiecesTresoreries_.iDEtablissementFinancierDepart)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Etablissementfinancier findIDEtablissementFinancierDepart(PiecesTresoreries entity) {
        return this.getMergedEntity(entity).getIDEtablissementFinancierDepart();
    }
    
}
