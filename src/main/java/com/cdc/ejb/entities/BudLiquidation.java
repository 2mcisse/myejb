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
@Table(name = "bud_liquidation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BudLiquidation.findAll", query = "SELECT b FROM BudLiquidation b")
    , @NamedQuery(name = "BudLiquidation.findByIDBUDLiquidation", query = "SELECT b FROM BudLiquidation b WHERE b.iDBUDLiquidation = :iDBUDLiquidation")
    , @NamedQuery(name = "BudLiquidation.findByNumeroCB", query = "SELECT b FROM BudLiquidation b WHERE b.numeroCB = :numeroCB")
    , @NamedQuery(name = "BudLiquidation.findByNumero", query = "SELECT b FROM BudLiquidation b WHERE b.numero = :numero")
    , @NamedQuery(name = "BudLiquidation.findByMontant", query = "SELECT b FROM BudLiquidation b WHERE b.montant = :montant")
    , @NamedQuery(name = "BudLiquidation.findByEtape", query = "SELECT b FROM BudLiquidation b WHERE b.etape = :etape")
    , @NamedQuery(name = "BudLiquidation.findByDateMandat", query = "SELECT b FROM BudLiquidation b WHERE b.dateMandat = :dateMandat")
    , @NamedQuery(name = "BudLiquidation.findByNumeroMandat", query = "SELECT b FROM BudLiquidation b WHERE b.numeroMandat = :numeroMandat")
    , @NamedQuery(name = "BudLiquidation.findByDateOP", query = "SELECT b FROM BudLiquidation b WHERE b.dateOP = :dateOP")
    , @NamedQuery(name = "BudLiquidation.findByDateAC", query = "SELECT b FROM BudLiquidation b WHERE b.dateAC = :dateAC")
    , @NamedQuery(name = "BudLiquidation.findByNumeroAC", query = "SELECT b FROM BudLiquidation b WHERE b.numeroAC = :numeroAC")
    , @NamedQuery(name = "BudLiquidation.findByCumulRetenues", query = "SELECT b FROM BudLiquidation b WHERE b.cumulRetenues = :cumulRetenues")
    , @NamedQuery(name = "BudLiquidation.findByNumeroOP", query = "SELECT b FROM BudLiquidation b WHERE b.numeroOP = :numeroOP")
    , @NamedQuery(name = "BudLiquidation.findByDateSaisie", query = "SELECT b FROM BudLiquidation b WHERE b.dateSaisie = :dateSaisie")
    , @NamedQuery(name = "BudLiquidation.findByDateVisaCG", query = "SELECT b FROM BudLiquidation b WHERE b.dateVisaCG = :dateVisaCG")
    , @NamedQuery(name = "BudLiquidation.findByDateVisaDG", query = "SELECT b FROM BudLiquidation b WHERE b.dateVisaDG = :dateVisaDG")
    , @NamedQuery(name = "BudLiquidation.findByEtatValidation", query = "SELECT b FROM BudLiquidation b WHERE b.etatValidation = :etatValidation")
    , @NamedQuery(name = "BudLiquidation.findByDateVisaSAGE", query = "SELECT b FROM BudLiquidation b WHERE b.dateVisaSAGE = :dateVisaSAGE")
    , @NamedQuery(name = "BudLiquidation.findByCumulOP", query = "SELECT b FROM BudLiquidation b WHERE b.cumulOP = :cumulOP")
    , @NamedQuery(name = "BudLiquidation.findByCodejnl", query = "SELECT b FROM BudLiquidation b WHERE b.codejnl = :codejnl")
    , @NamedQuery(name = "BudLiquidation.findByNiveau", query = "SELECT b FROM BudLiquidation b WHERE b.niveau = :niveau")
    , @NamedQuery(name = "BudLiquidation.findByNiveauPrecedent", query = "SELECT b FROM BudLiquidation b WHERE b.niveauPrecedent = :niveauPrecedent")
    , @NamedQuery(name = "BudLiquidation.findByObjetdepense", query = "SELECT b FROM BudLiquidation b WHERE b.objetdepense = :objetdepense")
    , @NamedQuery(name = "BudLiquidation.findByLogin", query = "SELECT b FROM BudLiquidation b WHERE b.login = :login")
    , @NamedQuery(name = "BudLiquidation.findByDmri", query = "SELECT b FROM BudLiquidation b WHERE b.dmri = :dmri")
    , @NamedQuery(name = "BudLiquidation.findByNumeroCompte", query = "SELECT b FROM BudLiquidation b WHERE b.numeroCompte = :numeroCompte")
    , @NamedQuery(name = "BudLiquidation.findByPrecompteTva", query = "SELECT b FROM BudLiquidation b WHERE b.precompteTva = :precompteTva")
    , @NamedQuery(name = "BudLiquidation.findByIDEtablissementFinancier", query = "SELECT b FROM BudLiquidation b WHERE b.iDEtablissementFinancier = :iDEtablissementFinancier")
    , @NamedQuery(name = "BudLiquidation.findByAgence", query = "SELECT b FROM BudLiquidation b WHERE b.agence = :agence")
    , @NamedQuery(name = "BudLiquidation.findByLibop", query = "SELECT b FROM BudLiquidation b WHERE b.libop = :libop")
    , @NamedQuery(name = "BudLiquidation.findByGestion", query = "SELECT b FROM BudLiquidation b WHERE b.gestion = :gestion")})
