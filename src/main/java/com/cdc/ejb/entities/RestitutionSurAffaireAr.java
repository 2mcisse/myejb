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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "restitution_sur_affaire_ar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RestitutionSurAffaireAr.findAll", query = "SELECT r FROM RestitutionSurAffaireAr r")
    , @NamedQuery(name = "RestitutionSurAffaireAr.findByMontant", query = "SELECT r FROM RestitutionSurAffaireAr r WHERE r.montant = :montant")
    , @NamedQuery(name = "RestitutionSurAffaireAr.findByImputerSurCDO", query = "SELECT r FROM RestitutionSurAffaireAr r WHERE r.imputerSurCDO = :imputerSurCDO")
    , @NamedQuery(name = "RestitutionSurAffaireAr.findById", query = "SELECT r FROM RestitutionSurAffaireAr r WHERE r.id = :id")})
public class RestitutionSurAffaireAr implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTANT")
    private BigDecimal montant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImputerSurCDO")
    private short imputerSurCDO;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "IDAFFAIRES", referencedColumnName = "IDAFFAIRES")
    @ManyToOne(optional = false)
    private DecAffaires idaffaires;
    @JoinColumn(name = "IDDEC_AutorisationDeRestitution", referencedColumnName = "IDDEC_AutorisationDeRestitution")
    @ManyToOne(optional = false)
    private DecAutorisationderestitution iDDECAutorisationDeRestitution;

    public RestitutionSurAffaireAr() {
    }

    public RestitutionSurAffaireAr(Integer id) {
        this.id = id;
    }

    public RestitutionSurAffaireAr(Integer id, BigDecimal montant, short imputerSurCDO) {
        this.id = id;
        this.montant = montant;
        this.imputerSurCDO = imputerSurCDO;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public short getImputerSurCDO() {
        return imputerSurCDO;
    }

    public void setImputerSurCDO(short imputerSurCDO) {
        this.imputerSurCDO = imputerSurCDO;
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

    public DecAutorisationderestitution getIDDECAutorisationDeRestitution() {
        return iDDECAutorisationDeRestitution;
    }

    public void setIDDECAutorisationDeRestitution(DecAutorisationderestitution iDDECAutorisationDeRestitution) {
        this.iDDECAutorisationDeRestitution = iDDECAutorisationDeRestitution;
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
        if (!(object instanceof RestitutionSurAffaireAr)) {
            return false;
        }
        RestitutionSurAffaireAr other = (RestitutionSurAffaireAr) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.RestitutionSurAffaireAr[ id=" + id + " ]";
    }
    
}
