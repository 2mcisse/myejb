/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.AchPlanPassation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.AchPlanPassation_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.AchLignesplanPassation;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class AchPlanPassationFacade extends AbstractFacade<AchPlanPassation> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AchPlanPassationFacade() {
        super(AchPlanPassation.class);
    }

    public boolean isAchLignesplanPassationListEmpty(AchPlanPassation entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchPlanPassation> achPlanPassation = cq.from(AchPlanPassation.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achPlanPassation, entity), cb.isNotEmpty(achPlanPassation.get(AchPlanPassation_.achLignesplanPassationList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<AchLignesplanPassation> findAchLignesplanPassationList(AchPlanPassation entity) {
        AchPlanPassation mergedEntity = this.getMergedEntity(entity);
        List<AchLignesplanPassation> achLignesplanPassationList = mergedEntity.getAchLignesplanPassationList();
        achLignesplanPassationList.size();
        return achLignesplanPassationList;
    }
    
}
