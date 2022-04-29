/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdc.ejb.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "decaissements")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Decaissements.findAll", query = "SELECT d FROM Decaissements d")
    , @NamedQuery(name = "Decaissements.findByDate", query = "SELECT d FROM Decaissements d WHERE d.date = :date")
    , @NamedQuery(name = "Decaissements.findByMontant", query = "SELECT d FROM Decaissements d WHERE d.montant = :montant")
    , @NamedQuery(name = "Decaissements.findByObservation", query = "SELECT d FROM Decaissements d WHERE d.observation = :observation")
    , @NamedQuery(name = "Decaissements.findByNumOR", query = "SELECT d FROM Decaissements d WHERE d.numOR = :numOR")
    , @NamedQuery(name = "Decaissements.findByCodeDec", query = "SELECT d FROM Decaissements d WHERE d.codeDec = :codeDec")
    , @NamedQuery(name = "Decaissements.findByIDActionscCaisses", query = "SELECT d FROM Decaissements d WHERE d.iDActionscCaisses = :iDActionscCaisses")
    , @NamedQuery(name = "Decaissements.findByTypeDecaissement", query = "SELECT d FROM Decaissements d WHERE d.typeDecaissement = :typeDecaissement")
    , @NamedQuery(name = "Decaissements.findByCaissier", query = "SELECT d FROM Decaissements d WHERE d.caissier = :caissier")
    , @NamedQuery(name = "Decaissements.findByIdmandataires", query = "SELECT d FROM Decaissements d WHERE d.idmandataires = :idmandataires")
    , @NamedQuery(name = "Decaissements.findByIDEtablissementFinancierDest", query = "SELECT d FROM Decaissements d WHERE d.iDEtablissementFinancierDest = :iDEtablissementFinancierDest")
    , @NamedQuery(name = "Decaissements.findByNumPieceReg", query = "SELECT d FROM Decaissements d WHERE d.numPieceReg = :numPieceReg")
    , @NamedQuery(name = "Decaissements.findByNumeroCBDepart", query = "SELECT d FROM Decaissements d WHERE d.numeroCBDepart = :numeroCBDepart")
    , @NamedQuery(name = "Decaissements.findByNumeroCBDest", query = "SELECT d FROM Decaissements d WHERE d.numeroCBDest = :numeroCBDest")
    , @NamedQuery(name = "Decaissements.findByDetenuePar", query = "SELECT d FROM Decaissements d WHERE d.detenuePar = :detenuePar")
    , @NamedQuery(name = "Decaissements.findByIdnatureoperation", query = "SELECT d FROM Decaissements d WHERE d.idnatureoperation = :idnatureoperation")
    , @NamedQuery(name = "Decaissements.findByCodejnl", query = "SELECT d FROM Decaissements d WHERE d.codejnl = :codejnl")
    , @NamedQuery(name = "Decaissements.findByDateTransfert", query = "SELECT d FROM Decaissements d WHERE d.dateTransfert = :dateTransfert")
    , @NamedQuery(name = "Decaissements.findByComptabilise", query = "SELECT d FROM Decaissements d WHERE d.comptabilise = :comptabilise")
    , @NamedQuery(name = "Decaissements.findByDateDecaissement", query = "SELECT d FROM Decaissements d WHERE d.dateDecaissement = :dateDecaissement")
    , @NamedQuery(name = "Decaissements.findBySupprimer", query = "SELECT d FROM Decaissements d WHERE d.supprimer = :supprimer")
    , @NamedQuery(name = "Decaissements.findByLogSup", query = "SELECT d FROM Decaissements d WHERE d.logSup = :logSup")
    , @NamedQuery(name = "Decaissements.findByDateSup", query = "SELECT d FROM Decaissements d WHERE d.dateSup = :dateSup")
    , @NamedQuery(name = "Decaissements.findByGestion", query = "SELECT d FROM Decaissements d WHERE d.gestion = :gestion")})
