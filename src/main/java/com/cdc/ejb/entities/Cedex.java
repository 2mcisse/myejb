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
@Table(name = "cedex")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cedex.findAll", query = "SELECT c FROM Cedex c")
    , @NamedQuery(name = "Cedex.findByIDCedex", query = "SELECT c FROM Cedex c WHERE c.iDCedex = :iDCedex")
    , @NamedQuery(name = "Cedex.findByVille", query = "SELECT c FROM Cedex c WHERE c.ville = :ville")
    , @NamedQuery(name = "Cedex.findByCodePostal", query = "SELECT c FROM Cedex c WHERE c.codePostal = :codePostal")
    , @NamedQuery(name = "Cedex.findByGestion", query = "SELECT c FROM Cedex c WHERE c.gestion = :gestion")})
public class Cedex implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCedex")
    private Long iDCedex;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Ville")
    private String ville;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "CodePostal")
    private String codePostal;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public Cedex() {
    }

    public Cedex(Long iDCedex) {
        this.iDCedex = iDCedex;
    }

    public Cedex(Long iDCedex, String ville, String codePostal) {
        this.iDCedex = iDCedex;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public Long getIDCedex() {
        return iDCedex;
    }

    public void setIDCedex(Long iDCedex) {
        this.iDCedex = iDCedex;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCedex != null ? iDCedex.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cedex)) {
            return false;
        }
        Cedex other = (Cedex) object;
        if ((this.iDCedex == null && other.iDCedex != null) || (this.iDCedex != null && !this.iDCedex.equals(other.iDCedex))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Cedex[ iDCedex=" + iDCedex + " ]";
    }
    
}
