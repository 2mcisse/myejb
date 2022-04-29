/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "param_billetage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ParamBilletage.findAll", query = "SELECT p FROM ParamBilletage p")
    , @NamedQuery(name = "ParamBilletage.findByIdbilletage", query = "SELECT p FROM ParamBilletage p WHERE p.idbilletage = :idbilletage")
    , @NamedQuery(name = "ParamBilletage.findByTypes", query = "SELECT p FROM ParamBilletage p WHERE p.types = :types")
    , @NamedQuery(name = "ParamBilletage.findByMontant", query = "SELECT p FROM ParamBilletage p WHERE p.montant = :montant")
    , @NamedQuery(name = "ParamBilletage.findByQuantite", query = "SELECT p FROM ParamBilletage p WHERE p.quantite = :quantite")
    , @NamedQuery(name = "ParamBilletage.findByIddemandes", query = "SELECT p FROM ParamBilletage p WHERE p.iddemandes = :iddemandes")
    , @NamedQuery(name = "ParamBilletage.findByCodeEnc", query = "SELECT p FROM ParamBilletage p WHERE p.codeEnc = :codeEnc")})
public class ParamBilletage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBILLETAGE")
    private Integer idbilletage;
    @Column(name = "Types")
    private Short types;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Montant")
    private BigDecimal montant;
    @Column(name = "Quantite")
    private Integer quantite;
    @Column(name = "IDDEMANDES")
    private Integer iddemandes;
    @Column(name = "CODE_ENC")
    private BigInteger codeEnc;

    public ParamBilletage() {
    }

    public ParamBilletage(Integer idbilletage) {
        this.idbilletage = idbilletage;
    }

    public Integer getIdbilletage() {
        return idbilletage;
    }

    public void setIdbilletage(Integer idbilletage) {
        this.idbilletage = idbilletage;
    }

    public Short getTypes() {
        return types;
    }

    public void setTypes(Short types) {
        this.types = types;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Integer getIddemandes() {
        return iddemandes;
    }

    public void setIddemandes(Integer iddemandes) {
        this.iddemandes = iddemandes;
    }

    public BigInteger getCodeEnc() {
        return codeEnc;
    }

    public void setCodeEnc(BigInteger codeEnc) {
        this.codeEnc = codeEnc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbilletage != null ? idbilletage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParamBilletage)) {
            return false;
        }
        ParamBilletage other = (ParamBilletage) object;
        if ((this.idbilletage == null && other.idbilletage != null) || (this.idbilletage != null && !this.idbilletage.equals(other.idbilletage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.ParamBilletage[ idbilletage=" + idbilletage + " ]";
    }
    
}
