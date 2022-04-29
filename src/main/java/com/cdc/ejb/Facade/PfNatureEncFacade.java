/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.PfNatureEnc;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.PfNatureEnc_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PfTypeEnc;
import com.cdc.ejb.entities.PfTableauAmo;
import com.cdc.ejb.entities.PfEncaissements;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PfNatureEncFacade extends AbstractFacade<PfNatureEnc> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PfNatureEncFacade() {
        super(PfNatureEnc.class);
    }

    public boolean isPfTypeEncListEmpty(PfNatureEnc entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfNatureEnc> pfNatureEnc = cq.from(PfNatureEnc.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfNatureEnc, entity), cb.isNotEmpty(pfNatureEnc.get(PfNatureEnc_.pfTypeEncList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfTypeEnc> findPfTypeEncList(PfNatureEnc entity) {
        PfNatureEnc mergedEntity = this.getMergedEntity(entity);
        List<PfTypeEnc> pfTypeEncList = mergedEntity.getPfTypeEncList();
        pfTypeEncList.size();
        return pfTypeEncList;
    }

    public boolean isPfTableauAmoListEmpty(PfNatureEnc entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfNatureEnc> pfNatureEnc = cq.from(PfNatureEnc.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfNatureEnc, entity), cb.isNotEmpty(pfNatureEnc.get(PfNatureEnc_.pfTableauAmoList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfTableauAmo> findPfTableauAmoList(PfNatureEnc entity) {
        PfNatureEnc mergedEntity = this.getMergedEntity(entity);
        List<PfTableauAmo> pfTableauAmoList = mergedEntity.getPfTableauAmoList();
        pfTableauAmoList.size();
        return pfTableauAmoList;
    }

    public boolean isPfEncaissementsListEmpty(PfNatureEnc entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfNatureEnc> pfNatureEnc = cq.from(PfNatureEnc.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfNatureEnc, entity), cb.isNotEmpty(pfNatureEnc.get(PfNatureEnc_.pfEncaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfEncaissements> findPfEncaissementsList(PfNatureEnc entity) {
        PfNatureEnc mergedEntity = this.getMergedEntity(entity);
        List<PfEncaissements> pfEncaissementsList = mergedEntity.getPfEncaissementsList();
        pfEncaissementsList.size();
        return pfEncaissementsList;
    }
    
}
