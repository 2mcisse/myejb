/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ALIENWARE
 */
@Entity
@Table(name = "partage")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partage.findAll", query = "SELECT p FROM Partage p")
    , @NamedQuery(name = "Partage.findByIDPartage", query = "SELECT p FROM Partage p WHERE p.iDPartage = :iDPartage")
    , @NamedQuery(name = "Partage.findByLibelle", query = "SELECT p FROM Partage p WHERE p.libelle = :libelle")
    , @NamedQuery(name = "Partage.findByIDDossierParent", query = "SELECT p FROM Partage p WHERE p.iDDossierParent = :iDDossierParent")
    , @NamedQuery(name = "Partage.findByDateHeureCreation", query = "SELECT p FROM Partage p WHERE p.dateHeureCreation = :dateHeureCreation")
    , @NamedQuery(name = "Partage.findByTypePartage", query = "SELECT p FROM Partage p WHERE p.typePartage = :typePartage")
    , @NamedQuery(name = "Partage.findByMotDePasse", query = "SELECT p FROM Partage p WHERE p.motDePasse = :motDePasse")
    , @NamedQuery(name = "Partage.findByDateHeureModification", query = "SELECT p FROM Partage p WHERE p.dateHeureModification = :dateHeureModification")
    , @NamedQuery(name = "Partage.findByClePartage", query = "SELECT p FROM Partage p WHERE p.clePartage = :clePartage")
    , @NamedQuery(name = "Partage.findByEstPublic", query = "SELECT p FROM Partage p WHERE p.estPublic = :estPublic")
    , @NamedQuery(name = "Partage.findByIDModificateur", query = "SELECT p FROM Partage p WHERE p.iDModificateur = :iDModificateur")
    , @NamedQuery(name = "Partage.findByEstRepDocCDC", query = "SELECT p FROM Partage p WHERE p.estRepDocCDC = :estRepDocCDC")
    , @NamedQuery(name = "Partage.findByCodePiece", query = "SELECT p FROM Partage p WHERE p.codePiece = :codePiece")
    , @NamedQuery(name = "Partage.findByTesr", query = "SELECT p FROM Partage p WHERE p.tesr = :tesr")
    , @NamedQuery(name = "Partage.findByRefPiece", query = "SELECT p FROM Partage p WHERE p.refPiece = :refPiece")
    , @NamedQuery(name = "Partage.findByGCreateur", query = "SELECT p FROM Partage p WHERE p.gCreateur = :gCreateur")
    , @NamedQuery(name = "Partage.findByGestion", query = "SELECT p FROM Partage p WHERE p.gestion = :gestion")})
public class Partage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPartage")
    private Integer iDPartage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "Libelle")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDossierParent")
    private int iDDossierParent;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureCreation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureCreation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TypePartage")
    private short typePartage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "MotDePasse")
    private String motDePasse;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureModification")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureModification;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "ClePartage")
    private String clePartage;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstPublic")
    private short estPublic;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDModificateur")
    private int iDModificateur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstRepDocCDC")
    private short estRepDocCDC;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_PIECE")
    private int codePiece;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "tesr")
    private String tesr;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "REF_PIECE")
    private String refPiece;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "GCreateur")
    private String gCreateur;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "IDProprietaire", referencedColumnName = "IDUtilisateur")
    @ManyToOne(optional = false)
    private Utilisateur iDProprietaire;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDPartage")
    private List<Partagedroit> partagedroitList;

    public Partage() {
    }

    public Partage(Integer iDPartage) {
        this.iDPartage = iDPartage;
    }

    public Partage(Integer iDPartage, String libelle, int iDDossierParent, Date dateHeureCreation, short typePartage, String motDePasse, String description, Date dateHeureModification, String clePartage, short estPublic, int iDModificateur, short estRepDocCDC, int codePiece, String tesr, String refPiece, String gCreateur) {
        this.iDPartage = iDPartage;
        this.libelle = libelle;
        this.iDDossierParent = iDDossierParent;
        this.dateHeureCreation = dateHeureCreation;
        this.typePartage = typePartage;
        this.motDePasse = motDePasse;
        this.description = description;
        this.dateHeureModification = dateHeureModification;
        this.clePartage = clePartage;
        this.estPublic = estPublic;
        this.iDModificateur = iDModificateur;
        this.estRepDocCDC = estRepDocCDC;
        this.codePiece = codePiece;
        this.tesr = tesr;
        this.refPiece = refPiece;
        this.gCreateur = gCreateur;
    }

    public Integer getIDPartage() {
        return iDPartage;
    }

    public void setIDPartage(Integer iDPartage) {
        this.iDPartage = iDPartage;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getIDDossierParent() {
        return iDDossierParent;
    }

    public void setIDDossierParent(int iDDossierParent) {
        this.iDDossierParent = iDDossierParent;
    }

    public Date getDateHeureCreation() {
        return dateHeureCreation;
    }

    public void setDateHeureCreation(Date dateHeureCreation) {
        this.dateHeureCreation = dateHeureCreation;
    }

    public short getTypePartage() {
        return typePartage;
    }

    public void setTypePartage(short typePartage) {
        this.typePartage = typePartage;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateHeureModification() {
        return dateHeureModification;
    }

    public void setDateHeureModification(Date dateHeureModification) {
        this.dateHeureModification = dateHeureModification;
    }

    public String getClePartage() {
        return clePartage;
    }

    public void setClePartage(String clePartage) {
        this.clePartage = clePartage;
    }

    public short getEstPublic() {
        return estPublic;
    }

    public void setEstPublic(short estPublic) {
        this.estPublic = estPublic;
    }

    public int getIDModificateur() {
        return iDModificateur;
    }

    public void setIDModificateur(int iDModificateur) {
        this.iDModificateur = iDModificateur;
    }

    public short getEstRepDocCDC() {
        return estRepDocCDC;
    }

    public void setEstRepDocCDC(short estRepDocCDC) {
        this.estRepDocCDC = estRepDocCDC;
    }

    public int getCodePiece() {
        return codePiece;
    }

    public void setCodePiece(int codePiece) {
        this.codePiece = codePiece;
    }

    public String getTesr() {
        return tesr;
    }

    public void setTesr(String tesr) {
        this.tesr = tesr;
    }

    public String getRefPiece() {
        return refPiece;
    }

    public void setRefPiece(String refPiece) {
        this.refPiece = refPiece;
    }

    public String getGCreateur() {
        return gCreateur;
    }

    public void setGCreateur(String gCreateur) {
        this.gCreateur = gCreateur;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Utilisateur getIDProprietaire() {
        return iDProprietaire;
    }

    public void setIDProprietaire(Utilisateur iDProprietaire) {
        this.iDProprietaire = iDProprietaire;
    }

    @XmlTransient
    public List<Partagedroit> getPartagedroitList() {
        return partagedroitList;
    }

    public void setPartagedroitList(List<Partagedroit> partagedroitList) {
        this.partagedroitList = partagedroitList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPartage != null ? iDPartage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partage)) {
            return false;
        }
        Partage other = (Partage) object;
        if ((this.iDPartage == null && other.iDPartage != null) || (this.iDPartage != null && !this.iDPartage.equals(other.iDPartage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Partage[ iDPartage=" + iDPartage + " ]";
    }
    
}
