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
@Table(name = "etablissementgestionnaire")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etablissementgestionnaire.findAll", query = "SELECT e FROM Etablissementgestionnaire e")
    , @NamedQuery(name = "Etablissementgestionnaire.findByEtablissementGestionnaire", query = "SELECT e FROM Etablissementgestionnaire e WHERE e.etablissementGestionnaire = :etablissementGestionnaire")
    , @NamedQuery(name = "Etablissementgestionnaire.findByCodeEtablis", query = "SELECT e FROM Etablissementgestionnaire e WHERE e.codeEtablis = :codeEtablis")
    , @NamedQuery(name = "Etablissementgestionnaire.findBySigle", query = "SELECT e FROM Etablissementgestionnaire e WHERE e.sigle = :sigle")
    , @NamedQuery(name = "Etablissementgestionnaire.findByDesignation", query = "SELECT e FROM Etablissementgestionnaire e WHERE e.designation = :designation")
    , @NamedQuery(name = "Etablissementgestionnaire.findByType", query = "SELECT e FROM Etablissementgestionnaire e WHERE e.type = :type")})
public class Etablissementgestionnaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EtablissementGestionnaire")
    private Integer etablissementGestionnaire;
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
    @Column(name = "type")
    private short type;
    @OneToMany(mappedBy = "etablissementGestionnaire")
    private List<PfSupports> pfSupportsList;

    public Etablissementgestionnaire() {
    }

    public Etablissementgestionnaire(Integer etablissementGestionnaire) {
        this.etablissementGestionnaire = etablissementGestionnaire;
    }

    public Etablissementgestionnaire(Integer etablissementGestionnaire, String codeEtablis, String sigle, String designation, short type) {
        this.etablissementGestionnaire = etablissementGestionnaire;
        this.codeEtablis = codeEtablis;
        this.sigle = sigle;
        this.designation = designation;
        this.type = type;
    }

    public Integer getEtablissementGestionnaire() {
        return etablissementGestionnaire;
    }

    public void setEtablissementGestionnaire(Integer etablissementGestionnaire) {
        this.etablissementGestionnaire = etablissementGestionnaire;
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

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
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
        hash += (etablissementGestionnaire != null ? etablissementGestionnaire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etablissementgestionnaire)) {
            return false;
        }
        Etablissementgestionnaire other = (Etablissementgestionnaire) object;
        if ((this.etablissementGestionnaire == null && other.etablissementGestionnaire != null) || (this.etablissementGestionnaire != null && !this.etablissementGestionnaire.equals(other.etablissementGestionnaire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Etablissementgestionnaire[ etablissementGestionnaire=" + etablissementGestionnaire + " ]";
    }
    
}
