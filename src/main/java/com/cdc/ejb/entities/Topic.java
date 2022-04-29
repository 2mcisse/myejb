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
@Table(name = "topic")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Topic.findAll", query = "SELECT t FROM Topic t")
    , @NamedQuery(name = "Topic.findByIDTopic", query = "SELECT t FROM Topic t WHERE t.iDTopic = :iDTopic")
    , @NamedQuery(name = "Topic.findByTitre", query = "SELECT t FROM Topic t WHERE t.titre = :titre")
    , @NamedQuery(name = "Topic.findByEstEpingle", query = "SELECT t FROM Topic t WHERE t.estEpingle = :estEpingle")
    , @NamedQuery(name = "Topic.findByDateHeureCreation", query = "SELECT t FROM Topic t WHERE t.dateHeureCreation = :dateHeureCreation")
    , @NamedQuery(name = "Topic.findByIDPremierPost", query = "SELECT t FROM Topic t WHERE t.iDPremierPost = :iDPremierPost")
    , @NamedQuery(name = "Topic.findByEstFerme", query = "SELECT t FROM Topic t WHERE t.estFerme = :estFerme")
    , @NamedQuery(name = "Topic.findByDateHeureDernierPost", query = "SELECT t FROM Topic t WHERE t.dateHeureDernierPost = :dateHeureDernierPost")
    , @NamedQuery(name = "Topic.findByIDDernierPost", query = "SELECT t FROM Topic t WHERE t.iDDernierPost = :iDDernierPost")
    , @NamedQuery(name = "Topic.findByGestion", query = "SELECT t FROM Topic t WHERE t.gestion = :gestion")})
public class Topic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTopic")
    private Integer iDTopic;
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
    @Column(name = "EstEpingle")
    private short estEpingle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureCreation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureCreation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPremierPost")
    private int iDPremierPost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstFerme")
    private short estFerme;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureDernierPost")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureDernierPost;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDernierPost")
    private int iDDernierPost;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDTopic")
    private List<Post> postList;
    @JoinColumn(name = "IDForum", referencedColumnName = "IDForum")
    @ManyToOne(optional = false)
    private Forum iDForum;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;
    @JoinColumn(name = "IDAuteurDernierPost", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDAuteurDernierPost;

    public Topic() {
    }

    public Topic(Integer iDTopic) {
        this.iDTopic = iDTopic;
    }

    public Topic(Integer iDTopic, String titre, String description, short estEpingle, Date dateHeureCreation, int iDPremierPost, short estFerme, Date dateHeureDernierPost, int iDDernierPost) {
        this.iDTopic = iDTopic;
        this.titre = titre;
        this.description = description;
        this.estEpingle = estEpingle;
        this.dateHeureCreation = dateHeureCreation;
        this.iDPremierPost = iDPremierPost;
        this.estFerme = estFerme;
        this.dateHeureDernierPost = dateHeureDernierPost;
        this.iDDernierPost = iDDernierPost;
    }

    public Integer getIDTopic() {
        return iDTopic;
    }

    public void setIDTopic(Integer iDTopic) {
        this.iDTopic = iDTopic;
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

    public short getEstEpingle() {
        return estEpingle;
    }

    public void setEstEpingle(short estEpingle) {
        this.estEpingle = estEpingle;
    }

    public Date getDateHeureCreation() {
        return dateHeureCreation;
    }

    public void setDateHeureCreation(Date dateHeureCreation) {
        this.dateHeureCreation = dateHeureCreation;
    }

    public int getIDPremierPost() {
        return iDPremierPost;
    }

    public void setIDPremierPost(int iDPremierPost) {
        this.iDPremierPost = iDPremierPost;
    }

    public short getEstFerme() {
        return estFerme;
    }

    public void setEstFerme(short estFerme) {
        this.estFerme = estFerme;
    }

    public Date getDateHeureDernierPost() {
        return dateHeureDernierPost;
    }

    public void setDateHeureDernierPost(Date dateHeureDernierPost) {
        this.dateHeureDernierPost = dateHeureDernierPost;
    }

    public int getIDDernierPost() {
        return iDDernierPost;
    }

    public void setIDDernierPost(int iDDernierPost) {
        this.iDDernierPost = iDDernierPost;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    public Forum getIDForum() {
        return iDForum;
    }

    public void setIDForum(Forum iDForum) {
        this.iDForum = iDForum;
    }

    public Utilisateur getIDUtilisateur() {
        return iDUtilisateur;
    }

    public void setIDUtilisateur(Utilisateur iDUtilisateur) {
        this.iDUtilisateur = iDUtilisateur;
    }

    public Utilisateur getIDAuteurDernierPost() {
        return iDAuteurDernierPost;
    }

    public void setIDAuteurDernierPost(Utilisateur iDAuteurDernierPost) {
        this.iDAuteurDernierPost = iDAuteurDernierPost;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDTopic != null ? iDTopic.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Topic)) {
            return false;
        }
        Topic other = (Topic) object;
        if ((this.iDTopic == null && other.iDTopic != null) || (this.iDTopic != null && !this.iDTopic.equals(other.iDTopic))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Topic[ iDTopic=" + iDTopic + " ]";
    }
    
}
