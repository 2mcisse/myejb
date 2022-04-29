/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Corpset;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Corpset_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Titres;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class CorpsetFacade extends AbstractFacade<Corpset> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CorpsetFacade() {
        super(Corpset.class);
    }

    public boolean isTtcleunikEmpty(Corpset entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Corpset> corpset = cq.from(Corpset.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(corpset, entity), cb.isNotNull(corpset.get(Corpset_.ttcleunik)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Titres findTtcleunik(Corpset entity) {
        return this.getMergedEntity(entity).getTtcleunik();
    }
    
}
