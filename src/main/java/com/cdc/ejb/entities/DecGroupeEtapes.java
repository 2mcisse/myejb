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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "dec_groupe_etapes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecGroupeEtapes.findAll", query = "SELECT d FROM DecGroupeEtapes d")
    , @NamedQuery(name = "DecGroupeEtapes.findByIDTypeCourriers", query = "SELECT d FROM DecGroupeEtapes d WHERE d.iDTypeCourriers = :iDTypeCourriers")
    , @NamedQuery(name = "DecGroupeEtapes.findByNomGroupe", query = "SELECT d FROM DecGroupeEtapes d WHERE d.nomGroupe = :nomGroupe")
    , @NamedQuery(name = "DecGroupeEtapes.findByNiveau", query = "SELECT d FROM DecGroupeEtapes d WHERE d.niveau = :niveau")
    , @NamedQuery(name = "DecGroupeEtapes.findByTypeDoc", query = "SELECT d FROM DecGroupeEtapes d WHERE d.typeDoc = :typeDoc")
    , @NamedQuery(name = "DecGroupeEtapes.findById", query = "SELECT d FROM DecGroupeEtapes d WHERE d.id = :id")})
public class DecGroupeEtapes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTypeCourriers")
    private int iDTypeCourriers;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NomGroupe")
    private String nomGroupe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NIVEAU")
    private int niveau;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TypeDoc")
    private short typeDoc;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "IDNATUREOPERATION", referencedColumnName = "IDNATUREOPERATION")
    @ManyToOne(optional = false)
    private DecNatureoperation idnatureoperation;
    @JoinColumn(name = "IDNATUREOPERATIONTypeDoc", referencedColumnName = "IDNATUREOPERATIONTypeDoc")
    @ManyToOne(optional = false)
    private Natureoperationtypedoc iDNATUREOPERATIONTypeDoc;

    public DecGroupeEtapes() {
    }

    public DecGroupeEtapes(Integer id) {
        this.id = id;
    }

    public DecGroupeEtapes(Integer id, int iDTypeCourriers, String nomGroupe, int niveau, short typeDoc) {
        this.id = id;
        this.iDTypeCourriers = iDTypeCourriers;
        this.nomGroupe = nomGroupe;
        this.niveau = niveau;
        this.typeDoc = typeDoc;
    }

    public int getIDTypeCourriers() {
        return iDTypeCourriers;
    }

    public void setIDTypeCourriers(int iDTypeCourriers) {
        this.iDTypeCourriers = iDTypeCourriers;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public short getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(short typeDoc) {
        this.typeDoc = typeDoc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DecNatureoperation getIdnatureoperation() {
        return idnatureoperation;
    }

    public void setIdnatureoperation(DecNatureoperation idnatureoperation) {
        this.idnatureoperation = idnatureoperation;
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
        if (!(object instanceof DecGroupeEtapes)) {
            return false;
        }
        DecGroupeEtapes other = (DecGroupeEtapes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecGroupeEtapes[ id=" + id + " ]";
    }
    
}
