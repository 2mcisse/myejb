/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.NatureBiens1;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.NatureBiens1_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PfSupports;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class NatureBiens1Facade extends AbstractFacade<NatureBiens1> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NatureBiens1Facade() {
        super(NatureBiens1.class);
    }

    public boolean isPfSupportsListEmpty(NatureBiens1 entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<NatureBiens1> natureBiens1 = cq.from(NatureBiens1.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(natureBiens1, entity), cb.isNotEmpty(natureBiens1.get(NatureBiens1_.pfSupportsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfSupports> findPfSupportsList(NatureBiens1 entity) {
        NatureBiens1 mergedEntity = this.getMergedEntity(entity);
        List<PfSupports> pfSupportsList = mergedEntity.getPfSupportsList();
        pfSupportsList.size();
        return pfSupportsList;
    }
    
}
