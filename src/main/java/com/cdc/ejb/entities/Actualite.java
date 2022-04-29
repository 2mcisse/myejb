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
@Table(name = "actualite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actualite.findAll", query = "SELECT a FROM Actualite a")
    , @NamedQuery(name = "Actualite.findByIDActualite", query = "SELECT a FROM Actualite a WHERE a.iDActualite = :iDActualite")
    , @NamedQuery(name = "Actualite.findByTitre", query = "SELECT a FROM Actualite a WHERE a.titre = :titre")
    , @NamedQuery(name = "Actualite.findByDateHeureCreation", query = "SELECT a FROM Actualite a WHERE a.dateHeureCreation = :dateHeureCreation")
    , @NamedQuery(name = "Actualite.findByGestion", query = "SELECT a FROM Actualite a WHERE a.gestion = :gestion")})
public class Actualite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDActualite")
    private Integer iDActualite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Titre")
    private String titre;
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
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;

    public Actualite() {
    }

    public Actualite(Integer iDActualite) {
        this.iDActualite = iDActualite;
    }

    public Actualite(Integer iDActualite, String titre, String contenu, Date dateHeureCreation) {
        this.iDActualite = iDActualite;
        this.titre = titre;
        this.contenu = contenu;
        this.dateHeureCreation = dateHeureCreation;
    }

    public Integer getIDActualite() {
        return iDActualite;
    }

    public void setIDActualite(Integer iDActualite) {
        this.iDActualite = iDActualite;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
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

    public Utilisateur getIDUtilisateur() {
        return iDUtilisateur;
    }

    public void setIDUtilisateur(Utilisateur iDUtilisateur) {
        this.iDUtilisateur = iDUtilisateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDActualite != null ? iDActualite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actualite)) {
            return false;
        }
        Actualite other = (Actualite) object;
        if ((this.iDActualite == null && other.iDActualite != null) || (this.iDActualite != null && !this.iDActualite.equals(other.iDActualite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Actualite[ iDActualite=" + iDActualite + " ]";
    }
    
}
