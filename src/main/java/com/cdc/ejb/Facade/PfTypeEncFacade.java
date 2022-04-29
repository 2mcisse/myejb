/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.PfTypeEnc;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.PfTypeEnc_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PfNatureEnc;
import com.cdc.ejb.entities.PfType;
import com.cdc.ejb.entities.PfTableauAmo;
import com.cdc.ejb.entities.PfEncaissements;
import com.cdc.ejb.entities.PfSupports;
import com.cdc.ejb.entities.PfCorrespondances;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PfTypeEncFacade extends AbstractFacade<PfTypeEnc> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PfTypeEncFacade() {
        super(PfTypeEnc.class);
    }

    public boolean isIdnatureEncEmpty(PfTypeEnc entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTypeEnc> pfTypeEnc = cq.from(PfTypeEnc.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTypeEnc, entity), cb.isNotNull(pfTypeEnc.get(PfTypeEnc_.idnatureEnc)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfNatureEnc findIdnatureEnc(PfTypeEnc entity) {
        return this.getMergedEntity(entity).getIdnatureEnc();
    }

    public boolean isIdpfTypeEmpty(PfTypeEnc entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTypeEnc> pfTypeEnc = cq.from(PfTypeEnc.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTypeEnc, entity), cb.isNotNull(pfTypeEnc.get(PfTypeEnc_.idpfType)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfType findIdpfType(PfTypeEnc entity) {
        return this.getMergedEntity(entity).getIdpfType();
    }

    public boolean isPfTableauAmoListEmpty(PfTypeEnc entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTypeEnc> pfTypeEnc = cq.from(PfTypeEnc.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTypeEnc, entity), cb.isNotEmpty(pfTypeEnc.get(PfTypeEnc_.pfTableauAmoList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfTableauAmo> findPfTableauAmoList(PfTypeEnc entity) {
        PfTypeEnc mergedEntity = this.getMergedEntity(entity);
        List<PfTableauAmo> pfTableauAmoList = mergedEntity.getPfTableauAmoList();
        pfTableauAmoList.size();
        return pfTableauAmoList;
    }

    public boolean isPfEncaissementsListEmpty(PfTypeEnc entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTypeEnc> pfTypeEnc = cq.from(PfTypeEnc.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTypeEnc, entity), cb.isNotEmpty(pfTypeEnc.get(PfTypeEnc_.pfEncaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfEncaissements> findPfEncaissementsList(PfTypeEnc entity) {
        PfTypeEnc mergedEntity = this.getMergedEntity(entity);
        List<PfEncaissements> pfEncaissementsList = mergedEntity.getPfEncaissementsList();
        pfEncaissementsList.size();
        return pfEncaissementsList;
    }

    public boolean isPfSupportsListEmpty(PfTypeEnc entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTypeEnc> pfTypeEnc = cq.from(PfTypeEnc.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTypeEnc, entity), cb.isNotEmpty(pfTypeEnc.get(PfTypeEnc_.pfSupportsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfSupports> findPfSupportsList(PfTypeEnc entity) {
        PfTypeEnc mergedEntity = this.getMergedEntity(entity);
        List<PfSupports> pfSupportsList = mergedEntity.getPfSupportsList();
        pfSupportsList.size();
        return pfSupportsList;
    }

    public boolean isPfCorrespondancesListEmpty(PfTypeEnc entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTypeEnc> pfTypeEnc = cq.from(PfTypeEnc.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTypeEnc, entity), cb.isNotEmpty(pfTypeEnc.get(PfTypeEnc_.pfCorrespondancesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfCorrespondances> findPfCorrespondancesList(PfTypeEnc entity) {
        PfTypeEnc mergedEntity = this.getMergedEntity(entity);
        List<PfCorrespondances> pfCorrespondancesList = mergedEntity.getPfCorrespondancesList();
        pfCorrespondancesList.size();
        return pfCorrespondancesList;
    }
    
}
