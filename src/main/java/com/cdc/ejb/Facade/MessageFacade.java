/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Message;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Message_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Destinataire;
import com.cdc.ejb.entities.Utilisateur;
import com.cdc.ejb.entities.Messageetiquette;
import com.cdc.ejb.entities.Messageattache;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class MessageFacade extends AbstractFacade<Message> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MessageFacade() {
        super(Message.class);
    }

    public boolean isDestinataireListEmpty(Message entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Message> message = cq.from(Message.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(message, entity), cb.isNotEmpty(message.get(Message_.destinataireList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Destinataire> findDestinataireList(Message entity) {
        Message mergedEntity = this.getMergedEntity(entity);
        List<Destinataire> destinataireList = mergedEntity.getDestinataireList();
        destinataireList.size();
        return destinataireList;
    }

    public boolean isIDExpediteurEmpty(Message entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Message> message = cq.from(Message.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(message, entity), cb.isNotNull(message.get(Message_.iDExpediteur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDExpediteur(Message entity) {
        return this.getMergedEntity(entity).getIDExpediteur();
    }

    public boolean isMessageetiquetteListEmpty(Message entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Message> message = cq.from(Message.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(message, entity), cb.isNotEmpty(message.get(Message_.messageetiquetteList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Messageetiquette> findMessageetiquetteList(Message entity) {
        Message mergedEntity = this.getMergedEntity(entity);
        List<Messageetiquette> messageetiquetteList = mergedEntity.getMessageetiquetteList();
        messageetiquetteList.size();
        return messageetiquetteList;
    }

    public boolean isMessageattacheListEmpty(Message entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Message> message = cq.from(Message.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(message, entity), cb.isNotEmpty(message.get(Message_.messageattacheList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Messageattache> findMessageattacheList(Message entity) {
        Message mergedEntity = this.getMergedEntity(entity);
        List<Messageattache> messageattacheList = mergedEntity.getMessageattacheList();
        messageattacheList.size();
        return messageattacheList;
    }
    
}
