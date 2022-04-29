/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Messageattache;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Messageattache_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Piecejointe;
import com.cdc.ejb.entities.Message;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class MessageattacheFacade extends AbstractFacade<Messageattache> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MessageattacheFacade() {
        super(Messageattache.class);
    }

    public boolean isCleEmpty(Messageattache entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Messageattache> messageattache = cq.from(Messageattache.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(messageattache, entity), cb.isNotNull(messageattache.get(Messageattache_.cle)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Piecejointe findCle(Messageattache entity) {
        return this.getMergedEntity(entity).getCle();
    }

    public boolean isIDMessageEmpty(Messageattache entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Messageattache> messageattache = cq.from(Messageattache.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(messageattache, entity), cb.isNotNull(messageattache.get(Messageattache_.iDMessage)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Message findIDMessage(Messageattache entity) {
        return this.getMergedEntity(entity).getIDMessage();
    }
    
}
