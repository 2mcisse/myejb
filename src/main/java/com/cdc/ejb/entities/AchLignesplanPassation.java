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
@Table(name = "ach_lignesplan_passation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AchLignesplanPassation.findAll", query = "SELECT a FROM AchLignesplanPassation a")
    , @NamedQuery(name = "AchLignesplanPassation.findByIdachLignesplanPassation", query = "SELECT a FROM AchLignesplanPassation a WHERE a.idachLignesplanPassation = :idachLignesplanPassation")
    , @NamedQuery(name = "AchLignesplanPassation.findByDateLancement", query = "SELECT a FROM AchLignesplanPassation a WHERE a.dateLancement = :dateLancement")
    , @NamedQuery(name = "AchLignesplanPassation.findByDureeEstimee", query = "SELECT a FROM AchLignesplanPassation a WHERE a.dureeEstimee = :dureeEstimee")
    , @NamedQuery(name = "AchLignesplanPassation.findByMontantEstime", query = "SELECT a FROM AchLignesplanPassation a WHERE a.montantEstime = :montantEstime")
    , @NamedQuery(name = "AchLignesplanPassation.findByObjetMarche", query = "SELECT a FROM AchLignesplanPassation a WHERE a.objetMarche = :objetMarche")
    , @NamedQuery(name = "AchLignesplanPassation.findByMarche", query = "SELECT a FROM AchLignesplanPassation a WHERE a.marche = :marche")
    , @NamedQuery(name = "AchLignesplanPassation.findByIDBUDBudget", query = "SELECT a FROM AchLignesplanPassation a WHERE a.iDBUDBudget = :iDBUDBudget")
    , @NamedQuery(name = "AchLignesplanPassation.findByRefefence", query = "SELECT a FROM AchLignesplanPassation a WHERE a.refefence = :refefence")
    , @NamedQuery(name = "AchLignesplanPassation.findByDateAttribution", query = "SELECT a FROM AchLignesplanPassation a WHERE a.dateAttribution = :dateAttribution")
    , @NamedQuery(name = "AchLignesplanPassation.findByDateDemarrage", query = "SELECT a FROM AchLignesplanPassation a WHERE a.dateDemarrage = :dateDemarrage")
    , @NamedQuery(name = "AchLignesplanPassation.findByDateDachevement", query = "SELECT a FROM AchLignesplanPassation a WHERE a.dateDachevement = :dateDachevement")
    , @NamedQuery(name = "AchLignesplanPassation.findByGestion", query = "SELECT a FROM AchLignesplanPassation a WHERE a.gestion = :gestion")})
