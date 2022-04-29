/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Commentaire;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Commentaire_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Billet;
import com.cdc.ejb.entities.Utilisateur;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class CommentaireFacade extends AbstractFacade<Commentaire> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CommentaireFacade() {
        super(Commentaire.class);
    }

    public boolean isIDBilletEmpty(Commentaire entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Commentaire> commentaire = cq.from(Commentaire.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(commentaire, entity), cb.isNotNull(commentaire.get(Commentaire_.iDBillet)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Billet findIDBillet(Commentaire entity) {
        return this.getMergedEntity(entity).getIDBillet();
    }

    public boolean isIDUtilisateurEmpty(Commentaire entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Commentaire> commentaire = cq.from(Commentaire.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(commentaire, entity), cb.isNotNull(commentaire.get(Commentaire_.iDUtilisateur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDUtilisateur(Commentaire entity) {
        return this.getMergedEntity(entity).getIDUtilisateur();
    }
    
}
