/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.PfNatureDec;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.PfNatureDec_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PfDecaissements;
import com.cdc.ejb.entities.PfTableauAmo;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PfNatureDecFacade extends AbstractFacade<PfNatureDec> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PfNatureDecFacade() {
        super(PfNatureDec.class);
    }

    public boolean isPfDecaissementsListEmpty(PfNatureDec entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfNatureDec> pfNatureDec = cq.from(PfNatureDec.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfNatureDec, entity), cb.isNotEmpty(pfNatureDec.get(PfNatureDec_.pfDecaissementsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfDecaissements> findPfDecaissementsList(PfNatureDec entity) {
        PfNatureDec mergedEntity = this.getMergedEntity(entity);
        List<PfDecaissements> pfDecaissementsList = mergedEntity.getPfDecaissementsList();
        pfDecaissementsList.size();
        return pfDecaissementsList;
    }

    public boolean isPfTableauAmoListEmpty(PfNatureDec entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfNatureDec> pfNatureDec = cq.from(PfNatureDec.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfNatureDec, entity), cb.isNotEmpty(pfNatureDec.get(PfNatureDec_.pfTableauAmoList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfTableauAmo> findPfTableauAmoList(PfNatureDec entity) {
        PfNatureDec mergedEntity = this.getMergedEntity(entity);
        List<PfTableauAmo> pfTableauAmoList = mergedEntity.getPfTableauAmoList();
        pfTableauAmoList.size();
        return pfTableauAmoList;
    }
    
}
