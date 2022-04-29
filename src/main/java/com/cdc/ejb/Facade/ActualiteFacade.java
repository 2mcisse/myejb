/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Actualite;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Actualite_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Utilisateur;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class ActualiteFacade extends AbstractFacade<Actualite> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ActualiteFacade() {
        super(Actualite.class);
    }

    public boolean isIDUtilisateurEmpty(Actualite entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Actualite> actualite = cq.from(Actualite.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(actualite, entity), cb.isNotNull(actualite.get(Actualite_.iDUtilisateur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDUtilisateur(Actualite entity) {
        return this.getMergedEntity(entity).getIDUtilisateur();
    }
    
}
