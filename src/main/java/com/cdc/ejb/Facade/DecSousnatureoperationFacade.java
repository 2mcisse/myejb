/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.DecSousnatureoperation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.DecSousnatureoperation_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.DecNatureoperation;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DecSousnatureoperationFacade extends AbstractFacade<DecSousnatureoperation> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DecSousnatureoperationFacade() {
        super(DecSousnatureoperation.class);
    }

    public boolean isIdnatureoperationEmpty(DecSousnatureoperation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecSousnatureoperation> decSousnatureoperation = cq.from(DecSousnatureoperation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decSousnatureoperation, entity), cb.isNotNull(decSousnatureoperation.get(DecSousnatureoperation_.idnatureoperation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecNatureoperation findIdnatureoperation(DecSousnatureoperation entity) {
        return this.getMergedEntity(entity).getIdnatureoperation();
    }
    
}