public class AchLignesplanPassation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACH_LIGNESPLAN_PASSATION")
    private Integer idachLignesplanPassation;
    @Column(name = "DateLancement")
    @Temporal(TemporalType.DATE)
    private Date dateLancement;
    @Column(name = "DureeEstimee")
    private Integer dureeEstimee;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MontantEstime")
    private BigDecimal montantEstime;
    @Size(max = 150)
    @Column(name = "ObjetMarche")
    private String objetMarche;
    @Column(name = "Marche")
    private Short marche;
    @Column(name = "IDBUD_Budget")
    private Integer iDBUDBudget;
    @Size(max = 100)
    @Column(name = "REFEFENCE")
    private String refefence;
    @Column(name = "DateAttribution")
    @Temporal(TemporalType.DATE)
    private Date dateAttribution;
    @Column(name = "DateDemarrage")
    @Temporal(TemporalType.DATE)
    private Date dateDemarrage;
    @Column(name = "DateDachevement")
    @Temporal(TemporalType.DATE)
    private Date dateDachevement;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idachLignesplanPassation")
    private List<AchMarches> achMarchesList;
    @JoinColumn(name = "IDPLAN_PASSATION", referencedColumnName = "IDPLAN_PASSATION")
    @ManyToOne
    private AchPlanPassation idplanPassation;
    @JoinColumn(name = "IDSERVICES", referencedColumnName = "IDSERVICES")
    @ManyToOne
    private Services idservices;
    @JoinColumn(name = "IDType", referencedColumnName = "IDType")
    @ManyToOne
    private AchTypemarche iDType;
    @JoinColumn(name = "IDNATURE_MARCHE", referencedColumnName = "IDNATURE_MARCHE")
    @ManyToOne
    private AchNatureMarche idnatureMarche;

    public AchLignesplanPassation() {
    }

    public AchLignesplanPassation(Integer idachLignesplanPassation) {
        this.idachLignesplanPassation = idachLignesplanPassation;
    }

    public Integer getIdachLignesplanPassation() {
        return idachLignesplanPassation;
    }

    public void setIdachLignesplanPassation(Integer idachLignesplanPassation) {
        this.idachLignesplanPassation = idachLignesplanPassation;
    }

    public Date getDateLancement() {
        return dateLancement;
    }

    public void setDateLancement(Date dateLancement) {
        this.dateLancement = dateLancement;
    }

    public Integer getDureeEstimee() {
        return dureeEstimee;
    }

    public void setDureeEstimee(Integer dureeEstimee) {
        this.dureeEstimee = dureeEstimee;
    }

    public BigDecimal getMontantEstime() {
        return montantEstime;
    }

    public void setMontantEstime(BigDecimal montantEstime) {
        this.montantEstime = montantEstime;
    }

    public String getObjetMarche() {
        return objetMarche;
    }

    public void setObjetMarche(String objetMarche) {
        this.objetMarche = objetMarche;
    }

    public Short getMarche() {
        return marche;
    }

    public void setMarche(Short marche) {
        this.marche = marche;
    }

    public Integer getIDBUDBudget() {
        return iDBUDBudget;
    }

    public void setIDBUDBudget(Integer iDBUDBudget) {
        this.iDBUDBudget = iDBUDBudget;
    }

    public String getRefefence() {
        return refefence;
    }

    public void setRefefence(String refefence) {
        this.refefence = refefence;
    }

    public Date getDateAttribution() {
        return dateAttribution;
    }

    public void setDateAttribution(Date dateAttribution) {
        this.dateAttribution = dateAttribution;
    }

    public Date getDateDemarrage() {
        return dateDemarrage;
    }

    public void setDateDemarrage(Date dateDemarrage) {
        this.dateDemarrage = dateDemarrage;
    }

    public Date getDateDachevement() {
        return dateDachevement;
    }

    public void setDateDachevement(Date dateDachevement) {
        this.dateDachevement = dateDachevement;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<AchMarches> getAchMarchesList() {
        return achMarchesList;
    }

    public void setAchMarchesList(List<AchMarches> achMarchesList) {
        this.achMarchesList = achMarchesList;
    }

    public AchPlanPassation getIdplanPassation() {
        return idplanPassation;
    }

    public void setIdplanPassation(AchPlanPassation idplanPassation) {
        this.idplanPassation = idplanPassation;
    }

    public Services getIdservices() {
        return idservices;
    }

    public void setIdservices(Services idservices) {
        this.idservices = idservices;
    }

    public AchTypemarche getIDType() {
        return iDType;
    }

    public void setIDType(AchTypemarche iDType) {
        this.iDType = iDType;
    }

    public AchNatureMarche getIdnatureMarche() {
        return idnatureMarche;
    }

    public void setIdnatureMarche(AchNatureMarche idnatureMarche) {
        this.idnatureMarche = idnatureMarche;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idachLignesplanPassation != null ? idachLignesplanPassation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AchLignesplanPassation)) {
            return false;
        }
        AchLignesplanPassation other = (AchLignesplanPassation) object;
        if ((this.idachLignesplanPassation == null && other.idachLignesplanPassation != null) || (this.idachLignesplanPassation != null && !this.idachLignesplanPassation.equals(other.idachLignesplanPassation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.AchLignesplanPassation[ idachLignesplanPassation=" + idachLignesplanPassation + " ]";
    }
    
}
