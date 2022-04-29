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
import javax.persistence.Lob;
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
@Table(name = "groupe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Groupe.findAll", query = "SELECT g FROM Groupe g")
    , @NamedQuery(name = "Groupe.findByIDGroupe", query = "SELECT g FROM Groupe g WHERE g.iDGroupe = :iDGroupe")
    , @NamedQuery(name = "Groupe.findByTitre", query = "SELECT g FROM Groupe g WHERE g.titre = :titre")
    , @NamedQuery(name = "Groupe.findByGCreateur", query = "SELECT g FROM Groupe g WHERE g.gCreateur = :gCreateur")})
public class Groupe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGroupe")
    private Integer iDGroupe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "Titre")
    private String titre;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Liste")
    private String liste;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "GCreateur")
    private String gCreateur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDGroupe")
    private List<Partagedroit> partagedroitList;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;

    public Groupe() {
    }

    public Groupe(Integer iDGroupe) {
        this.iDGroupe = iDGroupe;
    }

    public Groupe(Integer iDGroupe, String titre, String liste, String gCreateur) {
        this.iDGroupe = iDGroupe;
        this.titre = titre;
        this.liste = liste;
        this.gCreateur = gCreateur;
    }

    public Integer getIDGroupe() {
        return iDGroupe;
    }

    public void setIDGroupe(Integer iDGroupe) {
        this.iDGroupe = iDGroupe;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getListe() {
        return liste;
    }

    public void setListe(String liste) {
        this.liste = liste;
    }

    public String getGCreateur() {
        return gCreateur;
    }

    public void setGCreateur(String gCreateur) {
        this.gCreateur = gCreateur;
    }

    @XmlTransient
    public List<Partagedroit> getPartagedroitList() {
        return partagedroitList;
    }

    public void setPartagedroitList(List<Partagedroit> partagedroitList) {
        this.partagedroitList = partagedroitList;
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
        hash += (iDGroupe != null ? iDGroupe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groupe)) {
            return false;
        }
        Groupe other = (Groupe) object;
        if ((this.iDGroupe == null && other.iDGroupe != null) || (this.iDGroupe != null && !this.iDGroupe.equals(other.iDGroupe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Groupe[ iDGroupe=" + iDGroupe + " ]";
    }
    
}
