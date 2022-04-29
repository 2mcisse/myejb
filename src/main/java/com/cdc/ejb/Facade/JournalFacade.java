/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Journal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Journal_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Mouvement;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class JournalFacade extends AbstractFacade<Journal> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public JournalFacade() {
        super(Journal.class);
    }

    public boolean isMouvementListEmpty(Journal entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Journal> journal = cq.from(Journal.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(journal, entity), cb.isNotEmpty(journal.get(Journal_.mouvementList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Mouvement> findMouvementList(Journal entity) {
        Journal mergedEntity = this.getMergedEntity(entity);
        List<Mouvement> mouvementList = mergedEntity.getMouvementList();
        mouvementList.size();
        return mouvementList;
    }
    
}
