/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Etablissementgestionnaire;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Etablissementgestionnaire_;
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
public class EtablissementgestionnaireFacade extends AbstractFacade<Etablissementgestionnaire> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EtablissementgestionnaireFacade() {
        super(Etablissementgestionnaire.class);
    }

    public boolean isPfSupportsListEmpty(Etablissementgestionnaire entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Etablissementgestionnaire> etablissementgestionnaire = cq.from(Etablissementgestionnaire.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(etablissementgestionnaire, entity), cb.isNotEmpty(etablissementgestionnaire.get(Etablissementgestionnaire_.pfSupportsList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfSupports> findPfSupportsList(Etablissementgestionnaire entity) {
        Etablissementgestionnaire mergedEntity = this.getMergedEntity(entity);
        List<PfSupports> pfSupportsList = mergedEntity.getPfSupportsList();
        pfSupportsList.size();
        return pfSupportsList;
    }
    
}
