/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Lien;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Lien_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Utilisateur;
import com.cdc.ejb.entities.Liennote;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class LienFacade extends AbstractFacade<Lien> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LienFacade() {
        super(Lien.class);
    }

    public boolean isIDUtilisateurEmpty(Lien entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Lien> lien = cq.from(Lien.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(lien, entity), cb.isNotNull(lien.get(Lien_.iDUtilisateur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDUtilisateur(Lien entity) {
        return this.getMergedEntity(entity).getIDUtilisateur();
    }

    public boolean isLiennoteListEmpty(Lien entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Lien> lien = cq.from(Lien.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(lien, entity), cb.isNotEmpty(lien.get(Lien_.liennoteList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Liennote> findLiennoteList(Lien entity) {
        Lien mergedEntity = this.getMergedEntity(entity);
        List<Liennote> liennoteList = mergedEntity.getLiennoteList();
        liennoteList.size();
        return liennoteList;
    }
    
}
