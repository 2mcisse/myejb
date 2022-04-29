/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Discussioninvitation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Discussioninvitation_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Utilisateur;
import com.cdc.ejb.entities.Utilisateur;
import com.cdc.ejb.entities.Discussion;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DiscussioninvitationFacade extends AbstractFacade<Discussioninvitation> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DiscussioninvitationFacade() {
        super(Discussioninvitation.class);
    }

    public boolean isIDDemandeurEmpty(Discussioninvitation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Discussioninvitation> discussioninvitation = cq.from(Discussioninvitation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(discussioninvitation, entity), cb.isNotNull(discussioninvitation.get(Discussioninvitation_.iDDemandeur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDDemandeur(Discussioninvitation entity) {
        return this.getMergedEntity(entity).getIDDemandeur();
    }

    public boolean isIDDemandeEmpty(Discussioninvitation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Discussioninvitation> discussioninvitation = cq.from(Discussioninvitation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(discussioninvitation, entity), cb.isNotNull(discussioninvitation.get(Discussioninvitation_.iDDemande)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDDemande(Discussioninvitation entity) {
        return this.getMergedEntity(entity).getIDDemande();
    }

    public boolean isIDDiscussionEmpty(Discussioninvitation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Discussioninvitation> discussioninvitation = cq.from(Discussioninvitation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(discussioninvitation, entity), cb.isNotNull(discussioninvitation.get(Discussioninvitation_.iDDiscussion)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Discussion findIDDiscussion(Discussioninvitation entity) {
        return this.getMergedEntity(entity).getIDDiscussion();
    }
    
}
