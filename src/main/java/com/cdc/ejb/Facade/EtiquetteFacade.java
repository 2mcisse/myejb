/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Etiquette;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Etiquette_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Messageetiquette;
import com.cdc.ejb.entities.Utilisateur;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class EtiquetteFacade extends AbstractFacade<Etiquette> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EtiquetteFacade() {
        super(Etiquette.class);
    }

    public boolean isMessageetiquetteListEmpty(Etiquette entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Etiquette> etiquette = cq.from(Etiquette.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(etiquette, entity), cb.isNotEmpty(etiquette.get(Etiquette_.messageetiquetteList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Messageetiquette> findMessageetiquetteList(Etiquette entity) {
        Etiquette mergedEntity = this.getMergedEntity(entity);
        List<Messageetiquette> messageetiquetteList = mergedEntity.getMessageetiquetteList();
        messageetiquetteList.size();
        return messageetiquetteList;
    }

    public boolean isIDUtilisateurEmpty(Etiquette entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Etiquette> etiquette = cq.from(Etiquette.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(etiquette, entity), cb.isNotNull(etiquette.get(Etiquette_.iDUtilisateur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDUtilisateur(Etiquette entity) {
        return this.getMergedEntity(entity).getIDUtilisateur();
    }
    
}
