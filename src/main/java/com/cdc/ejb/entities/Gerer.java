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
@Table(name = "gerer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gerer.findAll", query = "SELECT g FROM Gerer g")
    , @NamedQuery(name = "Gerer.findByIdgerer", query = "SELECT g FROM Gerer g WHERE g.idgerer = :idgerer")
    , @NamedQuery(name = "Gerer.findByGestion", query = "SELECT g FROM Gerer g WHERE g.gestion = :gestion")})
public class Gerer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGERER")
    private Long idgerer;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne
    private Tiers numTiers;
    @JoinColumn(name = "IDPortefeuilles", referencedColumnName = "IDPortefeuilles")
    @ManyToOne
    private Portefeuilles iDPortefeuilles;

    public Gerer() {
    }

    public Gerer(Long idgerer) {
        this.idgerer = idgerer;
    }

    public Long getIdgerer() {
        return idgerer;
    }

    public void setIdgerer(Long idgerer) {
        this.idgerer = idgerer;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Tiers getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(Tiers numTiers) {
        this.numTiers = numTiers;
    }

    public Portefeuilles getIDPortefeuilles() {
        return iDPortefeuilles;
    }

    public void setIDPortefeuilles(Portefeuilles iDPortefeuilles) {
        this.iDPortefeuilles = iDPortefeuilles;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgerer != null ? idgerer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gerer)) {
            return false;
        }
        Gerer other = (Gerer) object;
        if ((this.idgerer == null && other.idgerer != null) || (this.idgerer != null && !this.idgerer.equals(other.idgerer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Gerer[ idgerer=" + idgerer + " ]";
    }
    
}
