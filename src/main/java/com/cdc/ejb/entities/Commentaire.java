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
@Table(name = "commentaire")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Commentaire.findAll", query = "SELECT c FROM Commentaire c")
    , @NamedQuery(name = "Commentaire.findByIDCommentaire", query = "SELECT c FROM Commentaire c WHERE c.iDCommentaire = :iDCommentaire")
    , @NamedQuery(name = "Commentaire.findByDateHeureCreation", query = "SELECT c FROM Commentaire c WHERE c.dateHeureCreation = :dateHeureCreation")
    , @NamedQuery(name = "Commentaire.findByGestion", query = "SELECT c FROM Commentaire c WHERE c.gestion = :gestion")})
public class Commentaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCommentaire")
    private Integer iDCommentaire;
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
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDBillet", referencedColumnName = "IDBillet")
    @ManyToOne(optional = false)
    private Billet iDBillet;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;

    public Commentaire() {
    }

    public Commentaire(Integer iDCommentaire) {
        this.iDCommentaire = iDCommentaire;
    }

    public Commentaire(Integer iDCommentaire, String contenu, Date dateHeureCreation) {
        this.iDCommentaire = iDCommentaire;
        this.contenu = contenu;
        this.dateHeureCreation = dateHeureCreation;
    }

    public Integer getIDCommentaire() {
        return iDCommentaire;
    }

    public void setIDCommentaire(Integer iDCommentaire) {
        this.iDCommentaire = iDCommentaire;
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

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Billet getIDBillet() {
        return iDBillet;
    }

    public void setIDBillet(Billet iDBillet) {
        this.iDBillet = iDBillet;
    }

    public Utilisateur getIDUtilisateur() {
        return iDUtilisateur;
    }

    public void setIDUtilisateur(Utilisateur iDUtilisateur) {
        this.iDUtilisateur = iDUtilisateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCommentaire != null ? iDCommentaire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commentaire)) {
            return false;
        }
        Commentaire other = (Commentaire) object;
        if ((this.iDCommentaire == null && other.iDCommentaire != null) || (this.iDCommentaire != null && !this.iDCommentaire.equals(other.iDCommentaire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Commentaire[ iDCommentaire=" + iDCommentaire + " ]";
    }
    
}
