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
@Table(name = "bud_dmri")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BudDmri.findAll", query = "SELECT b FROM BudDmri b")
    , @NamedQuery(name = "BudDmri.findByIdbudDmri", query = "SELECT b FROM BudDmri b WHERE b.idbudDmri = :idbudDmri")
    , @NamedQuery(name = "BudDmri.findByNumeroCB", query = "SELECT b FROM BudDmri b WHERE b.numeroCB = :numeroCB")
    , @NamedQuery(name = "BudDmri.findByNumero", query = "SELECT b FROM BudDmri b WHERE b.numero = :numero")
    , @NamedQuery(name = "BudDmri.findByMontant", query = "SELECT b FROM BudDmri b WHERE b.montant = :montant")
    , @NamedQuery(name = "BudDmri.findByEtape", query = "SELECT b FROM BudDmri b WHERE b.etape = :etape")
    , @NamedQuery(name = "BudDmri.findByDateMandat", query = "SELECT b FROM BudDmri b WHERE b.dateMandat = :dateMandat")
    , @NamedQuery(name = "BudDmri.findByNumeroMandat", query = "SELECT b FROM BudDmri b WHERE b.numeroMandat = :numeroMandat")
    , @NamedQuery(name = "BudDmri.findByIDBUDEngagement", query = "SELECT b FROM BudDmri b WHERE b.iDBUDEngagement = :iDBUDEngagement")
    , @NamedQuery(name = "BudDmri.findByDateOP", query = "SELECT b FROM BudDmri b WHERE b.dateOP = :dateOP")
    , @NamedQuery(name = "BudDmri.findByDateAC", query = "SELECT b FROM BudDmri b WHERE b.dateAC = :dateAC")
    , @NamedQuery(name = "BudDmri.findByNumeroAC", query = "SELECT b FROM BudDmri b WHERE b.numeroAC = :numeroAC")
    , @NamedQuery(name = "BudDmri.findByCumulRetenues", query = "SELECT b FROM BudDmri b WHERE b.cumulRetenues = :cumulRetenues")
    , @NamedQuery(name = "BudDmri.findByNumeroOP", query = "SELECT b FROM BudDmri b WHERE b.numeroOP = :numeroOP")
    , @NamedQuery(name = "BudDmri.findByDateSaisie", query = "SELECT b FROM BudDmri b WHERE b.dateSaisie = :dateSaisie")
    , @NamedQuery(name = "BudDmri.findByDateVisaCG", query = "SELECT b FROM BudDmri b WHERE b.dateVisaCG = :dateVisaCG")
    , @NamedQuery(name = "BudDmri.findByDateVisaDG", query = "SELECT b FROM BudDmri b WHERE b.dateVisaDG = :dateVisaDG")
    , @NamedQuery(name = "BudDmri.findByEtatValidation", query = "SELECT b FROM BudDmri b WHERE b.etatValidation = :etatValidation")
    , @NamedQuery(name = "BudDmri.findByDateVisaSAGE", query = "SELECT b FROM BudDmri b WHERE b.dateVisaSAGE = :dateVisaSAGE")
    , @NamedQuery(name = "BudDmri.findByNumTiers", query = "SELECT b FROM BudDmri b WHERE b.numTiers = :numTiers")
    , @NamedQuery(name = "BudDmri.findByNiveau", query = "SELECT b FROM BudDmri b WHERE b.niveau = :niveau")
    , @NamedQuery(name = "BudDmri.findByNiveauPrecedent", query = "SELECT b FROM BudDmri b WHERE b.niveauPrecedent = :niveauPrecedent")
    , @NamedQuery(name = "BudDmri.findByGestion", query = "SELECT b FROM BudDmri b WHERE b.gestion = :gestion")})
public class BudDmri implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_DMRI")
    private Integer idbudDmri;
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
    @Column(name = "Niveau")
    private short niveau;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NiveauPrecedent")
    private int niveauPrecedent;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDBUD_Budget", referencedColumnName = "IDBUD_Budget")
    @ManyToOne(optional = false)
    private BudBudget iDBUDBudget;
    @OneToMany(mappedBy = "idbudDmri")
    private List<Ordresdepaiement> ordresdepaiementList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idbudDmri")
    private List<BudLiquidation> budLiquidationList;

    public BudDmri() {
    }

    public BudDmri(Integer idbudDmri) {
        this.idbudDmri = idbudDmri;
    }

    public BudDmri(Integer idbudDmri, String numeroCB, String numero, BigDecimal montant, short etape, Date dateMandat, String numeroMandat, int iDBUDEngagement, Date dateOP, Date dateAC, String numeroAC, BigDecimal cumulRetenues, String numeroOP, Date dateSaisie, Date dateVisaCG, Date dateVisaDG, short etatValidation, Date dateVisaSAGE, long numTiers, short niveau, int niveauPrecedent) {
        this.idbudDmri = idbudDmri;
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
        this.niveau = niveau;
        this.niveauPrecedent = niveauPrecedent;
    }

    public Integer getIdbudDmri() {
        return idbudDmri;
    }

    public void setIdbudDmri(Integer idbudDmri) {
        this.idbudDmri = idbudDmri;
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

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public BudBudget getIDBUDBudget() {
        return iDBUDBudget;
    }

    public void setIDBUDBudget(BudBudget iDBUDBudget) {
        this.iDBUDBudget = iDBUDBudget;
    }

    @XmlTransient
    public List<Ordresdepaiement> getOrdresdepaiementList() {
        return ordresdepaiementList;
    }

    public void setOrdresdepaiementList(List<Ordresdepaiement> ordresdepaiementList) {
        this.ordresdepaiementList = ordresdepaiementList;
    }

    @XmlTransient
    public List<BudLiquidation> getBudLiquidationList() {
        return budLiquidationList;
    }

    public void setBudLiquidationList(List<BudLiquidation> budLiquidationList) {
        this.budLiquidationList = budLiquidationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbudDmri != null ? idbudDmri.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudDmri)) {
            return false;
        }
        BudDmri other = (BudDmri) object;
        if ((this.idbudDmri == null && other.idbudDmri != null) || (this.idbudDmri != null && !this.idbudDmri.equals(other.idbudDmri))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.BudDmri[ idbudDmri=" + idbudDmri + " ]";
    }
    
}
