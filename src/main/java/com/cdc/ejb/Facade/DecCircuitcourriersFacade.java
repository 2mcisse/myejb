/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.DecCircuitcourriers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.DecCircuitcourriers_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Natureoperationtypedoc;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DecCircuitcourriersFacade extends AbstractFacade<DecCircuitcourriers> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DecCircuitcourriersFacade() {
        super(DecCircuitcourriers.class);
    }

    public boolean isIDNATUREOPERATIONTypeDocEmpty(DecCircuitcourriers entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecCircuitcourriers> decCircuitcourriers = cq.from(DecCircuitcourriers.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decCircuitcourriers, entity), cb.isNotNull(decCircuitcourriers.get(DecCircuitcourriers_.iDNATUREOPERATIONTypeDoc)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Natureoperationtypedoc findIDNATUREOPERATIONTypeDoc(DecCircuitcourriers entity) {
        return this.getMergedEntity(entity).getIDNATUREOPERATIONTypeDoc();
    }
    
}
