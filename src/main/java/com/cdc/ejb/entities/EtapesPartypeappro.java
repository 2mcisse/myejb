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
@Table(name = "etapes_partypeappro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EtapesPartypeappro.findAll", query = "SELECT e FROM EtapesPartypeappro e")
    , @NamedQuery(name = "EtapesPartypeappro.findByIdetapes", query = "SELECT e FROM EtapesPartypeappro e WHERE e.idetapes = :idetapes")
    , @NamedQuery(name = "EtapesPartypeappro.findByMontantDebut", query = "SELECT e FROM EtapesPartypeappro e WHERE e.montantDebut = :montantDebut")
    , @NamedQuery(name = "EtapesPartypeappro.findByMontantFin", query = "SELECT e FROM EtapesPartypeappro e WHERE e.montantFin = :montantFin")
    , @NamedQuery(name = "EtapesPartypeappro.findByIDType", query = "SELECT e FROM EtapesPartypeappro e WHERE e.iDType = :iDType")
    , @NamedQuery(name = "EtapesPartypeappro.findByPhase", query = "SELECT e FROM EtapesPartypeappro e WHERE e.phase = :phase")
    , @NamedQuery(name = "EtapesPartypeappro.findByACopier", query = "SELECT e FROM EtapesPartypeappro e WHERE e.aCopier = :aCopier")
    , @NamedQuery(name = "EtapesPartypeappro.findByDestination", query = "SELECT e FROM EtapesPartypeappro e WHERE e.destination = :destination")
    , @NamedQuery(name = "EtapesPartypeappro.findByGestion", query = "SELECT e FROM EtapesPartypeappro e WHERE e.gestion = :gestion")})
public class EtapesPartypeappro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDETAPES")
    private Integer idetapes;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontantDebut")
    private BigDecimal montantDebut;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MontantFin")
    private BigDecimal montantFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDType")
    private int iDType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Phase")
    private short phase;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ACopier")
    private short aCopier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Destination")
    private short destination;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idetapes")
    private List<EtapesMarchesDetails> etapesMarchesDetailsList;
    @JoinColumn(name = "IDNATURE_MARCHE", referencedColumnName = "IDNATURE_MARCHE")
    @ManyToOne(optional = false)
    private AchNatureMarche idnatureMarche;
    @JoinColumn(name = "IDACH_MODE_EVALUATION", referencedColumnName = "IDACH_MODE_EVALUATION")
    @ManyToOne(optional = false)
    private AchModeEvaluation idachModeEvaluation;

    public EtapesPartypeappro() {
    }

    public EtapesPartypeappro(Integer idetapes) {
        this.idetapes = idetapes;
    }

    public EtapesPartypeappro(Integer idetapes, BigDecimal montantDebut, BigDecimal montantFin, int iDType, short phase, short aCopier, short destination) {
        this.idetapes = idetapes;
        this.montantDebut = montantDebut;
        this.montantFin = montantFin;
        this.iDType = iDType;
        this.phase = phase;
        this.aCopier = aCopier;
        this.destination = destination;
    }

    public Integer getIdetapes() {
        return idetapes;
    }

    public void setIdetapes(Integer idetapes) {
        this.idetapes = idetapes;
    }

    public BigDecimal getMontantDebut() {
        return montantDebut;
    }

    public void setMontantDebut(BigDecimal montantDebut) {
        this.montantDebut = montantDebut;
    }

    public BigDecimal getMontantFin() {
        return montantFin;
    }

    public void setMontantFin(BigDecimal montantFin) {
        this.montantFin = montantFin;
    }

    public int getIDType() {
        return iDType;
    }

    public void setIDType(int iDType) {
        this.iDType = iDType;
    }

    public short getPhase() {
        return phase;
    }

    public void setPhase(short phase) {
        this.phase = phase;
    }

    public short getACopier() {
        return aCopier;
    }

    public void setACopier(short aCopier) {
        this.aCopier = aCopier;
    }

    public short getDestination() {
        return destination;
    }

    public void setDestination(short destination) {
        this.destination = destination;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<EtapesMarchesDetails> getEtapesMarchesDetailsList() {
        return etapesMarchesDetailsList;
    }

    public void setEtapesMarchesDetailsList(List<EtapesMarchesDetails> etapesMarchesDetailsList) {
        this.etapesMarchesDetailsList = etapesMarchesDetailsList;
    }

    public AchNatureMarche getIdnatureMarche() {
        return idnatureMarche;
    }

    public void setIdnatureMarche(AchNatureMarche idnatureMarche) {
        this.idnatureMarche = idnatureMarche;
    }

    public AchModeEvaluation getIdachModeEvaluation() {
        return idachModeEvaluation;
    }

    public void setIdachModeEvaluation(AchModeEvaluation idachModeEvaluation) {
        this.idachModeEvaluation = idachModeEvaluation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idetapes != null ? idetapes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtapesPartypeappro)) {
            return false;
        }
        EtapesPartypeappro other = (EtapesPartypeappro) object;
        if ((this.idetapes == null && other.idetapes != null) || (this.idetapes != null && !this.idetapes.equals(other.idetapes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.EtapesPartypeappro[ idetapes=" + idetapes + " ]";
    }
    
}
