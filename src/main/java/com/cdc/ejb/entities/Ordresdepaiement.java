/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
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
@Table(name = "ordresdepaiement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordresdepaiement.findAll", query = "SELECT o FROM Ordresdepaiement o")
    , @NamedQuery(name = "Ordresdepaiement.findByIDOrdresDePaiement", query = "SELECT o FROM Ordresdepaiement o WHERE o.iDOrdresDePaiement = :iDOrdresDePaiement")
    , @NamedQuery(name = "Ordresdepaiement.findByNumOR", query = "SELECT o FROM Ordresdepaiement o WHERE o.numOR = :numOR")
    , @NamedQuery(name = "Ordresdepaiement.findByNumOP", query = "SELECT o FROM Ordresdepaiement o WHERE o.numOP = :numOP")
    , @NamedQuery(name = "Ordresdepaiement.findByMontant", query = "SELECT o FROM Ordresdepaiement o WHERE o.montant = :montant")
    , @NamedQuery(name = "Ordresdepaiement.findByType", query = "SELECT o FROM Ordresdepaiement o WHERE o.type = :type")
    , @NamedQuery(name = "Ordresdepaiement.findByPayer", query = "SELECT o FROM Ordresdepaiement o WHERE o.payer = :payer")
    , @NamedQuery(name = "Ordresdepaiement.findByValider", query = "SELECT o FROM Ordresdepaiement o WHERE o.valider = :valider")
    , @NamedQuery(name = "Ordresdepaiement.findByIDDECAutorisationDeRestitution", query = "SELECT o FROM Ordresdepaiement o WHERE o.iDDECAutorisationDeRestitution = :iDDECAutorisationDeRestitution")
    , @NamedQuery(name = "Ordresdepaiement.findByNumTiers", query = "SELECT o FROM Ordresdepaiement o WHERE o.numTiers = :numTiers")
    , @NamedQuery(name = "Ordresdepaiement.findByIdaffaires", query = "SELECT o FROM Ordresdepaiement o WHERE o.idaffaires = :idaffaires")
    , @NamedQuery(name = "Ordresdepaiement.findByIdnatureoperation", query = "SELECT o FROM Ordresdepaiement o WHERE o.idnatureoperation = :idnatureoperation")
    , @NamedQuery(name = "Ordresdepaiement.findByNumeroCompte", query = "SELECT o FROM Ordresdepaiement o WHERE o.numeroCompte = :numeroCompte")
    , @NamedQuery(name = "Ordresdepaiement.findByObservation", query = "SELECT o FROM Ordresdepaiement o WHERE o.observation = :observation")
    , @NamedQuery(name = "Ordresdepaiement.findByCumulRetenues", query = "SELECT o FROM Ordresdepaiement o WHERE o.cumulRetenues = :cumulRetenues")
    , @NamedQuery(name = "Ordresdepaiement.findByCaisseDavance", query = "SELECT o FROM Ordresdepaiement o WHERE o.caisseDavance = :caisseDavance")
    , @NamedQuery(name = "Ordresdepaiement.findByDateOP", query = "SELECT o FROM Ordresdepaiement o WHERE o.dateOP = :dateOP")
    , @NamedQuery(name = "Ordresdepaiement.findByIDEtablissementFinancier", query = "SELECT o FROM Ordresdepaiement o WHERE o.iDEtablissementFinancier = :iDEtablissementFinancier")
    , @NamedQuery(name = "Ordresdepaiement.findByAgence", query = "SELECT o FROM Ordresdepaiement o WHERE o.agence = :agence")
    , @NamedQuery(name = "Ordresdepaiement.findByCompteBanque", query = "SELECT o FROM Ordresdepaiement o WHERE o.compteBanque = :compteBanque")
    , @NamedQuery(name = "Ordresdepaiement.findByIDSYSMode", query = "SELECT o FROM Ordresdepaiement o WHERE o.iDSYSMode = :iDSYSMode")
    , @NamedQuery(name = "Ordresdepaiement.findByGestion", query = "SELECT o FROM Ordresdepaiement o WHERE o.gestion = :gestion")})
