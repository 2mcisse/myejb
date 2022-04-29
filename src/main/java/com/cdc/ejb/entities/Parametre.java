/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "parametre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Parametre.findAll", query = "SELECT p FROM Parametre p")
    , @NamedQuery(name = "Parametre.findByIDParametre", query = "SELECT p FROM Parametre p WHERE p.iDParametre = :iDParametre")
    , @NamedQuery(name = "Parametre.findByCle", query = "SELECT p FROM Parametre p WHERE p.cle = :cle")})
public class Parametre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDParametre")
    private Integer iDParametre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "Cle")
    private String cle;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Valeur")
    private String valeur;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;

    public Parametre() {
    }

    public Parametre(Integer iDParametre) {
        this.iDParametre = iDParametre;
    }

    public Parametre(Integer iDParametre, String cle, String valeur) {
        this.iDParametre = iDParametre;
        this.cle = cle;
        this.valeur = valeur;
    }

    public Integer getIDParametre() {
        return iDParametre;
    }

    public void setIDParametre(Integer iDParametre) {
        this.iDParametre = iDParametre;
    }

    public String getCle() {
        return cle;
    }

    public void setCle(String cle) {
        this.cle = cle;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
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
        hash += (iDParametre != null ? iDParametre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parametre)) {
            return false;
        }
        Parametre other = (Parametre) object;
        if ((this.iDParametre == null && other.iDParametre != null) || (this.iDParametre != null && !this.iDParametre.equals(other.iDParametre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Parametre[ iDParametre=" + iDParametre + " ]";
    }
    
}
