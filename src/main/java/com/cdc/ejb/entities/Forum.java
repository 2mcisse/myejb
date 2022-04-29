/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "forum")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Forum.findAll", query = "SELECT f FROM Forum f")
    , @NamedQuery(name = "Forum.findByIDForum", query = "SELECT f FROM Forum f WHERE f.iDForum = :iDForum")
    , @NamedQuery(name = "Forum.findByTitre", query = "SELECT f FROM Forum f WHERE f.titre = :titre")
    , @NamedQuery(name = "Forum.findByDateHeureCreation", query = "SELECT f FROM Forum f WHERE f.dateHeureCreation = :dateHeureCreation")
    , @NamedQuery(name = "Forum.findByEstGroupe", query = "SELECT f FROM Forum f WHERE f.estGroupe = :estGroupe")
    , @NamedQuery(name = "Forum.findByType", query = "SELECT f FROM Forum f WHERE f.type = :type")
    , @NamedQuery(name = "Forum.findByEstProtege", query = "SELECT f FROM Forum f WHERE f.estProtege = :estProtege")})
public class Forum implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDForum")
    private Integer iDForum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Titre")
    private String titre;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureCreation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureCreation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstGroupe")
    private short estGroupe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Type")
    private int type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstProtege")
    private short estProtege;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDForumParent")
    private List<Forum> forumList;
    @JoinColumn(name = "IDForumParent", referencedColumnName = "IDForum")
    @ManyToOne(optional = false)
    private Forum iDForumParent;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDForum")
    private List<Topic> topicList;

    public Forum() {
    }

    public Forum(Integer iDForum) {
        this.iDForum = iDForum;
    }

    public Forum(Integer iDForum, String titre, String description, Date dateHeureCreation, short estGroupe, int type, short estProtege) {
        this.iDForum = iDForum;
        this.titre = titre;
        this.description = description;
        this.dateHeureCreation = dateHeureCreation;
        this.estGroupe = estGroupe;
        this.type = type;
        this.estProtege = estProtege;
    }

    public Integer getIDForum() {
        return iDForum;
    }

    public void setIDForum(Integer iDForum) {
        this.iDForum = iDForum;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateHeureCreation() {
        return dateHeureCreation;
    }

    public void setDateHeureCreation(Date dateHeureCreation) {
        this.dateHeureCreation = dateHeureCreation;
    }

    public short getEstGroupe() {
        return estGroupe;
    }

    public void setEstGroupe(short estGroupe) {
        this.estGroupe = estGroupe;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public short getEstProtege() {
        return estProtege;
    }

    public void setEstProtege(short estProtege) {
        this.estProtege = estProtege;
    }

    @XmlTransient
    public List<Forum> getForumList() {
        return forumList;
    }

    public void setForumList(List<Forum> forumList) {
        this.forumList = forumList;
    }

    public Forum getIDForumParent() {
        return iDForumParent;
    }

    public void setIDForumParent(Forum iDForumParent) {
        this.iDForumParent = iDForumParent;
    }

    public Utilisateur getIDUtilisateur() {
        return iDUtilisateur;
    }

    public void setIDUtilisateur(Utilisateur iDUtilisateur) {
        this.iDUtilisateur = iDUtilisateur;
    }

    @XmlTransient
    public List<Topic> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDForum != null ? iDForum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Forum)) {
            return false;
        }
        Forum other = (Forum) object;
        if ((this.iDForum == null && other.iDForum != null) || (this.iDForum != null && !this.iDForum.equals(other.iDForum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Forum[ iDForum=" + iDForum + " ]";
    }
    
}