public class Ordresdepaiement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDOrdresDePaiement")
    private Integer iDOrdresDePaiement;
    @Size(max = 50)
    @Column(name = "Num_OR")
    private String numOR;
    @Size(max = 50)
    @Column(name = "Num_OP")
    private String numOP;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Montant")
    private BigDecimal montant;
    @Column(name = "type")
    private Short type;
    @Column(name = "Payer")
    private Short payer;
    @Column(name = "Valider")
    private Short valider;
    @Column(name = "IDDEC_AutorisationDeRestitution")
    private Integer iDDECAutorisationDeRestitution;
    @Column(name = "NumTiers")
    private BigInteger numTiers;
    @Column(name = "IDAFFAIRES")
    private Integer idaffaires;
    @Column(name = "IDNATUREOPERATION")
    private Integer idnatureoperation;
    @Size(max = 51)
    @Column(name = "NumeroCompte")
    private String numeroCompte;
    @Size(max = 200)
    @Column(name = "OBSERVATION")
    private String observation;
    @Column(name = "CumulRetenues")
    private BigDecimal cumulRetenues;
    @Column(name = "CaisseDavance")
    private Short caisseDavance;
    @Column(name = "DateOP")
    @Temporal(TemporalType.DATE)
    private Date dateOP;
    @Column(name = "IDEtablissementFinancier")
    private Integer iDEtablissementFinancier;
    @Size(max = 100)
    @Column(name = "Agence")
    private String agence;
    @Size(max = 50)
    @Column(name = "compteBanque")
    private String compteBanque;
    @Column(name = "IDSYS_Mode")
    private Integer iDSYSMode;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDOrdresDePaiement")
    private List<Decaissements> decaissementsList;
    @JoinColumn(name = "IDBUD_Budget", referencedColumnName = "IDBUD_Budget")
    @ManyToOne
    private BudBudget iDBUDBudget;
    @JoinColumn(name = "IDBUD_Liquidation", referencedColumnName = "IDBUD_Liquidation")
    @ManyToOne
    private BudLiquidation iDBUDLiquidation;
    @JoinColumn(name = "IDBUD_DMRI", referencedColumnName = "IDBUD_DMRI")
    @ManyToOne
    private BudDmri idbudDmri;
    @JoinColumn(name = "IDDEC_Restitution", referencedColumnName = "IDDEC_Restitution")
    @ManyToOne
    private DecRestitution iDDECRestitution;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDOrdresDePaiement")
    private List<BudRetenues> budRetenuesList;

    public Ordresdepaiement() {
    }

    public Ordresdepaiement(Integer iDOrdresDePaiement) {
        this.iDOrdresDePaiement = iDOrdresDePaiement;
    }

    public Integer getIDOrdresDePaiement() {
        return iDOrdresDePaiement;
    }

    public void setIDOrdresDePaiement(Integer iDOrdresDePaiement) {
        this.iDOrdresDePaiement = iDOrdresDePaiement;
    }

    public String getNumOR() {
        return numOR;
    }

    public void setNumOR(String numOR) {
        this.numOR = numOR;
    }

    public String getNumOP() {
        return numOP;
    }

    public void setNumOP(String numOP) {
        this.numOP = numOP;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getPayer() {
        return payer;
    }

    public void setPayer(Short payer) {
        this.payer = payer;
    }

    public Short getValider() {
        return valider;
    }

    public void setValider(Short valider) {
        this.valider = valider;
    }

    public Integer getIDDECAutorisationDeRestitution() {
        return iDDECAutorisationDeRestitution;
    }

    public void setIDDECAutorisationDeRestitution(Integer iDDECAutorisationDeRestitution) {
        this.iDDECAutorisationDeRestitution = iDDECAutorisationDeRestitution;
    }

    public BigInteger getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(BigInteger numTiers) {
        this.numTiers = numTiers;
    }

    public Integer getIdaffaires() {
        return idaffaires;
    }

    public void setIdaffaires(Integer idaffaires) {
        this.idaffaires = idaffaires;
    }

    public Integer getIdnatureoperation() {
        return idnatureoperation;
    }

    public void setIdnatureoperation(Integer idnatureoperation) {
        this.idnatureoperation = idnatureoperation;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public BigDecimal getCumulRetenues() {
        return cumulRetenues;
    }

    public void setCumulRetenues(BigDecimal cumulRetenues) {
        this.cumulRetenues = cumulRetenues;
    }

    public Short getCaisseDavance() {
        return caisseDavance;
    }

    public void setCaisseDavance(Short caisseDavance) {
        this.caisseDavance = caisseDavance;
    }

    public Date getDateOP() {
        return dateOP;
    }

    public void setDateOP(Date dateOP) {
        this.dateOP = dateOP;
    }

    public Integer getIDEtablissementFinancier() {
        return iDEtablissementFinancier;
    }

    public void setIDEtablissementFinancier(Integer iDEtablissementFinancier) {
        this.iDEtablissementFinancier = iDEtablissementFinancier;
    }

    public String getAgence() {
        return agence;
    }

    public void setAgence(String agence) {
        this.agence = agence;
    }

    public String getCompteBanque() {
        return compteBanque;
    }

    public void setCompteBanque(String compteBanque) {
        this.compteBanque = compteBanque;
    }

    public Integer getIDSYSMode() {
        return iDSYSMode;
    }

    public void setIDSYSMode(Integer iDSYSMode) {
        this.iDSYSMode = iDSYSMode;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Decaissements> getDecaissementsList() {
        return decaissementsList;
    }

    public void setDecaissementsList(List<Decaissements> decaissementsList) {
        this.decaissementsList = decaissementsList;
    }

    public BudBudget getIDBUDBudget() {
        return iDBUDBudget;
    }

    public void setIDBUDBudget(BudBudget iDBUDBudget) {
        this.iDBUDBudget = iDBUDBudget;
    }

    public BudLiquidation getIDBUDLiquidation() {
        return iDBUDLiquidation;
    }

    public void setIDBUDLiquidation(BudLiquidation iDBUDLiquidation) {
        this.iDBUDLiquidation = iDBUDLiquidation;
    }

    public BudDmri getIdbudDmri() {
        return idbudDmri;
    }

    public void setIdbudDmri(BudDmri idbudDmri) {
        this.idbudDmri = idbudDmri;
    }

    public DecRestitution getIDDECRestitution() {
        return iDDECRestitution;
    }

    public void setIDDECRestitution(DecRestitution iDDECRestitution) {
        this.iDDECRestitution = iDDECRestitution;
    }

    @XmlTransient
    public List<BudRetenues> getBudRetenuesList() {
        return budRetenuesList;
    }

    public void setBudRetenuesList(List<BudRetenues> budRetenuesList) {
        this.budRetenuesList = budRetenuesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDOrdresDePaiement != null ? iDOrdresDePaiement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordresdepaiement)) {
            return false;
        }
        Ordresdepaiement other = (Ordresdepaiement) object;
        if ((this.iDOrdresDePaiement == null && other.iDOrdresDePaiement != null) || (this.iDOrdresDePaiement != null && !this.iDOrdresDePaiement.equals(other.iDOrdresDePaiement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Ordresdepaiement[ iDOrdresDePaiement=" + iDOrdresDePaiement + " ]";
    }
    
}
