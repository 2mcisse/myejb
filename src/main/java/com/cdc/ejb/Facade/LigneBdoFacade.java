/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.LigneBdo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.LigneBdo_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Bdo;
import com.cdc.ejb.entities.Encaissements;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class LigneBdoFacade extends AbstractFacade<LigneBdo> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LigneBdoFacade() {
        super(LigneBdo.class);
    }

    public boolean isReferenceEmpty(LigneBdo entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<LigneBdo> ligneBdo = cq.from(LigneBdo.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(ligneBdo, entity), cb.isNotNull(ligneBdo.get(LigneBdo_.reference)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Bdo findReference(LigneBdo entity) {
        return this.getMergedEntity(entity).getReference();
    }

    public boolean isCodeEncEmpty(LigneBdo entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<LigneBdo> ligneBdo = cq.from(LigneBdo.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(ligneBdo, entity), cb.isNotNull(ligneBdo.get(LigneBdo_.codeEnc)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Encaissements findCodeEnc(LigneBdo entity) {
        return this.getMergedEntity(entity).getCodeEnc();
    }
    
}
