/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.Facade;

import com.cdc.ejb.entities.Blog;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.cdc.ejb.entities.Blog_;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.cdc.ejb.entities.Utilisateur;
import com.cdc.ejb.entities.Billet;
import java.util.List;

/**
 *
 * @author ALIENWARE
 */
@Stateless
public class BlogFacade extends AbstractFacade<Blog> {

    @PersistenceContext(unitName = "com.cdc_ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BlogFacade() {
        super(Blog.class);
    }

    public boolean isIDUtilisateurEmpty(Blog entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Blog> blog = cq.from(Blog.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(blog, entity), cb.isNotNull(blog.get(Blog_.iDUtilisateur)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public Utilisateur findIDUtilisateur(Blog entity) {
        return this.getMergedEntity(entity).getIDUtilisateur();
    }

    public boolean isBilletListEmpty(Blog entity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Blog> blog = cq.from(Blog.class);
        cq.select(cb.literal(1L)).distinct(true).where(cb.equal(blog, entity), cb.isNotEmpty(blog.get(Blog_.billetList)));
        return em.createQuery(cq).getResultList().isEmpty();
    }

    public List<Billet> findBilletList(Blog entity) {
        Blog mergedEntity = this.getMergedEntity(entity);
        List<Billet> billetList = mergedEntity.getBilletList();
        billetList.size();
        return billetList;
    }
    
}
