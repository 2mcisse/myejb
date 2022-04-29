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
@Table(name = "bud_liquidationsup")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BudLiquidationsup.findAll", query = "SELECT b FROM BudLiquidationsup b")
    , @NamedQuery(name = "BudLiquidationsup.findByIDBUDLiquidation", query = "SELECT b FROM BudLiquidationsup b WHERE b.iDBUDLiquidation = :iDBUDLiquidation")
    , @NamedQuery(name = "BudLiquidationsup.findByNumeroCB", query = "SELECT b FROM BudLiquidationsup b WHERE b.numeroCB = :numeroCB")
    , @NamedQuery(name = "BudLiquidationsup.findByNumero", query = "SELECT b FROM BudLiquidationsup b WHERE b.numero = :numero")
    , @NamedQuery(name = "BudLiquidationsup.findByMontant", query = "SELECT b FROM BudLiquidationsup b WHERE b.montant = :montant")
    , @NamedQuery(name = "BudLiquidationsup.findByEtape", query = "SELECT b FROM BudLiquidationsup b WHERE b.etape = :etape")
    , @NamedQuery(name = "BudLiquidationsup.findByDateMandat", query = "SELECT b FROM BudLiquidationsup b WHERE b.dateMandat = :dateMandat")
    , @NamedQuery(name = "BudLiquidationsup.findByNumeroMandat", query = "SELECT b FROM BudLiquidationsup b WHERE b.numeroMandat = :numeroMandat")
    , @NamedQuery(name = "BudLiquidationsup.findByIDBUDEngagement", query = "SELECT b FROM BudLiquidationsup b WHERE b.iDBUDEngagement = :iDBUDEngagement")
    , @NamedQuery(name = "BudLiquidationsup.findByDateOP", query = "SELECT b FROM BudLiquidationsup b WHERE b.dateOP = :dateOP")
    , @NamedQuery(name = "BudLiquidationsup.findByDateAC", query = "SELECT b FROM BudLiquidationsup b WHERE b.dateAC = :dateAC")
    , @NamedQuery(name = "BudLiquidationsup.findByNumeroAC", query = "SELECT b FROM BudLiquidationsup b WHERE b.numeroAC = :numeroAC")
    , @NamedQuery(name = "BudLiquidationsup.findByCumulRetenues", query = "SELECT b FROM BudLiquidationsup b WHERE b.cumulRetenues = :cumulRetenues")
    , @NamedQuery(name = "BudLiquidationsup.findByNumeroOP", query = "SELECT b FROM BudLiquidationsup b WHERE b.numeroOP = :numeroOP")
    , @NamedQuery(name = "BudLiquidationsup.findByDateSaisie", query = "SELECT b FROM BudLiquidationsup b WHERE b.dateSaisie = :dateSaisie")
    , @NamedQuery(name = "BudLiquidationsup.findByDateVisaCG", query = "SELECT b FROM BudLiquidationsup b WHERE b.dateVisaCG = :dateVisaCG")
    , @NamedQuery(name = "BudLiquidationsup.findByDateVisaDG", query = "SELECT b FROM BudLiquidationsup b WHERE b.dateVisaDG = :dateVisaDG")
    , @NamedQuery(name = "BudLiquidationsup.findByEtatValidation", query = "SELECT b FROM BudLiquidationsup b WHERE b.etatValidation = :etatValidation")
    , @NamedQuery(name = "BudLiquidationsup.findByDateVisaSAGE", query = "SELECT b FROM BudLiquidationsup b WHERE b.dateVisaSAGE = :dateVisaSAGE")
    , @NamedQuery(name = "BudLiquidationsup.findByNumTiers", query = "SELECT b FROM BudLiquidationsup b WHERE b.numTiers = :numTiers")
    , @NamedQuery(name = "BudLiquidationsup.findByIdbudDmri", query = "SELECT b FROM BudLiquidationsup b WHERE b.idbudDmri = :idbudDmri")
    , @NamedQuery(name = "BudLiquidationsup.findByCumulOP", query = "SELECT b FROM BudLiquidationsup b WHERE b.cumulOP = :cumulOP")
    , @NamedQuery(name = "BudLiquidationsup.findByCodejnl", query = "SELECT b FROM BudLiquidationsup b WHERE b.codejnl = :codejnl")
    , @NamedQuery(name = "BudLiquidationsup.findByNiveau", query = "SELECT b FROM BudLiquidationsup b WHERE b.niveau = :niveau")
    , @NamedQuery(name = "BudLiquidationsup.findByNiveauPrecedent", query = "SELECT b FROM BudLiquidationsup b WHERE b.niveauPrecedent = :niveauPrecedent")
    , @NamedQuery(name = "BudLiquidationsup.findByObjetdepense", query = "SELECT b FROM BudLiquidationsup b WHERE b.objetdepense = :objetdepense")
    , @NamedQuery(name = "BudLiquidationsup.findByLogin", query = "SELECT b FROM BudLiquidationsup b WHERE b.login = :login")
    , @NamedQuery(name = "BudLiquidationsup.findByDmri", query = "SELECT b FROM BudLiquidationsup b WHERE b.dmri = :dmri")
    , @NamedQuery(name = "BudLiquidationsup.findByNumeroCompte", query = "SELECT b FROM BudLiquidationsup b WHERE b.numeroCompte = :numeroCompte")
    , @NamedQuery(name = "BudLiquidationsup.findByPrecompteTva", query = "SELECT b FROM BudLiquidationsup b WHERE b.precompteTva = :precompteTva")
    , @NamedQuery(name = "BudLiquidationsup.findByIDEtablissementFinancier", query = "SELECT b FROM BudLiquidationsup b WHERE b.iDEtablissementFinancier = :iDEtablissementFinancier")
    , @NamedQuery(name = "BudLiquidationsup.findByAgence", query = "SELECT b FROM BudLiquidationsup b WHERE b.agence = :agence")
    , @NamedQuery(name = "BudLiquidationsup.findByLibop", query = "SELECT b FROM BudLiquidationsup b WHERE b.libop = :libop")
    , @NamedQuery(name = "BudLiquidationsup.findByMotif", query = "SELECT b FROM BudLiquidationsup b WHERE b.motif = :motif")
    , @NamedQuery(name = "BudLiquidationsup.findByNtiersup", query = "SELECT b FROM BudLiquidationsup b WHERE b.ntiersup = :ntiersup")
    , @NamedQuery(name = "BudLiquidationsup.findByGestion", query = "SELECT b FROM BudLiquidationsup b WHERE b.gestion = :gestion")})
