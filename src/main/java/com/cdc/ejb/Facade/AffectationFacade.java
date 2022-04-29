/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Affectation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Affectation_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Caisses;
import com.cdc.ejb.entities.Guichets;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class AffectationFacade extends AbstractFacade<Affectation> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AffectationFacade() {
        super(Affectation.class);
    }

    public boolean isNumeroCaisseEmpty(Affectation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Affectation> affectation = cq.from(Affectation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(affectation, entity), cb.isNotNull(affectation.get(Affectation_.numeroCaisse)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Caisses findNumeroCaisse(Affectation entity) {
        return this.getMergedEntity(entity).getNumeroCaisse();
    }

    public boolean isCodeGEmpty(Affectation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Affectation> affectation = cq.from(Affectation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(affectation, entity), cb.isNotNull(affectation.get(Affectation_.codeG)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Guichets findCodeG(Affectation entity) {
        return this.getMergedEntity(entity).getCodeG();
    }
    
}
