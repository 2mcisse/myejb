/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.PfDetailsarretes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.PfDetailsarretes_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PfArrete;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PfDetailsarretesFacade extends AbstractFacade<PfDetailsarretes> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PfDetailsarretesFacade() {
        super(PfDetailsarretes.class);
    }

    public boolean isIDArreteEmpty(PfDetailsarretes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfDetailsarretes> pfDetailsarretes = cq.from(PfDetailsarretes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfDetailsarretes, entity), cb.isNotNull(pfDetailsarretes.get(PfDetailsarretes_.iDArrete)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfArrete findIDArrete(PfDetailsarretes entity) {
        return this.getMergedEntity(entity).getIDArrete();
    }
    
}
