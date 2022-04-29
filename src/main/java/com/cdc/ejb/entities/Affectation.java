/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "affectation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Affectation.findAll", query = "SELECT a FROM Affectation a")
    , @NamedQuery(name = "Affectation.findByIdaffectation", query = "SELECT a FROM Affectation a WHERE a.idaffectation = :idaffectation")
    , @NamedQuery(name = "Affectation.findByNumTiers", query = "SELECT a FROM Affectation a WHERE a.numTiers = :numTiers")
    , @NamedQuery(name = "Affectation.findByDateAf", query = "SELECT a FROM Affectation a WHERE a.dateAf = :dateAf")
    , @NamedQuery(name = "Affectation.findByEncours", query = "SELECT a FROM Affectation a WHERE a.encours = :encours")
    , @NamedQuery(name = "Affectation.findByGestion", query = "SELECT a FROM Affectation a WHERE a.gestion = :gestion")})
public class Affectation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDAFFECTATION")
    private Integer idaffectation;
    @Column(name = "NumTiers")
    private BigInteger numTiers;
    @Size(max = 50)
    @Column(name = "DateAf")
    private String dateAf;
    @Column(name = "Encours")
    private Short encours;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "NumeroCaisse", referencedColumnName = "NumeroCaisse")
    @ManyToOne
    private Caisses numeroCaisse;
    @JoinColumn(name = "CodeG", referencedColumnName = "CodeG")
    @ManyToOne
    private Guichets codeG;

    public Affectation() {
    }

    public Affectation(Integer idaffectation) {
        this.idaffectation = idaffectation;
    }

    public Integer getIdaffectation() {
        return idaffectation;
    }

    public void setIdaffectation(Integer idaffectation) {
        this.idaffectation = idaffectation;
    }

    public BigInteger getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(BigInteger numTiers) {
        this.numTiers = numTiers;
    }

    public String getDateAf() {
        return dateAf;
    }

    public void setDateAf(String dateAf) {
        this.dateAf = dateAf;
    }

    public Short getEncours() {
        return encours;
    }

    public void setEncours(Short encours) {
        this.encours = encours;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Caisses getNumeroCaisse() {
        return numeroCaisse;
    }

    public void setNumeroCaisse(Caisses numeroCaisse) {
        this.numeroCaisse = numeroCaisse;
    }

    public Guichets getCodeG() {
        return codeG;
    }

    public void setCodeG(Guichets codeG) {
        this.codeG = codeG;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idaffectation != null ? idaffectation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Affectation)) {
            return false;
        }
        Affectation other = (Affectation) object;
        if ((this.idaffectation == null && other.idaffectation != null) || (this.idaffectation != null && !this.idaffectation.equals(other.idaffectation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Affectation[ idaffectation=" + idaffectation + " ]";
    }
    
}
