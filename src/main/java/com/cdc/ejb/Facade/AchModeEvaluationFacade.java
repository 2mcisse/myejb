/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.AchModeEvaluation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.AchModeEvaluation_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.AchMarches;
import com.cdc.ejb.entities.EtapesPartypeappro;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class AchModeEvaluationFacade extends AbstractFacade<AchModeEvaluation> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AchModeEvaluationFacade() {
        super(AchModeEvaluation.class);
    }

    public boolean isAchMarchesListEmpty(AchModeEvaluation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchModeEvaluation> achModeEvaluation = cq.from(AchModeEvaluation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achModeEvaluation, entity), cb.isNotEmpty(achModeEvaluation.get(AchModeEvaluation_.achMarchesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<AchMarches> findAchMarchesList(AchModeEvaluation entity) {
        AchModeEvaluation mergedEntity = this.getMergedEntity(entity);
        List<AchMarches> achMarchesList = mergedEntity.getAchMarchesList();
        achMarchesList.size();
        return achMarchesList;
    }

    public boolean isEtapesPartypeapproListEmpty(AchModeEvaluation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchModeEvaluation> achModeEvaluation = cq.from(AchModeEvaluation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achModeEvaluation, entity), cb.isNotEmpty(achModeEvaluation.get(AchModeEvaluation_.etapesPartypeapproList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<EtapesPartypeappro> findEtapesPartypeapproList(AchModeEvaluation entity) {
        AchModeEvaluation mergedEntity = this.getMergedEntity(entity);
        List<EtapesPartypeappro> etapesPartypeapproList = mergedEntity.getEtapesPartypeapproList();
        etapesPartypeapproList.size();
        return etapesPartypeapproList;
    }
    
}
