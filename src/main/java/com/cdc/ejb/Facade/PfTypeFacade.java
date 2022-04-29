/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.PfType;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.PfType_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PfTypeEnc;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PfTypeFacade extends AbstractFacade<PfType> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PfTypeFacade() {
        super(PfType.class);
    }

    public boolean isPfTypeEncListEmpty(PfType entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfType> pfType = cq.from(PfType.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfType, entity), cb.isNotEmpty(pfType.get(PfType_.pfTypeEncList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfTypeEnc> findPfTypeEncList(PfType entity) {
        PfType mergedEntity = this.getMergedEntity(entity);
        List<PfTypeEnc> pfTypeEncList = mergedEntity.getPfTypeEncList();
        pfTypeEncList.size();
        return pfTypeEncList;
    }
    
}
