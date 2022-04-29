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
@Table(name = "spim")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Spim.findAll", query = "SELECT s FROM Spim s")
    , @NamedQuery(name = "Spim.findByIDSpim", query = "SELECT s FROM Spim s WHERE s.iDSpim = :iDSpim")
    , @NamedQuery(name = "Spim.findByListeDestinataires", query = "SELECT s FROM Spim s WHERE s.listeDestinataires = :listeDestinataires")
    , @NamedQuery(name = "Spim.findByDateHeureEnvoi", query = "SELECT s FROM Spim s WHERE s.dateHeureEnvoi = :dateHeureEnvoi")
    , @NamedQuery(name = "Spim.findByGestion", query = "SELECT s FROM Spim s WHERE s.gestion = :gestion")})
public class Spim implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSpim")
    private Integer iDSpim;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ListeDestinataires")
    private String listeDestinataires;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureEnvoi")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureEnvoi;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Contenu")
    private String contenu;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDExpediteur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDExpediteur;

    public Spim() {
    }

    public Spim(Integer iDSpim) {
        this.iDSpim = iDSpim;
    }

    public Spim(Integer iDSpim, String listeDestinataires, Date dateHeureEnvoi, String contenu) {
        this.iDSpim = iDSpim;
        this.listeDestinataires = listeDestinataires;
        this.dateHeureEnvoi = dateHeureEnvoi;
        this.contenu = contenu;
    }

    public Integer getIDSpim() {
        return iDSpim;
    }

    public void setIDSpim(Integer iDSpim) {
        this.iDSpim = iDSpim;
    }

    public String getListeDestinataires() {
        return listeDestinataires;
    }

    public void setListeDestinataires(String listeDestinataires) {
        this.listeDestinataires = listeDestinataires;
    }

    public Date getDateHeureEnvoi() {
        return dateHeureEnvoi;
    }

    public void setDateHeureEnvoi(Date dateHeureEnvoi) {
        this.dateHeureEnvoi = dateHeureEnvoi;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Utilisateur getIDExpediteur() {
        return iDExpediteur;
    }

    public void setIDExpediteur(Utilisateur iDExpediteur) {
        this.iDExpediteur = iDExpediteur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDSpim != null ? iDSpim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Spim)) {
            return false;
        }
        Spim other = (Spim) object;
        if ((this.iDSpim == null && other.iDSpim != null) || (this.iDSpim != null && !this.iDSpim.equals(other.iDSpim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Spim[ iDSpim=" + iDSpim + " ]";
    }
    
}
