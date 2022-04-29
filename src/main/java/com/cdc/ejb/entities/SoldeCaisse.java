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
@Table(name = "solde_caisse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SoldeCaisse.findAll", query = "SELECT s FROM SoldeCaisse s")
    , @NamedQuery(name = "SoldeCaisse.findByIdsoldeCaisse", query = "SELECT s FROM SoldeCaisse s WHERE s.idsoldeCaisse = :idsoldeCaisse")
    , @NamedQuery(name = "SoldeCaisse.findBySolde", query = "SELECT s FROM SoldeCaisse s WHERE s.solde = :solde")
    , @NamedQuery(name = "SoldeCaisse.findBySaiDate", query = "SELECT s FROM SoldeCaisse s WHERE s.saiDate = :saiDate")
    , @NamedQuery(name = "SoldeCaisse.findByGestion", query = "SELECT s FROM SoldeCaisse s WHERE s.gestion = :gestion")})
public class SoldeCaisse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSOLDE_CAISSE")
    private Integer idsoldeCaisse;
    @Column(name = "SOLDE")
    private Integer solde;
    @Column(name = "SAI_DATE")
    @Temporal(TemporalType.DATE)
    private Date saiDate;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "NumeroCaisse", referencedColumnName = "NumeroCaisse")
    @ManyToOne
    private Caisses numeroCaisse;

    public SoldeCaisse() {
    }

    public SoldeCaisse(Integer idsoldeCaisse) {
        this.idsoldeCaisse = idsoldeCaisse;
    }

    public Integer getIdsoldeCaisse() {
        return idsoldeCaisse;
    }

    public void setIdsoldeCaisse(Integer idsoldeCaisse) {
        this.idsoldeCaisse = idsoldeCaisse;
    }

    public Integer getSolde() {
        return solde;
    }

    public void setSolde(Integer solde) {
        this.solde = solde;
    }

    public Date getSaiDate() {
        return saiDate;
    }

    public void setSaiDate(Date saiDate) {
        this.saiDate = saiDate;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Caisses getNumeroCaisse() {
        return numeroCaisse;
    }

    public void setNumeroCaisse(Caisses numeroCaisse) {
        this.numeroCaisse = numeroCaisse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsoldeCaisse != null ? idsoldeCaisse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SoldeCaisse)) {
            return false;
        }
        SoldeCaisse other = (SoldeCaisse) object;
        if ((this.idsoldeCaisse == null && other.idsoldeCaisse != null) || (this.idsoldeCaisse != null && !this.idsoldeCaisse.equals(other.idsoldeCaisse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.SoldeCaisse[ idsoldeCaisse=" + idsoldeCaisse + " ]";
    }
    
}
