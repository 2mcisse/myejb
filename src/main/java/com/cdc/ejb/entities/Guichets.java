/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "guichets")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Guichets.findAll", query = "SELECT g FROM Guichets g")
    , @NamedQuery(name = "Guichets.findByCodeG", query = "SELECT g FROM Guichets g WHERE g.codeG = :codeG")
    , @NamedQuery(name = "Guichets.findByLibelle", query = "SELECT g FROM Guichets g WHERE g.libelle = :libelle")
    , @NamedQuery(name = "Guichets.findByNumTiers", query = "SELECT g FROM Guichets g WHERE g.numTiers = :numTiers")
    , @NamedQuery(name = "Guichets.findByNUMencours", query = "SELECT g FROM Guichets g WHERE g.nUMencours = :nUMencours")})
public class Guichets implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CodeG")
    private String codeG;
    @Size(max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @Column(name = "NumTiers")
    private BigInteger numTiers;
    @Column(name = "NUMencours")
    private Integer nUMencours;
    @OneToMany(mappedBy = "codeG")
    private List<Affectation> affectationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeG")
    private List<Caisses> caissesList;

    public Guichets() {
    }

    public Guichets(String codeG) {
        this.codeG = codeG;
    }

    public String getCodeG() {
        return codeG;
    }

    public void setCodeG(String codeG) {
        this.codeG = codeG;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public BigInteger getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(BigInteger numTiers) {
        this.numTiers = numTiers;
    }

    public Integer getNUMencours() {
        return nUMencours;
    }

    public void setNUMencours(Integer nUMencours) {
        this.nUMencours = nUMencours;
    }

    @XmlTransient
    public List<Affectation> getAffectationList() {
        return affectationList;
    }

    public void setAffectationList(List<Affectation> affectationList) {
        this.affectationList = affectationList;
    }

    @XmlTransient
    public List<Caisses> getCaissesList() {
        return caissesList;
    }

    public void setCaissesList(List<Caisses> caissesList) {
        this.caissesList = caissesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeG != null ? codeG.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Guichets)) {
            return false;
        }
        Guichets other = (Guichets) object;
        if ((this.codeG == null && other.codeG != null) || (this.codeG != null && !this.codeG.equals(other.codeG))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Guichets[ codeG=" + codeG + " ]";
    }
    
}
