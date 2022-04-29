/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "ach_plan_passation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AchPlanPassation.findAll", query = "SELECT a FROM AchPlanPassation a")
    , @NamedQuery(name = "AchPlanPassation.findByIdplanPassation", query = "SELECT a FROM AchPlanPassation a WHERE a.idplanPassation = :idplanPassation")
    , @NamedQuery(name = "AchPlanPassation.findByNumeroCaisse", query = "SELECT a FROM AchPlanPassation a WHERE a.numeroCaisse = :numeroCaisse")
    , @NamedQuery(name = "AchPlanPassation.findByGestion", query = "SELECT a FROM AchPlanPassation a WHERE a.gestion = :gestion")
    , @NamedQuery(name = "AchPlanPassation.findByDateDCMP", query = "SELECT a FROM AchPlanPassation a WHERE a.dateDCMP = :dateDCMP")})
public class AchPlanPassation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPLAN_PASSATION")
    private Integer idplanPassation;
    @Size(max = 50)
    @Column(name = "NumeroCaisse")
    private String numeroCaisse;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @Column(name = "Date_DCMP")
    @Temporal(TemporalType.DATE)
    private Date dateDCMP;
    @OneToMany(mappedBy = "idplanPassation")
    private List<AchLignesplanPassation> achLignesplanPassationList;

    public AchPlanPassation() {
    }

    public AchPlanPassation(Integer idplanPassation) {
        this.idplanPassation = idplanPassation;
    }

    public Integer getIdplanPassation() {
        return idplanPassation;
    }

    public void setIdplanPassation(Integer idplanPassation) {
        this.idplanPassation = idplanPassation;
    }

    public String getNumeroCaisse() {
        return numeroCaisse;
    }

    public void setNumeroCaisse(String numeroCaisse) {
        this.numeroCaisse = numeroCaisse;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Date getDateDCMP() {
        return dateDCMP;
    }

    public void setDateDCMP(Date dateDCMP) {
        this.dateDCMP = dateDCMP;
    }

    @XmlTransient
    public List<AchLignesplanPassation> getAchLignesplanPassationList() {
        return achLignesplanPassationList;
    }

    public void setAchLignesplanPassationList(List<AchLignesplanPassation> achLignesplanPassationList) {
        this.achLignesplanPassationList = achLignesplanPassationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idplanPassation != null ? idplanPassation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AchPlanPassation)) {
            return false;
        }
        AchPlanPassation other = (AchPlanPassation) object;
        if ((this.idplanPassation == null && other.idplanPassation != null) || (this.idplanPassation != null && !this.idplanPassation.equals(other.idplanPassation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.AchPlanPassation[ idplanPassation=" + idplanPassation + " ]";
    }
    
}
