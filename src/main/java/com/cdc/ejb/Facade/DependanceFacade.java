/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Dependance;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Dependance_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Tiers;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DependanceFacade extends AbstractFacade<Dependance> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DependanceFacade() {
        super(Dependance.class);
    }

    public boolean isTiersListEmpty(Dependance entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Dependance> dependance = cq.from(Dependance.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(dependance, entity), cb.isNotEmpty(dependance.get(Dependance_.tiersList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Tiers> findTiersList(Dependance entity) {
        Dependance mergedEntity = this.getMergedEntity(entity);
        List<Tiers> tiersList = mergedEntity.getTiersList();
        tiersList.size();
        return tiersList;
    }
    
}
