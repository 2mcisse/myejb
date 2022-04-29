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
@Table(name = "caisses")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caisses.findAll", query = "SELECT c FROM Caisses c")
    , @NamedQuery(name = "Caisses.findByNumeroCaisse", query = "SELECT c FROM Caisses c WHERE c.numeroCaisse = :numeroCaisse")
    , @NamedQuery(name = "Caisses.findByObservations", query = "SELECT c FROM Caisses c WHERE c.observations = :observations")
    , @NamedQuery(name = "Caisses.findByCaissePrincipale", query = "SELECT c FROM Caisses c WHERE c.caissePrincipale = :caissePrincipale")
    , @NamedQuery(name = "Caisses.findByEtat", query = "SELECT c FROM Caisses c WHERE c.etat = :etat")
    , @NamedQuery(name = "Caisses.findByNumTiers", query = "SELECT c FROM Caisses c WHERE c.numTiers = :numTiers")
    , @NamedQuery(name = "Caisses.findByNUMencours", query = "SELECT c FROM Caisses c WHERE c.nUMencours = :nUMencours")
    , @NamedQuery(name = "Caisses.findBySolde", query = "SELECT c FROM Caisses c WHERE c.solde = :solde")
    , @NamedQuery(name = "Caisses.findByCaisseAssociee", query = "SELECT c FROM Caisses c WHERE c.caisseAssociee = :caisseAssociee")
    , @NamedQuery(name = "Caisses.findByGestion", query = "SELECT c FROM Caisses c WHERE c.gestion = :gestion")})
public class Caisses implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroCaisse")
    private String numeroCaisse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Observations")
    private String observations;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CaissePrincipale")
    private short caissePrincipale;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Etat")
    private short etat;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumTiers")
    private long numTiers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMencours")
    private int nUMencours;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SOLDE")
    private int solde;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CaisseAssociee")
    private int caisseAssociee;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroCaisse")
    private List<Encaissements> encaissementsList;
    @OneToMany(mappedBy = "numeroCaisse")
    private List<Demandes> demandesList;
    @OneToMany(mappedBy = "numeroCaisse")
    private List<Affectation> affectationList;
    @OneToMany(mappedBy = "numeroCaisse")
    private List<Billetage> billetageList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroCaisse")
    private List<Decaissements> decaissementsList;
    @OneToMany(mappedBy = "numeroCaisse")
    private List<SoldeCaisse> soldeCaisseList;
    @OneToMany(mappedBy = "numeroCaisse")
    private List<ApproDeg> approDegList;
    @OneToMany(mappedBy = "numeroCaisse")
    private List<Actionsccaisses> actionsccaissesList;
    @JoinColumn(name = "CodeG", referencedColumnName = "CodeG")
    @ManyToOne(optional = false)
    private Guichets codeG;

    public Caisses() {
    }

    public Caisses(String numeroCaisse) {
        this.numeroCaisse = numeroCaisse;
    }

    public Caisses(String numeroCaisse, String observations, short caissePrincipale, short etat, long numTiers, int nUMencours, int solde, int caisseAssociee) {
        this.numeroCaisse = numeroCaisse;
        this.observations = observations;
        this.caissePrincipale = caissePrincipale;
        this.etat = etat;
        this.numTiers = numTiers;
        this.nUMencours = nUMencours;
        this.solde = solde;
        this.caisseAssociee = caisseAssociee;
    }

    public String getNumeroCaisse() {
        return numeroCaisse;
    }

    public void setNumeroCaisse(String numeroCaisse) {
        this.numeroCaisse = numeroCaisse;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public short getCaissePrincipale() {
        return caissePrincipale;
    }

    public void setCaissePrincipale(short caissePrincipale) {
        this.caissePrincipale = caissePrincipale;
    }

    public short getEtat() {
        return etat;
    }

    public void setEtat(short etat) {
        this.etat = etat;
    }

    public long getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(long numTiers) {
        this.numTiers = numTiers;
    }

    public int getNUMencours() {
        return nUMencours;
    }

    public void setNUMencours(int nUMencours) {
        this.nUMencours = nUMencours;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public int getCaisseAssociee() {
        return caisseAssociee;
    }

    public void setCaisseAssociee(int caisseAssociee) {
        this.caisseAssociee = caisseAssociee;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Encaissements> getEncaissementsList() {
        return encaissementsList;
    }

    public void setEncaissementsList(List<Encaissements> encaissementsList) {
        this.encaissementsList = encaissementsList;
    }

    @XmlTransient
    public List<Demandes> getDemandesList() {
        return demandesList;
    }

    public void setDemandesList(List<Demandes> demandesList) {
        this.demandesList = demandesList;
    }

    @XmlTransient
    public List<Affectation> getAffectationList() {
        return affectationList;
    }

    public void setAffectationList(List<Affectation> affectationList) {
        this.affectationList = affectationList;
    }

    @XmlTransient
    public List<Billetage> getBilletageList() {
        return billetageList;
    }

    public void setBilletageList(List<Billetage> billetageList) {
        this.billetageList = billetageList;
    }

    @XmlTransient
    public List<Decaissements> getDecaissementsList() {
        return decaissementsList;
    }

    public void setDecaissementsList(List<Decaissements> decaissementsList) {
        this.decaissementsList = decaissementsList;
    }

    @XmlTransient
    public List<SoldeCaisse> getSoldeCaisseList() {
        return soldeCaisseList;
    }

    public void setSoldeCaisseList(List<SoldeCaisse> soldeCaisseList) {
        this.soldeCaisseList = soldeCaisseList;
    }

    @XmlTransient
    public List<ApproDeg> getApproDegList() {
        return approDegList;
    }

    public void setApproDegList(List<ApproDeg> approDegList) {
        this.approDegList = approDegList;
    }

    @XmlTransient
    public List<Actionsccaisses> getActionsccaissesList() {
        return actionsccaissesList;
    }

    public void setActionsccaissesList(List<Actionsccaisses> actionsccaissesList) {
        this.actionsccaissesList = actionsccaissesList;
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
        hash += (numeroCaisse != null ? numeroCaisse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caisses)) {
            return false;
        }
        Caisses other = (Caisses) object;
        if ((this.numeroCaisse == null && other.numeroCaisse != null) || (this.numeroCaisse != null && !this.numeroCaisse.equals(other.numeroCaisse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Caisses[ numeroCaisse=" + numeroCaisse + " ]";
    }
    
}
