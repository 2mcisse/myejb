/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "dec_sousnatureoperation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecSousnatureoperation.findAll", query = "SELECT d FROM DecSousnatureoperation d")
    , @NamedQuery(name = "DecSousnatureoperation.findByIDSousNATUREOPERATION", query = "SELECT d FROM DecSousnatureoperation d WHERE d.iDSousNATUREOPERATION = :iDSousNATUREOPERATION")
    , @NamedQuery(name = "DecSousnatureoperation.findByCode", query = "SELECT d FROM DecSousnatureoperation d WHERE d.code = :code")
    , @NamedQuery(name = "DecSousnatureoperation.findByIntitule", query = "SELECT d FROM DecSousnatureoperation d WHERE d.intitule = :intitule")})
public class DecSousnatureoperation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSousNATUREOPERATION")
    private Integer iDSousNATUREOPERATION;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Intitule")
    private String intitule;
    @JoinColumn(name = "IDNATUREOPERATION", referencedColumnName = "IDNATUREOPERATION")
    @ManyToOne(optional = false)
    private DecNatureoperation idnatureoperation;

    public DecSousnatureoperation() {
    }

    public DecSousnatureoperation(Integer iDSousNATUREOPERATION) {
        this.iDSousNATUREOPERATION = iDSousNATUREOPERATION;
    }

    public DecSousnatureoperation(Integer iDSousNATUREOPERATION, String code, String intitule) {
        this.iDSousNATUREOPERATION = iDSousNATUREOPERATION;
        this.code = code;
        this.intitule = intitule;
    }

    public Integer getIDSousNATUREOPERATION() {
        return iDSousNATUREOPERATION;
    }

    public void setIDSousNATUREOPERATION(Integer iDSousNATUREOPERATION) {
        this.iDSousNATUREOPERATION = iDSousNATUREOPERATION;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public DecNatureoperation getIdnatureoperation() {
        return idnatureoperation;
    }

    public void setIdnatureoperation(DecNatureoperation idnatureoperation) {
        this.idnatureoperation = idnatureoperation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDSousNATUREOPERATION != null ? iDSousNATUREOPERATION.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DecSousnatureoperation)) {
            return false;
        }
        DecSousnatureoperation other = (DecSousnatureoperation) object;
        if ((this.iDSousNATUREOPERATION == null && other.iDSousNATUREOPERATION != null) || (this.iDSousNATUREOPERATION != null && !this.iDSousNATUREOPERATION.equals(other.iDSousNATUREOPERATION))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecSousnatureoperation[ iDSousNATUREOPERATION=" + iDSousNATUREOPERATION + " ]";
    }
    
}
