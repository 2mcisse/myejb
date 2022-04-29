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
import javax.persistence.Id;
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
@Table(name = "etatsfin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etatsfin.findAll", query = "SELECT e FROM Etatsfin e")
    , @NamedQuery(name = "Etatsfin.findByIDEtatsFin", query = "SELECT e FROM Etatsfin e WHERE e.iDEtatsFin = :iDEtatsFin")
    , @NamedQuery(name = "Etatsfin.findByRef", query = "SELECT e FROM Etatsfin e WHERE e.ref = :ref")
    , @NamedQuery(name = "Etatsfin.findByPoste", query = "SELECT e FROM Etatsfin e WHERE e.poste = :poste")
    , @NamedQuery(name = "Etatsfin.findByFormule", query = "SELECT e FROM Etatsfin e WHERE e.formule = :formule")
    , @NamedQuery(name = "Etatsfin.findByTtcleunik", query = "SELECT e FROM Etatsfin e WHERE e.ttcleunik = :ttcleunik")
    , @NamedQuery(name = "Etatsfin.findByBrut", query = "SELECT e FROM Etatsfin e WHERE e.brut = :brut")
    , @NamedQuery(name = "Etatsfin.findByAmort", query = "SELECT e FROM Etatsfin e WHERE e.amort = :amort")
    , @NamedQuery(name = "Etatsfin.findByComptes", query = "SELECT e FROM Etatsfin e WHERE e.comptes = :comptes")
    , @NamedQuery(name = "Etatsfin.findByBrut0", query = "SELECT e FROM Etatsfin e WHERE e.brut0 = :brut0")
    , @NamedQuery(name = "Etatsfin.findByBrut1", query = "SELECT e FROM Etatsfin e WHERE e.brut1 = :brut1")
    , @NamedQuery(name = "Etatsfin.findByAmort0", query = "SELECT e FROM Etatsfin e WHERE e.amort0 = :amort0")
    , @NamedQuery(name = "Etatsfin.findByAmort1", query = "SELECT e FROM Etatsfin e WHERE e.amort1 = :amort1")
    , @NamedQuery(name = "Etatsfin.findByDebit0", query = "SELECT e FROM Etatsfin e WHERE e.debit0 = :debit0")
    , @NamedQuery(name = "Etatsfin.findByDebit1", query = "SELECT e FROM Etatsfin e WHERE e.debit1 = :debit1")
    , @NamedQuery(name = "Etatsfin.findByCredit0", query = "SELECT e FROM Etatsfin e WHERE e.credit0 = :credit0")
    , @NamedQuery(name = "Etatsfin.findByCredit1", query = "SELECT e FROM Etatsfin e WHERE e.credit1 = :credit1")
    , @NamedQuery(name = "Etatsfin.findByExo", query = "SELECT e FROM Etatsfin e WHERE e.exo = :exo")})
public class Etatsfin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEtatsFin")
    private Integer iDEtatsFin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Ref")
    private String ref;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Poste")
    private String poste;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Formule")
    private int formule;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TTCLEUNIK")
    private int ttcleunik;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Brut")
    private String brut;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Amort")
    private String amort;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Comptes")
    private String comptes;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Brut0")
    private BigDecimal brut0;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Brut1")
    private BigDecimal brut1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Amort0")
    private BigDecimal amort0;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Amort1")
    private BigDecimal amort1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Debit0")
    private BigDecimal debit0;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Debit1")
    private BigDecimal debit1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Credit0")
    private BigDecimal credit0;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Credit1")
    private BigDecimal credit1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "Exo")
    private String exo;

    public Etatsfin() {
    }

    public Etatsfin(Integer iDEtatsFin) {
        this.iDEtatsFin = iDEtatsFin;
    }

    public Etatsfin(Integer iDEtatsFin, String ref, String poste, int formule, int ttcleunik, String brut, String amort, String comptes, BigDecimal brut0, BigDecimal brut1, BigDecimal amort0, BigDecimal amort1, BigDecimal debit0, BigDecimal debit1, BigDecimal credit0, BigDecimal credit1, String exo) {
        this.iDEtatsFin = iDEtatsFin;
        this.ref = ref;
        this.poste = poste;
        this.formule = formule;
        this.ttcleunik = ttcleunik;
        this.brut = brut;
        this.amort = amort;
        this.comptes = comptes;
        this.brut0 = brut0;
        this.brut1 = brut1;
        this.amort0 = amort0;
        this.amort1 = amort1;
        this.debit0 = debit0;
        this.debit1 = debit1;
        this.credit0 = credit0;
        this.credit1 = credit1;
        this.exo = exo;
    }

    public Integer getIDEtatsFin() {
        return iDEtatsFin;
    }

    public void setIDEtatsFin(Integer iDEtatsFin) {
        this.iDEtatsFin = iDEtatsFin;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public int getFormule() {
        return formule;
    }

    public void setFormule(int formule) {
        this.formule = formule;
    }

    public int getTtcleunik() {
        return ttcleunik;
    }

    public void setTtcleunik(int ttcleunik) {
        this.ttcleunik = ttcleunik;
    }

    public String getBrut() {
        return brut;
    }

    public void setBrut(String brut) {
        this.brut = brut;
    }

    public String getAmort() {
        return amort;
    }

    public void setAmort(String amort) {
        this.amort = amort;
    }

    public String getComptes() {
        return comptes;
    }

    public void setComptes(String comptes) {
        this.comptes = comptes;
    }

    public BigDecimal getBrut0() {
        return brut0;
    }

    public void setBrut0(BigDecimal brut0) {
        this.brut0 = brut0;
    }

    public BigDecimal getBrut1() {
        return brut1;
    }

    public void setBrut1(BigDecimal brut1) {
        this.brut1 = brut1;
    }

    public BigDecimal getAmort0() {
        return amort0;
    }

    public void setAmort0(BigDecimal amort0) {
        this.amort0 = amort0;
    }

    public BigDecimal getAmort1() {
        return amort1;
    }

    public void setAmort1(BigDecimal amort1) {
        this.amort1 = amort1;
    }

    public BigDecimal getDebit0() {
        return debit0;
    }

    public void setDebit0(BigDecimal debit0) {
        this.debit0 = debit0;
    }

    public BigDecimal getDebit1() {
        return debit1;
    }

    public void setDebit1(BigDecimal debit1) {
        this.debit1 = debit1;
    }

    public BigDecimal getCredit0() {
        return credit0;
    }

    public void setCredit0(BigDecimal credit0) {
        this.credit0 = credit0;
    }

    public BigDecimal getCredit1() {
        return credit1;
    }

    public void setCredit1(BigDecimal credit1) {
        this.credit1 = credit1;
    }

    public String getExo() {
        return exo;
    }

    public void setExo(String exo) {
        this.exo = exo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDEtatsFin != null ? iDEtatsFin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etatsfin)) {
            return false;
        }
        Etatsfin other = (Etatsfin) object;
        if ((this.iDEtatsFin == null && other.iDEtatsFin != null) || (this.iDEtatsFin != null && !this.iDEtatsFin.equals(other.iDEtatsFin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Etatsfin[ iDEtatsFin=" + iDEtatsFin + " ]";
    }
    
}
