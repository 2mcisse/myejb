/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Partagedroit;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Partagedroit_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Groupe;
import com.cdc.ejb.entities.Partage;
import com.cdc.ejb.entities.Utilisateur;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PartagedroitFacade extends AbstractFacade<Partagedroit> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PartagedroitFacade() {
        super(Partagedroit.class);
    }

    public boolean isIDGroupeEmpty(Partagedroit entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Partagedroit> partagedroit = cq.from(Partagedroit.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(partagedroit, entity), cb.isNotNull(partagedroit.get(Partagedroit_.iDGroupe)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Groupe findIDGroupe(Partagedroit entity) {
        return this.getMergedEntity(entity).getIDGroupe();
    }

    public boolean isIDPartageEmpty(Partagedroit entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Partagedroit> partagedroit = cq.from(Partagedroit.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(partagedroit, entity), cb.isNotNull(partagedroit.get(Partagedroit_.iDPartage)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Partage findIDPartage(Partagedroit entity) {
        return this.getMergedEntity(entity).getIDPartage();
    }

    public boolean isIDUtilisateurEmpty(Partagedroit entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Partagedroit> partagedroit = cq.from(Partagedroit.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(partagedroit, entity), cb.isNotNull(partagedroit.get(Partagedroit_.iDUtilisateur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDUtilisateur(Partagedroit entity) {
        return this.getMergedEntity(entity).getIDUtilisateur();
    }
    
}
