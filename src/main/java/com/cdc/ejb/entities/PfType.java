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
@Table(name = "pf_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PfType.findAll", query = "SELECT p FROM PfType p")
    , @NamedQuery(name = "PfType.findByIdpfType", query = "SELECT p FROM PfType p WHERE p.idpfType = :idpfType")
    , @NamedQuery(name = "PfType.findByLibelle", query = "SELECT p FROM PfType p WHERE p.libelle = :libelle")})
public class PfType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPF_TYPE")
    private Integer idpfType;
    @Size(max = 150)
    @Column(name = "LIBELLE")
    private String libelle;
    @OneToMany(mappedBy = "idpfType")
    private List<PfTypeEnc> pfTypeEncList;

    public PfType() {
    }

    public PfType(Integer idpfType) {
        this.idpfType = idpfType;
    }

    public Integer getIdpfType() {
        return idpfType;
    }

    public void setIdpfType(Integer idpfType) {
        this.idpfType = idpfType;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @XmlTransient
    public List<PfTypeEnc> getPfTypeEncList() {
        return pfTypeEncList;
    }

    public void setPfTypeEncList(List<PfTypeEnc> pfTypeEncList) {
        this.pfTypeEncList = pfTypeEncList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpfType != null ? idpfType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PfType)) {
            return false;
        }
        PfType other = (PfType) object;
        if ((this.idpfType == null && other.idpfType != null) || (this.idpfType != null && !this.idpfType.equals(other.idpfType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PfType[ idpfType=" + idpfType + " ]";
    }
    
}
