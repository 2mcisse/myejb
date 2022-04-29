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
@Table(name = "mouvement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mouvement.findAll", query = "SELECT m FROM Mouvement m")
    , @NamedQuery(name = "Mouvement.findByIDMouvement", query = "SELECT m FROM Mouvement m WHERE m.iDMouvement = :iDMouvement")
    , @NamedQuery(name = "Mouvement.findByDateMouvement", query = "SELECT m FROM Mouvement m WHERE m.dateMouvement = :dateMouvement")
    , @NamedQuery(name = "Mouvement.findByTotalDebitMouvement", query = "SELECT m FROM Mouvement m WHERE m.totalDebitMouvement = :totalDebitMouvement")
    , @NamedQuery(name = "Mouvement.findByTotalCreditMouvement", query = "SELECT m FROM Mouvement m WHERE m.totalCreditMouvement = :totalCreditMouvement")
    , @NamedQuery(name = "Mouvement.findByAmodifier", query = "SELECT m FROM Mouvement m WHERE m.amodifier = :amodifier")
    , @NamedQuery(name = "Mouvement.findByNumOR", query = "SELECT m FROM Mouvement m WHERE m.numOR = :numOR")
    , @NamedQuery(name = "Mouvement.findByNumeroTitre", query = "SELECT m FROM Mouvement m WHERE m.numeroTitre = :numeroTitre")
    , @NamedQuery(name = "Mouvement.findByIDBUDLiquidation", query = "SELECT m FROM Mouvement m WHERE m.iDBUDLiquidation = :iDBUDLiquidation")
    , @NamedQuery(name = "Mouvement.findByIDOrdresDePaiement", query = "SELECT m FROM Mouvement m WHERE m.iDOrdresDePaiement = :iDOrdresDePaiement")
    , @NamedQuery(name = "Mouvement.findByIDDECAutorisationDeRestitution", query = "SELECT m FROM Mouvement m WHERE m.iDDECAutorisationDeRestitution = :iDDECAutorisationDeRestitution")
    , @NamedQuery(name = "Mouvement.findByIDDECTitreDePerception", query = "SELECT m FROM Mouvement m WHERE m.iDDECTitreDePerception = :iDDECTitreDePerception")
    , @NamedQuery(name = "Mouvement.findByLibop", query = "SELECT m FROM Mouvement m WHERE m.libop = :libop")
    , @NamedQuery(name = "Mouvement.findByValider", query = "SELECT m FROM Mouvement m WHERE m.valider = :valider")
    , @NamedQuery(name = "Mouvement.findByLettrage", query = "SELECT m FROM Mouvement m WHERE m.lettrage = :lettrage")
    , @NamedQuery(name = "Mouvement.findByGestion", query = "SELECT m FROM Mouvement m WHERE m.gestion = :gestion")})
