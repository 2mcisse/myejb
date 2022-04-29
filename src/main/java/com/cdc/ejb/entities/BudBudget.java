/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "bud_budget")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BudBudget.findAll", query = "SELECT b FROM BudBudget b")
    , @NamedQuery(name = "BudBudget.findByIDBUDBudget", query = "SELECT b FROM BudBudget b WHERE b.iDBUDBudget = :iDBUDBudget")
    , @NamedQuery(name = "BudBudget.findByDotationBU", query = "SELECT b FROM BudBudget b WHERE b.dotationBU = :dotationBU")
    , @NamedQuery(name = "BudBudget.findByValideBU", query = "SELECT b FROM BudBudget b WHERE b.valideBU = :valideBU")
    , @NamedQuery(name = "BudBudget.findByDotTrim1", query = "SELECT b FROM BudBudget b WHERE b.dotTrim1 = :dotTrim1")
    , @NamedQuery(name = "BudBudget.findByDotTrim2", query = "SELECT b FROM BudBudget b WHERE b.dotTrim2 = :dotTrim2")
    , @NamedQuery(name = "BudBudget.findByDotTrim3", query = "SELECT b FROM BudBudget b WHERE b.dotTrim3 = :dotTrim3")
    , @NamedQuery(name = "BudBudget.findByDotTrim4", query = "SELECT b FROM BudBudget b WHERE b.dotTrim4 = :dotTrim4")
    , @NamedQuery(name = "BudBudget.findByImputation", query = "SELECT b FROM BudBudget b WHERE b.imputation = :imputation")
    , @NamedQuery(name = "BudBudget.findByIntitule", query = "SELECT b FROM BudBudget b WHERE b.intitule = :intitule")
    , @NamedQuery(name = "BudBudget.findByDotation", query = "SELECT b FROM BudBudget b WHERE b.dotation = :dotation")
    , @NamedQuery(name = "BudBudget.findByReports", query = "SELECT b FROM BudBudget b WHERE b.reports = :reports")
    , @NamedQuery(name = "BudBudget.findByVirementsenmoins", query = "SELECT b FROM BudBudget b WHERE b.virementsenmoins = :virementsenmoins")
    , @NamedQuery(name = "BudBudget.findByVirementsenplus", query = "SELECT b FROM BudBudget b WHERE b.virementsenplus = :virementsenplus")
    , @NamedQuery(name = "BudBudget.findByEngagements", query = "SELECT b FROM BudBudget b WHERE b.engagements = :engagements")
    , @NamedQuery(name = "BudBudget.findByLiquidations", query = "SELECT b FROM BudBudget b WHERE b.liquidations = :liquidations")
    , @NamedQuery(name = "BudBudget.findByOrdonnancements", query = "SELECT b FROM BudBudget b WHERE b.ordonnancements = :ordonnancements")
    , @NamedQuery(name = "BudBudget.findByPrisesEnCharge", query = "SELECT b FROM BudBudget b WHERE b.prisesEnCharge = :prisesEnCharge")
    , @NamedQuery(name = "BudBudget.findByMisesEnReglement", query = "SELECT b FROM BudBudget b WHERE b.misesEnReglement = :misesEnReglement")
    , @NamedQuery(name = "BudBudget.findByReglements", query = "SELECT b FROM BudBudget b WHERE b.reglements = :reglements")
    , @NamedQuery(name = "BudBudget.findByAnnulations", query = "SELECT b FROM BudBudget b WHERE b.annulations = :annulations")
    , @NamedQuery(name = "BudBudget.findByTypeBudget", query = "SELECT b FROM BudBudget b WHERE b.typeBudget = :typeBudget")
    , @NamedQuery(name = "BudBudget.findBySection", query = "SELECT b FROM BudBudget b WHERE b.section = :section")
    , @NamedQuery(name = "BudBudget.findByCode", query = "SELECT b FROM BudBudget b WHERE b.code = :code")
    , @NamedQuery(name = "BudBudget.findByGestion", query = "SELECT b FROM BudBudget b WHERE b.gestion = :gestion")})
