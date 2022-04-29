/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Parametre;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Parametre_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Utilisateur;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class ParametreFacade extends AbstractFacade<Parametre> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ParametreFacade() {
        super(Parametre.class);
    }

    public boolean isIDUtilisateurEmpty(Parametre entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Parametre> parametre = cq.from(Parametre.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(parametre, entity), cb.isNotNull(parametre.get(Parametre_.iDUtilisateur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDUtilisateur(Parametre entity) {
        return this.getMergedEntity(entity).getIDUtilisateur();
    }
    
}
