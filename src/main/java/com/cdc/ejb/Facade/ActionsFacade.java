/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Actions;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Actions_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Courriers;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class ActionsFacade extends AbstractFacade<Actions> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ActionsFacade() {
        super(Actions.class);
    }

    public boolean isCourriersListEmpty(Actions entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Actions> actions = cq.from(Actions.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(actions, entity), cb.isNotEmpty(actions.get(Actions_.courriersList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Courriers> findCourriersList(Actions entity) {
        Actions mergedEntity = this.getMergedEntity(entity);
        List<Courriers> courriersList = mergedEntity.getCourriersList();
        courriersList.size();
        return courriersList;
    }
    
}
