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
@Table(name = "dec_affaires")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecAffaires.findAll", query = "SELECT d FROM DecAffaires d")
    , @NamedQuery(name = "DecAffaires.findByIdaffaires", query = "SELECT d FROM DecAffaires d WHERE d.idaffaires = :idaffaires")
    , @NamedQuery(name = "DecAffaires.findByDateAffaire", query = "SELECT d FROM DecAffaires d WHERE d.dateAffaire = :dateAffaire")
    , @NamedQuery(name = "DecAffaires.findByDate1ereOperation", query = "SELECT d FROM DecAffaires d WHERE d.date1ereOperation = :date1ereOperation")
    , @NamedQuery(name = "DecAffaires.findByNUMeroAffaire", query = "SELECT d FROM DecAffaires d WHERE d.nUMeroAffaire = :nUMeroAffaire")
    , @NamedQuery(name = "DecAffaires.findByCode", query = "SELECT d FROM DecAffaires d WHERE d.code = :code")
    , @NamedQuery(name = "DecAffaires.findByIntitule", query = "SELECT d FROM DecAffaires d WHERE d.intitule = :intitule")
    , @NamedQuery(name = "DecAffaires.findByMontantInitial", query = "SELECT d FROM DecAffaires d WHERE d.montantInitial = :montantInitial")
    , @NamedQuery(name = "DecAffaires.findByCumulReceptions", query = "SELECT d FROM DecAffaires d WHERE d.cumulReceptions = :cumulReceptions")
    , @NamedQuery(name = "DecAffaires.findByCumulRestitutions", query = "SELECT d FROM DecAffaires d WHERE d.cumulRestitutions = :cumulRestitutions")
    , @NamedQuery(name = "DecAffaires.findByClient", query = "SELECT d FROM DecAffaires d WHERE d.client = :client")
    , @NamedQuery(name = "DecAffaires.findByType", query = "SELECT d FROM DecAffaires d WHERE d.type = :type")
    , @NamedQuery(name = "DecAffaires.findByIDunik", query = "SELECT d FROM DecAffaires d WHERE d.iDunik = :iDunik")
    , @NamedQuery(name = "DecAffaires.findByCloturee", query = "SELECT d FROM DecAffaires d WHERE d.cloturee = :cloturee")
    , @NamedQuery(name = "DecAffaires.findByTransfertEffectif", query = "SELECT d FROM DecAffaires d WHERE d.transfertEffectif = :transfertEffectif")
    , @NamedQuery(name = "DecAffaires.findByNumeroCompteObligatoite", query = "SELECT d FROM DecAffaires d WHERE d.numeroCompteObligatoite = :numeroCompteObligatoite")
    , @NamedQuery(name = "DecAffaires.findByImputerSurCDO", query = "SELECT d FROM DecAffaires d WHERE d.imputerSurCDO = :imputerSurCDO")
    , @NamedQuery(name = "DecAffaires.findByDATEDeButImputationSurCDO", query = "SELECT d FROM DecAffaires d WHERE d.dATEDeButImputationSurCDO = :dATEDeButImputationSurCDO")
    , @NamedQuery(name = "DecAffaires.findByCumulTitre", query = "SELECT d FROM DecAffaires d WHERE d.cumulTitre = :cumulTitre")
    , @NamedQuery(name = "DecAffaires.findByCumulAutorisation", query = "SELECT d FROM DecAffaires d WHERE d.cumulAutorisation = :cumulAutorisation")
    , @NamedQuery(name = "DecAffaires.findByCumultitreValides", query = "SELECT d FROM DecAffaires d WHERE d.cumultitreValides = :cumultitreValides")
    , @NamedQuery(name = "DecAffaires.findByCumulAutorisationValides", query = "SELECT d FROM DecAffaires d WHERE d.cumulAutorisationValides = :cumulAutorisationValides")
    , @NamedQuery(name = "DecAffaires.findByGestion", query = "SELECT d FROM DecAffaires d WHERE d.gestion = :gestion")})
