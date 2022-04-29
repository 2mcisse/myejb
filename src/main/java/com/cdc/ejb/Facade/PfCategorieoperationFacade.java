/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.PfCategorieoperation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.PfCategorieoperation_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PfTypesupports;
import com.cdc.ejb.entities.PfSupports;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PfCategorieoperationFacade extends AbstractFacade<PfCategorieoperation> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PfCategorieoperationFacade() {
        super(PfCategorieoperation.class);
    }

    public boolean isPfTypesupportsListEmpty(PfCategorieoperation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfCategorieoperation> pfCategorieoperation = cq.from(PfCategorieoperation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfCategorieoperation, entity), cb.isNotEmpty(pfCategorieoperation.get(PfCategorieoperation_.pfTypesupportsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfTypesupports> findPfTypesupportsList(PfCategorieoperation entity) {
        PfCategorieoperation mergedEntity = this.getMergedEntity(entity);
        List<PfTypesupports> pfTypesupportsList = mergedEntity.getPfTypesupportsList();
        pfTypesupportsList.size();
        return pfTypesupportsList;
    }

    public boolean isPfSupportsListEmpty(PfCategorieoperation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfCategorieoperation> pfCategorieoperation = cq.from(PfCategorieoperation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfCategorieoperation, entity), cb.isNotEmpty(pfCategorieoperation.get(PfCategorieoperation_.pfSupportsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfSupports> findPfSupportsList(PfCategorieoperation entity) {
        PfCategorieoperation mergedEntity = this.getMergedEntity(entity);
        List<PfSupports> pfSupportsList = mergedEntity.getPfSupportsList();
        pfSupportsList.size();
        return pfSupportsList;
    }
    
}
