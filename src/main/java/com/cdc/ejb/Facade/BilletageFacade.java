/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Billetage;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Billetage_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Encaissements;
import com.cdc.ejb.entities.Demandes;
import com.cdc.ejb.entities.Caisses;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class BilletageFacade extends AbstractFacade<Billetage> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BilletageFacade() {
        super(Billetage.class);
    }

    public boolean isCodeEncEmpty(Billetage entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Billetage> billetage = cq.from(Billetage.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(billetage, entity), cb.isNotNull(billetage.get(Billetage_.codeEnc)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Encaissements findCodeEnc(Billetage entity) {
        return this.getMergedEntity(entity).getCodeEnc();
    }

    public boolean isIddemandesEmpty(Billetage entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Billetage> billetage = cq.from(Billetage.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(billetage, entity), cb.isNotNull(billetage.get(Billetage_.iddemandes)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Demandes findIddemandes(Billetage entity) {
        return this.getMergedEntity(entity).getIddemandes();
    }

    public boolean isNumeroCaisseEmpty(Billetage entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Billetage> billetage = cq.from(Billetage.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(billetage, entity), cb.isNotNull(billetage.get(Billetage_.numeroCaisse)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Caisses findNumeroCaisse(Billetage entity) {
        return this.getMergedEntity(entity).getNumeroCaisse();
    }
    
}
