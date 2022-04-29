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
@Table(name = "pf_typesupports")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PfTypesupports.findAll", query = "SELECT p FROM PfTypesupports p")
    , @NamedQuery(name = "PfTypesupports.findByIdpfTypesupports", query = "SELECT p FROM PfTypesupports p WHERE p.idpfTypesupports = :idpfTypesupports")
    , @NamedQuery(name = "PfTypesupports.findByLibelle", query = "SELECT p FROM PfTypesupports p WHERE p.libelle = :libelle")
    , @NamedQuery(name = "PfTypesupports.findByIdentiter", query = "SELECT p FROM PfTypesupports p WHERE p.identiter = :identiter")
    , @NamedQuery(name = "PfTypesupports.findByTva", query = "SELECT p FROM PfTypesupports p WHERE p.tva = :tva")
    , @NamedQuery(name = "PfTypesupports.findByIrc", query = "SELECT p FROM PfTypesupports p WHERE p.irc = :irc")})
public class PfTypesupports implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPF_TYPESUPPORTS")
    private Integer idpfTypesupports;
    @Size(max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @Column(name = "Identiter")
    private Short identiter;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TVA")
    private Double tva;
    @Column(name = "IRC")
    private Double irc;
    @JoinColumn(name = "IDPF_CategorieOperation", referencedColumnName = "IDPF_CategorieOperation")
    @ManyToOne
    private PfCategorieoperation iDPFCategorieOperation;
    @OneToMany(mappedBy = "idpfTypesupports")
    private List<PfSupports> pfSupportsList;

    public PfTypesupports() {
    }

    public PfTypesupports(Integer idpfTypesupports) {
        this.idpfTypesupports = idpfTypesupports;
    }

    public Integer getIdpfTypesupports() {
        return idpfTypesupports;
    }

    public void setIdpfTypesupports(Integer idpfTypesupports) {
        this.idpfTypesupports = idpfTypesupports;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Short getIdentiter() {
        return identiter;
    }

    public void setIdentiter(Short identiter) {
        this.identiter = identiter;
    }

    public Double getTva() {
        return tva;
    }

    public void setTva(Double tva) {
        this.tva = tva;
    }

    public Double getIrc() {
        return irc;
    }

    public void setIrc(Double irc) {
        this.irc = irc;
    }

    public PfCategorieoperation getIDPFCategorieOperation() {
        return iDPFCategorieOperation;
    }

    public void setIDPFCategorieOperation(PfCategorieoperation iDPFCategorieOperation) {
        this.iDPFCategorieOperation = iDPFCategorieOperation;
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
        hash += (idpfTypesupports != null ? idpfTypesupports.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PfTypesupports)) {
            return false;
        }
        PfTypesupports other = (PfTypesupports) object;
        if ((this.idpfTypesupports == null && other.idpfTypesupports != null) || (this.idpfTypesupports != null && !this.idpfTypesupports.equals(other.idpfTypesupports))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PfTypesupports[ idpfTypesupports=" + idpfTypesupports + " ]";
    }
    
}
