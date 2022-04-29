/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Discussionmessage;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Discussionmessage_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Discussion;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DiscussionmessageFacade extends AbstractFacade<Discussionmessage> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DiscussionmessageFacade() {
        super(Discussionmessage.class);
    }

    public boolean isIDDiscussionEmpty(Discussionmessage entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Discussionmessage> discussionmessage = cq.from(Discussionmessage.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(discussionmessage, entity), cb.isNotNull(discussionmessage.get(Discussionmessage_.iDDiscussion)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Discussion findIDDiscussion(Discussionmessage entity) {
        return this.getMergedEntity(entity).getIDDiscussion();
    }
    
}
