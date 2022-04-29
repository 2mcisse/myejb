/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Document;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Document_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Index;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class DocumentFacade extends AbstractFacade<Document> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DocumentFacade() {
        super(Document.class);
    }

    public boolean isIndexListEmpty(Document entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Document> document = cq.from(Document.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(document, entity), cb.isNotEmpty(document.get(Document_.indexList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Index> findIndexList(Document entity) {
        Document mergedEntity = this.getMergedEntity(entity);
        List<Index> indexList = mergedEntity.getIndexList();
        indexList.size();
        return indexList;
    }
    
}
