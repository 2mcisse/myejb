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
@Table(name = "etapescourriers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etapescourriers.findAll", query = "SELECT e FROM Etapescourriers e")
    , @NamedQuery(name = "Etapescourriers.findByIdetapes", query = "SELECT e FROM Etapescourriers e WHERE e.idetapes = :idetapes")
    , @NamedQuery(name = "Etapescourriers.findByNiveau", query = "SELECT e FROM Etapescourriers e WHERE e.niveau = :niveau")
    , @NamedQuery(name = "Etapescourriers.findByDescription", query = "SELECT e FROM Etapescourriers e WHERE e.description = :description")
    , @NamedQuery(name = "Etapescourriers.findByFinProcessus", query = "SELECT e FROM Etapescourriers e WHERE e.finProcessus = :finProcessus")})
public class Etapescourriers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDETAPES")
    private Integer idetapes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Niveau")
    private short niveau;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FinProcessus")
    private short finProcessus;

    public Etapescourriers() {
    }

    public Etapescourriers(Integer idetapes) {
        this.idetapes = idetapes;
    }

    public Etapescourriers(Integer idetapes, short niveau, String description, short finProcessus) {
        this.idetapes = idetapes;
        this.niveau = niveau;
        this.description = description;
        this.finProcessus = finProcessus;
    }

    public Integer getIdetapes() {
        return idetapes;
    }

    public void setIdetapes(Integer idetapes) {
        this.idetapes = idetapes;
    }

    public short getNiveau() {
        return niveau;
    }

    public void setNiveau(short niveau) {
        this.niveau = niveau;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public short getFinProcessus() {
        return finProcessus;
    }

    public void setFinProcessus(short finProcessus) {
        this.finProcessus = finProcessus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idetapes != null ? idetapes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etapescourriers)) {
            return false;
        }
        Etapescourriers other = (Etapescourriers) object;
        if ((this.idetapes == null && other.idetapes != null) || (this.idetapes != null && !this.idetapes.equals(other.idetapes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Etapescourriers[ idetapes=" + idetapes + " ]";
    }
    
}
