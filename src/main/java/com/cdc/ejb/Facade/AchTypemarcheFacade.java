/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.AchTypemarche;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.AchTypemarche_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.AchMarches;
import com.cdc.ejb.entities.AchLignesplanPassation;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class AchTypemarcheFacade extends AbstractFacade<AchTypemarche> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AchTypemarcheFacade() {
        super(AchTypemarche.class);
    }

    public boolean isAchMarchesListEmpty(AchTypemarche entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchTypemarche> achTypemarche = cq.from(AchTypemarche.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achTypemarche, entity), cb.isNotEmpty(achTypemarche.get(AchTypemarche_.achMarchesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<AchMarches> findAchMarchesList(AchTypemarche entity) {
        AchTypemarche mergedEntity = this.getMergedEntity(entity);
        List<AchMarches> achMarchesList = mergedEntity.getAchMarchesList();
        achMarchesList.size();
        return achMarchesList;
    }

    public boolean isAchLignesplanPassationListEmpty(AchTypemarche entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchTypemarche> achTypemarche = cq.from(AchTypemarche.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achTypemarche, entity), cb.isNotEmpty(achTypemarche.get(AchTypemarche_.achLignesplanPassationList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<AchLignesplanPassation> findAchLignesplanPassationList(AchTypemarche entity) {
        AchTypemarche mergedEntity = this.getMergedEntity(entity);
        List<AchLignesplanPassation> achLignesplanPassationList = mergedEntity.getAchLignesplanPassationList();
        achLignesplanPassationList.size();
        return achLignesplanPassationList;
    }
    
}
