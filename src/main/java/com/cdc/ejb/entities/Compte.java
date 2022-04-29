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
@Table(name = "compte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compte.findAll", query = "SELECT c FROM Compte c")
    , @NamedQuery(name = "Compte.findByLibelleCompte", query = "SELECT c FROM Compte c WHERE c.libelleCompte = :libelleCompte")
    , @NamedQuery(name = "Compte.findByDateCreerCompte", query = "SELECT c FROM Compte c WHERE c.dateCreerCompte = :dateCreerCompte")
    , @NamedQuery(name = "Compte.findByNumeroCompte", query = "SELECT c FROM Compte c WHERE c.numeroCompte = :numeroCompte")
    , @NamedQuery(name = "Compte.findBySolde", query = "SELECT c FROM Compte c WHERE c.solde = :solde")
    , @NamedQuery(name = "Compte.findBySection", query = "SELECT c FROM Compte c WHERE c.section = :section")
    , @NamedQuery(name = "Compte.findByEtat", query = "SELECT c FROM Compte c WHERE c.etat = :etat")
    , @NamedQuery(name = "Compte.findByResultat", query = "SELECT c FROM Compte c WHERE c.resultat = :resultat")
    , @NamedQuery(name = "Compte.findByBudgetisable", query = "SELECT c FROM Compte c WHERE c.budgetisable = :budgetisable")
    , @NamedQuery(name = "Compte.findByVentilable", query = "SELECT c FROM Compte c WHERE c.ventilable = :ventilable")
    , @NamedQuery(name = "Compte.findByCollectif", query = "SELECT c FROM Compte c WHERE c.collectif = :collectif")
    , @NamedQuery(name = "Compte.findBySoldeNul", query = "SELECT c FROM Compte c WHERE c.soldeNul = :soldeNul")})
public class Compte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LibelleCompte")
    private String libelleCompte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateCreerCompte")
    @Temporal(TemporalType.DATE)
    private Date dateCreerCompte;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 51)
    @Column(name = "NumeroCompte")
    private String numeroCompte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SOLDE")
    private short solde;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Section")
    private short section;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Etat")
    private short etat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Resultat")
    private short resultat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Budgetisable")
    private short budgetisable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ventilable")
    private short ventilable;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Collectif")
    private short collectif;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SoldeNul")
    private short soldeNul;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroCompte")
    private List<BudTyperetenues> budTyperetenuesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroCompte")
    private List<BudBudget> budBudgetList;
    @JoinColumn(name = "CODE_CLASSE", referencedColumnName = "CODE_CLASSE")
    @ManyToOne(optional = false)
    private Classes codeClasse;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroCompte")
    private List<Ligneecriture> ligneecritureList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroCompte")
    private List<DecNatureoperation> decNatureoperationList;

    public Compte() {
    }

    public Compte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public Compte(String numeroCompte, String libelleCompte, Date dateCreerCompte, short solde, short section, short etat, short resultat, short budgetisable, short ventilable, short collectif, short soldeNul) {
        this.numeroCompte = numeroCompte;
        this.libelleCompte = libelleCompte;
        this.dateCreerCompte = dateCreerCompte;
        this.solde = solde;
        this.section = section;
        this.etat = etat;
        this.resultat = resultat;
        this.budgetisable = budgetisable;
        this.ventilable = ventilable;
        this.collectif = collectif;
        this.soldeNul = soldeNul;
    }

    public String getLibelleCompte() {
        return libelleCompte;
    }

    public void setLibelleCompte(String libelleCompte) {
        this.libelleCompte = libelleCompte;
    }

    public Date getDateCreerCompte() {
        return dateCreerCompte;
    }

    public void setDateCreerCompte(Date dateCreerCompte) {
        this.dateCreerCompte = dateCreerCompte;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public short getSolde() {
        return solde;
    }

    public void setSolde(short solde) {
        this.solde = solde;
    }

    public short getSection() {
        return section;
    }

    public void setSection(short section) {
        this.section = section;
    }

    public short getEtat() {
        return etat;
    }

    public void setEtat(short etat) {
        this.etat = etat;
    }

    public short getResultat() {
        return resultat;
    }

    public void setResultat(short resultat) {
        this.resultat = resultat;
    }

    public short getBudgetisable() {
        return budgetisable;
    }

    public void setBudgetisable(short budgetisable) {
        this.budgetisable = budgetisable;
    }

    public short getVentilable() {
        return ventilable;
    }

    public void setVentilable(short ventilable) {
        this.ventilable = ventilable;
    }

    public short getCollectif() {
        return collectif;
    }

    public void setCollectif(short collectif) {
        this.collectif = collectif;
    }

    public short getSoldeNul() {
        return soldeNul;
    }

    public void setSoldeNul(short soldeNul) {
        this.soldeNul = soldeNul;
    }

    @XmlTransient
    public List<BudTyperetenues> getBudTyperetenuesList() {
        return budTyperetenuesList;
    }

    public void setBudTyperetenuesList(List<BudTyperetenues> budTyperetenuesList) {
        this.budTyperetenuesList = budTyperetenuesList;
    }

    @XmlTransient
    public List<BudBudget> getBudBudgetList() {
        return budBudgetList;
    }

    public void setBudBudgetList(List<BudBudget> budBudgetList) {
        this.budBudgetList = budBudgetList;
    }

    public Classes getCodeClasse() {
        return codeClasse;
    }

    public void setCodeClasse(Classes codeClasse) {
        this.codeClasse = codeClasse;
    }

    @XmlTransient
    public List<Ligneecriture> getLigneecritureList() {
        return ligneecritureList;
    }

    public void setLigneecritureList(List<Ligneecriture> ligneecritureList) {
        this.ligneecritureList = ligneecritureList;
    }

    @XmlTransient
    public List<DecNatureoperation> getDecNatureoperationList() {
        return decNatureoperationList;
    }

    public void setDecNatureoperationList(List<DecNatureoperation> decNatureoperationList) {
        this.decNatureoperationList = decNatureoperationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numeroCompte != null ? numeroCompte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compte)) {
            return false;
        }
        Compte other = (Compte) object;
        if ((this.numeroCompte == null && other.numeroCompte != null) || (this.numeroCompte != null && !this.numeroCompte.equals(other.numeroCompte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Compte[ numeroCompte=" + numeroCompte + " ]";
    }
    
}
