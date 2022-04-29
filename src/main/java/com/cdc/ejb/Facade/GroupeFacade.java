/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Groupe;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Groupe_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Partagedroit;
import com.cdc.ejb.entities.Utilisateur;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class GroupeFacade extends AbstractFacade<Groupe> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GroupeFacade() {
        super(Groupe.class);
    }

    public boolean isPartagedroitListEmpty(Groupe entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Groupe> groupe = cq.from(Groupe.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(groupe, entity), cb.isNotEmpty(groupe.get(Groupe_.partagedroitList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Partagedroit> findPartagedroitList(Groupe entity) {
        Groupe mergedEntity = this.getMergedEntity(entity);
        List<Partagedroit> partagedroitList = mergedEntity.getPartagedroitList();
        partagedroitList.size();
        return partagedroitList;
    }

    public boolean isIDUtilisateurEmpty(Groupe entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Groupe> groupe = cq.from(Groupe.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(groupe, entity), cb.isNotNull(groupe.get(Groupe_.iDUtilisateur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDUtilisateur(Groupe entity) {
        return this.getMergedEntity(entity).getIDUtilisateur();
    }
    
}
