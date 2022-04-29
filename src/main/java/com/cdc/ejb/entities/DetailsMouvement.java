/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "details_mouvement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetailsMouvement.findAll", query = "SELECT d FROM DetailsMouvement d")
    , @NamedQuery(name = "DetailsMouvement.findByIdunites", query = "SELECT d FROM DetailsMouvement d WHERE d.idunites = :idunites")
    , @NamedQuery(name = "DetailsMouvement.findByNombre", query = "SELECT d FROM DetailsMouvement d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "DetailsMouvement.findByPrixUnitraire", query = "SELECT d FROM DetailsMouvement d WHERE d.prixUnitraire = :prixUnitraire")
    , @NamedQuery(name = "DetailsMouvement.findByMontant", query = "SELECT d FROM DetailsMouvement d WHERE d.montant = :montant")
    , @NamedQuery(name = "DetailsMouvement.findByObservations", query = "SELECT d FROM DetailsMouvement d WHERE d.observations = :observations")
    , @NamedQuery(name = "DetailsMouvement.findBySpecifications", query = "SELECT d FROM DetailsMouvement d WHERE d.specifications = :specifications")
    , @NamedQuery(name = "DetailsMouvement.findByIddetailsMouvement", query = "SELECT d FROM DetailsMouvement d WHERE d.iddetailsMouvement = :iddetailsMouvement")
    , @NamedQuery(name = "DetailsMouvement.findByIdmouvements", query = "SELECT d FROM DetailsMouvement d WHERE d.idmouvements = :idmouvements")
    , @NamedQuery(name = "DetailsMouvement.findByIdsousComptes", query = "SELECT d FROM DetailsMouvement d WHERE d.idsousComptes = :idsousComptes")
    , @NamedQuery(name = "DetailsMouvement.findByIdsuiviPu", query = "SELECT d FROM DetailsMouvement d WHERE d.idsuiviPu = :idsuiviPu")
    , @NamedQuery(name = "DetailsMouvement.findByNumImmat", query = "SELECT d FROM DetailsMouvement d WHERE d.numImmat = :numImmat")
    , @NamedQuery(name = "DetailsMouvement.findByAnneeBudg", query = "SELECT d FROM DetailsMouvement d WHERE d.anneeBudg = :anneeBudg")
    , @NamedQuery(name = "DetailsMouvement.findByGestion", query = "SELECT d FROM DetailsMouvement d WHERE d.gestion = :gestion")})
public class DetailsMouvement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUNITES")
    private int idunites;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NOMBRE")
    private int nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRIX_UNITRAIRE")
    private BigDecimal prixUnitraire;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTANT")
    private BigDecimal montant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "OBSERVATIONS")
    private String observations;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "SPECIFICATIONS")
    private String specifications;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDETAILS_MOUVEMENT")
    private Integer iddetailsMouvement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMOUVEMENTS")
    private int idmouvements;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSOUS_COMPTES")
    private int idsousComptes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSUIVI_PU")
    private int idsuiviPu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NumImmat")
    private String numImmat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "AnneeBudg")
    private String anneeBudg;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;

    public DetailsMouvement() {
    }

    public DetailsMouvement(Integer iddetailsMouvement) {
        this.iddetailsMouvement = iddetailsMouvement;
    }

    public DetailsMouvement(Integer iddetailsMouvement, int idunites, int nombre, BigDecimal prixUnitraire, BigDecimal montant, String observations, String specifications, int idmouvements, int idsousComptes, int idsuiviPu, String numImmat, String anneeBudg) {
        this.iddetailsMouvement = iddetailsMouvement;
        this.idunites = idunites;
        this.nombre = nombre;
        this.prixUnitraire = prixUnitraire;
        this.montant = montant;
        this.observations = observations;
        this.specifications = specifications;
        this.idmouvements = idmouvements;
        this.idsousComptes = idsousComptes;
        this.idsuiviPu = idsuiviPu;
        this.numImmat = numImmat;
        this.anneeBudg = anneeBudg;
    }

    public int getIdunites() {
        return idunites;
    }

    public void setIdunites(int idunites) {
        this.idunites = idunites;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrixUnitraire() {
        return prixUnitraire;
    }

    public void setPrixUnitraire(BigDecimal prixUnitraire) {
        this.prixUnitraire = prixUnitraire;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public Integer getIddetailsMouvement() {
        return iddetailsMouvement;
    }

    public void setIddetailsMouvement(Integer iddetailsMouvement) {
        this.iddetailsMouvement = iddetailsMouvement;
    }

    public int getIdmouvements() {
        return idmouvements;
    }

    public void setIdmouvements(int idmouvements) {
        this.idmouvements = idmouvements;
    }

    public int getIdsousComptes() {
        return idsousComptes;
    }

    public void setIdsousComptes(int idsousComptes) {
        this.idsousComptes = idsousComptes;
    }

    public int getIdsuiviPu() {
        return idsuiviPu;
    }

    public void setIdsuiviPu(int idsuiviPu) {
        this.idsuiviPu = idsuiviPu;
    }

    public String getNumImmat() {
        return numImmat;
    }

    public void setNumImmat(String numImmat) {
        this.numImmat = numImmat;
    }

    public String getAnneeBudg() {
        return anneeBudg;
    }

    public void setAnneeBudg(String anneeBudg) {
        this.anneeBudg = anneeBudg;
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
        hash += (iddetailsMouvement != null ? iddetailsMouvement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetailsMouvement)) {
            return false;
        }
        DetailsMouvement other = (DetailsMouvement) object;
        if ((this.iddetailsMouvement == null && other.iddetailsMouvement != null) || (this.iddetailsMouvement != null && !this.iddetailsMouvement.equals(other.iddetailsMouvement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.DetailsMouvement[ iddetailsMouvement=" + iddetailsMouvement + " ]";
    }
    
}
