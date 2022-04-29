/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.AchLignesplanPassation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.AchLignesplanPassation_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.AchMarches;
import com.cdc.ejb.entities.AchPlanPassation;
import com.cdc.ejb.entities.Services;
import com.cdc.ejb.entities.AchTypemarche;
import com.cdc.ejb.entities.AchNatureMarche;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class AchLignesplanPassationFacade extends AbstractFacade<AchLignesplanPassation> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AchLignesplanPassationFacade() {
        super(AchLignesplanPassation.class);
    }

    public boolean isAchMarchesListEmpty(AchLignesplanPassation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchLignesplanPassation> achLignesplanPassation = cq.from(AchLignesplanPassation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achLignesplanPassation, entity), cb.isNotEmpty(achLignesplanPassation.get(AchLignesplanPassation_.achMarchesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<AchMarches> findAchMarchesList(AchLignesplanPassation entity) {
        AchLignesplanPassation mergedEntity = this.getMergedEntity(entity);
        List<AchMarches> achMarchesList = mergedEntity.getAchMarchesList();
        achMarchesList.size();
        return achMarchesList;
    }

    public boolean isIdplanPassationEmpty(AchLignesplanPassation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchLignesplanPassation> achLignesplanPassation = cq.from(AchLignesplanPassation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achLignesplanPassation, entity), cb.isNotNull(achLignesplanPassation.get(AchLignesplanPassation_.idplanPassation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public AchPlanPassation findIdplanPassation(AchLignesplanPassation entity) {
        return this.getMergedEntity(entity).getIdplanPassation();
    }

    public boolean isIdservicesEmpty(AchLignesplanPassation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchLignesplanPassation> achLignesplanPassation = cq.from(AchLignesplanPassation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achLignesplanPassation, entity), cb.isNotNull(achLignesplanPassation.get(AchLignesplanPassation_.idservices)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Services findIdservices(AchLignesplanPassation entity) {
        return this.getMergedEntity(entity).getIdservices();
    }

    public boolean isIDTypeEmpty(AchLignesplanPassation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchLignesplanPassation> achLignesplanPassation = cq.from(AchLignesplanPassation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achLignesplanPassation, entity), cb.isNotNull(achLignesplanPassation.get(AchLignesplanPassation_.iDType)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public AchTypemarche findIDType(AchLignesplanPassation entity) {
        return this.getMergedEntity(entity).getIDType();
    }

    public boolean isIdnatureMarcheEmpty(AchLignesplanPassation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchLignesplanPassation> achLignesplanPassation = cq.from(AchLignesplanPassation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achLignesplanPassation, entity), cb.isNotNull(achLignesplanPassation.get(AchLignesplanPassation_.idnatureMarche)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public AchNatureMarche findIdnatureMarche(AchLignesplanPassation entity) {
        return this.getMergedEntity(entity).getIdnatureMarche();
    }
    
}
