/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Gestions;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Gestions_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Periodes;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class GestionsFacade extends AbstractFacade<Gestions> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GestionsFacade() {
        super(Gestions.class);
    }

    public boolean isPeriodesListEmpty(Gestions entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Gestions> gestions = cq.from(Gestions.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(gestions, entity), cb.isNotEmpty(gestions.get(Gestions_.periodesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Periodes> findPeriodesList(Gestions entity) {
        Gestions mergedEntity = this.getMergedEntity(entity);
        List<Periodes> periodesList = mergedEntity.getPeriodesList();
        periodesList.size();
        return periodesList;
    }
    
}
