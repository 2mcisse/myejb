/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Fiscalite;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Fiscalite_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PfSupports;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class FiscaliteFacade extends AbstractFacade<Fiscalite> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FiscaliteFacade() {
        super(Fiscalite.class);
    }

    public boolean isIdpfSupportsEmpty(Fiscalite entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Fiscalite> fiscalite = cq.from(Fiscalite.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(fiscalite, entity), cb.isNotNull(fiscalite.get(Fiscalite_.idpfSupports)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfSupports findIdpfSupports(Fiscalite entity) {
        return this.getMergedEntity(entity).getIdpfSupports();
    }
    
}
