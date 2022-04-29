/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Etablissementfinancier;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Etablissementfinancier_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Encaissements;
import com.cdc.ejb.entities.PiecesTresoreries;
import com.cdc.ejb.entities.Decaissements;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class EtablissementfinancierFacade extends AbstractFacade<Etablissementfinancier> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EtablissementfinancierFacade() {
        super(Etablissementfinancier.class);
    }

    public boolean isEncaissementsListEmpty(Etablissementfinancier entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Etablissementfinancier> etablissementfinancier = cq.from(Etablissementfinancier.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(etablissementfinancier, entity), cb.isNotEmpty(etablissementfinancier.get(Etablissementfinancier_.encaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Encaissements> findEncaissementsList(Etablissementfinancier entity) {
        Etablissementfinancier mergedEntity = this.getMergedEntity(entity);
        List<Encaissements> encaissementsList = mergedEntity.getEncaissementsList();
        encaissementsList.size();
        return encaissementsList;
    }

    public boolean isPiecesTresoreriesListEmpty(Etablissementfinancier entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Etablissementfinancier> etablissementfinancier = cq.from(Etablissementfinancier.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(etablissementfinancier, entity), cb.isNotEmpty(etablissementfinancier.get(Etablissementfinancier_.piecesTresoreriesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PiecesTresoreries> findPiecesTresoreriesList(Etablissementfinancier entity) {
        Etablissementfinancier mergedEntity = this.getMergedEntity(entity);
        List<PiecesTresoreries> piecesTresoreriesList = mergedEntity.getPiecesTresoreriesList();
        piecesTresoreriesList.size();
        return piecesTresoreriesList;
    }

    public boolean isDecaissementsListEmpty(Etablissementfinancier entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Etablissementfinancier> etablissementfinancier = cq.from(Etablissementfinancier.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(etablissementfinancier, entity), cb.isNotEmpty(etablissementfinancier.get(Etablissementfinancier_.decaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Decaissements> findDecaissementsList(Etablissementfinancier entity) {
        Etablissementfinancier mergedEntity = this.getMergedEntity(entity);
        List<Decaissements> decaissementsList = mergedEntity.getDecaissementsList();
        decaissementsList.size();
        return decaissementsList;
    }
    
}
