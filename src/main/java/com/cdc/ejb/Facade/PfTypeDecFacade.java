/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.PfTypeDec;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.PfTypeDec_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PfDecaissements;
import com.cdc.ejb.entities.PfTableauAmo;
import com.cdc.ejb.entities.PfCorrespondances;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PfTypeDecFacade extends AbstractFacade<PfTypeDec> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PfTypeDecFacade() {
        super(PfTypeDec.class);
    }

    public boolean isPfDecaissementsListEmpty(PfTypeDec entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTypeDec> pfTypeDec = cq.from(PfTypeDec.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTypeDec, entity), cb.isNotEmpty(pfTypeDec.get(PfTypeDec_.pfDecaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfDecaissements> findPfDecaissementsList(PfTypeDec entity) {
        PfTypeDec mergedEntity = this.getMergedEntity(entity);
        List<PfDecaissements> pfDecaissementsList = mergedEntity.getPfDecaissementsList();
        pfDecaissementsList.size();
        return pfDecaissementsList;
    }

    public boolean isPfTableauAmoListEmpty(PfTypeDec entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTypeDec> pfTypeDec = cq.from(PfTypeDec.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTypeDec, entity), cb.isNotEmpty(pfTypeDec.get(PfTypeDec_.pfTableauAmoList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfTableauAmo> findPfTableauAmoList(PfTypeDec entity) {
        PfTypeDec mergedEntity = this.getMergedEntity(entity);
        List<PfTableauAmo> pfTableauAmoList = mergedEntity.getPfTableauAmoList();
        pfTableauAmoList.size();
        return pfTableauAmoList;
    }

    public boolean isPfCorrespondancesListEmpty(PfTypeDec entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfTypeDec> pfTypeDec = cq.from(PfTypeDec.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfTypeDec, entity), cb.isNotEmpty(pfTypeDec.get(PfTypeDec_.pfCorrespondancesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfCorrespondances> findPfCorrespondancesList(PfTypeDec entity) {
        PfTypeDec mergedEntity = this.getMergedEntity(entity);
        List<PfCorrespondances> pfCorrespondancesList = mergedEntity.getPfCorrespondancesList();
        pfCorrespondancesList.size();
        return pfCorrespondancesList;
    }
    
}
