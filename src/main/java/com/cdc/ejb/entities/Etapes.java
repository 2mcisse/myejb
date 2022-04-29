/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "etapes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etapes.findAll", query = "SELECT e FROM Etapes e")
    , @NamedQuery(name = "Etapes.findByIdetapes", query = "SELECT e FROM Etapes e WHERE e.idetapes = :idetapes")
    , @NamedQuery(name = "Etapes.findByDateDebutPrev", query = "SELECT e FROM Etapes e WHERE e.dateDebutPrev = :dateDebutPrev")
    , @NamedQuery(name = "Etapes.findByDateFinPrev", query = "SELECT e FROM Etapes e WHERE e.dateFinPrev = :dateFinPrev")
    , @NamedQuery(name = "Etapes.findByDateDebutReelle", query = "SELECT e FROM Etapes e WHERE e.dateDebutReelle = :dateDebutReelle")
    , @NamedQuery(name = "Etapes.findByDateFinReelle", query = "SELECT e FROM Etapes e WHERE e.dateFinReelle = :dateFinReelle")
    , @NamedQuery(name = "Etapes.findByNiveauExecution", query = "SELECT e FROM Etapes e WHERE e.niveauExecution = :niveauExecution")
    , @NamedQuery(name = "Etapes.findByLibelle", query = "SELECT e FROM Etapes e WHERE e.libelle = :libelle")
    , @NamedQuery(name = "Etapes.findByGroupe", query = "SELECT e FROM Etapes e WHERE e.groupe = :groupe")
    , @NamedQuery(name = "Etapes.findByDelainotification", query = "SELECT e FROM Etapes e WHERE e.delainotification = :delainotification")
    , @NamedQuery(name = "Etapes.findByChoix", query = "SELECT e FROM Etapes e WHERE e.choix = :choix")
    , @NamedQuery(name = "Etapes.findByChaineNotif", query = "SELECT e FROM Etapes e WHERE e.chaineNotif = :chaineNotif")
    , @NamedQuery(name = "Etapes.findByIdachPhasesMarches", query = "SELECT e FROM Etapes e WHERE e.idachPhasesMarches = :idachPhasesMarches")
    , @NamedQuery(name = "Etapes.findByNbreJoursOccurence", query = "SELECT e FROM Etapes e WHERE e.nbreJoursOccurence = :nbreJoursOccurence")
    , @NamedQuery(name = "Etapes.findByGestion", query = "SELECT e FROM Etapes e WHERE e.gestion = :gestion")})
public class Etapes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDETAPES")
    private Integer idetapes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateDebutPrev")
    @Temporal(TemporalType.DATE)
    private Date dateDebutPrev;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateFinPrev")
    @Temporal(TemporalType.DATE)
    private Date dateFinPrev;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateDebutReelle")
    @Temporal(TemporalType.DATE)
    private Date dateDebutReelle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateFinReelle")
    @Temporal(TemporalType.DATE)
    private Date dateFinReelle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Niveau_Execution")
    private short niveauExecution;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LIBELLE")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Groupe")
    private String groupe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Delainotification")
    private short delainotification;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Choix")
    private short choix;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "ChaineNotif")
    private String chaineNotif;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACH_PHASES_MARCHES")
    private int idachPhasesMarches;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NbreJoursOccurence")
    private int nbreJoursOccurence;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "ID_Marche", referencedColumnName = "ID_Marche")
    @ManyToOne(optional = false)
    private AchMarches iDMarche;
    @JoinColumn(name = "IDContentieux", referencedColumnName = "IDContentieux")
    @ManyToOne(optional = false)
    private Contentieux iDContentieux;
    @JoinColumn(name = "NumContrat", referencedColumnName = "NumContrat")
    @ManyToOne(optional = false)
    private Contrats numContrat;

    public Etapes() {
    }

    public Etapes(Integer idetapes) {
        this.idetapes = idetapes;
    }

    public Etapes(Integer idetapes, Date dateDebutPrev, Date dateFinPrev, Date dateDebutReelle, Date dateFinReelle, short niveauExecution, String libelle, String groupe, short delainotification, short choix, String chaineNotif, int idachPhasesMarches, int nbreJoursOccurence) {
        this.idetapes = idetapes;
        this.dateDebutPrev = dateDebutPrev;
        this.dateFinPrev = dateFinPrev;
        this.dateDebutReelle = dateDebutReelle;
        this.dateFinReelle = dateFinReelle;
        this.niveauExecution = niveauExecution;
        this.libelle = libelle;
        this.groupe = groupe;
        this.delainotification = delainotification;
        this.choix = choix;
        this.chaineNotif = chaineNotif;
        this.idachPhasesMarches = idachPhasesMarches;
        this.nbreJoursOccurence = nbreJoursOccurence;
    }

    public Integer getIdetapes() {
        return idetapes;
    }

    public void setIdetapes(Integer idetapes) {
        this.idetapes = idetapes;
    }

    public Date getDateDebutPrev() {
        return dateDebutPrev;
    }

    public void setDateDebutPrev(Date dateDebutPrev) {
        this.dateDebutPrev = dateDebutPrev;
    }

    public Date getDateFinPrev() {
        return dateFinPrev;
    }

    public void setDateFinPrev(Date dateFinPrev) {
        this.dateFinPrev = dateFinPrev;
    }

    public Date getDateDebutReelle() {
        return dateDebutReelle;
    }

    public void setDateDebutReelle(Date dateDebutReelle) {
        this.dateDebutReelle = dateDebutReelle;
    }

    public Date getDateFinReelle() {
        return dateFinReelle;
    }

    public void setDateFinReelle(Date dateFinReelle) {
        this.dateFinReelle = dateFinReelle;
    }

    public short getNiveauExecution() {
        return niveauExecution;
    }

    public void setNiveauExecution(short niveauExecution) {
        this.niveauExecution = niveauExecution;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public short getDelainotification() {
        return delainotification;
    }

    public void setDelainotification(short delainotification) {
        this.delainotification = delainotification;
    }

    public short getChoix() {
        return choix;
    }

    public void setChoix(short choix) {
        this.choix = choix;
    }

    public String getChaineNotif() {
        return chaineNotif;
    }

    public void setChaineNotif(String chaineNotif) {
        this.chaineNotif = chaineNotif;
    }

    public int getIdachPhasesMarches() {
        return idachPhasesMarches;
    }

    public void setIdachPhasesMarches(int idachPhasesMarches) {
        this.idachPhasesMarches = idachPhasesMarches;
    }

    public int getNbreJoursOccurence() {
        return nbreJoursOccurence;
    }

    public void setNbreJoursOccurence(int nbreJoursOccurence) {
        this.nbreJoursOccurence = nbreJoursOccurence;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public AchMarches getIDMarche() {
        return iDMarche;
    }

    public void setIDMarche(AchMarches iDMarche) {
        this.iDMarche = iDMarche;
    }

    public Contentieux getIDContentieux() {
        return iDContentieux;
    }

    public void setIDContentieux(Contentieux iDContentieux) {
        this.iDContentieux = iDContentieux;
    }

    public Contrats getNumContrat() {
        return numContrat;
    }

    public void setNumContrat(Contrats numContrat) {
        this.numContrat = numContrat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idetapes != null ? idetapes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etapes)) {
            return false;
        }
        Etapes other = (Etapes) object;
        if ((this.idetapes == null && other.idetapes != null) || (this.idetapes != null && !this.idetapes.equals(other.idetapes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Etapes[ idetapes=" + idetapes + " ]";
    }
    
}
