/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Guichets;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Guichets_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Affectation;
import com.cdc.ejb.entities.Caisses;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class GuichetsFacade extends AbstractFacade<Guichets> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GuichetsFacade() {
        super(Guichets.class);
    }

    public boolean isAffectationListEmpty(Guichets entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Guichets> guichets = cq.from(Guichets.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(guichets, entity), cb.isNotEmpty(guichets.get(Guichets_.affectationList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Affectation> findAffectationList(Guichets entity) {
        Guichets mergedEntity = this.getMergedEntity(entity);
        List<Affectation> affectationList = mergedEntity.getAffectationList();
        affectationList.size();
        return affectationList;
    }

    public boolean isCaissesListEmpty(Guichets entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Guichets> guichets = cq.from(Guichets.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(guichets, entity), cb.isNotEmpty(guichets.get(Guichets_.caissesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Caisses> findCaissesList(Guichets entity) {
        Guichets mergedEntity = this.getMergedEntity(entity);
        List<Caisses> caissesList = mergedEntity.getCaissesList();
        caissesList.size();
        return caissesList;
    }
    
}
