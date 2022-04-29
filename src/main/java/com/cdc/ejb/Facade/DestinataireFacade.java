/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Destinataire;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Destinataire_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Utilisateur;
import com.cdc.ejb.entities.Message;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DestinataireFacade extends AbstractFacade<Destinataire> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DestinataireFacade() {
        super(Destinataire.class);
    }

    public boolean isIDUtilisateurEmpty(Destinataire entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Destinataire> destinataire = cq.from(Destinataire.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(destinataire, entity), cb.isNotNull(destinataire.get(Destinataire_.iDUtilisateur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDUtilisateur(Destinataire entity) {
        return this.getMergedEntity(entity).getIDUtilisateur();
    }

    public boolean isIDMessageEmpty(Destinataire entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Destinataire> destinataire = cq.from(Destinataire.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(destinataire, entity), cb.isNotNull(destinataire.get(Destinataire_.iDMessage)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Message findIDMessage(Destinataire entity) {
        return this.getMergedEntity(entity).getIDMessage();
    }
    
}
