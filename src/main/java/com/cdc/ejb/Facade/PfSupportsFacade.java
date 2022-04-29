/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.PfSupports;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.PfSupports_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.PfTableauAmo;
import com.cdc.ejb.entities.Fiscalite;
import com.cdc.ejb.entities.PfArrete;
import com.cdc.ejb.entities.NatureBiens1;
import com.cdc.ejb.entities.PfTypeEnc;
import com.cdc.ejb.entities.Etablissementgestionnaire;
import com.cdc.ejb.entities.PfCategorieoperation;
import com.cdc.ejb.entities.PfTypesupports;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class PfSupportsFacade extends AbstractFacade<PfSupports> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PfSupportsFacade() {
        super(PfSupports.class);
    }

    public boolean isPfTableauAmoListEmpty(PfSupports entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfSupports> pfSupports = cq.from(PfSupports.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfSupports, entity), cb.isNotEmpty(pfSupports.get(PfSupports_.pfTableauAmoList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfTableauAmo> findPfTableauAmoList(PfSupports entity) {
        PfSupports mergedEntity = this.getMergedEntity(entity);
        List<PfTableauAmo> pfTableauAmoList = mergedEntity.getPfTableauAmoList();
        pfTableauAmoList.size();
        return pfTableauAmoList;
    }

    public boolean isFiscaliteListEmpty(PfSupports entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfSupports> pfSupports = cq.from(PfSupports.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfSupports, entity), cb.isNotEmpty(pfSupports.get(PfSupports_.fiscaliteList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Fiscalite> findFiscaliteList(PfSupports entity) {
        PfSupports mergedEntity = this.getMergedEntity(entity);
        List<Fiscalite> fiscaliteList = mergedEntity.getFiscaliteList();
        fiscaliteList.size();
        return fiscaliteList;
    }

    public boolean isPfArreteListEmpty(PfSupports entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfSupports> pfSupports = cq.from(PfSupports.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfSupports, entity), cb.isNotEmpty(pfSupports.get(PfSupports_.pfArreteList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<PfArrete> findPfArreteList(PfSupports entity) {
        PfSupports mergedEntity = this.getMergedEntity(entity);
        List<PfArrete> pfArreteList = mergedEntity.getPfArreteList();
        pfArreteList.size();
        return pfArreteList;
    }

    public boolean isIdnatureBiensEmpty(PfSupports entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfSupports> pfSupports = cq.from(PfSupports.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfSupports, entity), cb.isNotNull(pfSupports.get(PfSupports_.idnatureBiens)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public NatureBiens1 findIdnatureBiens(PfSupports entity) {
        return this.getMergedEntity(entity).getIdnatureBiens();
    }

    public boolean isIdtypeEncEmpty(PfSupports entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfSupports> pfSupports = cq.from(PfSupports.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfSupports, entity), cb.isNotNull(pfSupports.get(PfSupports_.idtypeEnc)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfTypeEnc findIdtypeEnc(PfSupports entity) {
        return this.getMergedEntity(entity).getIdtypeEnc();
    }

    public boolean isEtablissementGestionnaireEmpty(PfSupports entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfSupports> pfSupports = cq.from(PfSupports.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfSupports, entity), cb.isNotNull(pfSupports.get(PfSupports_.etablissementGestionnaire)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Etablissementgestionnaire findEtablissementGestionnaire(PfSupports entity) {
        return this.getMergedEntity(entity).getEtablissementGestionnaire();
    }

    public boolean isIDPFCategorieOperationEmpty(PfSupports entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfSupports> pfSupports = cq.from(PfSupports.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfSupports, entity), cb.isNotNull(pfSupports.get(PfSupports_.iDPFCategorieOperation)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfCategorieoperation findIDPFCategorieOperation(PfSupports entity) {
        return this.getMergedEntity(entity).getIDPFCategorieOperation();
    }

    public boolean isIdpfTypesupportsEmpty(PfSupports entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<PfSupports> pfSupports = cq.from(PfSupports.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(pfSupports, entity), cb.isNotNull(pfSupports.get(PfSupports_.idpfTypesupports)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public PfTypesupports findIdpfTypesupports(PfSupports entity) {
        return this.getMergedEntity(entity).getIdpfTypesupports();
    }
    
}
