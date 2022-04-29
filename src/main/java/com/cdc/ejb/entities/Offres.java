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
@Table(name = "offres")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Offres.findAll", query = "SELECT o FROM Offres o")
    , @NamedQuery(name = "Offres.findByIdoffres", query = "SELECT o FROM Offres o WHERE o.idoffres = :idoffres")
    , @NamedQuery(name = "Offres.findByDateDepot", query = "SELECT o FROM Offres o WHERE o.dateDepot = :dateDepot")
    , @NamedQuery(name = "Offres.findByMontant", query = "SELECT o FROM Offres o WHERE o.montant = :montant")
    , @NamedQuery(name = "Offres.findByNoteTech", query = "SELECT o FROM Offres o WHERE o.noteTech = :noteTech")
    , @NamedQuery(name = "Offres.findByPhase", query = "SELECT o FROM Offres o WHERE o.phase = :phase")
    , @NamedQuery(name = "Offres.findByGestion", query = "SELECT o FROM Offres o WHERE o.gestion = :gestion")})
public class Offres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDOFFRES")
    private Integer idoffres;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateDepot")
    @Temporal(TemporalType.DATE)
    private Date dateDepot;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Montant")
    private String montant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NOTE_TECH")
    private int noteTech;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Phase")
    private short phase;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne(optional = false)
    private Tiers numTiers;
    @JoinColumn(name = "ID_Marche", referencedColumnName = "ID_Marche")
    @ManyToOne(optional = false)
    private AchMarches iDMarche;

    public Offres() {
    }

    public Offres(Integer idoffres) {
        this.idoffres = idoffres;
    }

    public Offres(Integer idoffres, Date dateDepot, String montant, int noteTech, short phase) {
        this.idoffres = idoffres;
        this.dateDepot = dateDepot;
        this.montant = montant;
        this.noteTech = noteTech;
        this.phase = phase;
    }

    public Integer getIdoffres() {
        return idoffres;
    }

    public void setIdoffres(Integer idoffres) {
        this.idoffres = idoffres;
    }

    public Date getDateDepot() {
        return dateDepot;
    }

    public void setDateDepot(Date dateDepot) {
        this.dateDepot = dateDepot;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public int getNoteTech() {
        return noteTech;
    }

    public void setNoteTech(int noteTech) {
        this.noteTech = noteTech;
    }

    public short getPhase() {
        return phase;
    }

    public void setPhase(short phase) {
        this.phase = phase;
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

    public AchMarches getIDMarche() {
        return iDMarche;
    }

    public void setIDMarche(AchMarches iDMarche) {
        this.iDMarche = iDMarche;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idoffres != null ? idoffres.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Offres)) {
            return false;
        }
        Offres other = (Offres) object;
        if ((this.idoffres == null && other.idoffres != null) || (this.idoffres != null && !this.idoffres.equals(other.idoffres))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Offres[ idoffres=" + idoffres + " ]";
    }
    
}
