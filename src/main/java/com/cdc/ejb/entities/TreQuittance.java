/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "tre_quittance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TreQuittance.findAll", query = "SELECT t FROM TreQuittance t")
    , @NamedQuery(name = "TreQuittance.findByIDTREQuittance", query = "SELECT t FROM TreQuittance t WHERE t.iDTREQuittance = :iDTREQuittance")
    , @NamedQuery(name = "TreQuittance.findByObservations", query = "SELECT t FROM TreQuittance t WHERE t.observations = :observations")
    , @NamedQuery(name = "TreQuittance.findByNumeroQittance", query = "SELECT t FROM TreQuittance t WHERE t.numeroQittance = :numeroQittance")
    , @NamedQuery(name = "TreQuittance.findByDate", query = "SELECT t FROM TreQuittance t WHERE t.date = :date")
    , @NamedQuery(name = "TreQuittance.findByDeposant", query = "SELECT t FROM TreQuittance t WHERE t.deposant = :deposant")
    , @NamedQuery(name = "TreQuittance.findByBeneficiaire", query = "SELECT t FROM TreQuittance t WHERE t.beneficiaire = :beneficiaire")
    , @NamedQuery(name = "TreQuittance.findByMontant", query = "SELECT t FROM TreQuittance t WHERE t.montant = :montant")
    , @NamedQuery(name = "TreQuittance.findByType", query = "SELECT t FROM TreQuittance t WHERE t.type = :type")
    , @NamedQuery(name = "TreQuittance.findByNumeroCertificat", query = "SELECT t FROM TreQuittance t WHERE t.numeroCertificat = :numeroCertificat")
    , @NamedQuery(name = "TreQuittance.findByGestion", query = "SELECT t FROM TreQuittance t WHERE t.gestion = :gestion")})
public class TreQuittance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTRE_Quittance")
    private Integer iDTREQuittance;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Observations")
    private String observations;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroQittance")
    private String numeroQittance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Deposant")
    private String deposant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Beneficiaire")
    private String beneficiaire;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Montant")
    private BigDecimal montant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private short type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroCertificat")
    private String numeroCertificat;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDTREQuittance")
    private List<DecReception> decReceptionList;
    @JoinColumn(name = "CODE_ENC", referencedColumnName = "CODE_ENC")
    @ManyToOne(optional = false)
    private Encaissements codeEnc;

    public TreQuittance() {
    }

    public TreQuittance(Integer iDTREQuittance) {
        this.iDTREQuittance = iDTREQuittance;
    }

    public TreQuittance(Integer iDTREQuittance, String observations, String numeroQittance, Date date, String deposant, String beneficiaire, BigDecimal montant, short type, String numeroCertificat) {
        this.iDTREQuittance = iDTREQuittance;
        this.observations = observations;
        this.numeroQittance = numeroQittance;
        this.date = date;
        this.deposant = deposant;
        this.beneficiaire = beneficiaire;
        this.montant = montant;
        this.type = type;
        this.numeroCertificat = numeroCertificat;
    }

    public Integer getIDTREQuittance() {
        return iDTREQuittance;
    }

    public void setIDTREQuittance(Integer iDTREQuittance) {
        this.iDTREQuittance = iDTREQuittance;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getNumeroQittance() {
        return numeroQittance;
    }

    public void setNumeroQittance(String numeroQittance) {
        this.numeroQittance = numeroQittance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDeposant() {
        return deposant;
    }

    public void setDeposant(String deposant) {
        this.deposant = deposant;
    }

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getNumeroCertificat() {
        return numeroCertificat;
    }

    public void setNumeroCertificat(String numeroCertificat) {
        this.numeroCertificat = numeroCertificat;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<DecReception> getDecReceptionList() {
        return decReceptionList;
    }

    public void setDecReceptionList(List<DecReception> decReceptionList) {
        this.decReceptionList = decReceptionList;
    }

    public Encaissements getCodeEnc() {
        return codeEnc;
    }

    public void setCodeEnc(Encaissements codeEnc) {
        this.codeEnc = codeEnc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDTREQuittance != null ? iDTREQuittance.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TreQuittance)) {
            return false;
        }
        TreQuittance other = (TreQuittance) object;
        if ((this.iDTREQuittance == null && other.iDTREQuittance != null) || (this.iDTREQuittance != null && !this.iDTREQuittance.equals(other.iDTREQuittance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.TreQuittance[ iDTREQuittance=" + iDTREQuittance + " ]";
    }
    
}