public class BudLiquidation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_Liquidation")
    private Integer iDBUDLiquidation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "numeroCB")
    private String numeroCB;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Numero")
    private String numero;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Montant")
    private BigDecimal montant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Etape")
    private short etape;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateMandat")
    @Temporal(TemporalType.DATE)
    private Date dateMandat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroMandat")
    private String numeroMandat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateOP")
    @Temporal(TemporalType.DATE)
    private Date dateOP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateAC")
    @Temporal(TemporalType.DATE)
    private Date dateAC;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroAC")
    private String numeroAC;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CumulRetenues")
    private BigDecimal cumulRetenues;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroOP")
    private String numeroOP;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateSaisie")
    @Temporal(TemporalType.DATE)
    private Date dateSaisie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateVisaCG")
    @Temporal(TemporalType.DATE)
    private Date dateVisaCG;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateVisaDG")
    @Temporal(TemporalType.DATE)
    private Date dateVisaDG;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EtatValidation")
    private short etatValidation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateVisaSAGE")
    @Temporal(TemporalType.DATE)
    private Date dateVisaSAGE;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CumulOP")
    private BigDecimal cumulOP;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CODEJNL")
    private String codejnl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Niveau")
    private short niveau;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NiveauPrecedent")
    private int niveauPrecedent;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Objetdepense")
    private String objetdepense;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Login")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DMRI")
    private short dmri;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 51)
    @Column(name = "NumeroCompte")
    private String numeroCompte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PrecompteTva")
    private short precompteTva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEtablissementFinancier")
    private int iDEtablissementFinancier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Agence")
    private String agence;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "LIBOP")
    private String libop;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDBUDLiquidation")
    private List<Pieces> piecesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDBUDLiquidation")
    private List<SysContenubordereau> sysContenubordereauList;
    @OneToMany(mappedBy = "iDBUDLiquidation")
    private List<Ordresdepaiement> ordresdepaiementList;
    @JoinColumn(name = "IDBUD_Engagement", referencedColumnName = "IDBUD_Engagement")
    @ManyToOne(optional = false)
    private BudEngagement iDBUDEngagement;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne(optional = false)
    private Tiers numTiers;
    @JoinColumn(name = "IDBUD_DMRI", referencedColumnName = "IDBUD_DMRI")
    @ManyToOne(optional = false)
    private BudDmri idbudDmri;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDBUDLiquidation")
    private List<BudRetenues> budRetenuesList;

    public BudLiquidation() {
    }

    public BudLiquidation(Integer iDBUDLiquidation) {
        this.iDBUDLiquidation = iDBUDLiquidation;
    }

    public BudLiquidation(Integer iDBUDLiquidation, String numeroCB, String numero, BigDecimal montant, short etape, Date dateMandat, String numeroMandat, Date dateOP, Date dateAC, String numeroAC, BigDecimal cumulRetenues, String numeroOP, Date dateSaisie, Date dateVisaCG, Date dateVisaDG, short etatValidation, Date dateVisaSAGE, BigDecimal cumulOP, String codejnl, short niveau, int niveauPrecedent, String objetdepense, String login, short dmri, String numeroCompte, short precompteTva, int iDEtablissementFinancier, String agence, String libop) {
        this.iDBUDLiquidation = iDBUDLiquidation;
        this.numeroCB = numeroCB;
        this.numero = numero;
        this.montant = montant;
        this.etape = etape;
        this.dateMandat = dateMandat;
        this.numeroMandat = numeroMandat;
        this.dateOP = dateOP;
        this.dateAC = dateAC;
        this.numeroAC = numeroAC;
        this.cumulRetenues = cumulRetenues;
        this.numeroOP = numeroOP;
        this.dateSaisie = dateSaisie;
        this.dateVisaCG = dateVisaCG;
        this.dateVisaDG = dateVisaDG;
        this.etatValidation = etatValidation;
        this.dateVisaSAGE = dateVisaSAGE;
        this.cumulOP = cumulOP;
        this.codejnl = codejnl;
        this.niveau = niveau;
        this.niveauPrecedent = niveauPrecedent;
        this.objetdepense = objetdepense;
        this.login = login;
        this.dmri = dmri;
        this.numeroCompte = numeroCompte;
        this.precompteTva = precompteTva;
        this.iDEtablissementFinancier = iDEtablissementFinancier;
        this.agence = agence;
        this.libop = libop;
    }

    public Integer getIDBUDLiquidation() {
        return iDBUDLiquidation;
    }

    public void setIDBUDLiquidation(Integer iDBUDLiquidation) {
        this.iDBUDLiquidation = iDBUDLiquidation;
    }

    public String getNumeroCB() {
        return numeroCB;
    }

    public void setNumeroCB(String numeroCB) {
        this.numeroCB = numeroCB;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public short getEtape() {
        return etape;
    }

    public void setEtape(short etape) {
        this.etape = etape;
    }

    public Date getDateMandat() {
        return dateMandat;
    }

    public void setDateMandat(Date dateMandat) {
        this.dateMandat = dateMandat;
    }

    public String getNumeroMandat() {
        return numeroMandat;
    }

    public void setNumeroMandat(String numeroMandat) {
        this.numeroMandat = numeroMandat;
    }

    public Date getDateOP() {
        return dateOP;
    }

    public void setDateOP(Date dateOP) {
        this.dateOP = dateOP;
    }

    public Date getDateAC() {
        return dateAC;
    }

    public void setDateAC(Date dateAC) {
        this.dateAC = dateAC;
    }

    public String getNumeroAC() {
        return numeroAC;
    }

    public void setNumeroAC(String numeroAC) {
        this.numeroAC = numeroAC;
    }

    public BigDecimal getCumulRetenues() {
        return cumulRetenues;
    }

    public void setCumulRetenues(BigDecimal cumulRetenues) {
        this.cumulRetenues = cumulRetenues;
    }

    public String getNumeroOP() {
        return numeroOP;
    }

    public void setNumeroOP(String numeroOP) {
        this.numeroOP = numeroOP;
    }

    public Date getDateSaisie() {
        return dateSaisie;
    }

    public void setDateSaisie(Date dateSaisie) {
        this.dateSaisie = dateSaisie;
    }

    public Date getDateVisaCG() {
        return dateVisaCG;
    }

    public void setDateVisaCG(Date dateVisaCG) {
        this.dateVisaCG = dateVisaCG;
    }

    public Date getDateVisaDG() {
        return dateVisaDG;
    }

    public void setDateVisaDG(Date dateVisaDG) {
        this.dateVisaDG = dateVisaDG;
    }

    public short getEtatValidation() {
        return etatValidation;
    }

    public void setEtatValidation(short etatValidation) {
        this.etatValidation = etatValidation;
    }

    public Date getDateVisaSAGE() {
        return dateVisaSAGE;
    }

    public void setDateVisaSAGE(Date dateVisaSAGE) {
        this.dateVisaSAGE = dateVisaSAGE;
    }

    public BigDecimal getCumulOP() {
        return cumulOP;
    }

    public void setCumulOP(BigDecimal cumulOP) {
        this.cumulOP = cumulOP;
    }

    public String getCodejnl() {
        return codejnl;
    }

    public void setCodejnl(String codejnl) {
        this.codejnl = codejnl;
    }

    public short getNiveau() {
        return niveau;
    }

    public void setNiveau(short niveau) {
        this.niveau = niveau;
    }

    public int getNiveauPrecedent() {
        return niveauPrecedent;
    }

    public void setNiveauPrecedent(int niveauPrecedent) {
        this.niveauPrecedent = niveauPrecedent;
    }

    public String getObjetdepense() {
        return objetdepense;
    }

    public void setObjetdepense(String objetdepense) {
        this.objetdepense = objetdepense;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public short getDmri() {
        return dmri;
    }

    public void setDmri(short dmri) {
        this.dmri = dmri;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public short getPrecompteTva() {
        return precompteTva;
    }

    public void setPrecompteTva(short precompteTva) {
        this.precompteTva = precompteTva;
    }

    public int getIDEtablissementFinancier() {
        return iDEtablissementFinancier;
    }

    public void setIDEtablissementFinancier(int iDEtablissementFinancier) {
        this.iDEtablissementFinancier = iDEtablissementFinancier;
    }

    public String getAgence() {
        return agence;
    }

    public void setAgence(String agence) {
        this.agence = agence;
    }

    public String getLibop() {
        return libop;
    }

    public void setLibop(String libop) {
        this.libop = libop;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Pieces> getPiecesList() {
        return piecesList;
    }

    public void setPiecesList(List<Pieces> piecesList) {
        this.piecesList = piecesList;
    }

    @XmlTransient
    public List<SysContenubordereau> getSysContenubordereauList() {
        return sysContenubordereauList;
    }

    public void setSysContenubordereauList(List<SysContenubordereau> sysContenubordereauList) {
        this.sysContenubordereauList = sysContenubordereauList;
    }

    @XmlTransient
    public List<Ordresdepaiement> getOrdresdepaiementList() {
        return ordresdepaiementList;
    }

    public void setOrdresdepaiementList(List<Ordresdepaiement> ordresdepaiementList) {
        this.ordresdepaiementList = ordresdepaiementList;
    }

    public BudEngagement getIDBUDEngagement() {
        return iDBUDEngagement;
    }

    public void setIDBUDEngagement(BudEngagement iDBUDEngagement) {
        this.iDBUDEngagement = iDBUDEngagement;
    }

    public Tiers getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(Tiers numTiers) {
        this.numTiers = numTiers;
    }

    public BudDmri getIdbudDmri() {
        return idbudDmri;
    }

    public void setIdbudDmri(BudDmri idbudDmri) {
        this.idbudDmri = idbudDmri;
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
        hash += (iDBUDLiquidation != null ? iDBUDLiquidation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudLiquidation)) {
            return false;
        }
        BudLiquidation other = (BudLiquidation) object;
        if ((this.iDBUDLiquidation == null && other.iDBUDLiquidation != null) || (this.iDBUDLiquidation != null && !this.iDBUDLiquidation.equals(other.iDBUDLiquidation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.BudLiquidation[ iDBUDLiquidation=" + iDBUDLiquidation + " ]";
    }
    
}
