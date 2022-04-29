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
@Table(name = "groupe_etapes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GroupeEtapes.findAll", query = "SELECT g FROM GroupeEtapes g")
    , @NamedQuery(name = "GroupeEtapes.findByNiveau", query = "SELECT g FROM GroupeEtapes g WHERE g.niveau = :niveau")
    , @NamedQuery(name = "GroupeEtapes.findById", query = "SELECT g FROM GroupeEtapes g WHERE g.id = :id")})
public class GroupeEtapes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NIVEAU")
    private int niveau;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "IDTypeCourriers", referencedColumnName = "IDTypeCourriers")
    @ManyToOne(optional = false)
    private Typecourriers iDTypeCourriers;
    @JoinColumn(name = "NomGroupe", referencedColumnName = "NomGroupe")
    @ManyToOne(optional = false)
    private Groupes nomGroupe;

    public GroupeEtapes() {
    }

    public GroupeEtapes(Integer id) {
        this.id = id;
    }

    public GroupeEtapes(Integer id, int niveau) {
        this.id = id;
        this.niveau = niveau;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Typecourriers getIDTypeCourriers() {
        return iDTypeCourriers;
    }

    public void setIDTypeCourriers(Typecourriers iDTypeCourriers) {
        this.iDTypeCourriers = iDTypeCourriers;
    }

    public Groupes getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(Groupes nomGroupe) {
        this.nomGroupe = nomGroupe;
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
        if (!(object instanceof GroupeEtapes)) {
            return false;
        }
        GroupeEtapes other = (GroupeEtapes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.GroupeEtapes[ id=" + id + " ]";
    }
    
}
