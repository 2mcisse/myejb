/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.AchComites;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.AchComites_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.AchMarches;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class AchComitesFacade extends AbstractFacade<AchComites> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AchComitesFacade() {
        super(AchComites.class);
    }

    public boolean isIDMarcheEmpty(AchComites entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchComites> achComites = cq.from(AchComites.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achComites, entity), cb.isNotNull(achComites.get(AchComites_.iDMarche)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public AchMarches findIDMarche(AchComites entity) {
        return this.getMergedEntity(entity).getIDMarche();
    }
    
}
