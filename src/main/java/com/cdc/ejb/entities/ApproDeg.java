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
@Table(name = "appro_deg")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApproDeg.findAll", query = "SELECT a FROM ApproDeg a")
    , @NamedQuery(name = "ApproDeg.findByIdapproDeg", query = "SELECT a FROM ApproDeg a WHERE a.idapproDeg = :idapproDeg")
    , @NamedQuery(name = "ApproDeg.findByDateOP", query = "SELECT a FROM ApproDeg a WHERE a.dateOP = :dateOP")
    , @NamedQuery(name = "ApproDeg.findByMontant", query = "SELECT a FROM ApproDeg a WHERE a.montant = :montant")
    , @NamedQuery(name = "ApproDeg.findByTypeOP", query = "SELECT a FROM ApproDeg a WHERE a.typeOP = :typeOP")
    , @NamedQuery(name = "ApproDeg.findByIDEtablissementFinancierC", query = "SELECT a FROM ApproDeg a WHERE a.iDEtablissementFinancierC = :iDEtablissementFinancierC")
    , @NamedQuery(name = "ApproDeg.findByIDEtablissementFinancierBQ", query = "SELECT a FROM ApproDeg a WHERE a.iDEtablissementFinancierBQ = :iDEtablissementFinancierBQ")
    , @NamedQuery(name = "ApproDeg.findByCptC", query = "SELECT a FROM ApproDeg a WHERE a.cptC = :cptC")
    , @NamedQuery(name = "ApproDeg.findByCPtBQ", query = "SELECT a FROM ApproDeg a WHERE a.cPtBQ = :cPtBQ")
    , @NamedQuery(name = "ApproDeg.findByCptvirement", query = "SELECT a FROM ApproDeg a WHERE a.cptvirement = :cptvirement")
    , @NamedQuery(name = "ApproDeg.findByCODEJNLDEpart", query = "SELECT a FROM ApproDeg a WHERE a.cODEJNLDEpart = :cODEJNLDEpart")
    , @NamedQuery(name = "ApproDeg.findByCODEJNLDEst", query = "SELECT a FROM ApproDeg a WHERE a.cODEJNLDEst = :cODEJNLDEst")
    , @NamedQuery(name = "ApproDeg.findByValider", query = "SELECT a FROM ApproDeg a WHERE a.valider = :valider")
    , @NamedQuery(name = "ApproDeg.findByTimbre", query = "SELECT a FROM ApproDeg a WHERE a.timbre = :timbre")
    , @NamedQuery(name = "ApproDeg.findByCptcreditTimbre", query = "SELECT a FROM ApproDeg a WHERE a.cptcreditTimbre = :cptcreditTimbre")
    , @NamedQuery(name = "ApproDeg.findByGestion", query = "SELECT a FROM ApproDeg a WHERE a.gestion = :gestion")})
public class ApproDeg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDAPPRO_DEG")
    private Integer idapproDeg;
    @Column(name = "DateOP")
    @Temporal(TemporalType.DATE)
    private Date dateOP;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Montant")
    private BigDecimal montant;
    @Column(name = "TypeOP")
    private Short typeOP;
    @Column(name = "IDEtablissementFinancierC")
    private Integer iDEtablissementFinancierC;
    @Column(name = "IDEtablissementFinancierBQ")
    private Integer iDEtablissementFinancierBQ;
    @Size(max = 50)
    @Column(name = "CPT_C")
    private String cptC;
    @Size(max = 50)
    @Column(name = "CPt_BQ")
    private String cPtBQ;
    @Size(max = 50)
    @Column(name = "CPTVIREMENT")
    private String cptvirement;
    @Size(max = 50)
    @Column(name = "CODEJNLDEpart")
    private String cODEJNLDEpart;
    @Size(max = 50)
    @Column(name = "CODEJNLDEst")
    private String cODEJNLDEst;
    @Column(name = "Valider")
    private Short valider;
    @Column(name = "Timbre")
    private BigDecimal timbre;
    @Size(max = 50)
    @Column(name = "CPTCREDIT_TIMBRE")
    private String cptcreditTimbre;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idapproDeg")
    private List<Mouvement> mouvementList;
    @JoinColumn(name = "NumeroCaisse", referencedColumnName = "NumeroCaisse")
    @ManyToOne
    private Caisses numeroCaisse;

    public ApproDeg() {
    }

    public ApproDeg(Integer idapproDeg) {
        this.idapproDeg = idapproDeg;
    }

    public Integer getIdapproDeg() {
        return idapproDeg;
    }

    public void setIdapproDeg(Integer idapproDeg) {
        this.idapproDeg = idapproDeg;
    }

    public Date getDateOP() {
        return dateOP;
    }

    public void setDateOP(Date dateOP) {
        this.dateOP = dateOP;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public Short getTypeOP() {
        return typeOP;
    }

    public void setTypeOP(Short typeOP) {
        this.typeOP = typeOP;
    }

    public Integer getIDEtablissementFinancierC() {
        return iDEtablissementFinancierC;
    }

    public void setIDEtablissementFinancierC(Integer iDEtablissementFinancierC) {
        this.iDEtablissementFinancierC = iDEtablissementFinancierC;
    }

    public Integer getIDEtablissementFinancierBQ() {
        return iDEtablissementFinancierBQ;
    }

    public void setIDEtablissementFinancierBQ(Integer iDEtablissementFinancierBQ) {
        this.iDEtablissementFinancierBQ = iDEtablissementFinancierBQ;
    }

    public String getCptC() {
        return cptC;
    }

    public void setCptC(String cptC) {
        this.cptC = cptC;
    }

    public String getCPtBQ() {
        return cPtBQ;
    }

    public void setCPtBQ(String cPtBQ) {
        this.cPtBQ = cPtBQ;
    }

    public String getCptvirement() {
        return cptvirement;
    }

    public void setCptvirement(String cptvirement) {
        this.cptvirement = cptvirement;
    }

    public String getCODEJNLDEpart() {
        return cODEJNLDEpart;
    }

    public void setCODEJNLDEpart(String cODEJNLDEpart) {
        this.cODEJNLDEpart = cODEJNLDEpart;
    }

    public String getCODEJNLDEst() {
        return cODEJNLDEst;
    }

    public void setCODEJNLDEst(String cODEJNLDEst) {
        this.cODEJNLDEst = cODEJNLDEst;
    }

    public Short getValider() {
        return valider;
    }

    public void setValider(Short valider) {
        this.valider = valider;
    }

    public BigDecimal getTimbre() {
        return timbre;
    }

    public void setTimbre(BigDecimal timbre) {
        this.timbre = timbre;
    }

    public String getCptcreditTimbre() {
        return cptcreditTimbre;
    }

    public void setCptcreditTimbre(String cptcreditTimbre) {
        this.cptcreditTimbre = cptcreditTimbre;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Mouvement> getMouvementList() {
        return mouvementList;
    }

    public void setMouvementList(List<Mouvement> mouvementList) {
        this.mouvementList = mouvementList;
    }

    public Caisses getNumeroCaisse() {
        return numeroCaisse;
    }

    public void setNumeroCaisse(Caisses numeroCaisse) {
        this.numeroCaisse = numeroCaisse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idapproDeg != null ? idapproDeg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApproDeg)) {
            return false;
        }
        ApproDeg other = (ApproDeg) object;
        if ((this.idapproDeg == null && other.idapproDeg != null) || (this.idapproDeg != null && !this.idapproDeg.equals(other.idapproDeg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.ApproDeg[ idapproDeg=" + idapproDeg + " ]";
    }
    
}
