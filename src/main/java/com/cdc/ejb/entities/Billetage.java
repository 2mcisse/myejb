/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "billetage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Billetage.findAll", query = "SELECT b FROM Billetage b")
    , @NamedQuery(name = "Billetage.findByIdbilletage", query = "SELECT b FROM Billetage b WHERE b.idbilletage = :idbilletage")
    , @NamedQuery(name = "Billetage.findByTypes", query = "SELECT b FROM Billetage b WHERE b.types = :types")
    , @NamedQuery(name = "Billetage.findByMontant", query = "SELECT b FROM Billetage b WHERE b.montant = :montant")
    , @NamedQuery(name = "Billetage.findByQuantite", query = "SELECT b FROM Billetage b WHERE b.quantite = :quantite")
    , @NamedQuery(name = "Billetage.findByDateOP", query = "SELECT b FROM Billetage b WHERE b.dateOP = :dateOP")
    , @NamedQuery(name = "Billetage.findByGestion", query = "SELECT b FROM Billetage b WHERE b.gestion = :gestion")})
public class Billetage implements Serializable {

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
    @Column(name = "DateOP")
    @Temporal(TemporalType.DATE)
    private Date dateOP;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "CODE_ENC", referencedColumnName = "CODE_ENC")
    @ManyToOne
    private Encaissements codeEnc;
    @JoinColumn(name = "IDDEMANDES", referencedColumnName = "IDDEMANDES")
    @ManyToOne
    private Demandes iddemandes;
    @JoinColumn(name = "NumeroCaisse", referencedColumnName = "NumeroCaisse")
    @ManyToOne
    private Caisses numeroCaisse;

    public Billetage() {
    }

    public Billetage(Integer idbilletage) {
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

    public Date getDateOP() {
        return dateOP;
    }

    public void setDateOP(Date dateOP) {
        this.dateOP = dateOP;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Encaissements getCodeEnc() {
        return codeEnc;
    }

    public void setCodeEnc(Encaissements codeEnc) {
        this.codeEnc = codeEnc;
    }

    public Demandes getIddemandes() {
        return iddemandes;
    }

    public void setIddemandes(Demandes iddemandes) {
        this.iddemandes = iddemandes;
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
        hash += (idbilletage != null ? idbilletage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Billetage)) {
            return false;
        }
        Billetage other = (Billetage) object;
        if ((this.idbilletage == null && other.idbilletage != null) || (this.idbilletage != null && !this.idbilletage.equals(other.idbilletage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Billetage[ idbilletage=" + idbilletage + " ]";
    }
    
}
