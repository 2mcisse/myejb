/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.EtapesMarchesDetails;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.EtapesMarchesDetails_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.EtapesPartypeappro;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class EtapesMarchesDetailsFacade extends AbstractFacade<EtapesMarchesDetails> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EtapesMarchesDetailsFacade() {
        super(EtapesMarchesDetails.class);
    }

    public boolean isIdetapesEmpty(EtapesMarchesDetails entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<EtapesMarchesDetails> etapesMarchesDetails = cq.from(EtapesMarchesDetails.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(etapesMarchesDetails, entity), cb.isNotNull(etapesMarchesDetails.get(EtapesMarchesDetails_.idetapes)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public EtapesPartypeappro findIdetapes(EtapesMarchesDetails entity) {
        return this.getMergedEntity(entity).getIdetapes();
    }
    
}
