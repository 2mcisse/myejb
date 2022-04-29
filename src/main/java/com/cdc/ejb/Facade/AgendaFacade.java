/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Agenda;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Agenda_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Utilisateur;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class AgendaFacade extends AbstractFacade<Agenda> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AgendaFacade() {
        super(Agenda.class);
    }

    public boolean isIDUtilisateurEmpty(Agenda entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Agenda> agenda = cq.from(Agenda.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(agenda, entity), cb.isNotNull(agenda.get(Agenda_.iDUtilisateur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDUtilisateur(Agenda entity) {
        return this.getMergedEntity(entity).getIDUtilisateur();
    }
    
}
