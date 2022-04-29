/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
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
@Table(name = "classes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Classes.findAll", query = "SELECT c FROM Classes c")
    , @NamedQuery(name = "Classes.findByCodeClasse", query = "SELECT c FROM Classes c WHERE c.codeClasse = :codeClasse")
    , @NamedQuery(name = "Classes.findByIntitule", query = "SELECT c FROM Classes c WHERE c.intitule = :intitule")
    , @NamedQuery(name = "Classes.findBySolde", query = "SELECT c FROM Classes c WHERE c.solde = :solde")
    , @NamedQuery(name = "Classes.findByEtat", query = "SELECT c FROM Classes c WHERE c.etat = :etat")
    , @NamedQuery(name = "Classes.findByBudgetisable", query = "SELECT c FROM Classes c WHERE c.budgetisable = :budgetisable")
    , @NamedQuery(name = "Classes.findBySoldeNul", query = "SELECT c FROM Classes c WHERE c.soldeNul = :soldeNul")
    , @NamedQuery(name = "Classes.findByResultat", query = "SELECT c FROM Classes c WHERE c.resultat = :resultat")
    , @NamedQuery(name = "Classes.findByVentilable", query = "SELECT c FROM Classes c WHERE c.ventilable = :ventilable")
    , @NamedQuery(name = "Classes.findBySection", query = "SELECT c FROM Classes c WHERE c.section = :section")
    , @NamedQuery(name = "Classes.findByCollectif", query = "SELECT c FROM Classes c WHERE c.collectif = :collectif")})
public class Classes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CODE_CLASSE")
    private String codeClasse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Intitule")
    private String intitule;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SOLDE")
    private short solde;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Etat")
    private short etat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Budgetisable")
    private short budgetisable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SoldeNul")
    private short soldeNul;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Resultat")
    private short resultat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ventilable")
    private short ventilable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Section")
    private short section;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Collectif")
    private short collectif;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeClasse")
    private List<Compte> compteList;

    public Classes() {
    }

    public Classes(String codeClasse) {
        this.codeClasse = codeClasse;
    }

    public Classes(String codeClasse, String intitule, short solde, short etat, short budgetisable, short soldeNul, short resultat, short ventilable, short section, short collectif) {
        this.codeClasse = codeClasse;
        this.intitule = intitule;
        this.solde = solde;
        this.etat = etat;
        this.budgetisable = budgetisable;
        this.soldeNul = soldeNul;
        this.resultat = resultat;
        this.ventilable = ventilable;
        this.section = section;
        this.collectif = collectif;
    }

    public String getCodeClasse() {
        return codeClasse;
    }

    public void setCodeClasse(String codeClasse) {
        this.codeClasse = codeClasse;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public short getSolde() {
        return solde;
    }

    public void setSolde(short solde) {
        this.solde = solde;
    }

    public short getEtat() {
        return etat;
    }

    public void setEtat(short etat) {
        this.etat = etat;
    }

    public short getBudgetisable() {
        return budgetisable;
    }

    public void setBudgetisable(short budgetisable) {
        this.budgetisable = budgetisable;
    }

    public short getSoldeNul() {
        return soldeNul;
    }

    public void setSoldeNul(short soldeNul) {
        this.soldeNul = soldeNul;
    }

    public short getResultat() {
        return resultat;
    }

    public void setResultat(short resultat) {
        this.resultat = resultat;
    }

    public short getVentilable() {
        return ventilable;
    }

    public void setVentilable(short ventilable) {
        this.ventilable = ventilable;
    }

    public short getSection() {
        return section;
    }

    public void setSection(short section) {
        this.section = section;
    }

    public short getCollectif() {
        return collectif;
    }

    public void setCollectif(short collectif) {
        this.collectif = collectif;
    }

    @XmlTransient
    public List<Compte> getCompteList() {
        return compteList;
    }

    public void setCompteList(List<Compte> compteList) {
        this.compteList = compteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeClasse != null ? codeClasse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Classes)) {
            return false;
        }
        Classes other = (Classes) object;
        if ((this.codeClasse == null && other.codeClasse != null) || (this.codeClasse != null && !this.codeClasse.equals(other.codeClasse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Classes[ codeClasse=" + codeClasse + " ]";
    }
    
}
