/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.DecGroupeEtapes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.DecGroupeEtapes_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.DecNatureoperation;
import com.cdc.ejb.entities.Natureoperationtypedoc;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DecGroupeEtapesFacade extends AbstractFacade<DecGroupeEtapes> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DecGroupeEtapesFacade() {
        super(DecGroupeEtapes.class);
    }

    public boolean isIdnatureoperationEmpty(DecGroupeEtapes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecGroupeEtapes> decGroupeEtapes = cq.from(DecGroupeEtapes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decGroupeEtapes, entity), cb.isNotNull(decGroupeEtapes.get(DecGroupeEtapes_.idnatureoperation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecNatureoperation findIdnatureoperation(DecGroupeEtapes entity) {
        return this.getMergedEntity(entity).getIdnatureoperation();
    }

    public boolean isIDNATUREOPERATIONTypeDocEmpty(DecGroupeEtapes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecGroupeEtapes> decGroupeEtapes = cq.from(DecGroupeEtapes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decGroupeEtapes, entity), cb.isNotNull(decGroupeEtapes.get(DecGroupeEtapes_.iDNATUREOPERATIONTypeDoc)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Natureoperationtypedoc findIDNATUREOPERATIONTypeDoc(DecGroupeEtapes entity) {
        return this.getMergedEntity(entity).getIDNATUREOPERATIONTypeDoc();
    }
    
}
