/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Periodes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Periodes_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Gestions;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PeriodesFacade extends AbstractFacade<Periodes> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PeriodesFacade() {
        super(Periodes.class);
    }

    public boolean isGestionEmpty(Periodes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Periodes> periodes = cq.from(Periodes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(periodes, entity), cb.isNotNull(periodes.get(Periodes_.gestion)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Gestions findGestion(Periodes entity) {
        return this.getMergedEntity(entity).getGestion();
    }
    
}
