/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "restitution_sur_affraire")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RestitutionSurAffraire.findAll", query = "SELECT r FROM RestitutionSurAffraire r")
    , @NamedQuery(name = "RestitutionSurAffraire.findByMontant", query = "SELECT r FROM RestitutionSurAffraire r WHERE r.montant = :montant")
    , @NamedQuery(name = "RestitutionSurAffraire.findByGestion", query = "SELECT r FROM RestitutionSurAffraire r WHERE r.gestion = :gestion")
    , @NamedQuery(name = "RestitutionSurAffraire.findById", query = "SELECT r FROM RestitutionSurAffraire r WHERE r.id = :id")})
public class RestitutionSurAffraire implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Montant")
    private BigDecimal montant;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "IDAFFAIRES", referencedColumnName = "IDAFFAIRES")
    @ManyToOne(optional = false)
    private DecAffaires idaffaires;
    @JoinColumn(name = "CODE_DEM_REST", referencedColumnName = "CODE_DEM_REST")
    @ManyToOne(optional = false)
    private DemandesRestitution codeDemRest;

    public RestitutionSurAffraire() {
    }

    public RestitutionSurAffraire(Integer id) {
        this.id = id;
    }

    public RestitutionSurAffraire(Integer id, BigDecimal montant) {
        this.id = id;
        this.montant = montant;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DecAffaires getIdaffaires() {
        return idaffaires;
    }

    public void setIdaffaires(DecAffaires idaffaires) {
        this.idaffaires = idaffaires;
    }

    public DemandesRestitution getCodeDemRest() {
        return codeDemRest;
    }

    public void setCodeDemRest(DemandesRestitution codeDemRest) {
        this.codeDemRest = codeDemRest;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RestitutionSurAffraire)) {
            return false;
        }
        RestitutionSurAffraire other = (RestitutionSurAffraire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.RestitutionSurAffraire[ id=" + id + " ]";
    }
    
}
