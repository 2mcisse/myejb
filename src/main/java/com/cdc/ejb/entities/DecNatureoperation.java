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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "dec_natureoperation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DecNatureoperation.findAll", query = "SELECT d FROM DecNatureoperation d")
    , @NamedQuery(name = "DecNatureoperation.findByIdnatureoperation", query = "SELECT d FROM DecNatureoperation d WHERE d.idnatureoperation = :idnatureoperation")
    , @NamedQuery(name = "DecNatureoperation.findByCode", query = "SELECT d FROM DecNatureoperation d WHERE d.code = :code")
    , @NamedQuery(name = "DecNatureoperation.findByIntitule", query = "SELECT d FROM DecNatureoperation d WHERE d.intitule = :intitule")
    , @NamedQuery(name = "DecNatureoperation.findByType", query = "SELECT d FROM DecNatureoperation d WHERE d.type = :type")
    , @NamedQuery(name = "DecNatureoperation.findByNumerocompteAttente", query = "SELECT d FROM DecNatureoperation d WHERE d.numerocompteAttente = :numerocompteAttente")
    , @NamedQuery(name = "DecNatureoperation.findByNumerocompteAttenteRestitution", query = "SELECT d FROM DecNatureoperation d WHERE d.numerocompteAttenteRestitution = :numerocompteAttenteRestitution")
    , @NamedQuery(name = "DecNatureoperation.findByNature", query = "SELECT d FROM DecNatureoperation d WHERE d.nature = :nature")
    , @NamedQuery(name = "DecNatureoperation.findByUtiliseCompteTiers", query = "SELECT d FROM DecNatureoperation d WHERE d.utiliseCompteTiers = :utiliseCompteTiers")
    , @NamedQuery(name = "DecNatureoperation.findByAvecAffaire", query = "SELECT d FROM DecNatureoperation d WHERE d.avecAffaire = :avecAffaire")
    , @NamedQuery(name = "DecNatureoperation.findByAvecInteret", query = "SELECT d FROM DecNatureoperation d WHERE d.avecInteret = :avecInteret")
    , @NamedQuery(name = "DecNatureoperation.findByTaux", query = "SELECT d FROM DecNatureoperation d WHERE d.taux = :taux")
    , @NamedQuery(name = "DecNatureoperation.findByTraiterComme", query = "SELECT d FROM DecNatureoperation d WHERE d.traiterComme = :traiterComme")})
