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
@Table(name = "discussioninvitation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Discussioninvitation.findAll", query = "SELECT d FROM Discussioninvitation d")
    , @NamedQuery(name = "Discussioninvitation.findByIDDiscussionInvitation", query = "SELECT d FROM Discussioninvitation d WHERE d.iDDiscussionInvitation = :iDDiscussionInvitation")
    , @NamedQuery(name = "Discussioninvitation.findByDateHeure", query = "SELECT d FROM Discussioninvitation d WHERE d.dateHeure = :dateHeure")
    , @NamedQuery(name = "Discussioninvitation.findByReponseDonnee", query = "SELECT d FROM Discussioninvitation d WHERE d.reponseDonnee = :reponseDonnee")
    , @NamedQuery(name = "Discussioninvitation.findByGestion", query = "SELECT d FROM Discussioninvitation d WHERE d.gestion = :gestion")})
public class Discussioninvitation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDiscussionInvitation")
    private Integer iDDiscussionInvitation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeure")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeure;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ReponseDonnee")
    private int reponseDonnee;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Commentaire")
    private String commentaire;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDDemandeur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDDemandeur;
    @JoinColumn(name = "IDDemande", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDDemande;
    @JoinColumn(name = "IDDiscussion", referencedColumnName = "IDDiscussion")
    @ManyToOne(optional = false)
    private Discussion iDDiscussion;

    public Discussioninvitation() {
    }

    public Discussioninvitation(Integer iDDiscussionInvitation) {
        this.iDDiscussionInvitation = iDDiscussionInvitation;
    }

    public Discussioninvitation(Integer iDDiscussionInvitation, Date dateHeure, int reponseDonnee, String commentaire) {
        this.iDDiscussionInvitation = iDDiscussionInvitation;
        this.dateHeure = dateHeure;
        this.reponseDonnee = reponseDonnee;
        this.commentaire = commentaire;
    }

    public Integer getIDDiscussionInvitation() {
        return iDDiscussionInvitation;
    }

    public void setIDDiscussionInvitation(Integer iDDiscussionInvitation) {
        this.iDDiscussionInvitation = iDDiscussionInvitation;
    }

    public Date getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(Date dateHeure) {
        this.dateHeure = dateHeure;
    }

    public int getReponseDonnee() {
        return reponseDonnee;
    }

    public void setReponseDonnee(int reponseDonnee) {
        this.reponseDonnee = reponseDonnee;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Utilisateur getIDDemandeur() {
        return iDDemandeur;
    }

    public void setIDDemandeur(Utilisateur iDDemandeur) {
        this.iDDemandeur = iDDemandeur;
    }

    public Utilisateur getIDDemande() {
        return iDDemande;
    }

    public void setIDDemande(Utilisateur iDDemande) {
        this.iDDemande = iDDemande;
    }

    public Discussion getIDDiscussion() {
        return iDDiscussion;
    }

    public void setIDDiscussion(Discussion iDDiscussion) {
        this.iDDiscussion = iDDiscussion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDDiscussionInvitation != null ? iDDiscussionInvitation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Discussioninvitation)) {
            return false;
        }
        Discussioninvitation other = (Discussioninvitation) object;
        if ((this.iDDiscussionInvitation == null && other.iDDiscussionInvitation != null) || (this.iDDiscussionInvitation != null && !this.iDDiscussionInvitation.equals(other.iDDiscussionInvitation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Discussioninvitation[ iDDiscussionInvitation=" + iDDiscussionInvitation + " ]";
    }
    
}
