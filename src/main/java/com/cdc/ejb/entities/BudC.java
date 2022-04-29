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
@Table(name = "bud_c")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BudC.findAll", query = "SELECT b FROM BudC b")
    , @NamedQuery(name = "BudC.findByIdbudC", query = "SELECT b FROM BudC b WHERE b.idbudC = :idbudC")
    , @NamedQuery(name = "BudC.findByCode", query = "SELECT b FROM BudC b WHERE b.code = :code")
    , @NamedQuery(name = "BudC.findByLibelle", query = "SELECT b FROM BudC b WHERE b.libelle = :libelle")})
public class BudC implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_C")
    private Integer idbudC;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idbudC")
    private List<BudBudget> budBudgetList;

    public BudC() {
    }

    public BudC(Integer idbudC) {
        this.idbudC = idbudC;
    }

    public BudC(Integer idbudC, String code, String libelle) {
        this.idbudC = idbudC;
        this.code = code;
        this.libelle = libelle;
    }

    public Integer getIdbudC() {
        return idbudC;
    }

    public void setIdbudC(Integer idbudC) {
        this.idbudC = idbudC;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbudC != null ? idbudC.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BudC)) {
            return false;
        }
        BudC other = (BudC) object;
        if ((this.idbudC == null && other.idbudC != null) || (this.idbudC != null && !this.idbudC.equals(other.idbudC))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.BudC[ idbudC=" + idbudC + " ]";
    }
    
}
