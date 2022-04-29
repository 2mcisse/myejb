/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.ApproDeg;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.ApproDeg_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Mouvement;
import com.cdc.ejb.entities.Caisses;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class ApproDegFacade extends AbstractFacade<ApproDeg> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ApproDegFacade() {
        super(ApproDeg.class);
    }

    public boolean isMouvementListEmpty(ApproDeg entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<ApproDeg> approDeg = cq.from(ApproDeg.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(approDeg, entity), cb.isNotEmpty(approDeg.get(ApproDeg_.mouvementList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Mouvement> findMouvementList(ApproDeg entity) {
        ApproDeg mergedEntity = this.getMergedEntity(entity);
        List<Mouvement> mouvementList = mergedEntity.getMouvementList();
        mouvementList.size();
        return mouvementList;
    }

    public boolean isNumeroCaisseEmpty(ApproDeg entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<ApproDeg> approDeg = cq.from(ApproDeg.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(approDeg, entity), cb.isNotNull(approDeg.get(ApproDeg_.numeroCaisse)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Caisses findNumeroCaisse(ApproDeg entity) {
        return this.getMergedEntity(entity).getNumeroCaisse();
    }
    
}
