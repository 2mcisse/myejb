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
@Table(name = "bud_a")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BudA.findAll", query = "SELECT b FROM BudA b")
    , @NamedQuery(name = "BudA.findByIdbudA", query = "SELECT b FROM BudA b WHERE b.idbudA = :idbudA")
    , @NamedQuery(name = "BudA.findByCode", query = "SELECT b FROM BudA b WHERE b.code = :code")
    , @NamedQuery(name = "BudA.findByLibelle", query = "SELECT b FROM BudA b WHERE b.libelle = :libelle")})
public class BudA implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_A")
    private Integer idbudA;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Libelle")
    private String libelle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idbudA")
    private List<BudBudget> budBudgetList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idbudA")
    private List<BudB> budBList;

    public BudA() {
    }

    public BudA(Integer idbudA) {
        this.idbudA = idbudA;
    }

    public BudA(Integer idbudA, String code, String libelle) {
        this.idbudA = idbudA;
        this.code = code;
        this.libelle = libelle;
    }

    public Integer getIdbudA() {
        return idbudA;
    }

    public void setIdbudA(Integer idbudA) {
        this.idbudA = idbudA;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @XmlTransient
    public List<BudBudget> getBudBudgetList() {
        return budBudgetList;
    }

    public void setBudBudgetList(List<BudBudget> budBudgetList) {
        this.budBudgetList = budBudgetList;
    }

    @XmlTransient
    public List<BudB> getBudBList() {
        return budBList;
    }

    public void setBudBList(List<BudB> budBList) {
        this.budBList = budBList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbudA != null ? idbudA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudA)) {
            return false;
        }
        BudA other = (BudA) object;
        if ((this.idbudA == null && other.idbudA != null) || (this.idbudA != null && !this.idbudA.equals(other.idbudA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.BudA[ idbudA=" + idbudA + " ]";
    }
    
}
