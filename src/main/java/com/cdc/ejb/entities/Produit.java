/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "produit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p")
    , @NamedQuery(name = "Produit.findByLibProd", query = "SELECT p FROM Produit p WHERE p.libProd = :libProd")
    , @NamedQuery(name = "Produit.findByPrixHT", query = "SELECT p FROM Produit p WHERE p.prixHT = :prixHT")
    , @NamedQuery(name = "Produit.findByQteReappro", query = "SELECT p FROM Produit p WHERE p.qteReappro = :qteReappro")
    , @NamedQuery(name = "Produit.findByQteMini", query = "SELECT p FROM Produit p WHERE p.qteMini = :qteMini")
    , @NamedQuery(name = "Produit.findByReference", query = "SELECT p FROM Produit p WHERE p.reference = :reference")
    , @NamedQuery(name = "Produit.findByTauxTVA", query = "SELECT p FROM Produit p WHERE p.tauxTVA = :tauxTVA")
    , @NamedQuery(name = "Produit.findByPlusAuCatalogue", query = "SELECT p FROM Produit p WHERE p.plusAuCatalogue = :plusAuCatalogue")
    , @NamedQuery(name = "Produit.findByGenCode", query = "SELECT p FROM Produit p WHERE p.genCode = :genCode")
    , @NamedQuery(name = "Produit.findByCodeBarre", query = "SELECT p FROM Produit p WHERE p.codeBarre = :codeBarre")
    , @NamedQuery(name = "Produit.findBySaisiPar", query = "SELECT p FROM Produit p WHERE p.saisiPar = :saisiPar")
    , @NamedQuery(name = "Produit.findBySaisiLe", query = "SELECT p FROM Produit p WHERE p.saisiLe = :saisiLe")
    , @NamedQuery(name = "Produit.findByPrixVente", query = "SELECT p FROM Produit p WHERE p.prixVente = :prixVente")})
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "LibProd")
    private String libProd;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "Photo")
    private byte[] photo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "PrixHT")
    private BigDecimal prixHT;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QteReappro")
    private int qteReappro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QteMini")
    private int qteMini;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Reference")
    private String reference;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TauxTVA")
    private double tauxTVA;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PlusAuCatalogue")
    private short plusAuCatalogue;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "GenCode")
    private String genCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CodeBarre")
    private String codeBarre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "SaisiPar")
    private String saisiPar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SaisiLe")
    @Temporal(TemporalType.DATE)
    private Date saisiLe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PrixVente")
    private BigDecimal prixVente;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne(optional = false)
    private Tiers numTiers;
    @JoinColumn(name = "Libcategorie", referencedColumnName = "Libcategorie")
    @ManyToOne(optional = false)
    private Categorie libcategorie;

    public Produit() {
    }

    public Produit(String reference) {
        this.reference = reference;
    }

    public Produit(String reference, String libProd, byte[] photo, BigDecimal prixHT, int qteReappro, int qteMini, double tauxTVA, String description, short plusAuCatalogue, String genCode, String codeBarre, String saisiPar, Date saisiLe, BigDecimal prixVente) {
        this.reference = reference;
        this.libProd = libProd;
        this.photo = photo;
        this.prixHT = prixHT;
        this.qteReappro = qteReappro;
        this.qteMini = qteMini;
        this.tauxTVA = tauxTVA;
        this.description = description;
        this.plusAuCatalogue = plusAuCatalogue;
        this.genCode = genCode;
        this.codeBarre = codeBarre;
        this.saisiPar = saisiPar;
        this.saisiLe = saisiLe;
        this.prixVente = prixVente;
    }

    public String getLibProd() {
        return libProd;
    }

    public void setLibProd(String libProd) {
        this.libProd = libProd;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public BigDecimal getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(BigDecimal prixHT) {
        this.prixHT = prixHT;
    }

    public int getQteReappro() {
        return qteReappro;
    }

    public void setQteReappro(int qteReappro) {
        this.qteReappro = qteReappro;
    }

    public int getQteMini() {
        return qteMini;
    }

    public void setQteMini(int qteMini) {
        this.qteMini = qteMini;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getTauxTVA() {
        return tauxTVA;
    }

    public void setTauxTVA(double tauxTVA) {
        this.tauxTVA = tauxTVA;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public short getPlusAuCatalogue() {
        return plusAuCatalogue;
    }

    public void setPlusAuCatalogue(short plusAuCatalogue) {
        this.plusAuCatalogue = plusAuCatalogue;
    }

    public String getGenCode() {
        return genCode;
    }

    public void setGenCode(String genCode) {
        this.genCode = genCode;
    }

    public String getCodeBarre() {
        return codeBarre;
    }

    public void setCodeBarre(String codeBarre) {
        this.codeBarre = codeBarre;
    }

    public String getSaisiPar() {
        return saisiPar;
    }

    public void setSaisiPar(String saisiPar) {
        this.saisiPar = saisiPar;
    }

    public Date getSaisiLe() {
        return saisiLe;
    }

    public void setSaisiLe(Date saisiLe) {
        this.saisiLe = saisiLe;
    }

    public BigDecimal getPrixVente() {
        return prixVente;
    }

    public void setPrixVente(BigDecimal prixVente) {
        this.prixVente = prixVente;
    }

    public Tiers getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(Tiers numTiers) {
        this.numTiers = numTiers;
    }

    public Categorie getLibcategorie() {
        return libcategorie;
    }

    public void setLibcategorie(Categorie libcategorie) {
        this.libcategorie = libcategorie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reference != null ? reference.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.reference == null && other.reference != null) || (this.reference != null && !this.reference.equals(other.reference))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Produit[ reference=" + reference + " ]";
    }
    
}
