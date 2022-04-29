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
@Table(name = "journal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Journal.findAll", query = "SELECT j FROM Journal j")
    , @NamedQuery(name = "Journal.findByLibelleJournal", query = "SELECT j FROM Journal j WHERE j.libelleJournal = :libelleJournal")
    , @NamedQuery(name = "Journal.findByAbreviation", query = "SELECT j FROM Journal j WHERE j.abreviation = :abreviation")
    , @NamedQuery(name = "Journal.findByBalanceEntree", query = "SELECT j FROM Journal j WHERE j.balanceEntree = :balanceEntree")
    , @NamedQuery(name = "Journal.findByCentralisateur", query = "SELECT j FROM Journal j WHERE j.centralisateur = :centralisateur")
    , @NamedQuery(name = "Journal.findByType", query = "SELECT j FROM Journal j WHERE j.type = :type")
    , @NamedQuery(name = "Journal.findByCompte", query = "SELECT j FROM Journal j WHERE j.compte = :compte")
    , @NamedQuery(name = "Journal.findByJnlCentralisateur", query = "SELECT j FROM Journal j WHERE j.jnlCentralisateur = :jnlCentralisateur")
    , @NamedQuery(name = "Journal.findByCodejnl", query = "SELECT j FROM Journal j WHERE j.codejnl = :codejnl")})
public class Journal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LibelleJournal")
    private String libelleJournal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "Abreviation")
    private String abreviation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Balance_Entree")
    private short balanceEntree;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Centralisateur")
    private short centralisateur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Type")
    private short type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Compte")
    private String compte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "JnlCentralisateur")
    private String jnlCentralisateur;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CODEJNL")
    private String codejnl;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codejnl")
    private List<Mouvement> mouvementList;

    public Journal() {
    }

    public Journal(String codejnl) {
        this.codejnl = codejnl;
    }

    public Journal(String codejnl, String libelleJournal, String abreviation, short balanceEntree, short centralisateur, short type, String compte, String jnlCentralisateur) {
        this.codejnl = codejnl;
        this.libelleJournal = libelleJournal;
        this.abreviation = abreviation;
        this.balanceEntree = balanceEntree;
        this.centralisateur = centralisateur;
        this.type = type;
        this.compte = compte;
        this.jnlCentralisateur = jnlCentralisateur;
    }

    public String getLibelleJournal() {
        return libelleJournal;
    }

    public void setLibelleJournal(String libelleJournal) {
        this.libelleJournal = libelleJournal;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public short getBalanceEntree() {
        return balanceEntree;
    }

    public void setBalanceEntree(short balanceEntree) {
        this.balanceEntree = balanceEntree;
    }

    public short getCentralisateur() {
        return centralisateur;
    }

    public void setCentralisateur(short centralisateur) {
        this.centralisateur = centralisateur;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getCompte() {
        return compte;
    }

    public void setCompte(String compte) {
        this.compte = compte;
    }

    public String getJnlCentralisateur() {
        return jnlCentralisateur;
    }

    public void setJnlCentralisateur(String jnlCentralisateur) {
        this.jnlCentralisateur = jnlCentralisateur;
    }

    public String getCodejnl() {
        return codejnl;
    }

    public void setCodejnl(String codejnl) {
        this.codejnl = codejnl;
    }

    @XmlTransient
    public List<Mouvement> getMouvementList() {
        return mouvementList;
    }

    public void setMouvementList(List<Mouvement> mouvementList) {
        this.mouvementList = mouvementList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codejnl != null ? codejnl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Journal)) {
            return false;
        }
        Journal other = (Journal) object;
        if ((this.codejnl == null && other.codejnl != null) || (this.codejnl != null && !this.codejnl.equals(other.codejnl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Journal[ codejnl=" + codejnl + " ]";
    }
    
}
