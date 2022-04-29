/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.DecDetailsarretes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.DecDetailsarretes_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.DecArrete;
import com.cdc.ejb.entities.Encaissements;
import com.cdc.ejb.entities.Decaissements;
import com.cdc.ejb.entities.DecMouvements;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DecDetailsarretesFacade extends AbstractFacade<DecDetailsarretes> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DecDetailsarretesFacade() {
        super(DecDetailsarretes.class);
    }

    public boolean isIDArreteEmpty(DecDetailsarretes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecDetailsarretes> decDetailsarretes = cq.from(DecDetailsarretes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decDetailsarretes, entity), cb.isNotNull(decDetailsarretes.get(DecDetailsarretes_.iDArrete)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecArrete findIDArrete(DecDetailsarretes entity) {
        return this.getMergedEntity(entity).getIDArrete();
    }

    public boolean isCodeEncEmpty(DecDetailsarretes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecDetailsarretes> decDetailsarretes = cq.from(DecDetailsarretes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decDetailsarretes, entity), cb.isNotNull(decDetailsarretes.get(DecDetailsarretes_.codeEnc)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Encaissements findCodeEnc(DecDetailsarretes entity) {
        return this.getMergedEntity(entity).getCodeEnc();
    }

    public boolean isCodeDecEmpty(DecDetailsarretes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecDetailsarretes> decDetailsarretes = cq.from(DecDetailsarretes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decDetailsarretes, entity), cb.isNotNull(decDetailsarretes.get(DecDetailsarretes_.codeDec)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Decaissements findCodeDec(DecDetailsarretes entity) {
        return this.getMergedEntity(entity).getCodeDec();
    }

    public boolean isDecMouvementsListEmpty(DecDetailsarretes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecDetailsarretes> decDetailsarretes = cq.from(DecDetailsarretes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decDetailsarretes, entity), cb.isNotEmpty(decDetailsarretes.get(DecDetailsarretes_.decMouvementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecMouvements> findDecMouvementsList(DecDetailsarretes entity) {
        DecDetailsarretes mergedEntity = this.getMergedEntity(entity);
        List<DecMouvements> decMouvementsList = mergedEntity.getDecMouvementsList();
        decMouvementsList.size();
        return decMouvementsList;
    }
    
}
