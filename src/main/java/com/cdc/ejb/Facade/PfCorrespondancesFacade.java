/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.PfCorrespondances;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.PfCorrespondances_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PfTypeEnc;
import com.cdc.ejb.entities.PfTypeDec;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PfCorrespondancesFacade extends AbstractFacade<PfCorrespondances> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PfCorrespondancesFacade() {
        super(PfCorrespondances.class);
    }

    public boolean isIdtypeEncEmpty(PfCorrespondances entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfCorrespondances> pfCorrespondances = cq.from(PfCorrespondances.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfCorrespondances, entity), cb.isNotNull(pfCorrespondances.get(PfCorrespondances_.idtypeEnc)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfTypeEnc findIdtypeEnc(PfCorrespondances entity) {
        return this.getMergedEntity(entity).getIdtypeEnc();
    }

    public boolean isIdtypeDecEmpty(PfCorrespondances entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfCorrespondances> pfCorrespondances = cq.from(PfCorrespondances.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfCorrespondances, entity), cb.isNotNull(pfCorrespondances.get(PfCorrespondances_.idtypeDec)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfTypeDec findIdtypeDec(PfCorrespondances entity) {
        return this.getMergedEntity(entity).getIdtypeDec();
    }
    
}