public class Mouvement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMouvement")
    private Long iDMouvement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateMouvement")
    @Temporal(TemporalType.DATE)
    private Date dateMouvement;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "TotalDebitMouvement")
    private BigDecimal totalDebitMouvement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TotalCreditMouvement")
    private BigDecimal totalCreditMouvement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Amodifier")
    private short amodifier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumOR")
    private String numOR;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroTitre")
    private String numeroTitre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_Liquidation")
    private int iDBUDLiquidation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDOrdresDePaiement")
    private int iDOrdresDePaiement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_AutorisationDeRestitution")
    private int iDDECAutorisationDeRestitution;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_TitreDePerception")
    private int iDDECTitreDePerception;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "LIBOP")
    private String libop;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Valider")
    private short valider;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Lettrage")
    private String lettrage;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDMouvement")
    private List<Ligneecriture> ligneecritureList;
    @JoinColumn(name = "CODE_DEC", referencedColumnName = "CODE_DEC")
    @ManyToOne(optional = false)
    private Decaissements codeDec;
    @JoinColumn(name = "CODE_ENC", referencedColumnName = "CODE_ENC")
    @ManyToOne(optional = false)
    private Encaissements codeEnc;
    @JoinColumn(name = "CODEJNL", referencedColumnName = "CODEJNL")
    @ManyToOne(optional = false)
    private Journal codejnl;
    @JoinColumn(name = "IDAPPRO_DEG", referencedColumnName = "IDAPPRO_DEG")
    @ManyToOne(optional = false)
    private ApproDeg idapproDeg;

    public Mouvement() {
    }

    public Mouvement(Long iDMouvement) {
        this.iDMouvement = iDMouvement;
    }

    public Mouvement(Long iDMouvement, Date dateMouvement, BigDecimal totalDebitMouvement, BigDecimal totalCreditMouvement, short amodifier, String numOR, String numeroTitre, int iDBUDLiquidation, int iDOrdresDePaiement, int iDDECAutorisationDeRestitution, int iDDECTitreDePerception, String libop, short valider, String lettrage) {
        this.iDMouvement = iDMouvement;
        this.dateMouvement = dateMouvement;
        this.totalDebitMouvement = totalDebitMouvement;
        this.totalCreditMouvement = totalCreditMouvement;
        this.amodifier = amodifier;
        this.numOR = numOR;
        this.numeroTitre = numeroTitre;
        this.iDBUDLiquidation = iDBUDLiquidation;
        this.iDOrdresDePaiement = iDOrdresDePaiement;
        this.iDDECAutorisationDeRestitution = iDDECAutorisationDeRestitution;
        this.iDDECTitreDePerception = iDDECTitreDePerception;
        this.libop = libop;
        this.valider = valider;
        this.lettrage = lettrage;
    }

    public Long getIDMouvement() {
        return iDMouvement;
    }

    public void setIDMouvement(Long iDMouvement) {
        this.iDMouvement = iDMouvement;
    }

    public Date getDateMouvement() {
        return dateMouvement;
    }

    public void setDateMouvement(Date dateMouvement) {
        this.dateMouvement = dateMouvement;
    }

    public BigDecimal getTotalDebitMouvement() {
        return totalDebitMouvement;
    }

    public void setTotalDebitMouvement(BigDecimal totalDebitMouvement) {
        this.totalDebitMouvement = totalDebitMouvement;
    }

    public BigDecimal getTotalCreditMouvement() {
        return totalCreditMouvement;
    }

    public void setTotalCreditMouvement(BigDecimal totalCreditMouvement) {
        this.totalCreditMouvement = totalCreditMouvement;
    }

    public short getAmodifier() {
        return amodifier;
    }

    public void setAmodifier(short amodifier) {
        this.amodifier = amodifier;
    }

    public String getNumOR() {
        return numOR;
    }

    public void setNumOR(String numOR) {
        this.numOR = numOR;
    }

    public String getNumeroTitre() {
        return numeroTitre;
    }

    public void setNumeroTitre(String numeroTitre) {
        this.numeroTitre = numeroTitre;
    }

    public int getIDBUDLiquidation() {
        return iDBUDLiquidation;
    }

    public void setIDBUDLiquidation(int iDBUDLiquidation) {
        this.iDBUDLiquidation = iDBUDLiquidation;
    }

    public int getIDOrdresDePaiement() {
        return iDOrdresDePaiement;
    }

    public void setIDOrdresDePaiement(int iDOrdresDePaiement) {
        this.iDOrdresDePaiement = iDOrdresDePaiement;
    }

    public int getIDDECAutorisationDeRestitution() {
        return iDDECAutorisationDeRestitution;
    }

    public void setIDDECAutorisationDeRestitution(int iDDECAutorisationDeRestitution) {
        this.iDDECAutorisationDeRestitution = iDDECAutorisationDeRestitution;
    }

    public int getIDDECTitreDePerception() {
        return iDDECTitreDePerception;
    }

    public void setIDDECTitreDePerception(int iDDECTitreDePerception) {
        this.iDDECTitreDePerception = iDDECTitreDePerception;
    }

    public String getLibop() {
        return libop;
    }

    public void setLibop(String libop) {
        this.libop = libop;
    }

    public short getValider() {
        return valider;
    }

    public void setValider(short valider) {
        this.valider = valider;
    }

    public String getLettrage() {
        return lettrage;
    }

    public void setLettrage(String lettrage) {
        this.lettrage = lettrage;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Ligneecriture> getLigneecritureList() {
        return ligneecritureList;
    }

    public void setLigneecritureList(List<Ligneecriture> ligneecritureList) {
        this.ligneecritureList = ligneecritureList;
    }

    public Decaissements getCodeDec() {
        return codeDec;
    }

    public void setCodeDec(Decaissements codeDec) {
        this.codeDec = codeDec;
    }

    public Encaissements getCodeEnc() {
        return codeEnc;
    }

    public void setCodeEnc(Encaissements codeEnc) {
        this.codeEnc = codeEnc;
    }

    public Journal getCodejnl() {
        return codejnl;
    }

    public void setCodejnl(Journal codejnl) {
        this.codejnl = codejnl;
    }

    public ApproDeg getIdapproDeg() {
        return idapproDeg;
    }

    public void setIdapproDeg(ApproDeg idapproDeg) {
        this.idapproDeg = idapproDeg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDMouvement != null ? iDMouvement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mouvement)) {
            return false;
        }
        Mouvement other = (Mouvement) object;
        if ((this.iDMouvement == null && other.iDMouvement != null) || (this.iDMouvement != null && !this.iDMouvement.equals(other.iDMouvement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Mouvement[ iDMouvement=" + iDMouvement + " ]";
    }
    
}
