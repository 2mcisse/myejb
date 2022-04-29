/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.InteretsCompte;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.InteretsCompte_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.DecMouvements;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class InteretsCompteFacade extends AbstractFacade<InteretsCompte> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InteretsCompteFacade() {
        super(InteretsCompte.class);
    }

    public boolean isIdmouvementsEmpty(InteretsCompte entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<InteretsCompte> interetsCompte = cq.from(InteretsCompte.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(interetsCompte, entity), cb.isNotNull(interetsCompte.get(InteretsCompte_.idmouvements)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public DecMouvements findIdmouvements(InteretsCompte entity) {
        return this.getMergedEntity(entity).getIdmouvements();
    }
    
}
