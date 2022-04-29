/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Messageetiquette;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Messageetiquette_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Etiquette;
import com.cdc.ejb.entities.Message;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class MessageetiquetteFacade extends AbstractFacade<Messageetiquette> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MessageetiquetteFacade() {
        super(Messageetiquette.class);
    }

    public boolean isIDEtiquetteEmpty(Messageetiquette entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Messageetiquette> messageetiquette = cq.from(Messageetiquette.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(messageetiquette, entity), cb.isNotNull(messageetiquette.get(Messageetiquette_.iDEtiquette)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Etiquette findIDEtiquette(Messageetiquette entity) {
        return this.getMergedEntity(entity).getIDEtiquette();
    }

    public boolean isIDMessageEmpty(Messageetiquette entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Messageetiquette> messageetiquette = cq.from(Messageetiquette.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(messageetiquette, entity), cb.isNotNull(messageetiquette.get(Messageetiquette_.iDMessage)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Message findIDMessage(Messageetiquette entity) {
        return this.getMergedEntity(entity).getIDMessage();
    }
    
}
