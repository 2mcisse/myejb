/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Naturecourrier;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Naturecourrier_;
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
public class NaturecourrierFacade extends AbstractFacade<Naturecourrier> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NaturecourrierFacade() {
        super(Naturecourrier.class);
    }

    public boolean isCourriersListEmpty(Naturecourrier entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Naturecourrier> naturecourrier = cq.from(Naturecourrier.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(naturecourrier, entity), cb.isNotEmpty(naturecourrier.get(Naturecourrier_.courriersList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Courriers> findCourriersList(Naturecourrier entity) {
        Naturecourrier mergedEntity = this.getMergedEntity(entity);
        List<Courriers> courriersList = mergedEntity.getCourriersList();
        courriersList.size();
        return courriersList;
    }
    
}
