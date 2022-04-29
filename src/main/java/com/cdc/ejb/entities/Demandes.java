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
@Table(name = "demandes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Demandes.findAll", query = "SELECT d FROM Demandes d")
    , @NamedQuery(name = "Demandes.findByIddemandes", query = "SELECT d FROM Demandes d WHERE d.iddemandes = :iddemandes")
    , @NamedQuery(name = "Demandes.findByNumTiersProvenance", query = "SELECT d FROM Demandes d WHERE d.numTiersProvenance = :numTiersProvenance")
    , @NamedQuery(name = "Demandes.findByNumTiersDestination", query = "SELECT d FROM Demandes d WHERE d.numTiersDestination = :numTiersDestination")
    , @NamedQuery(name = "Demandes.findByFonctionDestination", query = "SELECT d FROM Demandes d WHERE d.fonctionDestination = :fonctionDestination")
    , @NamedQuery(name = "Demandes.findByMontant", query = "SELECT d FROM Demandes d WHERE d.montant = :montant")
    , @NamedQuery(name = "Demandes.findByVisaProv", query = "SELECT d FROM Demandes d WHERE d.visaProv = :visaProv")
    , @NamedQuery(name = "Demandes.findByVisaDest", query = "SELECT d FROM Demandes d WHERE d.visaDest = :visaDest")
    , @NamedQuery(name = "Demandes.findByTypeDemande", query = "SELECT d FROM Demandes d WHERE d.typeDemande = :typeDemande")
    , @NamedQuery(name = "Demandes.findByNumTiers", query = "SELECT d FROM Demandes d WHERE d.numTiers = :numTiers")
    , @NamedQuery(name = "Demandes.findByVisaProvAppro", query = "SELECT d FROM Demandes d WHERE d.visaProvAppro = :visaProvAppro")
    , @NamedQuery(name = "Demandes.findByVisaDestAppro", query = "SELECT d FROM Demandes d WHERE d.visaDestAppro = :visaDestAppro")
    , @NamedQuery(name = "Demandes.findByNumPieceReg", query = "SELECT d FROM Demandes d WHERE d.numPieceReg = :numPieceReg")
    , @NamedQuery(name = "Demandes.findByNumeroCBDepart", query = "SELECT d FROM Demandes d WHERE d.numeroCBDepart = :numeroCBDepart")
    , @NamedQuery(name = "Demandes.findByIDEtablissementFinancierDepart", query = "SELECT d FROM Demandes d WHERE d.iDEtablissementFinancierDepart = :iDEtablissementFinancierDepart")
    , @NamedQuery(name = "Demandes.findByObservation", query = "SELECT d FROM Demandes d WHERE d.observation = :observation")
    , @NamedQuery(name = "Demandes.findByGestion", query = "SELECT d FROM Demandes d WHERE d.gestion = :gestion")})
