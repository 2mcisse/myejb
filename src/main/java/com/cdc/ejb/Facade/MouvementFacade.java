/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Mouvement;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Mouvement_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Ligneecriture;
import com.cdc.ejb.entities.Decaissements;
import com.cdc.ejb.entities.Encaissements;
import com.cdc.ejb.entities.Journal;
import com.cdc.ejb.entities.ApproDeg;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class MouvementFacade extends AbstractFacade<Mouvement> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MouvementFacade() {
        super(Mouvement.class);
    }

    public boolean isLigneecritureListEmpty(Mouvement entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Mouvement> mouvement = cq.from(Mouvement.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(mouvement, entity), cb.isNotEmpty(mouvement.get(Mouvement_.ligneecritureList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Ligneecriture> findLigneecritureList(Mouvement entity) {
        Mouvement mergedEntity = this.getMergedEntity(entity);
        List<Ligneecriture> ligneecritureList = mergedEntity.getLigneecritureList();
        ligneecritureList.size();
        return ligneecritureList;
    }

    public boolean isCodeDecEmpty(Mouvement entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Mouvement> mouvement = cq.from(Mouvement.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(mouvement, entity), cb.isNotNull(mouvement.get(Mouvement_.codeDec)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Decaissements findCodeDec(Mouvement entity) {
        return this.getMergedEntity(entity).getCodeDec();
    }

    public boolean isCodeEncEmpty(Mouvement entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Mouvement> mouvement = cq.from(Mouvement.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(mouvement, entity), cb.isNotNull(mouvement.get(Mouvement_.codeEnc)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Encaissements findCodeEnc(Mouvement entity) {
        return this.getMergedEntity(entity).getCodeEnc();
    }

    public boolean isCodejnlEmpty(Mouvement entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Mouvement> mouvement = cq.from(Mouvement.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(mouvement, entity), cb.isNotNull(mouvement.get(Mouvement_.codejnl)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Journal findCodejnl(Mouvement entity) {
        return this.getMergedEntity(entity).getCodejnl();
    }

    public boolean isIdapproDegEmpty(Mouvement entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Mouvement> mouvement = cq.from(Mouvement.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(mouvement, entity), cb.isNotNull(mouvement.get(Mouvement_.idapproDeg)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public ApproDeg findIdapproDeg(Mouvement entity) {
        return this.getMergedEntity(entity).getIdapproDeg();
    }
    
}
