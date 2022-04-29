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
@Table(name = "etatges")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etatges.findAll", query = "SELECT e FROM Etatges e")
    , @NamedQuery(name = "Etatges.findByIdetatges", query = "SELECT e FROM Etatges e WHERE e.idetatges = :idetatges")
    , @NamedQuery(name = "Etatges.findByNumero", query = "SELECT e FROM Etatges e WHERE e.numero = :numero")
    , @NamedQuery(name = "Etatges.findByLibelle", query = "SELECT e FROM Etatges e WHERE e.libelle = :libelle")})
public class Etatges implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDETATGES")
    private Integer idetatges;
    @Size(max = 50)
    @Column(name = "Numero")
    private String numero;
    @Size(max = 100)
    @Column(name = "LIBELLE")
    private String libelle;

    public Etatges() {
    }

    public Etatges(Integer idetatges) {
        this.idetatges = idetatges;
    }

    public Integer getIdetatges() {
        return idetatges;
    }

    public void setIdetatges(Integer idetatges) {
        this.idetatges = idetatges;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idetatges != null ? idetatges.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etatges)) {
            return false;
        }
        Etatges other = (Etatges) object;
        if ((this.idetatges == null && other.idetatges != null) || (this.idetatges != null && !this.idetatges.equals(other.idetatges))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Etatges[ idetatges=" + idetatges + " ]";
    }
    
}
