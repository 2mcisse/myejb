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
@Table(name = "etablissementfinancier")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etablissementfinancier.findAll", query = "SELECT e FROM Etablissementfinancier e")
    , @NamedQuery(name = "Etablissementfinancier.findByIDEtablissementFinancier", query = "SELECT e FROM Etablissementfinancier e WHERE e.iDEtablissementFinancier = :iDEtablissementFinancier")
    , @NamedQuery(name = "Etablissementfinancier.findByCodeEtablis", query = "SELECT e FROM Etablissementfinancier e WHERE e.codeEtablis = :codeEtablis")
    , @NamedQuery(name = "Etablissementfinancier.findBySigle", query = "SELECT e FROM Etablissementfinancier e WHERE e.sigle = :sigle")
    , @NamedQuery(name = "Etablissementfinancier.findByDesignation", query = "SELECT e FROM Etablissementfinancier e WHERE e.designation = :designation")
    , @NamedQuery(name = "Etablissementfinancier.findByNumeroCompte", query = "SELECT e FROM Etablissementfinancier e WHERE e.numeroCompte = :numeroCompte")
    , @NamedQuery(name = "Etablissementfinancier.findByCodejnl", query = "SELECT e FROM Etablissementfinancier e WHERE e.codejnl = :codejnl")
    , @NamedQuery(name = "Etablissementfinancier.findByType", query = "SELECT e FROM Etablissementfinancier e WHERE e.type = :type")})
public class Etablissementfinancier implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEtablissementFinancier")
    private Integer iDEtablissementFinancier;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CodeEtablis")
    private String codeEtablis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Sigle")
    private String sigle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Designation")
    private String designation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 51)
    @Column(name = "NumeroCompte")
    private String numeroCompte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CODEJNL")
    private String codejnl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private short type;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDEtablissementFinancierDepart")
    private List<Encaissements> encaissementsList;
    @OneToMany(mappedBy = "iDEtablissementFinancierDepart")
    private List<PiecesTresoreries> piecesTresoreriesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDEtablissementFinancierDepart")
    private List<Decaissements> decaissementsList;

    public Etablissementfinancier() {
    }

    public Etablissementfinancier(Integer iDEtablissementFinancier) {
        this.iDEtablissementFinancier = iDEtablissementFinancier;
    }

    public Etablissementfinancier(Integer iDEtablissementFinancier, String codeEtablis, String sigle, String designation, String numeroCompte, String codejnl, short type) {
        this.iDEtablissementFinancier = iDEtablissementFinancier;
        this.codeEtablis = codeEtablis;
        this.sigle = sigle;
        this.designation = designation;
        this.numeroCompte = numeroCompte;
        this.codejnl = codejnl;
        this.type = type;
    }

    public Integer getIDEtablissementFinancier() {
        return iDEtablissementFinancier;
    }

    public void setIDEtablissementFinancier(Integer iDEtablissementFinancier) {
        this.iDEtablissementFinancier = iDEtablissementFinancier;
    }

    public String getCodeEtablis() {
        return codeEtablis;
    }

    public void setCodeEtablis(String codeEtablis) {
        this.codeEtablis = codeEtablis;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getCodejnl() {
        return codejnl;
    }

    public void setCodejnl(String codejnl) {
        this.codejnl = codejnl;
    }

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    @XmlTransient
    public List<Encaissements> getEncaissementsList() {
        return encaissementsList;
    }

    public void setEncaissementsList(List<Encaissements> encaissementsList) {
        this.encaissementsList = encaissementsList;
    }

    @XmlTransient
    public List<PiecesTresoreries> getPiecesTresoreriesList() {
        return piecesTresoreriesList;
    }

    public void setPiecesTresoreriesList(List<PiecesTresoreries> piecesTresoreriesList) {
        this.piecesTresoreriesList = piecesTresoreriesList;
    }

    @XmlTransient
    public List<Decaissements> getDecaissementsList() {
        return decaissementsList;
    }

    public void setDecaissementsList(List<Decaissements> decaissementsList) {
        this.decaissementsList = decaissementsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDEtablissementFinancier != null ? iDEtablissementFinancier.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etablissementfinancier)) {
            return false;
        }
        Etablissementfinancier other = (Etablissementfinancier) object;
        if ((this.iDEtablissementFinancier == null && other.iDEtablissementFinancier != null) || (this.iDEtablissementFinancier != null && !this.iDEtablissementFinancier.equals(other.iDEtablissementFinancier))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Etablissementfinancier[ iDEtablissementFinancier=" + iDEtablissementFinancier + " ]";
    }
    
}
