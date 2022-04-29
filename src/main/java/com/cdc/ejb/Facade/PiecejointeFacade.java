/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Piecejointe;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Piecejointe_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Utilisateur;
import com.cdc.ejb.entities.Messageattache;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PiecejointeFacade extends AbstractFacade<Piecejointe> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PiecejointeFacade() {
        super(Piecejointe.class);
    }

    public boolean isIDUtilisateurEmpty(Piecejointe entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Piecejointe> piecejointe = cq.from(Piecejointe.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(piecejointe, entity), cb.isNotNull(piecejointe.get(Piecejointe_.iDUtilisateur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDUtilisateur(Piecejointe entity) {
        return this.getMergedEntity(entity).getIDUtilisateur();
    }

    public boolean isMessageattacheListEmpty(Piecejointe entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Piecejointe> piecejointe = cq.from(Piecejointe.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(piecejointe, entity), cb.isNotEmpty(piecejointe.get(Piecejointe_.messageattacheList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Messageattache> findMessageattacheList(Piecejointe entity) {
        Piecejointe mergedEntity = this.getMergedEntity(entity);
        List<Messageattache> messageattacheList = mergedEntity.getMessageattacheList();
        messageattacheList.size();
        return messageattacheList;
    }
    
}
