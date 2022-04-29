/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Discussion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Discussion_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Discussionmessage;
import com.cdc.ejb.entities.Discussioninvitation;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DiscussionFacade extends AbstractFacade<Discussion> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DiscussionFacade() {
        super(Discussion.class);
    }

    public boolean isDiscussionmessageListEmpty(Discussion entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Discussion> discussion = cq.from(Discussion.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(discussion, entity), cb.isNotEmpty(discussion.get(Discussion_.discussionmessageList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Discussionmessage> findDiscussionmessageList(Discussion entity) {
        Discussion mergedEntity = this.getMergedEntity(entity);
        List<Discussionmessage> discussionmessageList = mergedEntity.getDiscussionmessageList();
        discussionmessageList.size();
        return discussionmessageList;
    }

    public boolean isDiscussioninvitationListEmpty(Discussion entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Discussion> discussion = cq.from(Discussion.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(discussion, entity), cb.isNotEmpty(discussion.get(Discussion_.discussioninvitationList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Discussioninvitation> findDiscussioninvitationList(Discussion entity) {
        Discussion mergedEntity = this.getMergedEntity(entity);
        List<Discussioninvitation> discussioninvitationList = mergedEntity.getDiscussioninvitationList();
        discussioninvitationList.size();
        return discussioninvitationList;
    }
    
}
