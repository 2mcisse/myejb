/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Groupes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Groupes_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Tiers;
import com.cdc.ejb.entities.Representantsgroupe;
import com.cdc.ejb.entities.GroupeEtapes;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class GroupesFacade extends AbstractFacade<Groupes> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GroupesFacade() {
        super(Groupes.class);
    }

    public boolean isTiersListEmpty(Groupes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Groupes> groupes = cq.from(Groupes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(groupes, entity), cb.isNotEmpty(groupes.get(Groupes_.tiersList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Tiers> findTiersList(Groupes entity) {
        Groupes mergedEntity = this.getMergedEntity(entity);
        List<Tiers> tiersList = mergedEntity.getTiersList();
        tiersList.size();
        return tiersList;
    }

    public boolean isRepresentantsgroupeListEmpty(Groupes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Groupes> groupes = cq.from(Groupes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(groupes, entity), cb.isNotEmpty(groupes.get(Groupes_.representantsgroupeList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Representantsgroupe> findRepresentantsgroupeList(Groupes entity) {
        Groupes mergedEntity = this.getMergedEntity(entity);
        List<Representantsgroupe> representantsgroupeList = mergedEntity.getRepresentantsgroupeList();
        representantsgroupeList.size();
        return representantsgroupeList;
    }

    public boolean isGroupeEtapesListEmpty(Groupes entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Groupes> groupes = cq.from(Groupes.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(groupes, entity), cb.isNotEmpty(groupes.get(Groupes_.groupeEtapesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<GroupeEtapes> findGroupeEtapesList(Groupes entity) {
        Groupes mergedEntity = this.getMergedEntity(entity);
        List<GroupeEtapes> groupeEtapesList = mergedEntity.getGroupeEtapesList();
        groupeEtapesList.size();
        return groupeEtapesList;
    }
    
}
