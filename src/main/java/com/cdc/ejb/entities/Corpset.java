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
@Table(name = "corpset")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Corpset.findAll", query = "SELECT c FROM Corpset c")
    , @NamedQuery(name = "Corpset.findByCecleunik", query = "SELECT c FROM Corpset c WHERE c.cecleunik = :cecleunik")
    , @NamedQuery(name = "Corpset.findByRef", query = "SELECT c FROM Corpset c WHERE c.ref = :ref")
    , @NamedQuery(name = "Corpset.findByPoste", query = "SELECT c FROM Corpset c WHERE c.poste = :poste")
    , @NamedQuery(name = "Corpset.findByFormule", query = "SELECT c FROM Corpset c WHERE c.formule = :formule")
    , @NamedQuery(name = "Corpset.findByBrut", query = "SELECT c FROM Corpset c WHERE c.brut = :brut")
    , @NamedQuery(name = "Corpset.findByAmort", query = "SELECT c FROM Corpset c WHERE c.amort = :amort")
    , @NamedQuery(name = "Corpset.findByComptes", query = "SELECT c FROM Corpset c WHERE c.comptes = :comptes")
    , @NamedQuery(name = "Corpset.findByEtatFIN", query = "SELECT c FROM Corpset c WHERE c.etatFIN = :etatFIN")})
public class Corpset implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CECLEUNIK")
    private Integer cecleunik;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Ref")
    private String ref;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Poste")
    private String poste;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Formule")
    private int formule;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Brut")
    private String brut;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Amort")
    private String amort;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Comptes")
    private String comptes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EtatFIN")
    private short etatFIN;
    @JoinColumn(name = "TTCLEUNIK", referencedColumnName = "TTCLEUNIK")
    @ManyToOne(optional = false)
    private Titres ttcleunik;

    public Corpset() {
    }

    public Corpset(Integer cecleunik) {
        this.cecleunik = cecleunik;
    }

    public Corpset(Integer cecleunik, String ref, String poste, int formule, String brut, String amort, String comptes, short etatFIN) {
        this.cecleunik = cecleunik;
        this.ref = ref;
        this.poste = poste;
        this.formule = formule;
        this.brut = brut;
        this.amort = amort;
        this.comptes = comptes;
        this.etatFIN = etatFIN;
    }

    public Integer getCecleunik() {
        return cecleunik;
    }

    public void setCecleunik(Integer cecleunik) {
        this.cecleunik = cecleunik;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public int getFormule() {
        return formule;
    }

    public void setFormule(int formule) {
        this.formule = formule;
    }

    public String getBrut() {
        return brut;
    }

    public void setBrut(String brut) {
        this.brut = brut;
    }

    public String getAmort() {
        return amort;
    }

    public void setAmort(String amort) {
        this.amort = amort;
    }

    public String getComptes() {
        return comptes;
    }

    public void setComptes(String comptes) {
        this.comptes = comptes;
    }

    public short getEtatFIN() {
        return etatFIN;
    }

    public void setEtatFIN(short etatFIN) {
        this.etatFIN = etatFIN;
    }

    public Titres getTtcleunik() {
        return ttcleunik;
    }

    public void setTtcleunik(Titres ttcleunik) {
        this.ttcleunik = ttcleunik;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cecleunik != null ? cecleunik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Corpset)) {
            return false;
        }
        Corpset other = (Corpset) object;
        if ((this.cecleunik == null && other.cecleunik != null) || (this.cecleunik != null && !this.cecleunik.equals(other.cecleunik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Corpset[ cecleunik=" + cecleunik + " ]";
    }
    
}