public class Demandes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEMANDES")
    private Integer iddemandes;
    @Column(name = "NumTiersProvenance")
    private BigInteger numTiersProvenance;
    @Column(name = "NumTiersDestination")
    private BigInteger numTiersDestination;
    @Size(max = 50)
    @Column(name = "FonctionDestination")
    private String fonctionDestination;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT")
    private BigDecimal montant;
    @Column(name = "VisaProv")
    @Temporal(TemporalType.DATE)
    private Date visaProv;
    @Column(name = "VisaDest")
    @Temporal(TemporalType.DATE)
    private Date visaDest;
    @Column(name = "TypeDemande")
    private Short typeDemande;
    @Column(name = "NumTiers")
    private BigInteger numTiers;
    @Column(name = "VisaProvAppro")
    @Temporal(TemporalType.DATE)
    private Date visaProvAppro;
    @Column(name = "VisaDestAppro")
    @Temporal(TemporalType.DATE)
    private Date visaDestAppro;
    @Size(max = 50)
    @Column(name = "NumPieceReg")
    private String numPieceReg;
    @Size(max = 50)
    @Column(name = "NumeroCBDepart")
    private String numeroCBDepart;
    @Column(name = "IDEtablissementFinancierDepart")
    private Integer iDEtablissementFinancierDepart;
    @Size(max = 200)
    @Column(name = "OBSERVATION")
    private String observation;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddemandes")
    private List<Encaissements> encaissementsList;
    @JoinColumn(name = "NumeroCaisse", referencedColumnName = "NumeroCaisse")
    @ManyToOne
    private Caisses numeroCaisse;
    @OneToMany(mappedBy = "iddemandes")
    private List<Billetage> billetageList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iddemandes")
    private List<Decaissements> decaissementsList;

    public Demandes() {
    }

    public Demandes(Integer iddemandes) {
        this.iddemandes = iddemandes;
    }

    public Integer getIddemandes() {
        return iddemandes;
    }

    public void setIddemandes(Integer iddemandes) {
        this.iddemandes = iddemandes;
    }

    public BigInteger getNumTiersProvenance() {
        return numTiersProvenance;
    }

    public void setNumTiersProvenance(BigInteger numTiersProvenance) {
        this.numTiersProvenance = numTiersProvenance;
    }

    public BigInteger getNumTiersDestination() {
        return numTiersDestination;
    }

    public void setNumTiersDestination(BigInteger numTiersDestination) {
        this.numTiersDestination = numTiersDestination;
    }

    public String getFonctionDestination() {
        return fonctionDestination;
    }

    public void setFonctionDestination(String fonctionDestination) {
        this.fonctionDestination = fonctionDestination;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public Date getVisaProv() {
        return visaProv;
    }

    public void setVisaProv(Date visaProv) {
        this.visaProv = visaProv;
    }

    public Date getVisaDest() {
        return visaDest;
    }

    public void setVisaDest(Date visaDest) {
        this.visaDest = visaDest;
    }

    public Short getTypeDemande() {
        return typeDemande;
    }

    public void setTypeDemande(Short typeDemande) {
        this.typeDemande = typeDemande;
    }

    public BigInteger getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(BigInteger numTiers) {
        this.numTiers = numTiers;
    }

    public Date getVisaProvAppro() {
        return visaProvAppro;
    }

    public void setVisaProvAppro(Date visaProvAppro) {
        this.visaProvAppro = visaProvAppro;
    }

    public Date getVisaDestAppro() {
        return visaDestAppro;
    }

    public void setVisaDestAppro(Date visaDestAppro) {
        this.visaDestAppro = visaDestAppro;
    }

    public String getNumPieceReg() {
        return numPieceReg;
    }

    public void setNumPieceReg(String numPieceReg) {
        this.numPieceReg = numPieceReg;
    }

    public String getNumeroCBDepart() {
        return numeroCBDepart;
    }

    public void setNumeroCBDepart(String numeroCBDepart) {
        this.numeroCBDepart = numeroCBDepart;
    }

    public Integer getIDEtablissementFinancierDepart() {
        return iDEtablissementFinancierDepart;
    }

    public void setIDEtablissementFinancierDepart(Integer iDEtablissementFinancierDepart) {
        this.iDEtablissementFinancierDepart = iDEtablissementFinancierDepart;
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

    @XmlTransient
    public List<Encaissements> getEncaissementsList() {
        return encaissementsList;
    }

    public void setEncaissementsList(List<Encaissements> encaissementsList) {
        this.encaissementsList = encaissementsList;
    }

    public Caisses getNumeroCaisse() {
        return numeroCaisse;
    }

    public void setNumeroCaisse(Caisses numeroCaisse) {
        this.numeroCaisse = numeroCaisse;
    }

    @XmlTransient
    public List<Billetage> getBilletageList() {
        return billetageList;
    }

    public void setBilletageList(List<Billetage> billetageList) {
        this.billetageList = billetageList;
    }

    @XmlTransient
    public List<Decaissements> getDecaissementsList() {
        return decaissementsList;
    }

    public void setDecaissementsList(List<Decaissements> decaissementsList) {
        this.decaissementsList = decaissementsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddemandes != null ? iddemandes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Demandes)) {
            return false;
        }
        Demandes other = (Demandes) object;
        if ((this.iddemandes == null && other.iddemandes != null) || (this.iddemandes != null && !this.iddemandes.equals(other.iddemandes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Demandes[ iddemandes=" + iddemandes + " ]";
    }
    
}
