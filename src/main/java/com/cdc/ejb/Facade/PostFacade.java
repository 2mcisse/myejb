/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Post;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Post_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Utilisateur;
import com.cdc.ejb.entities.Topic;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PostFacade extends AbstractFacade<Post> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PostFacade() {
        super(Post.class);
    }

    public boolean isIDUtilisateurEmpty(Post entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Post> post = cq.from(Post.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(post, entity), cb.isNotNull(post.get(Post_.iDUtilisateur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDUtilisateur(Post entity) {
        return this.getMergedEntity(entity).getIDUtilisateur();
    }

    public boolean isIDTopicEmpty(Post entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Post> post = cq.from(Post.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(post, entity), cb.isNotNull(post.get(Post_.iDTopic)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Topic findIDTopic(Post entity) {
        return this.getMergedEntity(entity).getIDTopic();
    }
    
}
