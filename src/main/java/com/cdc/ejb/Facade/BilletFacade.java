/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Billet;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Billet_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Commentaire;
import com.cdc.ejb.entities.Blog;
import com.cdc.ejb.entities.Utilisateur;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class BilletFacade extends AbstractFacade<Billet> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BilletFacade() {
        super(Billet.class);
    }

    public boolean isCommentaireListEmpty(Billet entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Billet> billet = cq.from(Billet.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(billet, entity), cb.isNotEmpty(billet.get(Billet_.commentaireList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Commentaire> findCommentaireList(Billet entity) {
        Billet mergedEntity = this.getMergedEntity(entity);
        List<Commentaire> commentaireList = mergedEntity.getCommentaireList();
        commentaireList.size();
        return commentaireList;
    }

    public boolean isIDBlogEmpty(Billet entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Billet> billet = cq.from(Billet.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(billet, entity), cb.isNotNull(billet.get(Billet_.iDBlog)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Blog findIDBlog(Billet entity) {
        return this.getMergedEntity(entity).getIDBlog();
    }

    public boolean isIDUtilisateurEmpty(Billet entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Billet> billet = cq.from(Billet.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(billet, entity), cb.isNotNull(billet.get(Billet_.iDUtilisateur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDUtilisateur(Billet entity) {
        return this.getMergedEntity(entity).getIDUtilisateur();
    }
    
}