public class BudLiquidationsup implements Serializable {

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
    @Column(name = "IDBUD_Engagement")
    private int iDBUDEngagement;
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
    @Column(name = "NumTiers")
    private long numTiers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_DMRI")
    private int idbudDmri;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Motif")
    private String motif;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ntiersup")
    private long ntiersup;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public BudLiquidationsup() {
    }

    public BudLiquidationsup(Integer iDBUDLiquidation) {
        this.iDBUDLiquidation = iDBUDLiquidation;
    }

    public BudLiquidationsup(Integer iDBUDLiquidation, String numeroCB, String numero, BigDecimal montant, short etape, Date dateMandat, String numeroMandat, int iDBUDEngagement, Date dateOP, Date dateAC, String numeroAC, BigDecimal cumulRetenues, String numeroOP, Date dateSaisie, Date dateVisaCG, Date dateVisaDG, short etatValidation, Date dateVisaSAGE, long numTiers, int idbudDmri, BigDecimal cumulOP, String codejnl, short niveau, int niveauPrecedent, String objetdepense, String login, short dmri, String numeroCompte, short precompteTva, int iDEtablissementFinancier, String agence, String libop, String motif, long ntiersup) {
        this.iDBUDLiquidation = iDBUDLiquidation;
        this.numeroCB = numeroCB;
        this.numero = numero;
        this.montant = montant;
        this.etape = etape;
        this.dateMandat = dateMandat;
        this.numeroMandat = numeroMandat;
        this.iDBUDEngagement = iDBUDEngagement;
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
        this.numTiers = numTiers;
        this.idbudDmri = idbudDmri;
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
        this.motif = motif;
        this.ntiersup = ntiersup;
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

    public int getIDBUDEngagement() {
        return iDBUDEngagement;
    }

    public void setIDBUDEngagement(int iDBUDEngagement) {
        this.iDBUDEngagement = iDBUDEngagement;
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

    public long getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(long numTiers) {
        this.numTiers = numTiers;
    }

    public int getIdbudDmri() {
        return idbudDmri;
    }

    public void setIdbudDmri(int idbudDmri) {
        this.idbudDmri = idbudDmri;
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

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public long getNtiersup() {
        return ntiersup;
    }

    public void setNtiersup(long ntiersup) {
        this.ntiersup = ntiersup;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
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
        if (!(object instanceof BudLiquidationsup)) {
            return false;
        }
        BudLiquidationsup other = (BudLiquidationsup) object;
        if ((this.iDBUDLiquidation == null && other.iDBUDLiquidation != null) || (this.iDBUDLiquidation != null && !this.iDBUDLiquidation.equals(other.iDBUDLiquidation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.BudLiquidationsup[ iDBUDLiquidation=" + iDBUDLiquidation + " ]";
    }
    
}
