/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Forum;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Forum_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Forum;
import com.cdc.ejb.entities.Forum;
import com.cdc.ejb.entities.Utilisateur;
import com.cdc.ejb.entities.Topic;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class ForumFacade extends AbstractFacade<Forum> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ForumFacade() {
        super(Forum.class);
    }

    public boolean isForumListEmpty(Forum entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Forum> forum = cq.from(Forum.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(forum, entity), cb.isNotEmpty(forum.get(Forum_.forumList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Forum> findForumList(Forum entity) {
        Forum mergedEntity = this.getMergedEntity(entity);
        List<Forum> forumList = mergedEntity.getForumList();
        forumList.size();
        return forumList;
    }

    public boolean isIDForumParentEmpty(Forum entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Forum> forum = cq.from(Forum.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(forum, entity), cb.isNotNull(forum.get(Forum_.iDForumParent)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Forum findIDForumParent(Forum entity) {
        return this.getMergedEntity(entity).getIDForumParent();
    }

    public boolean isIDUtilisateurEmpty(Forum entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Forum> forum = cq.from(Forum.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(forum, entity), cb.isNotNull(forum.get(Forum_.iDUtilisateur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDUtilisateur(Forum entity) {
        return this.getMergedEntity(entity).getIDUtilisateur();
    }

    public boolean isTopicListEmpty(Forum entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Forum> forum = cq.from(Forum.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(forum, entity), cb.isNotEmpty(forum.get(Forum_.topicList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Topic> findTopicList(Forum entity) {
        Forum mergedEntity = this.getMergedEntity(entity);
        List<Topic> topicList = mergedEntity.getTopicList();
        topicList.size();
        return topicList;
    }
    
}
