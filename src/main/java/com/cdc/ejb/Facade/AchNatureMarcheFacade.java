/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.AchNatureMarche;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.AchNatureMarche_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.AchMarches;
import com.cdc.ejb.entities.AchLignesplanPassation;
import com.cdc.ejb.entities.EtapesPartypeappro;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class AchNatureMarcheFacade extends AbstractFacade<AchNatureMarche> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AchNatureMarcheFacade() {
        super(AchNatureMarche.class);
    }

    public boolean isAchMarchesListEmpty(AchNatureMarche entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchNatureMarche> achNatureMarche = cq.from(AchNatureMarche.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achNatureMarche, entity), cb.isNotEmpty(achNatureMarche.get(AchNatureMarche_.achMarchesList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<AchMarches> findAchMarchesList(AchNatureMarche entity) {
        AchNatureMarche mergedEntity = this.getMergedEntity(entity);
        List<AchMarches> achMarchesList = mergedEntity.getAchMarchesList();
        achMarchesList.size();
        return achMarchesList;
    }

    public boolean isAchLignesplanPassationListEmpty(AchNatureMarche entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchNatureMarche> achNatureMarche = cq.from(AchNatureMarche.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achNatureMarche, entity), cb.isNotEmpty(achNatureMarche.get(AchNatureMarche_.achLignesplanPassationList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<AchLignesplanPassation> findAchLignesplanPassationList(AchNatureMarche entity) {
        AchNatureMarche mergedEntity = this.getMergedEntity(entity);
        List<AchLignesplanPassation> achLignesplanPassationList = mergedEntity.getAchLignesplanPassationList();
        achLignesplanPassationList.size();
        return achLignesplanPassationList;
    }

    public boolean isEtapesPartypeapproListEmpty(AchNatureMarche entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<AchNatureMarche> achNatureMarche = cq.from(AchNatureMarche.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(achNatureMarche, entity), cb.isNotEmpty(achNatureMarche.get(AchNatureMarche_.etapesPartypeapproList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<EtapesPartypeappro> findEtapesPartypeapproList(AchNatureMarche entity) {
        AchNatureMarche mergedEntity = this.getMergedEntity(entity);
        List<EtapesPartypeappro> etapesPartypeapproList = mergedEntity.getEtapesPartypeapproList();
        etapesPartypeapproList.size();
        return etapesPartypeapproList;
    }
    
}
