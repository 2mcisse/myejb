/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.PfArrete;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.PfArrete_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PfSupports;
import com.cdc.ejb.entities.PfDetailsarretes;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PfArreteFacade extends AbstractFacade<PfArrete> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PfArreteFacade() {
        super(PfArrete.class);
    }

    public boolean isIdpfSupportsEmpty(PfArrete entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfArrete> pfArrete = cq.from(PfArrete.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfArrete, entity), cb.isNotNull(pfArrete.get(PfArrete_.idpfSupports)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfSupports findIdpfSupports(PfArrete entity) {
        return this.getMergedEntity(entity).getIdpfSupports();
    }

    public boolean isPfDetailsarretesListEmpty(PfArrete entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfArrete> pfArrete = cq.from(PfArrete.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfArrete, entity), cb.isNotEmpty(pfArrete.get(PfArrete_.pfDetailsarretesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfDetailsarretes> findPfDetailsarretesList(PfArrete entity) {
        PfArrete mergedEntity = this.getMergedEntity(entity);
        List<PfDetailsarretes> pfDetailsarretesList = mergedEntity.getPfDetailsarretesList();
        pfDetailsarretesList.size();
        return pfDetailsarretesList;
    }
    
}
