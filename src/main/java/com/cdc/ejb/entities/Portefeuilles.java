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
@Table(name = "portefeuilles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Portefeuilles.findAll", query = "SELECT p FROM Portefeuilles p")
    , @NamedQuery(name = "Portefeuilles.findByIDPortefeuilles", query = "SELECT p FROM Portefeuilles p WHERE p.iDPortefeuilles = :iDPortefeuilles")
    , @NamedQuery(name = "Portefeuilles.findByLibelle", query = "SELECT p FROM Portefeuilles p WHERE p.libelle = :libelle")})
public class Portefeuilles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPortefeuilles")
    private Long iDPortefeuilles;
    @Size(max = 150)
    @Column(name = "LIBELLE")
    private String libelle;
    @OneToMany(mappedBy = "iDPortefeuilles")
    private List<Gerer> gererList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDPortefeuilles")
    private List<DecNatureoperation> decNatureoperationList;

    public Portefeuilles() {
    }

    public Portefeuilles(Long iDPortefeuilles) {
        this.iDPortefeuilles = iDPortefeuilles;
    }

    public Long getIDPortefeuilles() {
        return iDPortefeuilles;
    }

    public void setIDPortefeuilles(Long iDPortefeuilles) {
        this.iDPortefeuilles = iDPortefeuilles;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @XmlTransient
    public List<Gerer> getGererList() {
        return gererList;
    }

    public void setGererList(List<Gerer> gererList) {
        this.gererList = gererList;
    }

    @XmlTransient
    public List<DecNatureoperation> getDecNatureoperationList() {
        return decNatureoperationList;
    }

    public void setDecNatureoperationList(List<DecNatureoperation> decNatureoperationList) {
        this.decNatureoperationList = decNatureoperationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPortefeuilles != null ? iDPortefeuilles.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Portefeuilles)) {
            return false;
        }
        Portefeuilles other = (Portefeuilles) object;
        if ((this.iDPortefeuilles == null && other.iDPortefeuilles != null) || (this.iDPortefeuilles != null && !this.iDPortefeuilles.equals(other.iDPortefeuilles))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Portefeuilles[ iDPortefeuilles=" + iDPortefeuilles + " ]";
    }
    
}
