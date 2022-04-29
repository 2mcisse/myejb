/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.EtapesPartypeappro;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.EtapesPartypeappro_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.EtapesMarchesDetails;
import com.cdc.ejb.entities.AchNatureMarche;
import com.cdc.ejb.entities.AchModeEvaluation;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class EtapesPartypeapproFacade extends AbstractFacade<EtapesPartypeappro> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EtapesPartypeapproFacade() {
        super(EtapesPartypeappro.class);
    }

    public boolean isEtapesMarchesDetailsListEmpty(EtapesPartypeappro entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<EtapesPartypeappro> etapesPartypeappro = cq.from(EtapesPartypeappro.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(etapesPartypeappro, entity), cb.isNotEmpty(etapesPartypeappro.get(EtapesPartypeappro_.etapesMarchesDetailsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<EtapesMarchesDetails> findEtapesMarchesDetailsList(EtapesPartypeappro entity) {
        EtapesPartypeappro mergedEntity = this.getMergedEntity(entity);
        List<EtapesMarchesDetails> etapesMarchesDetailsList = mergedEntity.getEtapesMarchesDetailsList();
        etapesMarchesDetailsList.size();
        return etapesMarchesDetailsList;
    }

    public boolean isIdnatureMarcheEmpty(EtapesPartypeappro entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<EtapesPartypeappro> etapesPartypeappro = cq.from(EtapesPartypeappro.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(etapesPartypeappro, entity), cb.isNotNull(etapesPartypeappro.get(EtapesPartypeappro_.idnatureMarche)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public AchNatureMarche findIdnatureMarche(EtapesPartypeappro entity) {
        return this.getMergedEntity(entity).getIdnatureMarche();
    }

    public boolean isIdachModeEvaluationEmpty(EtapesPartypeappro entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<EtapesPartypeappro> etapesPartypeappro = cq.from(EtapesPartypeappro.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(etapesPartypeappro, entity), cb.isNotNull(etapesPartypeappro.get(EtapesPartypeappro_.idachModeEvaluation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public AchModeEvaluation findIdachModeEvaluation(EtapesPartypeappro entity) {
        return this.getMergedEntity(entity).getIdachModeEvaluation();
    }
    
}
