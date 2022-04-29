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
@Table(name = "representantsgroupe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Representantsgroupe.findAll", query = "SELECT r FROM Representantsgroupe r")
    , @NamedQuery(name = "Representantsgroupe.findByIdrepresentantsgroupe", query = "SELECT r FROM Representantsgroupe r WHERE r.idrepresentantsgroupe = :idrepresentantsgroupe")
    , @NamedQuery(name = "Representantsgroupe.findByLogin", query = "SELECT r FROM Representantsgroupe r WHERE r.login = :login")})
public class Representantsgroupe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDREPRESENTANTSGROUPE")
    private Integer idrepresentantsgroupe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Login")
    private String login;
    @JoinColumn(name = "IDDocuments", referencedColumnName = "IDDocuments")
    @ManyToOne(optional = false)
    private Courriers iDDocuments;
    @JoinColumn(name = "NomGroupe", referencedColumnName = "NomGroupe")
    @ManyToOne(optional = false)
    private Groupes nomGroupe;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne(optional = false)
    private Tiers numTiers;

    public Representantsgroupe() {
    }

    public Representantsgroupe(Integer idrepresentantsgroupe) {
        this.idrepresentantsgroupe = idrepresentantsgroupe;
    }

    public Representantsgroupe(Integer idrepresentantsgroupe, String login) {
        this.idrepresentantsgroupe = idrepresentantsgroupe;
        this.login = login;
    }

    public Integer getIdrepresentantsgroupe() {
        return idrepresentantsgroupe;
    }

    public void setIdrepresentantsgroupe(Integer idrepresentantsgroupe) {
        this.idrepresentantsgroupe = idrepresentantsgroupe;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Courriers getIDDocuments() {
        return iDDocuments;
    }

    public void setIDDocuments(Courriers iDDocuments) {
        this.iDDocuments = iDDocuments;
    }

    public Groupes getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(Groupes nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public Tiers getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(Tiers numTiers) {
        this.numTiers = numTiers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrepresentantsgroupe != null ? idrepresentantsgroupe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Representantsgroupe)) {
            return false;
        }
        Representantsgroupe other = (Representantsgroupe) object;
        if ((this.idrepresentantsgroupe == null && other.idrepresentantsgroupe != null) || (this.idrepresentantsgroupe != null && !this.idrepresentantsgroupe.equals(other.idrepresentantsgroupe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Representantsgroupe[ idrepresentantsgroupe=" + idrepresentantsgroupe + " ]";
    }
    
}
