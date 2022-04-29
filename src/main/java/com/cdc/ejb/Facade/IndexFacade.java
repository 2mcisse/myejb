/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Index;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Index_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Document;
import com.cdc.ejb.entities.Mot;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class IndexFacade extends AbstractFacade<Index> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public IndexFacade() {
        super(Index.class);
    }

    public boolean isNDocumentEmpty(Index entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Index> index = cq.from(Index.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(index, entity), cb.isNotNull(index.get(Index_.nDocument)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Document findNDocument(Index entity) {
        return this.getMergedEntity(entity).getNDocument();
    }

    public boolean isIdmotEmpty(Index entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Index> index = cq.from(Index.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(index, entity), cb.isNotNull(index.get(Index_.idmot)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Mot findIdmot(Index entity) {
        return this.getMergedEntity(entity).getIdmot();
    }
    
}
