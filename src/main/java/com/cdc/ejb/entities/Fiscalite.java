/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "fiscalite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fiscalite.findAll", query = "SELECT f FROM Fiscalite f")
    , @NamedQuery(name = "Fiscalite.findByIDFiscalite", query = "SELECT f FROM Fiscalite f WHERE f.iDFiscalite = :iDFiscalite")
    , @NamedQuery(name = "Fiscalite.findByTaxe", query = "SELECT f FROM Fiscalite f WHERE f.taxe = :taxe")
    , @NamedQuery(name = "Fiscalite.findByMontant", query = "SELECT f FROM Fiscalite f WHERE f.montant = :montant")
    , @NamedQuery(name = "Fiscalite.findByTaux", query = "SELECT f FROM Fiscalite f WHERE f.taux = :taux")})
public class Fiscalite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDFiscalite")
    private Integer iDFiscalite;
    @Size(max = 50)
    @Column(name = "Taxe")
    private String taxe;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Montant")
    private BigDecimal montant;
    @Column(name = "Taux")
    private Double taux;
    @JoinColumn(name = "IDPF_SUPPORTS", referencedColumnName = "IDPF_SUPPORTS")
    @ManyToOne
    private PfSupports idpfSupports;

    public Fiscalite() {
    }

    public Fiscalite(Integer iDFiscalite) {
        this.iDFiscalite = iDFiscalite;
    }

    public Integer getIDFiscalite() {
        return iDFiscalite;
    }

    public void setIDFiscalite(Integer iDFiscalite) {
        this.iDFiscalite = iDFiscalite;
    }

    public String getTaxe() {
        return taxe;
    }

    public void setTaxe(String taxe) {
        this.taxe = taxe;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }

    public PfSupports getIdpfSupports() {
        return idpfSupports;
    }

    public void setIdpfSupports(PfSupports idpfSupports) {
        this.idpfSupports = idpfSupports;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDFiscalite != null ? iDFiscalite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fiscalite)) {
            return false;
        }
        Fiscalite other = (Fiscalite) object;
        if ((this.iDFiscalite == null && other.iDFiscalite != null) || (this.iDFiscalite != null && !this.iDFiscalite.equals(other.iDFiscalite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Fiscalite[ iDFiscalite=" + iDFiscalite + " ]";
    }
    
}