public class Decaissements implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTANT")
    private BigDecimal montant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "OBSERVATION")
    private String observation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumOR")
    private String numOR;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_DEC")
    private Long codeDec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDActionscCaisses")
    private int iDActionscCaisses;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TypeDecaissement")
    private short typeDecaissement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Caissier")
    private long caissier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMANDATAIRES")
    private int idmandataires;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEtablissementFinancierDest")
    private int iDEtablissementFinancierDest;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumPieceReg")
    private String numPieceReg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroCBDepart")
    private String numeroCBDepart;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroCBDest")
    private String numeroCBDest;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DetenuePar")
    private int detenuePar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDNATUREOPERATION")
    private int idnatureoperation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CODEJNL")
    private String codejnl;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateTransfert")
    @Temporal(TemporalType.DATE)
    private Date dateTransfert;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Comptabilise")
    private short comptabilise;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateDecaissement")
    @Temporal(TemporalType.DATE)
    private Date dateDecaissement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Supprimer")
    private short supprimer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "LogSup")
    private String logSup;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateSup")
    @Temporal(TemporalType.DATE)
    private Date dateSup;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(mappedBy = "codeDec")
    private List<PiecesTresoreries> piecesTresoreriesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeDec")
    private List<Situationdocument> situationdocumentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeDec")
    private List<DecDetailsarretes> decDetailsarretesList;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne(optional = false)
    private Tiers numTiers;
    @JoinColumn(name = "IDEtablissementFinancierDepart", referencedColumnName = "IDEtablissementFinancier")
    @ManyToOne(optional = false)
    private Etablissementfinancier iDEtablissementFinancierDepart;
    @JoinColumn(name = "NumeroCaisse", referencedColumnName = "NumeroCaisse")
    @ManyToOne(optional = false)
    private Caisses numeroCaisse;
    @JoinColumn(name = "IDSYS_Mode", referencedColumnName = "IDSYS_Mode")
    @ManyToOne(optional = false)
    private SysMode iDSYSMode;
    @JoinColumn(name = "IDDEC_Restitution", referencedColumnName = "IDDEC_Restitution")
    @ManyToOne(optional = false)
    private DecRestitution iDDECRestitution;
    @JoinColumn(name = "IDDEC_Reception", referencedColumnName = "IDDEC_Reception")
    @ManyToOne(optional = false)
    private DecReception iDDECReception;
    @JoinColumn(name = "IDAFFAIRES", referencedColumnName = "IDAFFAIRES")
    @ManyToOne(optional = false)
    private DecAffaires idaffaires;
    @JoinColumn(name = "IDOrdresDePaiement", referencedColumnName = "IDOrdresDePaiement")
    @ManyToOne(optional = false)
    private Ordresdepaiement iDOrdresDePaiement;
    @JoinColumn(name = "IDDEMANDES", referencedColumnName = "IDDEMANDES")
    @ManyToOne(optional = false)
    private Demandes iddemandes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeDec")
    private List<Mouvement> mouvementList;

    public Decaissements() {
    }

    public Decaissements(Long codeDec) {
        this.codeDec = codeDec;
    }

    public Decaissements(Long codeDec, Date date, BigDecimal montant, String observation, String numOR, int iDActionscCaisses, short typeDecaissement, long caissier, int idmandataires, int iDEtablissementFinancierDest, String numPieceReg, String numeroCBDepart, String numeroCBDest, int detenuePar, int idnatureoperation, String codejnl, Date dateTransfert, short comptabilise, Date dateDecaissement, short supprimer, String logSup, Date dateSup) {
        this.codeDec = codeDec;
        this.date = date;
        this.montant = montant;
        this.observation = observation;
        this.numOR = numOR;
        this.iDActionscCaisses = iDActionscCaisses;
        this.typeDecaissement = typeDecaissement;
        this.caissier = caissier;
        this.idmandataires = idmandataires;
        this.iDEtablissementFinancierDest = iDEtablissementFinancierDest;
        this.numPieceReg = numPieceReg;
        this.numeroCBDepart = numeroCBDepart;
        this.numeroCBDest = numeroCBDest;
        this.detenuePar = detenuePar;
        this.idnatureoperation = idnatureoperation;
        this.codejnl = codejnl;
        this.dateTransfert = dateTransfert;
        this.comptabilise = comptabilise;
        this.dateDecaissement = dateDecaissement;
        this.supprimer = supprimer;
        this.logSup = logSup;
        this.dateSup = dateSup;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getNumOR() {
        return numOR;
    }

    public void setNumOR(String numOR) {
        this.numOR = numOR;
    }

    public Long getCodeDec() {
        return codeDec;
    }

    public void setCodeDec(Long codeDec) {
        this.codeDec = codeDec;
    }

    public int getIDActionscCaisses() {
        return iDActionscCaisses;
    }

    public void setIDActionscCaisses(int iDActionscCaisses) {
        this.iDActionscCaisses = iDActionscCaisses;
    }

    public short getTypeDecaissement() {
        return typeDecaissement;
    }

    public void setTypeDecaissement(short typeDecaissement) {
        this.typeDecaissement = typeDecaissement;
    }

    public long getCaissier() {
        return caissier;
    }

    public void setCaissier(long caissier) {
        this.caissier = caissier;
    }

    public int getIdmandataires() {
        return idmandataires;
    }

    public void setIdmandataires(int idmandataires) {
        this.idmandataires = idmandataires;
    }

    public int getIDEtablissementFinancierDest() {
        return iDEtablissementFinancierDest;
    }

    public void setIDEtablissementFinancierDest(int iDEtablissementFinancierDest) {
        this.iDEtablissementFinancierDest = iDEtablissementFinancierDest;
    }

    public String getNumPieceReg() {
        return numPieceReg;
    }

    public void setNumPieceReg(String numPieceReg) {
        this.numPieceReg = numPieceReg;
    }

    public String getNumeroCBDepart() {
        return numeroCBDepart;
    }

    public void setNumeroCBDepart(String numeroCBDepart) {
        this.numeroCBDepart = numeroCBDepart;
    }

    public String getNumeroCBDest() {
        return numeroCBDest;
    }

    public void setNumeroCBDest(String numeroCBDest) {
        this.numeroCBDest = numeroCBDest;
    }

    public int getDetenuePar() {
        return detenuePar;
    }

    public void setDetenuePar(int detenuePar) {
        this.detenuePar = detenuePar;
    }

    public int getIdnatureoperation() {
        return idnatureoperation;
    }

    public void setIdnatureoperation(int idnatureoperation) {
        this.idnatureoperation = idnatureoperation;
    }

    public String getCodejnl() {
        return codejnl;
    }

    public void setCodejnl(String codejnl) {
        this.codejnl = codejnl;
    }

    public Date getDateTransfert() {
        return dateTransfert;
    }

    public void setDateTransfert(Date dateTransfert) {
        this.dateTransfert = dateTransfert;
    }

    public short getComptabilise() {
        return comptabilise;
    }

    public void setComptabilise(short comptabilise) {
        this.comptabilise = comptabilise;
    }

    public Date getDateDecaissement() {
        return dateDecaissement;
    }

    public void setDateDecaissement(Date dateDecaissement) {
        this.dateDecaissement = dateDecaissement;
    }

    public short getSupprimer() {
        return supprimer;
    }

    public void setSupprimer(short supprimer) {
        this.supprimer = supprimer;
    }

    public String getLogSup() {
        return logSup;
    }

    public void setLogSup(String logSup) {
        this.logSup = logSup;
    }

    public Date getDateSup() {
        return dateSup;
    }

    public void setDateSup(Date dateSup) {
        this.dateSup = dateSup;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<PiecesTresoreries> getPiecesTresoreriesList() {
        return piecesTresoreriesList;
    }

    public void setPiecesTresoreriesList(List<PiecesTresoreries> piecesTresoreriesList) {
        this.piecesTresoreriesList = piecesTresoreriesList;
    }

    @XmlTransient
    public List<Situationdocument> getSituationdocumentList() {
        return situationdocumentList;
    }

    public void setSituationdocumentList(List<Situationdocument> situationdocumentList) {
        this.situationdocumentList = situationdocumentList;
    }

    @XmlTransient
    public List<DecDetailsarretes> getDecDetailsarretesList() {
        return decDetailsarretesList;
    }

    public void setDecDetailsarretesList(List<DecDetailsarretes> decDetailsarretesList) {
        this.decDetailsarretesList = decDetailsarretesList;
    }

    public Tiers getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(Tiers numTiers) {
        this.numTiers = numTiers;
    }

    public Etablissementfinancier getIDEtablissementFinancierDepart() {
        return iDEtablissementFinancierDepart;
    }

    public void setIDEtablissementFinancierDepart(Etablissementfinancier iDEtablissementFinancierDepart) {
        this.iDEtablissementFinancierDepart = iDEtablissementFinancierDepart;
    }

    public Caisses getNumeroCaisse() {
        return numeroCaisse;
    }

    public void setNumeroCaisse(Caisses numeroCaisse) {
        this.numeroCaisse = numeroCaisse;
    }

    public SysMode getIDSYSMode() {
        return iDSYSMode;
    }

    public void setIDSYSMode(SysMode iDSYSMode) {
        this.iDSYSMode = iDSYSMode;
    }

    public DecRestitution getIDDECRestitution() {
        return iDDECRestitution;
    }

    public void setIDDECRestitution(DecRestitution iDDECRestitution) {
        this.iDDECRestitution = iDDECRestitution;
    }

    public DecReception getIDDECReception() {
        return iDDECReception;
    }

    public void setIDDECReception(DecReception iDDECReception) {
        this.iDDECReception = iDDECReception;
    }

    public DecAffaires getIdaffaires() {
        return idaffaires;
    }

    public void setIdaffaires(DecAffaires idaffaires) {
        this.idaffaires = idaffaires;
    }

    public Ordresdepaiement getIDOrdresDePaiement() {
        return iDOrdresDePaiement;
    }

    public void setIDOrdresDePaiement(Ordresdepaiement iDOrdresDePaiement) {
        this.iDOrdresDePaiement = iDOrdresDePaiement;
    }

    public Demandes getIddemandes() {
        return iddemandes;
    }

    public void setIddemandes(Demandes iddemandes) {
        this.iddemandes = iddemandes;
    }

    @XmlTransient
    public List<Mouvement> getMouvementList() {
        return mouvementList;
    }

    public void setMouvementList(List<Mouvement> mouvementList) {
        this.mouvementList = mouvementList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeDec != null ? codeDec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Decaissements)) {
            return false;
        }
        Decaissements other = (Decaissements) object;
        if ((this.codeDec == null && other.codeDec != null) || (this.codeDec != null && !this.codeDec.equals(other.codeDec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Decaissements[ codeDec=" + codeDec + " ]";
    }
    
}
