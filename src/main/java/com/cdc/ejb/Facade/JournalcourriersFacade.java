/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Journalcourriers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Journalcourriers_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Courriers;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class JournalcourriersFacade extends AbstractFacade<Journalcourriers> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JournalcourriersFacade() {
        super(Journalcourriers.class);
    }

    public boolean isIDDocumentsEmpty(Journalcourriers entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Journalcourriers> journalcourriers = cq.from(Journalcourriers.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(journalcourriers, entity), cb.isNotNull(journalcourriers.get(Journalcourriers_.iDDocuments)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Courriers findIDDocuments(Journalcourriers entity) {
        return this.getMergedEntity(entity).getIDDocuments();
    }
    
}
