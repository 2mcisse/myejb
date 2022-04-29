/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "post")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Post.findAll", query = "SELECT p FROM Post p")
    , @NamedQuery(name = "Post.findByIDPost", query = "SELECT p FROM Post p WHERE p.iDPost = :iDPost")
    , @NamedQuery(name = "Post.findByDateHeureCreation", query = "SELECT p FROM Post p WHERE p.dateHeureCreation = :dateHeureCreation")
    , @NamedQuery(name = "Post.findByIDPostParent", query = "SELECT p FROM Post p WHERE p.iDPostParent = :iDPostParent")})
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPost")
    private Integer iDPost;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Contenu")
    private String contenu;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureCreation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureCreation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPostParent")
    private int iDPostParent;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;
    @JoinColumn(name = "IDTopic", referencedColumnName = "IDTopic")
    @ManyToOne(optional = false)
    private Topic iDTopic;

    public Post() {
    }

    public Post(Integer iDPost) {
        this.iDPost = iDPost;
    }

    public Post(Integer iDPost, String contenu, Date dateHeureCreation, int iDPostParent) {
        this.iDPost = iDPost;
        this.contenu = contenu;
        this.dateHeureCreation = dateHeureCreation;
        this.iDPostParent = iDPostParent;
    }

    public Integer getIDPost() {
        return iDPost;
    }

    public void setIDPost(Integer iDPost) {
        this.iDPost = iDPost;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Date getDateHeureCreation() {
        return dateHeureCreation;
    }

    public void setDateHeureCreation(Date dateHeureCreation) {
        this.dateHeureCreation = dateHeureCreation;
    }

    public int getIDPostParent() {
        return iDPostParent;
    }

    public void setIDPostParent(int iDPostParent) {
        this.iDPostParent = iDPostParent;
    }

    public Utilisateur getIDUtilisateur() {
        return iDUtilisateur;
    }

    public void setIDUtilisateur(Utilisateur iDUtilisateur) {
        this.iDUtilisateur = iDUtilisateur;
    }

    public Topic getIDTopic() {
        return iDTopic;
    }

    public void setIDTopic(Topic iDTopic) {
        this.iDTopic = iDTopic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPost != null ? iDPost.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Post)) {
            return false;
        }
        Post other = (Post) object;
        if ((this.iDPost == null && other.iDPost != null) || (this.iDPost != null && !this.iDPost.equals(other.iDPost))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Post[ iDPost=" + iDPost + " ]";
    }
    
}
