/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.PfTypesupports;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.PfTypesupports_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PfCategorieoperation;
import com.cdc.ejb.entities.PfSupports;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PfTypesupportsFacade extends AbstractFacade<PfTypesupports> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PfTypesupportsFacade() {
        super(PfTypesupports.class);
    }

    public boolean isIDPFCategorieOperationEmpty(PfTypesupports entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTypesupports> pfTypesupports = cq.from(PfTypesupports.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTypesupports, entity), cb.isNotNull(pfTypesupports.get(PfTypesupports_.iDPFCategorieOperation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfCategorieoperation findIDPFCategorieOperation(PfTypesupports entity) {
        return this.getMergedEntity(entity).getIDPFCategorieOperation();
    }

    public boolean isPfSupportsListEmpty(PfTypesupports entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTypesupports> pfTypesupports = cq.from(PfTypesupports.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTypesupports, entity), cb.isNotEmpty(pfTypesupports.get(PfTypesupports_.pfSupportsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfSupports> findPfSupportsList(PfTypesupports entity) {
        PfTypesupports mergedEntity = this.getMergedEntity(entity);
        List<PfSupports> pfSupportsList = mergedEntity.getPfSupportsList();
        pfSupportsList.size();
        return pfSupportsList;
    }
    
}
