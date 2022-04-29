/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Portefeuilles;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Portefeuilles_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Gerer;
import com.cdc.ejb.entities.DecNatureoperation;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PortefeuillesFacade extends AbstractFacade<Portefeuilles> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PortefeuillesFacade() {
        super(Portefeuilles.class);
    }

    public boolean isGererListEmpty(Portefeuilles entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Portefeuilles> portefeuilles = cq.from(Portefeuilles.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(portefeuilles, entity), cb.isNotEmpty(portefeuilles.get(Portefeuilles_.gererList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Gerer> findGererList(Portefeuilles entity) {
        Portefeuilles mergedEntity = this.getMergedEntity(entity);
        List<Gerer> gererList = mergedEntity.getGererList();
        gererList.size();
        return gererList;
    }

    public boolean isDecNatureoperationListEmpty(Portefeuilles entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Portefeuilles> portefeuilles = cq.from(Portefeuilles.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(portefeuilles, entity), cb.isNotEmpty(portefeuilles.get(Portefeuilles_.decNatureoperationList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<DecNatureoperation> findDecNatureoperationList(Portefeuilles entity) {
        Portefeuilles mergedEntity = this.getMergedEntity(entity);
        List<DecNatureoperation> decNatureoperationList = mergedEntity.getDecNatureoperationList();
        decNatureoperationList.size();
        return decNatureoperationList;
    }
    
}
