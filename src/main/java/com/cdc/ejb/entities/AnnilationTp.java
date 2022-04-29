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
@Table(name = "annilation_tp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AnnilationTp.findAll", query = "SELECT a FROM AnnilationTp a")
    , @NamedQuery(name = "AnnilationTp.findByIdannilationTp", query = "SELECT a FROM AnnilationTp a WHERE a.idannilationTp = :idannilationTp")
    , @NamedQuery(name = "AnnilationTp.findByNumAnnulTP", query = "SELECT a FROM AnnilationTp a WHERE a.numAnnulTP = :numAnnulTP")
    , @NamedQuery(name = "AnnilationTp.findByDateAnnul", query = "SELECT a FROM AnnilationTp a WHERE a.dateAnnul = :dateAnnul")
    , @NamedQuery(name = "AnnilationTp.findByMotif", query = "SELECT a FROM AnnilationTp a WHERE a.motif = :motif")
    , @NamedQuery(name = "AnnilationTp.findByIDDECTitreDePerception", query = "SELECT a FROM AnnilationTp a WHERE a.iDDECTitreDePerception = :iDDECTitreDePerception")
    , @NamedQuery(name = "AnnilationTp.findByMontant", query = "SELECT a FROM AnnilationTp a WHERE a.montant = :montant")
    , @NamedQuery(name = "AnnilationTp.findByGestion", query = "SELECT a FROM AnnilationTp a WHERE a.gestion = :gestion")})
public class AnnilationTp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDANNILATION_TP")
    private Long idannilationTp;
    @Size(max = 50)
    @Column(name = "Num_AnnulTP")
    private String numAnnulTP;
    @Column(name = "DateAnnul")
    @Temporal(TemporalType.DATE)
    private Date dateAnnul;
    @Size(max = 150)
    @Column(name = "Motif")
    private String motif;
    @Column(name = "IDDEC_TitreDePerception")
    private Integer iDDECTitreDePerception;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT")
    private BigDecimal montant;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public AnnilationTp() {
    }

    public AnnilationTp(Long idannilationTp) {
        this.idannilationTp = idannilationTp;
    }

    public Long getIdannilationTp() {
        return idannilationTp;
    }

    public void setIdannilationTp(Long idannilationTp) {
        this.idannilationTp = idannilationTp;
    }

    public String getNumAnnulTP() {
        return numAnnulTP;
    }

    public void setNumAnnulTP(String numAnnulTP) {
        this.numAnnulTP = numAnnulTP;
    }

    public Date getDateAnnul() {
        return dateAnnul;
    }

    public void setDateAnnul(Date dateAnnul) {
        this.dateAnnul = dateAnnul;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Integer getIDDECTitreDePerception() {
        return iDDECTitreDePerception;
    }

    public void setIDDECTitreDePerception(Integer iDDECTitreDePerception) {
        this.iDDECTitreDePerception = iDDECTitreDePerception;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
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
        hash += (idannilationTp != null ? idannilationTp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnnilationTp)) {
            return false;
        }
        AnnilationTp other = (AnnilationTp) object;
        if ((this.idannilationTp == null && other.idannilationTp != null) || (this.idannilationTp != null && !this.idannilationTp.equals(other.idannilationTp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.AnnilationTp[ idannilationTp=" + idannilationTp + " ]";
    }
    
}
