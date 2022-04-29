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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "dec_typeaffaire")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecTypeaffaire.findAll", query = "SELECT d FROM DecTypeaffaire d")
    , @NamedQuery(name = "DecTypeaffaire.findByIdtypeaffaire", query = "SELECT d FROM DecTypeaffaire d WHERE d.idtypeaffaire = :idtypeaffaire")
    , @NamedQuery(name = "DecTypeaffaire.findByCode", query = "SELECT d FROM DecTypeaffaire d WHERE d.code = :code")
    , @NamedQuery(name = "DecTypeaffaire.findByIntitule", query = "SELECT d FROM DecTypeaffaire d WHERE d.intitule = :intitule")})
public class DecTypeaffaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTYPEAFFAIRE")
    private Integer idtypeaffaire;
    @Size(max = 100)
    @Column(name = "Code")
    private String code;
    @Size(max = 100)
    @Column(name = "Intitule")
    private String intitule;
    @JoinColumn(name = "IDCategoriesTiers", referencedColumnName = "IDCategoriesTiers")
    @ManyToOne
    private Categoriestiers iDCategoriesTiers;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtypeaffaire")
    private List<DecAffaires> decAffairesList;

    public DecTypeaffaire() {
    }

    public DecTypeaffaire(Integer idtypeaffaire) {
        this.idtypeaffaire = idtypeaffaire;
    }

    public Integer getIdtypeaffaire() {
        return idtypeaffaire;
    }

    public void setIdtypeaffaire(Integer idtypeaffaire) {
        this.idtypeaffaire = idtypeaffaire;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Categoriestiers getIDCategoriesTiers() {
        return iDCategoriesTiers;
    }

    public void setIDCategoriesTiers(Categoriestiers iDCategoriesTiers) {
        this.iDCategoriesTiers = iDCategoriesTiers;
    }

    @XmlTransient
    public List<DecAffaires> getDecAffairesList() {
        return decAffairesList;
    }

    public void setDecAffairesList(List<DecAffaires> decAffairesList) {
        this.decAffairesList = decAffairesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtypeaffaire != null ? idtypeaffaire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DecTypeaffaire)) {
            return false;
        }
        DecTypeaffaire other = (DecTypeaffaire) object;
        if ((this.idtypeaffaire == null && other.idtypeaffaire != null) || (this.idtypeaffaire != null && !this.idtypeaffaire.equals(other.idtypeaffaire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecTypeaffaire[ idtypeaffaire=" + idtypeaffaire + " ]";
    }
    
}
