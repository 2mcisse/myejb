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
import javax.persistence.ManyToMany;
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
@Table(name = "groupes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Groupes.findAll", query = "SELECT g FROM Groupes g")
    , @NamedQuery(name = "Groupes.findByNomGroupe", query = "SELECT g FROM Groupes g WHERE g.nomGroupe = :nomGroupe")
    , @NamedQuery(name = "Groupes.findByModule", query = "SELECT g FROM Groupes g WHERE g.module = :module")
    , @NamedQuery(name = "Groupes.findByCaissierGeneral", query = "SELECT g FROM Groupes g WHERE g.caissierGeneral = :caissierGeneral")
    , @NamedQuery(name = "Groupes.findByDg", query = "SELECT g FROM Groupes g WHERE g.dg = :dg")
    , @NamedQuery(name = "Groupes.findByVisa", query = "SELECT g FROM Groupes g WHERE g.visa = :visa")
    , @NamedQuery(name = "Groupes.findByAttributions", query = "SELECT g FROM Groupes g WHERE g.attributions = :attributions")})
public class Groupes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NomGroupe")
    private String nomGroupe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Module")
    private short module;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CaissierGeneral")
    private short caissierGeneral;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DG")
    private short dg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Visa")
    private short visa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Attributions")
    private short attributions;
    @ManyToMany(mappedBy = "groupesList")
    private List<Tiers> tiersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nomGroupe")
    private List<Representantsgroupe> representantsgroupeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nomGroupe")
    private List<GroupeEtapes> groupeEtapesList;

    public Groupes() {
    }

    public Groupes(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public Groupes(String nomGroupe, short module, short caissierGeneral, short dg, short visa, short attributions) {
        this.nomGroupe = nomGroupe;
        this.module = module;
        this.caissierGeneral = caissierGeneral;
        this.dg = dg;
        this.visa = visa;
        this.attributions = attributions;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public short getModule() {
        return module;
    }

    public void setModule(short module) {
        this.module = module;
    }

    public short getCaissierGeneral() {
        return caissierGeneral;
    }

    public void setCaissierGeneral(short caissierGeneral) {
        this.caissierGeneral = caissierGeneral;
    }

    public short getDg() {
        return dg;
    }

    public void setDg(short dg) {
        this.dg = dg;
    }

    public short getVisa() {
        return visa;
    }

    public void setVisa(short visa) {
        this.visa = visa;
    }

    public short getAttributions() {
        return attributions;
    }

    public void setAttributions(short attributions) {
        this.attributions = attributions;
    }

    @XmlTransient
    public List<Tiers> getTiersList() {
        return tiersList;
    }

    public void setTiersList(List<Tiers> tiersList) {
        this.tiersList = tiersList;
    }

    @XmlTransient
    public List<Representantsgroupe> getRepresentantsgroupeList() {
        return representantsgroupeList;
    }

    public void setRepresentantsgroupeList(List<Representantsgroupe> representantsgroupeList) {
        this.representantsgroupeList = representantsgroupeList;
    }

    @XmlTransient
    public List<GroupeEtapes> getGroupeEtapesList() {
        return groupeEtapesList;
    }

    public void setGroupeEtapesList(List<GroupeEtapes> groupeEtapesList) {
        this.groupeEtapesList = groupeEtapesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nomGroupe != null ? nomGroupe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groupes)) {
            return false;
        }
        Groupes other = (Groupes) object;
        if ((this.nomGroupe == null && other.nomGroupe != null) || (this.nomGroupe != null && !this.nomGroupe.equals(other.nomGroupe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Groupes[ nomGroupe=" + nomGroupe + " ]";
    }
    
}