public class BudBudget implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_Budget")
    private Integer iDBUDBudget;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "DotationBU")
    private BigDecimal dotationBU;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ValideBU")
    private int valideBU;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dotTrim1")
    private BigDecimal dotTrim1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dotTrim2")
    private BigDecimal dotTrim2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dotTrim3")
    private BigDecimal dotTrim3;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dotTrim4")
    private BigDecimal dotTrim4;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Imputation")
    private String imputation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "intitule")
    private String intitule;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Dotation")
    private BigDecimal dotation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Reports")
    private BigDecimal reports;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Virements_en_moins")
    private BigDecimal virementsenmoins;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Virements_en_plus")
    private BigDecimal virementsenplus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Engagements")
    private BigDecimal engagements;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Liquidations")
    private BigDecimal liquidations;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ordonnancements")
    private BigDecimal ordonnancements;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PrisesEnCharge")
    private BigDecimal prisesEnCharge;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MisesEnReglement")
    private BigDecimal misesEnReglement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Reglements")
    private BigDecimal reglements;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Annulations")
    private BigDecimal annulations;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TypeBudget")
    private short typeBudget;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Section")
    private short section;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "code")
    private String code;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDBUD_A", referencedColumnName = "IDBUD_A")
    @ManyToOne(optional = false)
    private BudA idbudA;
    @JoinColumn(name = "IDBUD_B", referencedColumnName = "IDBUD_B")
    @ManyToOne(optional = false)
    private BudB idbudB;
    @JoinColumn(name = "NumeroCompte", referencedColumnName = "NumeroCompte")
    @ManyToOne(optional = false)
    private Compte numeroCompte;
    @JoinColumn(name = "IDBUD_C", referencedColumnName = "IDBUD_C")
    @ManyToOne(optional = false)
    private BudC idbudC;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDBUDBudget")
    private List<BudDmri> budDmriList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDBUDBudget")
    private List<BudMvtbud> budMvtbudList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDBUDBudget")
    private List<BudEngagementannule> budEngagementannuleList;
    @OneToMany(mappedBy = "iDBUDBudget")
    private List<Ordresdepaiement> ordresdepaiementList;

    public BudBudget() {
    }

    public BudBudget(Integer iDBUDBudget) {
        this.iDBUDBudget = iDBUDBudget;
    }

    public BudBudget(Integer iDBUDBudget, BigDecimal dotationBU, int valideBU, BigDecimal dotTrim1, BigDecimal dotTrim2, BigDecimal dotTrim3, BigDecimal dotTrim4, String imputation, String intitule, BigDecimal dotation, BigDecimal reports, BigDecimal virementsenmoins, BigDecimal virementsenplus, BigDecimal engagements, BigDecimal liquidations, BigDecimal ordonnancements, BigDecimal prisesEnCharge, BigDecimal misesEnReglement, BigDecimal reglements, BigDecimal annulations, short typeBudget, short section, String code) {
        this.iDBUDBudget = iDBUDBudget;
        this.dotationBU = dotationBU;
        this.valideBU = valideBU;
        this.dotTrim1 = dotTrim1;
        this.dotTrim2 = dotTrim2;
        this.dotTrim3 = dotTrim3;
        this.dotTrim4 = dotTrim4;
        this.imputation = imputation;
        this.intitule = intitule;
        this.dotation = dotation;
        this.reports = reports;
        this.virementsenmoins = virementsenmoins;
        this.virementsenplus = virementsenplus;
        this.engagements = engagements;
        this.liquidations = liquidations;
        this.ordonnancements = ordonnancements;
        this.prisesEnCharge = prisesEnCharge;
        this.misesEnReglement = misesEnReglement;
        this.reglements = reglements;
        this.annulations = annulations;
        this.typeBudget = typeBudget;
        this.section = section;
        this.code = code;
    }

    public Integer getIDBUDBudget() {
        return iDBUDBudget;
    }

    public void setIDBUDBudget(Integer iDBUDBudget) {
        this.iDBUDBudget = iDBUDBudget;
    }

    public BigDecimal getDotationBU() {
        return dotationBU;
    }

    public void setDotationBU(BigDecimal dotationBU) {
        this.dotationBU = dotationBU;
    }

    public int getValideBU() {
        return valideBU;
    }

    public void setValideBU(int valideBU) {
        this.valideBU = valideBU;
    }

    public BigDecimal getDotTrim1() {
        return dotTrim1;
    }

    public void setDotTrim1(BigDecimal dotTrim1) {
        this.dotTrim1 = dotTrim1;
    }

    public BigDecimal getDotTrim2() {
        return dotTrim2;
    }

    public void setDotTrim2(BigDecimal dotTrim2) {
        this.dotTrim2 = dotTrim2;
    }

    public BigDecimal getDotTrim3() {
        return dotTrim3;
    }

    public void setDotTrim3(BigDecimal dotTrim3) {
        this.dotTrim3 = dotTrim3;
    }

    public BigDecimal getDotTrim4() {
        return dotTrim4;
    }

    public void setDotTrim4(BigDecimal dotTrim4) {
        this.dotTrim4 = dotTrim4;
    }

    public String getImputation() {
        return imputation;
    }

    public void setImputation(String imputation) {
        this.imputation = imputation;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public BigDecimal getDotation() {
        return dotation;
    }

    public void setDotation(BigDecimal dotation) {
        this.dotation = dotation;
    }

    public BigDecimal getReports() {
        return reports;
    }

    public void setReports(BigDecimal reports) {
        this.reports = reports;
    }

    public BigDecimal getVirementsenmoins() {
        return virementsenmoins;
    }

    public void setVirementsenmoins(BigDecimal virementsenmoins) {
        this.virementsenmoins = virementsenmoins;
    }

    public BigDecimal getVirementsenplus() {
        return virementsenplus;
    }

    public void setVirementsenplus(BigDecimal virementsenplus) {
        this.virementsenplus = virementsenplus;
    }

    public BigDecimal getEngagements() {
        return engagements;
    }

    public void setEngagements(BigDecimal engagements) {
        this.engagements = engagements;
    }

    public BigDecimal getLiquidations() {
        return liquidations;
    }

    public void setLiquidations(BigDecimal liquidations) {
        this.liquidations = liquidations;
    }

    public BigDecimal getOrdonnancements() {
        return ordonnancements;
    }

    public void setOrdonnancements(BigDecimal ordonnancements) {
        this.ordonnancements = ordonnancements;
    }

    public BigDecimal getPrisesEnCharge() {
        return prisesEnCharge;
    }

    public void setPrisesEnCharge(BigDecimal prisesEnCharge) {
        this.prisesEnCharge = prisesEnCharge;
    }

    public BigDecimal getMisesEnReglement() {
        return misesEnReglement;
    }

    public void setMisesEnReglement(BigDecimal misesEnReglement) {
        this.misesEnReglement = misesEnReglement;
    }

    public BigDecimal getReglements() {
        return reglements;
    }

    public void setReglements(BigDecimal reglements) {
        this.reglements = reglements;
    }

    public BigDecimal getAnnulations() {
        return annulations;
    }

    public void setAnnulations(BigDecimal annulations) {
        this.annulations = annulations;
    }

    public short getTypeBudget() {
        return typeBudget;
    }

    public void setTypeBudget(short typeBudget) {
        this.typeBudget = typeBudget;
    }

    public short getSection() {
        return section;
    }

    public void setSection(short section) {
        this.section = section;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public BudA getIdbudA() {
        return idbudA;
    }

    public void setIdbudA(BudA idbudA) {
        this.idbudA = idbudA;
    }

    public BudB getIdbudB() {
        return idbudB;
    }

    public void setIdbudB(BudB idbudB) {
        this.idbudB = idbudB;
    }

    public Compte getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(Compte numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public BudC getIdbudC() {
        return idbudC;
    }

    public void setIdbudC(BudC idbudC) {
        this.idbudC = idbudC;
    }

    @XmlTransient
    public List<BudDmri> getBudDmriList() {
        return budDmriList;
    }

    public void setBudDmriList(List<BudDmri> budDmriList) {
        this.budDmriList = budDmriList;
    }

    @XmlTransient
    public List<BudMvtbud> getBudMvtbudList() {
        return budMvtbudList;
    }

    public void setBudMvtbudList(List<BudMvtbud> budMvtbudList) {
        this.budMvtbudList = budMvtbudList;
    }

    @XmlTransient
    public List<BudEngagementannule> getBudEngagementannuleList() {
        return budEngagementannuleList;
    }

    public void setBudEngagementannuleList(List<BudEngagementannule> budEngagementannuleList) {
        this.budEngagementannuleList = budEngagementannuleList;
    }

    @XmlTransient
    public List<Ordresdepaiement> getOrdresdepaiementList() {
        return ordresdepaiementList;
    }

    public void setOrdresdepaiementList(List<Ordresdepaiement> ordresdepaiementList) {
        this.ordresdepaiementList = ordresdepaiementList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDBUDBudget != null ? iDBUDBudget.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudBudget)) {
            return false;
        }
        BudBudget other = (BudBudget) object;
        if ((this.iDBUDBudget == null && other.iDBUDBudget != null) || (this.iDBUDBudget != null && !this.iDBUDBudget.equals(other.iDBUDBudget))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.BudBudget[ iDBUDBudget=" + iDBUDBudget + " ]";
    }
    
}
