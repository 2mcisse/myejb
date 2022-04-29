/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.DecArrete;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.DecArrete_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.DecDetailsarretes;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DecArreteFacade extends AbstractFacade<DecArrete> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DecArreteFacade() {
        super(DecArrete.class);
    }

    public boolean isDecDetailsarretesListEmpty(DecArrete entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<DecArrete> decArrete = cq.from(DecArrete.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(decArrete, entity), cb.isNotEmpty(decArrete.get(DecArrete_.decDetailsarretesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecDetailsarretes> findDecDetailsarretesList(DecArrete entity) {
        DecArrete mergedEntity = this.getMergedEntity(entity);
        List<DecDetailsarretes> decDetailsarretesList = mergedEntity.getDecDetailsarretesList();
        decDetailsarretesList.size();
        return decDetailsarretesList;
    }
    
}
