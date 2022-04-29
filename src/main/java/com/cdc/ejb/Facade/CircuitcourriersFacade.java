/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Circuitcourriers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Circuitcourriers_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Typecourriers;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class CircuitcourriersFacade extends AbstractFacade<Circuitcourriers> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CircuitcourriersFacade() {
        super(Circuitcourriers.class);
    }

    public boolean isIDTypeCourriersEmpty(Circuitcourriers entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Circuitcourriers> circuitcourriers = cq.from(Circuitcourriers.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(circuitcourriers, entity), cb.isNotNull(circuitcourriers.get(Circuitcourriers_.iDTypeCourriers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Typecourriers findIDTypeCourriers(Circuitcourriers entity) {
        return this.getMergedEntity(entity).getIDTypeCourriers();
    }
    
}
