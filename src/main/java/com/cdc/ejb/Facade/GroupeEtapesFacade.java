/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.GroupeEtapes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.GroupeEtapes_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Typecourriers;
import com.cdc.ejb.entities.Groupes;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class GroupeEtapesFacade extends AbstractFacade<GroupeEtapes> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GroupeEtapesFacade() {
        super(GroupeEtapes.class);
    }

    public boolean isIDTypeCourriersEmpty(GroupeEtapes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<GroupeEtapes> groupeEtapes = cq.from(GroupeEtapes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(groupeEtapes, entity), cb.isNotNull(groupeEtapes.get(GroupeEtapes_.iDTypeCourriers)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Typecourriers findIDTypeCourriers(GroupeEtapes entity) {
        return this.getMergedEntity(entity).getIDTypeCourriers();
    }

    public boolean isNomGroupeEmpty(GroupeEtapes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<GroupeEtapes> groupeEtapes = cq.from(GroupeEtapes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(groupeEtapes, entity), cb.isNotNull(groupeEtapes.get(GroupeEtapes_.nomGroupe)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Groupes findNomGroupe(GroupeEtapes entity) {
        return this.getMergedEntity(entity).getNomGroupe();
    }
    
}