public class DecNatureoperation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNATUREOPERATION")
    private Integer idnatureoperation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Intitule")
    private String intitule;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type")
    private short type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumerocompteAttente")
    private String numerocompteAttente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumerocompteAttenteRestitution")
    private String numerocompteAttenteRestitution;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Nature")
    private short nature;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UtiliseCompteTiers")
    private short utiliseCompteTiers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AvecAffaire")
    private short avecAffaire;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AvecInteret")
    private short avecInteret;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Taux")
    private double taux;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TraiterComme")
    private short traiterComme;
    @JoinTable(name = "tiers_du_natureoperation", joinColumns = {
        @JoinColumn(name = "IDNATUREOPERATION", referencedColumnName = "IDNATUREOPERATION")}, inverseJoinColumns = {
        @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")})
    @ManyToMany
    private List<Tiers> tiersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnatureoperation")
    private List<Encaissements> encaissementsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnatureoperation")
    private List<DemandesRestitution> demandesRestitutionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnatureoperation")
    private List<DecReception> decReceptionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnatureoperation")
    private List<DecTitredeperception> decTitredeperceptionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnatureoperation")
    private List<DecSousnatureoperation> decSousnatureoperationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnatureoperation")
    private List<DecRestitution> decRestitutionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnatureoperation")
    private List<DecAutorisationderestitution> decAutorisationderestitutionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnatureoperation")
    private List<DecGroupeEtapes> decGroupeEtapesList;
    @JoinColumn(name = "NumeroCompte", referencedColumnName = "NumeroCompte")
    @ManyToOne(optional = false)
    private Compte numeroCompte;
    @JoinColumn(name = "IDPortefeuilles", referencedColumnName = "IDPortefeuilles")
    @ManyToOne(optional = false)
    private Portefeuilles iDPortefeuilles;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idnatureoperation")
    private List<DecAffaires> decAffairesList;

    public DecNatureoperation() {
    }

    public DecNatureoperation(Integer idnatureoperation) {
        this.idnatureoperation = idnatureoperation;
    }

    public DecNatureoperation(Integer idnatureoperation, String code, String intitule, short type, String numerocompteAttente, String numerocompteAttenteRestitution, short nature, short utiliseCompteTiers, short avecAffaire, short avecInteret, double taux, short traiterComme) {
        this.idnatureoperation = idnatureoperation;
        this.code = code;
        this.intitule = intitule;
        this.type = type;
        this.numerocompteAttente = numerocompteAttente;
        this.numerocompteAttenteRestitution = numerocompteAttenteRestitution;
        this.nature = nature;
        this.utiliseCompteTiers = utiliseCompteTiers;
        this.avecAffaire = avecAffaire;
        this.avecInteret = avecInteret;
        this.taux = taux;
        this.traiterComme = traiterComme;
    }

    public Integer getIdnatureoperation() {
        return idnatureoperation;
    }

    public void setIdnatureoperation(Integer idnatureoperation) {
        this.idnatureoperation = idnatureoperation;
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

    public short getType() {
        return type;
    }

    public void setType(short type) {
        this.type = type;
    }

    public String getNumerocompteAttente() {
        return numerocompteAttente;
    }

    public void setNumerocompteAttente(String numerocompteAttente) {
        this.numerocompteAttente = numerocompteAttente;
    }

    public String getNumerocompteAttenteRestitution() {
        return numerocompteAttenteRestitution;
    }

    public void setNumerocompteAttenteRestitution(String numerocompteAttenteRestitution) {
        this.numerocompteAttenteRestitution = numerocompteAttenteRestitution;
    }

    public short getNature() {
        return nature;
    }

    public void setNature(short nature) {
        this.nature = nature;
    }

    public short getUtiliseCompteTiers() {
        return utiliseCompteTiers;
    }

    public void setUtiliseCompteTiers(short utiliseCompteTiers) {
        this.utiliseCompteTiers = utiliseCompteTiers;
    }

    public short getAvecAffaire() {
        return avecAffaire;
    }

    public void setAvecAffaire(short avecAffaire) {
        this.avecAffaire = avecAffaire;
    }

    public short getAvecInteret() {
        return avecInteret;
    }

    public void setAvecInteret(short avecInteret) {
        this.avecInteret = avecInteret;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public short getTraiterComme() {
        return traiterComme;
    }

    public void setTraiterComme(short traiterComme) {
        this.traiterComme = traiterComme;
    }

    @XmlTransient
    public List<Tiers> getTiersList() {
        return tiersList;
    }

    public void setTiersList(List<Tiers> tiersList) {
        this.tiersList = tiersList;
    }

    @XmlTransient
    public List<Encaissements> getEncaissementsList() {
        return encaissementsList;
    }

    public void setEncaissementsList(List<Encaissements> encaissementsList) {
        this.encaissementsList = encaissementsList;
    }

    @XmlTransient
    public List<DemandesRestitution> getDemandesRestitutionList() {
        return demandesRestitutionList;
    }

    public void setDemandesRestitutionList(List<DemandesRestitution> demandesRestitutionList) {
        this.demandesRestitutionList = demandesRestitutionList;
    }

    @XmlTransient
    public List<DecReception> getDecReceptionList() {
        return decReceptionList;
    }

    public void setDecReceptionList(List<DecReception> decReceptionList) {
        this.decReceptionList = decReceptionList;
    }

    @XmlTransient
    public List<DecTitredeperception> getDecTitredeperceptionList() {
        return decTitredeperceptionList;
    }

    public void setDecTitredeperceptionList(List<DecTitredeperception> decTitredeperceptionList) {
        this.decTitredeperceptionList = decTitredeperceptionList;
    }

    @XmlTransient
    public List<DecSousnatureoperation> getDecSousnatureoperationList() {
        return decSousnatureoperationList;
    }

    public void setDecSousnatureoperationList(List<DecSousnatureoperation> decSousnatureoperationList) {
        this.decSousnatureoperationList = decSousnatureoperationList;
    }

    @XmlTransient
    public List<DecRestitution> getDecRestitutionList() {
        return decRestitutionList;
    }

    public void setDecRestitutionList(List<DecRestitution> decRestitutionList) {
        this.decRestitutionList = decRestitutionList;
    }

    @XmlTransient
    public List<DecAutorisationderestitution> getDecAutorisationderestitutionList() {
        return decAutorisationderestitutionList;
    }

    public void setDecAutorisationderestitutionList(List<DecAutorisationderestitution> decAutorisationderestitutionList) {
        this.decAutorisationderestitutionList = decAutorisationderestitutionList;
    }

    @XmlTransient
    public List<DecGroupeEtapes> getDecGroupeEtapesList() {
        return decGroupeEtapesList;
    }

    public void setDecGroupeEtapesList(List<DecGroupeEtapes> decGroupeEtapesList) {
        this.decGroupeEtapesList = decGroupeEtapesList;
    }

    public Compte getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(Compte numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public Portefeuilles getIDPortefeuilles() {
        return iDPortefeuilles;
    }

    public void setIDPortefeuilles(Portefeuilles iDPortefeuilles) {
        this.iDPortefeuilles = iDPortefeuilles;
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
        hash += (idnatureoperation != null ? idnatureoperation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DecNatureoperation)) {
            return false;
        }
        DecNatureoperation other = (DecNatureoperation) object;
        if ((this.idnatureoperation == null && other.idnatureoperation != null) || (this.idnatureoperation != null && !this.idnatureoperation.equals(other.idnatureoperation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DecNatureoperation[ idnatureoperation=" + idnatureoperation + " ]";
    }
    
}
