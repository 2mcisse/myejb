/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Partage;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Partage_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Utilisateur;
import com.cdc.ejb.entities.Partagedroit;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PartageFacade extends AbstractFacade<Partage> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PartageFacade() {
        super(Partage.class);
    }

    public boolean isIDProprietaireEmpty(Partage entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Partage> partage = cq.from(Partage.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(partage, entity), cb.isNotNull(partage.get(Partage_.iDProprietaire)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDProprietaire(Partage entity) {
        return this.getMergedEntity(entity).getIDProprietaire();
    }

    public boolean isPartagedroitListEmpty(Partage entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Partage> partage = cq.from(Partage.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(partage, entity), cb.isNotEmpty(partage.get(Partage_.partagedroitList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Partagedroit> findPartagedroitList(Partage entity) {
        Partage mergedEntity = this.getMergedEntity(entity);
        List<Partagedroit> partagedroitList = mergedEntity.getPartagedroitList();
        partagedroitList.size();
        return partagedroitList;
    }
    
}