public class DecAffaires implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDAFFAIRES")
    private Integer idaffaires;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateAffaire")
    @Temporal(TemporalType.DATE)
    private Date dateAffaire;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Date1ereOperation")
    @Temporal(TemporalType.DATE)
    private Date date1ereOperation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NUMeroAffaire")
    private String nUMeroAffaire;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Intitule")
    private String intitule;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontantInitial")
    private BigDecimal montantInitial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CumulReceptions")
    private BigDecimal cumulReceptions;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CumulRestitutions")
    private BigDecimal cumulRestitutions;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Client")
    private String client;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Type")
    private short type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "IDunik")
    private String iDunik;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cloturee")
    private short cloturee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TransfertEffectif")
    private short transfertEffectif;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroCompteObligatoite")
    private String numeroCompteObligatoite;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImputerSurCDO")
    private short imputerSurCDO;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DATEDeButImputationSurCDO")
    private String dATEDeButImputationSurCDO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CumulTitre")
    private BigDecimal cumulTitre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CumulAutorisation")
    private BigDecimal cumulAutorisation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CumultitreValides")
    private BigDecimal cumultitreValides;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CumulAutorisationValides")
    private BigDecimal cumulAutorisationValides;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idaffaires")
    private List<Encaissements> encaissementsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idaffaires")
    private List<RestitutionSurAffaireAr> restitutionSurAffaireArList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idaffaires")
    private List<DecReception> decReceptionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idaffaires")
    private List<DecTitredeperception> decTitredeperceptionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idaffaires")
    private List<RestitutionSurAffraire> restitutionSurAffraireList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idaffaires")
    private List<DecMouvements> decMouvementsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idaffaires")
    private List<Decaissements> decaissementsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idaffaires")
    private List<DecRestitution> decRestitutionList;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne(optional = false)
    private Tiers numTiers;
    @JoinColumn(name = "IDNATUREOPERATION", referencedColumnName = "IDNATUREOPERATION")
    @ManyToOne(optional = false)
    private DecNatureoperation idnatureoperation;
    @JoinColumn(name = "IDTYPEAFFAIRE", referencedColumnName = "IDTYPEAFFAIRE")
    @ManyToOne(optional = false)
    private DecTypeaffaire idtypeaffaire;

    public DecAffaires() {
    }

    public DecAffaires(Integer idaffaires) {
        this.idaffaires = idaffaires;
    }

    public DecAffaires(Integer idaffaires, Date dateAffaire, Date date1ereOperation, String nUMeroAffaire, String code, String intitule, BigDecimal montantInitial, BigDecimal cumulReceptions, BigDecimal cumulRestitutions, String client, short type, String iDunik, short cloturee, short transfertEffectif, String numeroCompteObligatoite, short imputerSurCDO, String dATEDeButImputationSurCDO, BigDecimal cumulTitre, BigDecimal cumulAutorisation, BigDecimal cumultitreValides, BigDecimal cumulAutorisationValides) {
        this.idaffaires = idaffaires;
        this.dateAffaire = dateAffaire;
        this.date1ereOperation = date1ereOperation;
        this.nUMeroAffaire = nUMeroAffaire;
        this.code = code;
        this.intitule = intitule;
        this.montantInitial = montantInitial;
        this.cumulReceptions = cumulReceptions;
        this.cumulRestitutions = cumulRestitutions;
        this.client = client;
        this.type = type;
        this.iDunik = iDunik;
        this.cloturee = cloturee;
        this.transfertEffectif = transfertEffectif;
        this.numeroCompteObligatoite = numeroCompteObligatoite;
        this.imputerSurCDO = imputerSurCDO;
        this.dATEDeButImputationSurCDO = dATEDeButImputationSurCDO;
        this.cumulTitre = cumulTitre;
        this.cumulAutorisation = cumulAutorisation;
        this.cumultitreValides = cumultitreValides;
        this.cumulAutorisationValides = cumulAutorisationValides;
    }

    public Integer getIdaffaires() {
        return idaffaires;
    }

    public void setIdaffaires(Integer idaffaires) {
        this.idaffaires = idaffaires;
    }

    public Date getDateAffaire() {
        return dateAffaire;
    }

    public void setDateAffaire(Date dateAffaire) {
        this.dateAffaire = dateAffaire;
    }

    public Date getDate1ereOperation() {
        return date1ereOperation;
    }

    public void setDate1ereOperation(Date date1ereOperation) {
        this.date1ereOperation = date1ereOperation;
    }

    public String getNUMeroAffaire() {
        return nUMeroAffaire;
    }

    public void setNUMeroAffaire(String nUMeroAffaire) {
        this.nUMeroAffaire = nUMeroAffaire;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public BigDecimal getMontantInitial() {
        return montantInitial;
    }

    public void setMontantInitial(BigDecimal montantInitial) {
        this.montantInitial = montantInitial;
    }

    public BigDecimal getCumulReceptions() {
        return cumulReceptions;
    }

    public void setCumulReceptions(BigDecimal cumulReceptions) {
        this.cumulReceptions = cumulReceptions;
    }

    public BigDecimal getCumulRestitutions() {
        return cumulRestitutions;
    }

    public void setCumulRestitutions(BigDecimal cumulRestitutions) {
        this.cumulRestitutions = cumulRestitutions;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getIDunik() {
        return iDunik;
    }

    public void setIDunik(String iDunik) {
        this.iDunik = iDunik;
    }

    public short getCloturee() {
        return cloturee;
    }

    public void setCloturee(short cloturee) {
        this.cloturee = cloturee;
    }

    public short getTransfertEffectif() {
        return transfertEffectif;
    }

    public void setTransfertEffectif(short transfertEffectif) {
        this.transfertEffectif = transfertEffectif;
    }

    public String getNumeroCompteObligatoite() {
        return numeroCompteObligatoite;
    }

    public void setNumeroCompteObligatoite(String numeroCompteObligatoite) {
        this.numeroCompteObligatoite = numeroCompteObligatoite;
    }

    public short getImputerSurCDO() {
        return imputerSurCDO;
    }

    public void setImputerSurCDO(short imputerSurCDO) {
        this.imputerSurCDO = imputerSurCDO;
    }

    public String getDATEDeButImputationSurCDO() {
        return dATEDeButImputationSurCDO;
    }

    public void setDATEDeButImputationSurCDO(String dATEDeButImputationSurCDO) {
        this.dATEDeButImputationSurCDO = dATEDeButImputationSurCDO;
    }

    public BigDecimal getCumulTitre() {
        return cumulTitre;
    }

    public void setCumulTitre(BigDecimal cumulTitre) {
        this.cumulTitre = cumulTitre;
    }

    public BigDecimal getCumulAutorisation() {
        return cumulAutorisation;
    }

    public void setCumulAutorisation(BigDecimal cumulAutorisation) {
        this.cumulAutorisation = cumulAutorisation;
    }

    public BigDecimal getCumultitreValides() {
        return cumultitreValides;
    }

    public void setCumultitreValides(BigDecimal cumultitreValides) {
        this.cumultitreValides = cumultitreValides;
    }

    public BigDecimal getCumulAutorisationValides() {
        return cumulAutorisationValides;
    }

    public void setCumulAutorisationValides(BigDecimal cumulAutorisationValides) {
        this.cumulAutorisationValides = cumulAutorisationValides;
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

    @XmlTransient
    public List<RestitutionSurAffaireAr> getRestitutionSurAffaireArList() {
        return restitutionSurAffaireArList;
    }

    public void setRestitutionSurAffaireArList(List<RestitutionSurAffaireAr> restitutionSurAffaireArList) {
        this.restitutionSurAffaireArList = restitutionSurAffaireArList;
    }

    @XmlTransient
    public List<DecReception> getDecReceptionList() {
        return decReceptionList;
    }

    public void setDecReceptionList(List<DecReception> decReceptionList) {
        this.decReceptionList = decReceptionList;
    }

    @XmlTransient
    public List<DecTitredeperception> getDecTitredeperceptionList() {
        return decTitredeperceptionList;
    }

    public void setDecTitredeperceptionList(List<DecTitredeperception> decTitredeperceptionList) {
        this.decTitredeperceptionList = decTitredeperceptionList;
    }

    @XmlTransient
    public List<RestitutionSurAffraire> getRestitutionSurAffraireList() {
        return restitutionSurAffraireList;
    }

    public void setRestitutionSurAffraireList(List<RestitutionSurAffraire> restitutionSurAffraireList) {
        this.restitutionSurAffraireList = restitutionSurAffraireList;
    }

    @XmlTransient
    public List<DecMouvements> getDecMouvementsList() {
        return decMouvementsList;
    }

    public void setDecMouvementsList(List<DecMouvements> decMouvementsList) {
        this.decMouvementsList = decMouvementsList;
    }

    @XmlTransient
    public List<Decaissements> getDecaissementsList() {
        return decaissementsList;
    }

    public void setDecaissementsList(List<Decaissements> decaissementsList) {
        this.decaissementsList = decaissementsList;
    }

    @XmlTransient
    public List<DecRestitution> getDecRestitutionList() {
        return decRestitutionList;
    }

    public void setDecRestitutionList(List<DecRestitution> decRestitutionList) {
        this.decRestitutionList = decRestitutionList;
    }

    public Tiers getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(Tiers numTiers) {
        this.numTiers = numTiers;
    }

    public DecNatureoperation getIdnatureoperation() {
        return idnatureoperation;
    }

    public void setIdnatureoperation(DecNatureoperation idnatureoperation) {
        this.idnatureoperation = idnatureoperation;
    }

    public DecTypeaffaire getIdtypeaffaire() {
        return idtypeaffaire;
    }

    public void setIdtypeaffaire(DecTypeaffaire idtypeaffaire) {
        this.idtypeaffaire = idtypeaffaire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idaffaires != null ? idaffaires.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DecAffaires)) {
            return false;
        }
        DecAffaires other = (DecAffaires) object;
        if ((this.idaffaires == null && other.idaffaires != null) || (this.idaffaires != null && !this.idaffaires.equals(other.idaffaires))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecAffaires[ idaffaires=" + idaffaires + " ]";
    }
    
}
