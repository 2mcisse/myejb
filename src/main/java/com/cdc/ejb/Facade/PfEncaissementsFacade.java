/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.PfEncaissements;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.PfEncaissements_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PfNatureEnc;
import com.cdc.ejb.entities.PfTypeEnc;
import com.cdc.ejb.entities.PfTableauAmo;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PfEncaissementsFacade extends AbstractFacade<PfEncaissements> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PfEncaissementsFacade() {
        super(PfEncaissements.class);
    }

    public boolean isIdnatureEncEmpty(PfEncaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfEncaissements> pfEncaissements = cq.from(PfEncaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfEncaissements, entity), cb.isNotNull(pfEncaissements.get(PfEncaissements_.idnatureEnc)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfNatureEnc findIdnatureEnc(PfEncaissements entity) {
        return this.getMergedEntity(entity).getIdnatureEnc();
    }

    public boolean isIdtypeEncEmpty(PfEncaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfEncaissements> pfEncaissements = cq.from(PfEncaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfEncaissements, entity), cb.isNotNull(pfEncaissements.get(PfEncaissements_.idtypeEnc)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfTypeEnc findIdtypeEnc(PfEncaissements entity) {
        return this.getMergedEntity(entity).getIdtypeEnc();
    }

    public boolean isIDDetailsArretesEmpty(PfEncaissements entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfEncaissements> pfEncaissements = cq.from(PfEncaissements.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfEncaissements, entity), cb.isNotNull(pfEncaissements.get(PfEncaissements_.iDDetailsArretes)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfTableauAmo findIDDetailsArretes(PfEncaissements entity) {
        return this.getMergedEntity(entity).getIDDetailsArretes();
    }
    
}
