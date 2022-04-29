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
@Table(name = "wikiattache")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Wikiattache.findAll", query = "SELECT w FROM Wikiattache w")
    , @NamedQuery(name = "Wikiattache.findByIDWIKIAttache", query = "SELECT w FROM Wikiattache w WHERE w.iDWIKIAttache = :iDWIKIAttache")
    , @NamedQuery(name = "Wikiattache.findByCle", query = "SELECT w FROM Wikiattache w WHERE w.cle = :cle")})
public class Wikiattache implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDWIKIAttache")
    private Integer iDWIKIAttache;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "Cle")
    private String cle;
    @JoinColumn(name = "IDWIKI", referencedColumnName = "IDWIKI")
    @ManyToOne(optional = false)
    private Wiki idwiki;

    public Wikiattache() {
    }

    public Wikiattache(Integer iDWIKIAttache) {
        this.iDWIKIAttache = iDWIKIAttache;
    }

    public Wikiattache(Integer iDWIKIAttache, String cle) {
        this.iDWIKIAttache = iDWIKIAttache;
        this.cle = cle;
    }

    public Integer getIDWIKIAttache() {
        return iDWIKIAttache;
    }

    public void setIDWIKIAttache(Integer iDWIKIAttache) {
        this.iDWIKIAttache = iDWIKIAttache;
    }

    public String getCle() {
        return cle;
    }

    public void setCle(String cle) {
        this.cle = cle;
    }

    public Wiki getIdwiki() {
        return idwiki;
    }

    public void setIdwiki(Wiki idwiki) {
        this.idwiki = idwiki;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDWIKIAttache != null ? iDWIKIAttache.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Wikiattache)) {
            return false;
        }
        Wikiattache other = (Wikiattache) object;
        if ((this.iDWIKIAttache == null && other.iDWIKIAttache != null) || (this.iDWIKIAttache != null && !this.iDWIKIAttache.equals(other.iDWIKIAttache))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Wikiattache[ iDWIKIAttache=" + iDWIKIAttache + " ]";
    }
    
}
