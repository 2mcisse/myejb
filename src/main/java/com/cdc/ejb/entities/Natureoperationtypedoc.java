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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "natureoperationtypedoc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Natureoperationtypedoc.findAll", query = "SELECT n FROM Natureoperationtypedoc n")
    , @NamedQuery(name = "Natureoperationtypedoc.findByIDNATUREOPERATIONTypeDoc", query = "SELECT n FROM Natureoperationtypedoc n WHERE n.iDNATUREOPERATIONTypeDoc = :iDNATUREOPERATIONTypeDoc")
    , @NamedQuery(name = "Natureoperationtypedoc.findByTypeDoc", query = "SELECT n FROM Natureoperationtypedoc n WHERE n.typeDoc = :typeDoc")
    , @NamedQuery(name = "Natureoperationtypedoc.findByIdnatureoperation", query = "SELECT n FROM Natureoperationtypedoc n WHERE n.idnatureoperation = :idnatureoperation")})
public class Natureoperationtypedoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNATUREOPERATIONTypeDoc")
    private Integer iDNATUREOPERATIONTypeDoc;
    @Column(name = "TypeDoc")
    private Short typeDoc;
    @Column(name = "IDNATUREOPERATION")
    private Integer idnatureoperation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDNATUREOPERATIONTypeDoc")
    private List<DecCircuitcourriers> decCircuitcourriersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDNATUREOPERATIONTypeDoc")
    private List<DecGroupeEtapes> decGroupeEtapesList;

    public Natureoperationtypedoc() {
    }

    public Natureoperationtypedoc(Integer iDNATUREOPERATIONTypeDoc) {
        this.iDNATUREOPERATIONTypeDoc = iDNATUREOPERATIONTypeDoc;
    }

    public Integer getIDNATUREOPERATIONTypeDoc() {
        return iDNATUREOPERATIONTypeDoc;
    }

    public void setIDNATUREOPERATIONTypeDoc(Integer iDNATUREOPERATIONTypeDoc) {
        this.iDNATUREOPERATIONTypeDoc = iDNATUREOPERATIONTypeDoc;
    }

    public Short getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(Short typeDoc) {
        this.typeDoc = typeDoc;
    }

    public Integer getIdnatureoperation() {
        return idnatureoperation;
    }

    public void setIdnatureoperation(Integer idnatureoperation) {
        this.idnatureoperation = idnatureoperation;
    }

    @XmlTransient
    public List<DecCircuitcourriers> getDecCircuitcourriersList() {
        return decCircuitcourriersList;
    }

    public void setDecCircuitcourriersList(List<DecCircuitcourriers> decCircuitcourriersList) {
        this.decCircuitcourriersList = decCircuitcourriersList;
    }

    @XmlTransient
    public List<DecGroupeEtapes> getDecGroupeEtapesList() {
        return decGroupeEtapesList;
    }

    public void setDecGroupeEtapesList(List<DecGroupeEtapes> decGroupeEtapesList) {
        this.decGroupeEtapesList = decGroupeEtapesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDNATUREOPERATIONTypeDoc != null ? iDNATUREOPERATIONTypeDoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Natureoperationtypedoc)) {
            return false;
        }
        Natureoperationtypedoc other = (Natureoperationtypedoc) object;
        if ((this.iDNATUREOPERATIONTypeDoc == null && other.iDNATUREOPERATIONTypeDoc != null) || (this.iDNATUREOPERATIONTypeDoc != null && !this.iDNATUREOPERATIONTypeDoc.equals(other.iDNATUREOPERATIONTypeDoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Natureoperationtypedoc[ iDNATUREOPERATIONTypeDoc=" + iDNATUREOPERATIONTypeDoc + " ]";
    }
    
}
