/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "etiquette")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etiquette.findAll", query = "SELECT e FROM Etiquette e")
    , @NamedQuery(name = "Etiquette.findByIDEtiquette", query = "SELECT e FROM Etiquette e WHERE e.iDEtiquette = :iDEtiquette")
    , @NamedQuery(name = "Etiquette.findByLibelle", query = "SELECT e FROM Etiquette e WHERE e.libelle = :libelle")})
public class Etiquette implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEtiquette")
    private Integer iDEtiquette;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "Libelle")
    private String libelle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDEtiquette")
    private List<Messageetiquette> messageetiquetteList;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;

    public Etiquette() {
    }

    public Etiquette(Integer iDEtiquette) {
        this.iDEtiquette = iDEtiquette;
    }

    public Etiquette(Integer iDEtiquette, String libelle) {
        this.iDEtiquette = iDEtiquette;
        this.libelle = libelle;
    }

    public Integer getIDEtiquette() {
        return iDEtiquette;
    }

    public void setIDEtiquette(Integer iDEtiquette) {
        this.iDEtiquette = iDEtiquette;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @XmlTransient
    public List<Messageetiquette> getMessageetiquetteList() {
        return messageetiquetteList;
    }

    public void setMessageetiquetteList(List<Messageetiquette> messageetiquetteList) {
        this.messageetiquetteList = messageetiquetteList;
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
        hash += (iDEtiquette != null ? iDEtiquette.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etiquette)) {
            return false;
        }
        Etiquette other = (Etiquette) object;
        if ((this.iDEtiquette == null && other.iDEtiquette != null) || (this.iDEtiquette != null && !this.iDEtiquette.equals(other.iDEtiquette))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Etiquette[ iDEtiquette=" + iDEtiquette + " ]";
    }
    
}
