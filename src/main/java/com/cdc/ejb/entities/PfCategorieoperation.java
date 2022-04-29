/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "pf_categorieoperation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PfCategorieoperation.findAll", query = "SELECT p FROM PfCategorieoperation p")
    , @NamedQuery(name = "PfCategorieoperation.findByIDPFCategorieOperation", query = "SELECT p FROM PfCategorieoperation p WHERE p.iDPFCategorieOperation = :iDPFCategorieOperation")
    , @NamedQuery(name = "PfCategorieoperation.findByLibelle", query = "SELECT p FROM PfCategorieoperation p WHERE p.libelle = :libelle")})
public class PfCategorieoperation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPF_CategorieOperation")
    private Integer iDPFCategorieOperation;
    @Size(max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @OneToMany(mappedBy = "iDPFCategorieOperation")
    private List<PfTypesupports> pfTypesupportsList;
    @OneToMany(mappedBy = "iDPFCategorieOperation")
    private List<PfSupports> pfSupportsList;

    public PfCategorieoperation() {
    }

    public PfCategorieoperation(Integer iDPFCategorieOperation) {
        this.iDPFCategorieOperation = iDPFCategorieOperation;
    }

    public Integer getIDPFCategorieOperation() {
        return iDPFCategorieOperation;
    }

    public void setIDPFCategorieOperation(Integer iDPFCategorieOperation) {
        this.iDPFCategorieOperation = iDPFCategorieOperation;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @XmlTransient
    public List<PfTypesupports> getPfTypesupportsList() {
        return pfTypesupportsList;
    }

    public void setPfTypesupportsList(List<PfTypesupports> pfTypesupportsList) {
        this.pfTypesupportsList = pfTypesupportsList;
    }

    @XmlTransient
    public List<PfSupports> getPfSupportsList() {
        return pfSupportsList;
    }

    public void setPfSupportsList(List<PfSupports> pfSupportsList) {
        this.pfSupportsList = pfSupportsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPFCategorieOperation != null ? iDPFCategorieOperation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PfCategorieoperation)) {
            return false;
        }
        PfCategorieoperation other = (PfCategorieoperation) object;
        if ((this.iDPFCategorieOperation == null && other.iDPFCategorieOperation != null) || (this.iDPFCategorieOperation != null && !this.iDPFCategorieOperation.equals(other.iDPFCategorieOperation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PfCategorieoperation[ iDPFCategorieOperation=" + iDPFCategorieOperation + " ]";
    }
    
}
