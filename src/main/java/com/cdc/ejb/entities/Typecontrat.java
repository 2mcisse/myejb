/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "typecontrat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Typecontrat.findAll", query = "SELECT t FROM Typecontrat t")
    , @NamedQuery(name = "Typecontrat.findByIDTypeContrat", query = "SELECT t FROM Typecontrat t WHERE t.iDTypeContrat = :iDTypeContrat")
    , @NamedQuery(name = "Typecontrat.findByLibelle", query = "SELECT t FROM Typecontrat t WHERE t.libelle = :libelle")})
public class Typecontrat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTypeContrat")
    private Integer iDTypeContrat;
    @Size(max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @OneToMany(mappedBy = "iDTypeContrat")
    private List<Contrats> contratsList;

    public Typecontrat() {
    }

    public Typecontrat(Integer iDTypeContrat) {
        this.iDTypeContrat = iDTypeContrat;
    }

    public Integer getIDTypeContrat() {
        return iDTypeContrat;
    }

    public void setIDTypeContrat(Integer iDTypeContrat) {
        this.iDTypeContrat = iDTypeContrat;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @XmlTransient
    public List<Contrats> getContratsList() {
        return contratsList;
    }

    public void setContratsList(List<Contrats> contratsList) {
        this.contratsList = contratsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDTypeContrat != null ? iDTypeContrat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Typecontrat)) {
            return false;
        }
        Typecontrat other = (Typecontrat) object;
        if ((this.iDTypeContrat == null && other.iDTypeContrat != null) || (this.iDTypeContrat != null && !this.iDTypeContrat.equals(other.iDTypeContrat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Typecontrat[ iDTypeContrat=" + iDTypeContrat + " ]";
    }
    
}
