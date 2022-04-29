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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "gestions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gestions.findAll", query = "SELECT g FROM Gestions g")
    , @NamedQuery(name = "Gestions.findByGestion", query = "SELECT g FROM Gestions g WHERE g.gestion = :gestion")})
public class Gestions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gestion")
    private List<Periodes> periodesList;

    public Gestions() {
    }

    public Gestions(String gestion) {
        this.gestion = gestion;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Periodes> getPeriodesList() {
        return periodesList;
    }

    public void setPeriodesList(List<Periodes> periodesList) {
        this.periodesList = periodesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gestion != null ? gestion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gestions)) {
            return false;
        }
        Gestions other = (Gestions) object;
        if ((this.gestion == null && other.gestion != null) || (this.gestion != null && !this.gestion.equals(other.gestion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Gestions[ gestion=" + gestion + " ]";
    }
    
}
