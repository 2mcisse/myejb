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
@Table(name = "ligneecriture")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ligneecriture.findAll", query = "SELECT l FROM Ligneecriture l")
    , @NamedQuery(name = "Ligneecriture.findByIDLigneEcriture", query = "SELECT l FROM Ligneecriture l WHERE l.iDLigneEcriture = :iDLigneEcriture")
    , @NamedQuery(name = "Ligneecriture.findByLibelleEcriture", query = "SELECT l FROM Ligneecriture l WHERE l.libelleEcriture = :libelleEcriture")
    , @NamedQuery(name = "Ligneecriture.findByDebitEcriture", query = "SELECT l FROM Ligneecriture l WHERE l.debitEcriture = :debitEcriture")
    , @NamedQuery(name = "Ligneecriture.findByCreditEcriture", query = "SELECT l FROM Ligneecriture l WHERE l.creditEcriture = :creditEcriture")
    , @NamedQuery(name = "Ligneecriture.findByValider", query = "SELECT l FROM Ligneecriture l WHERE l.valider = :valider")
    , @NamedQuery(name = "Ligneecriture.findByDateEcriture", query = "SELECT l FROM Ligneecriture l WHERE l.dateEcriture = :dateEcriture")
    , @NamedQuery(name = "Ligneecriture.findByCentraliser", query = "SELECT l FROM Ligneecriture l WHERE l.centraliser = :centraliser")
    , @NamedQuery(name = "Ligneecriture.findByLettrage", query = "SELECT l FROM Ligneecriture l WHERE l.lettrage = :lettrage")
    , @NamedQuery(name = "Ligneecriture.findByObservation", query = "SELECT l FROM Ligneecriture l WHERE l.observation = :observation")
    , @NamedQuery(name = "Ligneecriture.findByGestion", query = "SELECT l FROM Ligneecriture l WHERE l.gestion = :gestion")})
public class Ligneecriture implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDLigneEcriture")
    private Integer iDLigneEcriture;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "LibelleEcriture")
    private String libelleEcriture;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "DebitEcriture")
    private BigDecimal debitEcriture;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CreditEcriture")
    private BigDecimal creditEcriture;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Valider")
    private short valider;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateEcriture")
    @Temporal(TemporalType.DATE)
    private Date dateEcriture;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Centraliser")
    private short centraliser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Lettrage")
    private String lettrage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "OBSERVATION")
    private String observation;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "NumeroCompte", referencedColumnName = "NumeroCompte")
    @ManyToOne(optional = false)
    private Compte numeroCompte;
    @JoinColumn(name = "IDMouvement", referencedColumnName = "IDMouvement")
    @ManyToOne(optional = false)
    private Mouvement iDMouvement;

    public Ligneecriture() {
    }

    public Ligneecriture(Integer iDLigneEcriture) {
        this.iDLigneEcriture = iDLigneEcriture;
    }

    public Ligneecriture(Integer iDLigneEcriture, String libelleEcriture, BigDecimal debitEcriture, BigDecimal creditEcriture, short valider, Date dateEcriture, short centraliser, String lettrage, String observation) {
        this.iDLigneEcriture = iDLigneEcriture;
        this.libelleEcriture = libelleEcriture;
        this.debitEcriture = debitEcriture;
        this.creditEcriture = creditEcriture;
        this.valider = valider;
        this.dateEcriture = dateEcriture;
        this.centraliser = centraliser;
        this.lettrage = lettrage;
        this.observation = observation;
    }

    public Integer getIDLigneEcriture() {
        return iDLigneEcriture;
    }

    public void setIDLigneEcriture(Integer iDLigneEcriture) {
        this.iDLigneEcriture = iDLigneEcriture;
    }

    public String getLibelleEcriture() {
        return libelleEcriture;
    }

    public void setLibelleEcriture(String libelleEcriture) {
        this.libelleEcriture = libelleEcriture;
    }

    public BigDecimal getDebitEcriture() {
        return debitEcriture;
    }

    public void setDebitEcriture(BigDecimal debitEcriture) {
        this.debitEcriture = debitEcriture;
    }

    public BigDecimal getCreditEcriture() {
        return creditEcriture;
    }

    public void setCreditEcriture(BigDecimal creditEcriture) {
        this.creditEcriture = creditEcriture;
    }

    public short getValider() {
        return valider;
    }

    public void setValider(short valider) {
        this.valider = valider;
    }

    public Date getDateEcriture() {
        return dateEcriture;
    }

    public void setDateEcriture(Date dateEcriture) {
        this.dateEcriture = dateEcriture;
    }

    public short getCentraliser() {
        return centraliser;
    }

    public void setCentraliser(short centraliser) {
        this.centraliser = centraliser;
    }

    public String getLettrage() {
        return lettrage;
    }

    public void setLettrage(String lettrage) {
        this.lettrage = lettrage;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
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

    public Mouvement getIDMouvement() {
        return iDMouvement;
    }

    public void setIDMouvement(Mouvement iDMouvement) {
        this.iDMouvement = iDMouvement;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDLigneEcriture != null ? iDLigneEcriture.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ligneecriture)) {
            return false;
        }
        Ligneecriture other = (Ligneecriture) object;
        if ((this.iDLigneEcriture == null && other.iDLigneEcriture != null) || (this.iDLigneEcriture != null && !this.iDLigneEcriture.equals(other.iDLigneEcriture))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Ligneecriture[ iDLigneEcriture=" + iDLigneEcriture + " ]";
    }
    
}
