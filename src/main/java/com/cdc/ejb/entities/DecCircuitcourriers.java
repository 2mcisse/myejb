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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "dec_circuitcourriers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecCircuitcourriers.findAll", query = "SELECT d FROM DecCircuitcourriers d")
    , @NamedQuery(name = "DecCircuitcourriers.findByNiveauSortie", query = "SELECT d FROM DecCircuitcourriers d WHERE d.niveauSortie = :niveauSortie")
    , @NamedQuery(name = "DecCircuitcourriers.findByNiveauEntree", query = "SELECT d FROM DecCircuitcourriers d WHERE d.niveauEntree = :niveauEntree")
    , @NamedQuery(name = "DecCircuitcourriers.findByAvis", query = "SELECT d FROM DecCircuitcourriers d WHERE d.avis = :avis")
    , @NamedQuery(name = "DecCircuitcourriers.findByIDTypeCourriers", query = "SELECT d FROM DecCircuitcourriers d WHERE d.iDTypeCourriers = :iDTypeCourriers")
    , @NamedQuery(name = "DecCircuitcourriers.findByTypeDoc", query = "SELECT d FROM DecCircuitcourriers d WHERE d.typeDoc = :typeDoc")
    , @NamedQuery(name = "DecCircuitcourriers.findByIdnatureoperation", query = "SELECT d FROM DecCircuitcourriers d WHERE d.idnatureoperation = :idnatureoperation")
    , @NamedQuery(name = "DecCircuitcourriers.findById", query = "SELECT d FROM DecCircuitcourriers d WHERE d.id = :id")})
public class DecCircuitcourriers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NiveauSortie")
    private short niveauSortie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NiveauEntree")
    private short niveauEntree;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Avis")
    private short avis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTypeCourriers")
    private int iDTypeCourriers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TypeDoc")
    private short typeDoc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNATUREOPERATION")
    private int idnatureoperation;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "IDNATUREOPERATIONTypeDoc", referencedColumnName = "IDNATUREOPERATIONTypeDoc")
    @ManyToOne(optional = false)
    private Natureoperationtypedoc iDNATUREOPERATIONTypeDoc;

    public DecCircuitcourriers() {
    }

    public DecCircuitcourriers(Integer id) {
        this.id = id;
    }

    public DecCircuitcourriers(Integer id, short niveauSortie, short niveauEntree, short avis, int iDTypeCourriers, short typeDoc, int idnatureoperation) {
        this.id = id;
        this.niveauSortie = niveauSortie;
        this.niveauEntree = niveauEntree;
        this.avis = avis;
        this.iDTypeCourriers = iDTypeCourriers;
        this.typeDoc = typeDoc;
        this.idnatureoperation = idnatureoperation;
    }

    public short getNiveauSortie() {
        return niveauSortie;
    }

    public void setNiveauSortie(short niveauSortie) {
        this.niveauSortie = niveauSortie;
    }

    public short getNiveauEntree() {
        return niveauEntree;
    }

    public void setNiveauEntree(short niveauEntree) {
        this.niveauEntree = niveauEntree;
    }

    public short getAvis() {
        return avis;
    }

    public void setAvis(short avis) {
        this.avis = avis;
    }

    public int getIDTypeCourriers() {
        return iDTypeCourriers;
    }

    public void setIDTypeCourriers(int iDTypeCourriers) {
        this.iDTypeCourriers = iDTypeCourriers;
    }

    public short getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(short typeDoc) {
        this.typeDoc = typeDoc;
    }

    public int getIdnatureoperation() {
        return idnatureoperation;
    }

    public void setIdnatureoperation(int idnatureoperation) {
        this.idnatureoperation = idnatureoperation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Natureoperationtypedoc getIDNATUREOPERATIONTypeDoc() {
        return iDNATUREOPERATIONTypeDoc;
    }

    public void setIDNATUREOPERATIONTypeDoc(Natureoperationtypedoc iDNATUREOPERATIONTypeDoc) {
        this.iDNATUREOPERATIONTypeDoc = iDNATUREOPERATIONTypeDoc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DecCircuitcourriers)) {
            return false;
        }
        DecCircuitcourriers other = (DecCircuitcourriers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecCircuitcourriers[ id=" + id + " ]";
    }
    
}
