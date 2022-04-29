/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.PfDecaissements;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.PfDecaissements_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PfTypeDec;
import com.cdc.ejb.entities.PfNatureDec;
import com.cdc.ejb.entities.PfTableauAmo;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PfDecaissementsFacade extends AbstractFacade<PfDecaissements> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PfDecaissementsFacade() {
        super(PfDecaissements.class);
    }

    public boolean isIdtypeDecEmpty(PfDecaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfDecaissements> pfDecaissements = cq.from(PfDecaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfDecaissements, entity), cb.isNotNull(pfDecaissements.get(PfDecaissements_.idtypeDec)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfTypeDec findIdtypeDec(PfDecaissements entity) {
        return this.getMergedEntity(entity).getIdtypeDec();
    }

    public boolean isIdnatureDecEmpty(PfDecaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfDecaissements> pfDecaissements = cq.from(PfDecaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfDecaissements, entity), cb.isNotNull(pfDecaissements.get(PfDecaissements_.idnatureDec)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfNatureDec findIdnatureDec(PfDecaissements entity) {
        return this.getMergedEntity(entity).getIdnatureDec();
    }

    public boolean isIDDetailsArretesEmpty(PfDecaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfDecaissements> pfDecaissements = cq.from(PfDecaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfDecaissements, entity), cb.isNotNull(pfDecaissements.get(PfDecaissements_.iDDetailsArretes)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfTableauAmo findIDDetailsArretes(PfDecaissements entity) {
        return this.getMergedEntity(entity).getIDDetailsArretes();
    }
    
}
