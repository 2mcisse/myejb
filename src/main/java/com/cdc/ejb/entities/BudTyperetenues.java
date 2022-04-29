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
@Table(name = "bud_typeretenues")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BudTyperetenues.findAll", query = "SELECT b FROM BudTyperetenues b")
    , @NamedQuery(name = "BudTyperetenues.findByIDBUDTypeRetenues", query = "SELECT b FROM BudTyperetenues b WHERE b.iDBUDTypeRetenues = :iDBUDTypeRetenues")
    , @NamedQuery(name = "BudTyperetenues.findByLibelle", query = "SELECT b FROM BudTyperetenues b WHERE b.libelle = :libelle")
    , @NamedQuery(name = "BudTyperetenues.findByTaux", query = "SELECT b FROM BudTyperetenues b WHERE b.taux = :taux")
    , @NamedQuery(name = "BudTyperetenues.findByMntTTC", query = "SELECT b FROM BudTyperetenues b WHERE b.mntTTC = :mntTTC")
    , @NamedQuery(name = "BudTyperetenues.findByTva", query = "SELECT b FROM BudTyperetenues b WHERE b.tva = :tva")
    , @NamedQuery(name = "BudTyperetenues.findByGestion", query = "SELECT b FROM BudTyperetenues b WHERE b.gestion = :gestion")})
public class BudTyperetenues implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_TypeRetenues")
    private Integer iDBUDTypeRetenues;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Libelle")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Taux")
    private double taux;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MntTTC")
    private short mntTTC;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TVA")
    private short tva;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "NumeroCompte", referencedColumnName = "NumeroCompte")
    @ManyToOne(optional = false)
    private Compte numeroCompte;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDBUDTypeRetenues")
    private List<BudRetenues> budRetenuesList;

    public BudTyperetenues() {
    }

    public BudTyperetenues(Integer iDBUDTypeRetenues) {
        this.iDBUDTypeRetenues = iDBUDTypeRetenues;
    }

    public BudTyperetenues(Integer iDBUDTypeRetenues, String libelle, double taux, short mntTTC, short tva) {
        this.iDBUDTypeRetenues = iDBUDTypeRetenues;
        this.libelle = libelle;
        this.taux = taux;
        this.mntTTC = mntTTC;
        this.tva = tva;
    }

    public Integer getIDBUDTypeRetenues() {
        return iDBUDTypeRetenues;
    }

    public void setIDBUDTypeRetenues(Integer iDBUDTypeRetenues) {
        this.iDBUDTypeRetenues = iDBUDTypeRetenues;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public short getMntTTC() {
        return mntTTC;
    }

    public void setMntTTC(short mntTTC) {
        this.mntTTC = mntTTC;
    }

    public short getTva() {
        return tva;
    }

    public void setTva(short tva) {
        this.tva = tva;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Compte getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(Compte numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    @XmlTransient
    public List<BudRetenues> getBudRetenuesList() {
        return budRetenuesList;
    }

    public void setBudRetenuesList(List<BudRetenues> budRetenuesList) {
        this.budRetenuesList = budRetenuesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDBUDTypeRetenues != null ? iDBUDTypeRetenues.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudTyperetenues)) {
            return false;
        }
        BudTyperetenues other = (BudTyperetenues) object;
        if ((this.iDBUDTypeRetenues == null && other.iDBUDTypeRetenues != null) || (this.iDBUDTypeRetenues != null && !this.iDBUDTypeRetenues.equals(other.iDBUDTypeRetenues))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.BudTyperetenues[ iDBUDTypeRetenues=" + iDBUDTypeRetenues + " ]";
    }
    
}
