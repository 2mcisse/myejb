/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "interets_compte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InteretsCompte.findAll", query = "SELECT i FROM InteretsCompte i")
    , @NamedQuery(name = "InteretsCompte.findByIdinteretsCompte", query = "SELECT i FROM InteretsCompte i WHERE i.idinteretsCompte = :idinteretsCompte")
    , @NamedQuery(name = "InteretsCompte.findByCompteTiers", query = "SELECT i FROM InteretsCompte i WHERE i.compteTiers = :compteTiers")
    , @NamedQuery(name = "InteretsCompte.findByDates", query = "SELECT i FROM InteretsCompte i WHERE i.dates = :dates")
    , @NamedQuery(name = "InteretsCompte.findByMontant", query = "SELECT i FROM InteretsCompte i WHERE i.montant = :montant")
    , @NamedQuery(name = "InteretsCompte.findByIDArrete", query = "SELECT i FROM InteretsCompte i WHERE i.iDArrete = :iDArrete")
    , @NamedQuery(name = "InteretsCompte.findByChoisi", query = "SELECT i FROM InteretsCompte i WHERE i.choisi = :choisi")
    , @NamedQuery(name = "InteretsCompte.findByNumTiers", query = "SELECT i FROM InteretsCompte i WHERE i.numTiers = :numTiers")
    , @NamedQuery(name = "InteretsCompte.findByIdaffaires", query = "SELECT i FROM InteretsCompte i WHERE i.idaffaires = :idaffaires")
    , @NamedQuery(name = "InteretsCompte.findByTva", query = "SELECT i FROM InteretsCompte i WHERE i.tva = :tva")
    , @NamedQuery(name = "InteretsCompte.findByIrc", query = "SELECT i FROM InteretsCompte i WHERE i.irc = :irc")
    , @NamedQuery(name = "InteretsCompte.findByMntBase", query = "SELECT i FROM InteretsCompte i WHERE i.mntBase = :mntBase")
    , @NamedQuery(name = "InteretsCompte.findByNbreJour", query = "SELECT i FROM InteretsCompte i WHERE i.nbreJour = :nbreJour")
    , @NamedQuery(name = "InteretsCompte.findByDateDebut", query = "SELECT i FROM InteretsCompte i WHERE i.dateDebut = :dateDebut")
    , @NamedQuery(name = "InteretsCompte.findByGestion", query = "SELECT i FROM InteretsCompte i WHERE i.gestion = :gestion")})
public class InteretsCompte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDINTERETS_COMPTE")
    private Integer idinteretsCompte;
    @Size(max = 100)
    @Column(name = "CompteTiers")
    private String compteTiers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dates")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dates;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Montant")
    private BigDecimal montant;
    @Column(name = "IDArrete")
    private Integer iDArrete;
    @Column(name = "choisi")
    private Short choisi;
    @Column(name = "NumTiers")
    private BigInteger numTiers;
    @Column(name = "IDAFFAIRES")
    private Integer idaffaires;
    @Column(name = "TVA")
    private Integer tva;
    @Column(name = "IRC")
    private Integer irc;
    @Column(name = "MntBase")
    private BigDecimal mntBase;
    @Column(name = "NbreJour")
    private Integer nbreJour;
    @Column(name = "DateDebut")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDMOUVEMENTS", referencedColumnName = "IDMOUVEMENTS")
    @ManyToOne
    private DecMouvements idmouvements;

    public InteretsCompte() {
    }

    public InteretsCompte(Integer idinteretsCompte) {
        this.idinteretsCompte = idinteretsCompte;
    }

    public InteretsCompte(Integer idinteretsCompte, Date dates) {
        this.idinteretsCompte = idinteretsCompte;
        this.dates = dates;
    }

    public Integer getIdinteretsCompte() {
        return idinteretsCompte;
    }

    public void setIdinteretsCompte(Integer idinteretsCompte) {
        this.idinteretsCompte = idinteretsCompte;
    }

    public String getCompteTiers() {
        return compteTiers;
    }

    public void setCompteTiers(String compteTiers) {
        this.compteTiers = compteTiers;
    }

    public Date getDates() {
        return dates;
    }

    public void setDates(Date dates) {
        this.dates = dates;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public Integer getIDArrete() {
        return iDArrete;
    }

    public void setIDArrete(Integer iDArrete) {
        this.iDArrete = iDArrete;
    }

    public Short getChoisi() {
        return choisi;
    }

    public void setChoisi(Short choisi) {
        this.choisi = choisi;
    }

    public BigInteger getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(BigInteger numTiers) {
        this.numTiers = numTiers;
    }

    public Integer getIdaffaires() {
        return idaffaires;
    }

    public void setIdaffaires(Integer idaffaires) {
        this.idaffaires = idaffaires;
    }

    public Integer getTva() {
        return tva;
    }

    public void setTva(Integer tva) {
        this.tva = tva;
    }

    public Integer getIrc() {
        return irc;
    }

    public void setIrc(Integer irc) {
        this.irc = irc;
    }

    public BigDecimal getMntBase() {
        return mntBase;
    }

    public void setMntBase(BigDecimal mntBase) {
        this.mntBase = mntBase;
    }

    public Integer getNbreJour() {
        return nbreJour;
    }

    public void setNbreJour(Integer nbreJour) {
        this.nbreJour = nbreJour;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public DecMouvements getIdmouvements() {
        return idmouvements;
    }

    public void setIdmouvements(DecMouvements idmouvements) {
        this.idmouvements = idmouvements;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinteretsCompte != null ? idinteretsCompte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InteretsCompte)) {
            return false;
        }
        InteretsCompte other = (InteretsCompte) object;
        if ((this.idinteretsCompte == null && other.idinteretsCompte != null) || (this.idinteretsCompte != null && !this.idinteretsCompte.equals(other.idinteretsCompte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.InteretsCompte[ idinteretsCompte=" + idinteretsCompte + " ]";
    }
    
}
