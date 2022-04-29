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
@Table(name = "bud_b")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BudB.findAll", query = "SELECT b FROM BudB b")
    , @NamedQuery(name = "BudB.findByIdbudB", query = "SELECT b FROM BudB b WHERE b.idbudB = :idbudB")
    , @NamedQuery(name = "BudB.findByCode", query = "SELECT b FROM BudB b WHERE b.code = :code")
    , @NamedQuery(name = "BudB.findByLibelle", query = "SELECT b FROM BudB b WHERE b.libelle = :libelle")})
public class BudB implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_B")
    private Integer idbudB;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idbudB")
    private List<BudBudget> budBudgetList;
    @JoinColumn(name = "IDBUD_A", referencedColumnName = "IDBUD_A")
    @ManyToOne(optional = false)
    private BudA idbudA;

    public BudB() {
    }

    public BudB(Integer idbudB) {
        this.idbudB = idbudB;
    }

    public BudB(Integer idbudB, String code, String libelle) {
        this.idbudB = idbudB;
        this.code = code;
        this.libelle = libelle;
    }

    public Integer getIdbudB() {
        return idbudB;
    }

    public void setIdbudB(Integer idbudB) {
        this.idbudB = idbudB;
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

    public BudA getIdbudA() {
        return idbudA;
    }

    public void setIdbudA(BudA idbudA) {
        this.idbudA = idbudA;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbudB != null ? idbudB.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudB)) {
            return false;
        }
        BudB other = (BudB) object;
        if ((this.idbudB == null && other.idbudB != null) || (this.idbudB != null && !this.idbudB.equals(other.idbudB))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.BudB[ idbudB=" + idbudB + " ]";
    }
    
}
