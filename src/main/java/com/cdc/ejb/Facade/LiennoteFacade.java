/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Liennote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Liennote_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Utilisateur;
import com.cdc.ejb.entities.Lien;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class LiennoteFacade extends AbstractFacade<Liennote> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LiennoteFacade() {
        super(Liennote.class);
    }

    public boolean isIDUtilisateurEmpty(Liennote entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Liennote> liennote = cq.from(Liennote.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(liennote, entity), cb.isNotNull(liennote.get(Liennote_.iDUtilisateur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDUtilisateur(Liennote entity) {
        return this.getMergedEntity(entity).getIDUtilisateur();
    }

    public boolean isIDLienEmpty(Liennote entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Liennote> liennote = cq.from(Liennote.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(liennote, entity), cb.isNotNull(liennote.get(Liennote_.iDLien)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Lien findIDLien(Liennote entity) {
        return this.getMergedEntity(entity).getIDLien();
    }
    
}
