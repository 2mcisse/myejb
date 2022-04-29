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
@Table(name = "nature_biens1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NatureBiens1.findAll", query = "SELECT n FROM NatureBiens1 n")
    , @NamedQuery(name = "NatureBiens1.findByIdnatureBiens", query = "SELECT n FROM NatureBiens1 n WHERE n.idnatureBiens = :idnatureBiens")
    , @NamedQuery(name = "NatureBiens1.findByLibelle", query = "SELECT n FROM NatureBiens1 n WHERE n.libelle = :libelle")})
public class NatureBiens1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNATURE_BIENS")
    private Integer idnatureBiens;
    @Size(max = 150)
    @Column(name = "LIBELLE")
    private String libelle;
    @OneToMany(mappedBy = "idnatureBiens")
    private List<PfSupports> pfSupportsList;

    public NatureBiens1() {
    }

    public NatureBiens1(Integer idnatureBiens) {
        this.idnatureBiens = idnatureBiens;
    }

    public Integer getIdnatureBiens() {
        return idnatureBiens;
    }

    public void setIdnatureBiens(Integer idnatureBiens) {
        this.idnatureBiens = idnatureBiens;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @XmlTransient
    public List<PfSupports> getPfSupportsList() {
        return pfSupportsList;
    }

    public void setPfSupportsList(List<PfSupports> pfSupportsList) {
        this.pfSupportsList = pfSupportsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnatureBiens != null ? idnatureBiens.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NatureBiens1)) {
            return false;
        }
        NatureBiens1 other = (NatureBiens1) object;
        if ((this.idnatureBiens == null && other.idnatureBiens != null) || (this.idnatureBiens != null && !this.idnatureBiens.equals(other.idnatureBiens))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.NatureBiens1[ idnatureBiens=" + idnatureBiens + " ]";
    }
    
}
