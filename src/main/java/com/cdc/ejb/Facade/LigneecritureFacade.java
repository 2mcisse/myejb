/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Ligneecriture;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Ligneecriture_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Compte;
import com.cdc.ejb.entities.Mouvement;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class LigneecritureFacade extends AbstractFacade<Ligneecriture> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LigneecritureFacade() {
        super(Ligneecriture.class);
    }

    public boolean isNumeroCompteEmpty(Ligneecriture entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Ligneecriture> ligneecriture = cq.from(Ligneecriture.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(ligneecriture, entity), cb.isNotNull(ligneecriture.get(Ligneecriture_.numeroCompte)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Compte findNumeroCompte(Ligneecriture entity) {
        return this.getMergedEntity(entity).getNumeroCompte();
    }

    public boolean isIDMouvementEmpty(Ligneecriture entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Ligneecriture> ligneecriture = cq.from(Ligneecriture.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(ligneecriture, entity), cb.isNotNull(ligneecriture.get(Ligneecriture_.iDMouvement)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Mouvement findIDMouvement(Ligneecriture entity) {
        return this.getMergedEntity(entity).getIDMouvement();
    }
    
}
