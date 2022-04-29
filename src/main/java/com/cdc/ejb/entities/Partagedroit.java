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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "partagedroit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partagedroit.findAll", query = "SELECT p FROM Partagedroit p")
    , @NamedQuery(name = "Partagedroit.findByDroit", query = "SELECT p FROM Partagedroit p WHERE p.droit = :droit")
    , @NamedQuery(name = "Partagedroit.findById", query = "SELECT p FROM Partagedroit p WHERE p.id = :id")})
public class Partagedroit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Droit")
    private int droit;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "IDGroupe", referencedColumnName = "IDGroupe")
    @ManyToOne(optional = false)
    private Groupe iDGroupe;
    @JoinColumn(name = "IDPartage", referencedColumnName = "IDPartage")
    @ManyToOne(optional = false)
    private Partage iDPartage;
    @JoinColumn(name = "IDUtilisateur", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDUtilisateur;

    public Partagedroit() {
    }

    public Partagedroit(Integer id) {
        this.id = id;
    }

    public Partagedroit(Integer id, int droit) {
        this.id = id;
        this.droit = droit;
    }

    public int getDroit() {
        return droit;
    }

    public void setDroit(int droit) {
        this.droit = droit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Groupe getIDGroupe() {
        return iDGroupe;
    }

    public void setIDGroupe(Groupe iDGroupe) {
        this.iDGroupe = iDGroupe;
    }

    public Partage getIDPartage() {
        return iDPartage;
    }

    public void setIDPartage(Partage iDPartage) {
        this.iDPartage = iDPartage;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partagedroit)) {
            return false;
        }
        Partagedroit other = (Partagedroit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Partagedroit[ id=" + id + " ]";
    }
    
}
