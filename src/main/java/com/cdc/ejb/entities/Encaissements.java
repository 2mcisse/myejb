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
@Table(name = "encaissements")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Encaissements.findAll", query = "SELECT e FROM Encaissements e")
    , @NamedQuery(name = "Encaissements.findByNumeroTitre", query = "SELECT e FROM Encaissements e WHERE e.numeroTitre = :numeroTitre")
    , @NamedQuery(name = "Encaissements.findByDate", query = "SELECT e FROM Encaissements e WHERE e.date = :date")
    , @NamedQuery(name = "Encaissements.findByMontant", query = "SELECT e FROM Encaissements e WHERE e.montant = :montant")
    , @NamedQuery(name = "Encaissements.findByObservation", query = "SELECT e FROM Encaissements e WHERE e.observation = :observation")
    , @NamedQuery(name = "Encaissements.findByCodeEnc", query = "SELECT e FROM Encaissements e WHERE e.codeEnc = :codeEnc")
    , @NamedQuery(name = "Encaissements.findByIDActionscCaisses", query = "SELECT e FROM Encaissements e WHERE e.iDActionscCaisses = :iDActionscCaisses")
    , @NamedQuery(name = "Encaissements.findByTypeEncaissement", query = "SELECT e FROM Encaissements e WHERE e.typeEncaissement = :typeEncaissement")
    , @NamedQuery(name = "Encaissements.findByCaissier", query = "SELECT e FROM Encaissements e WHERE e.caissier = :caissier")
    , @NamedQuery(name = "Encaissements.findByVisaDest", query = "SELECT e FROM Encaissements e WHERE e.visaDest = :visaDest")
    , @NamedQuery(name = "Encaissements.findByVisaProv", query = "SELECT e FROM Encaissements e WHERE e.visaProv = :visaProv")
    , @NamedQuery(name = "Encaissements.findByIDEtablissementFinancierDest", query = "SELECT e FROM Encaissements e WHERE e.iDEtablissementFinancierDest = :iDEtablissementFinancierDest")
    , @NamedQuery(name = "Encaissements.findByNumeroCBDepart", query = "SELECT e FROM Encaissements e WHERE e.numeroCBDepart = :numeroCBDepart")
    , @NamedQuery(name = "Encaissements.findByNumeroCBDest", query = "SELECT e FROM Encaissements e WHERE e.numeroCBDest = :numeroCBDest")
    , @NamedQuery(name = "Encaissements.findByNumPieceReg", query = "SELECT e FROM Encaissements e WHERE e.numPieceReg = :numPieceReg")
    , @NamedQuery(name = "Encaissements.findByDetenuePar", query = "SELECT e FROM Encaissements e WHERE e.detenuePar = :detenuePar")
    , @NamedQuery(name = "Encaissements.findByIdmandataires", query = "SELECT e FROM Encaissements e WHERE e.idmandataires = :idmandataires")
    , @NamedQuery(name = "Encaissements.findByNumQuit", query = "SELECT e FROM Encaissements e WHERE e.numQuit = :numQuit")
    , @NamedQuery(name = "Encaissements.findByCodejnl", query = "SELECT e FROM Encaissements e WHERE e.codejnl = :codejnl")
    , @NamedQuery(name = "Encaissements.findByDateTransfert", query = "SELECT e FROM Encaissements e WHERE e.dateTransfert = :dateTransfert")
    , @NamedQuery(name = "Encaissements.findByComptabilise", query = "SELECT e FROM Encaissements e WHERE e.comptabilise = :comptabilise")
    , @NamedQuery(name = "Encaissements.findByDateEncaissement", query = "SELECT e FROM Encaissements e WHERE e.dateEncaissement = :dateEncaissement")
    , @NamedQuery(name = "Encaissements.findByTraiter", query = "SELECT e FROM Encaissements e WHERE e.traiter = :traiter")
    , @NamedQuery(name = "Encaissements.findByImputerSurCDO", query = "SELECT e FROM Encaissements e WHERE e.imputerSurCDO = :imputerSurCDO")
    , @NamedQuery(name = "Encaissements.findByEtat", query = "SELECT e FROM Encaissements e WHERE e.etat = :etat")
    , @NamedQuery(name = "Encaissements.findByCPtCREDIT", query = "SELECT e FROM Encaissements e WHERE e.cPtCREDIT = :cPtCREDIT")
    , @NamedQuery(name = "Encaissements.findByCptdebit", query = "SELECT e FROM Encaissements e WHERE e.cptdebit = :cptdebit")
    , @NamedQuery(name = "Encaissements.findByBeneficiaire", query = "SELECT e FROM Encaissements e WHERE e.beneficiaire = :beneficiaire")
    , @NamedQuery(name = "Encaissements.findByNdeclaration", query = "SELECT e FROM Encaissements e WHERE e.ndeclaration = :ndeclaration")
    , @NamedQuery(name = "Encaissements.findByHeureSaisie", query = "SELECT e FROM Encaissements e WHERE e.heureSaisie = :heureSaisie")
    , @NamedQuery(name = "Encaissements.findByTimbre", query = "SELECT e FROM Encaissements e WHERE e.timbre = :timbre")
    , @NamedQuery(name = "Encaissements.findByCptcreditTimbre", query = "SELECT e FROM Encaissements e WHERE e.cptcreditTimbre = :cptcreditTimbre")
    , @NamedQuery(name = "Encaissements.findByCodeG", query = "SELECT e FROM Encaissements e WHERE e.codeG = :codeG")
    , @NamedQuery(name = "Encaissements.findByDeposant", query = "SELECT e FROM Encaissements e WHERE e.deposant = :deposant")
    , @NamedQuery(name = "Encaissements.findBySupprimer", query = "SELECT e FROM Encaissements e WHERE e.supprimer = :supprimer")
    , @NamedQuery(name = "Encaissements.findByLogSup", query = "SELECT e FROM Encaissements e WHERE e.logSup = :logSup")
    , @NamedQuery(name = "Encaissements.findByDateSup", query = "SELECT e FROM Encaissements e WHERE e.dateSup = :dateSup")
    , @NamedQuery(name = "Encaissements.findByCptObligatoire", query = "SELECT e FROM Encaissements e WHERE e.cptObligatoire = :cptObligatoire")
    , @NamedQuery(name = "Encaissements.findByTg", query = "SELECT e FROM Encaissements e WHERE e.tg = :tg")
    , @NamedQuery(name = "Encaissements.findByGestion", query = "SELECT e FROM Encaissements e WHERE e.gestion = :gestion")})
public class Encaissements implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroTitre")
    private String numeroTitre;
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
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_ENC")
    private Long codeEnc;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDActionscCaisses")
    private int iDActionscCaisses;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TypeEncaissement")
    private short typeEncaissement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Caissier")
    private long caissier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VisaDest")
    @Temporal(TemporalType.DATE)
    private Date visaDest;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VisaProv")
    @Temporal(TemporalType.DATE)
    private Date visaProv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEtablissementFinancierDest")
    private int iDEtablissementFinancierDest;
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
    @Size(min = 1, max = 50)
    @Column(name = "NumPieceReg")
    private String numPieceReg;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DetenuePar")
    private int detenuePar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMANDATAIRES")
    private int idmandataires;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumQuit")
    private String numQuit;
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
    @Column(name = "DateEncaissement")
    @Temporal(TemporalType.DATE)
    private Date dateEncaissement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Traiter")
    private short traiter;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ImputerSurCDO")
    private short imputerSurCDO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Etat")
    private short etat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPtCREDIT")
    private String cPtCREDIT;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPTDEBIT")
    private String cptdebit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Beneficiaire")
    private String beneficiaire;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NDECLARATION")
    private String ndeclaration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HeureSaisie")
    @Temporal(TemporalType.TIME)
    private Date heureSaisie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Timbre")
    private BigDecimal timbre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CPTCREDIT_TIMBRE")
    private String cptcreditTimbre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CodeG")
    private String codeG;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Deposant")
    private String deposant;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "CptObligatoire")
    private short cptObligatoire;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TG")
    private short tg;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @JoinColumn(name = "ID_PIECES", referencedColumnName = "ID_PIECES")
    @ManyToOne(optional = false)
    private Pieces idPieces;
    @JoinColumn(name = "IDDEMANDES", referencedColumnName = "IDDEMANDES")
    @ManyToOne(optional = false)
    private Demandes iddemandes;
    @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")
    @ManyToOne(optional = false)
    private Tiers numTiers;
    @JoinColumn(name = "NumeroCaisse", referencedColumnName = "NumeroCaisse")
    @ManyToOne(optional = false)
    private Caisses numeroCaisse;
    @JoinColumn(name = "IDEtablissementFinancierDepart", referencedColumnName = "IDEtablissementFinancier")
    @ManyToOne(optional = false)
    private Etablissementfinancier iDEtablissementFinancierDepart;
    @JoinColumn(name = "IDSYS_Mode", referencedColumnName = "IDSYS_Mode")
    @ManyToOne(optional = false)
    private SysMode iDSYSMode;
    @JoinColumn(name = "IDNATUREOPERATION", referencedColumnName = "IDNATUREOPERATION")
    @ManyToOne(optional = false)
    private DecNatureoperation idnatureoperation;
    @JoinColumn(name = "IDDEC_Restitution", referencedColumnName = "IDDEC_Restitution")
    @ManyToOne(optional = false)
    private DecRestitution iDDECRestitution;
    @JoinColumn(name = "IDDEC_Reception", referencedColumnName = "IDDEC_Reception")
    @ManyToOne(optional = false)
    private DecReception iDDECReception;
    @JoinColumn(name = "IDAFFAIRES", referencedColumnName = "IDAFFAIRES")
    @ManyToOne(optional = false)
    private DecAffaires idaffaires;
    @OneToMany(mappedBy = "codeEnc")
    private List<PiecesTresoreries> piecesTresoreriesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeEnc")
    private List<Situationdocument> situationdocumentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeEnc")
    private List<DecDetailsarretes> decDetailsarretesList;
    @OneToMany(mappedBy = "codeEnc")
    private List<LigneBdo> ligneBdoList;
    @OneToMany(mappedBy = "codeEnc")
    private List<Billetage> billetageList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeEnc")
    private List<TreQuittance> treQuittanceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeEnc")
    private List<Mouvement> mouvementList;

    public Encaissements() {
    }

    public Encaissements(Long codeEnc) {
        this.codeEnc = codeEnc;
    }

    public Encaissements(Long codeEnc, String numeroTitre, Date date, BigDecimal montant, String observation, int iDActionscCaisses, short typeEncaissement, long caissier, Date visaDest, Date visaProv, int iDEtablissementFinancierDest, String numeroCBDepart, String numeroCBDest, String numPieceReg, int detenuePar, int idmandataires, String numQuit, String codejnl, Date dateTransfert, short comptabilise, Date dateEncaissement, short traiter, short imputerSurCDO, short etat, String cPtCREDIT, String cptdebit, String beneficiaire, String ndeclaration, Date heureSaisie, BigDecimal timbre, String cptcreditTimbre, String codeG, String deposant, short supprimer, String logSup, Date dateSup, short cptObligatoire, short tg) {
        this.codeEnc = codeEnc;
        this.numeroTitre = numeroTitre;
        this.date = date;
        this.montant = montant;
        this.observation = observation;
        this.iDActionscCaisses = iDActionscCaisses;
        this.typeEncaissement = typeEncaissement;
        this.caissier = caissier;
        this.visaDest = visaDest;
        this.visaProv = visaProv;
        this.iDEtablissementFinancierDest = iDEtablissementFinancierDest;
        this.numeroCBDepart = numeroCBDepart;
        this.numeroCBDest = numeroCBDest;
        this.numPieceReg = numPieceReg;
        this.detenuePar = detenuePar;
        this.idmandataires = idmandataires;
        this.numQuit = numQuit;
        this.codejnl = codejnl;
        this.dateTransfert = dateTransfert;
        this.comptabilise = comptabilise;
        this.dateEncaissement = dateEncaissement;
        this.traiter = traiter;
        this.imputerSurCDO = imputerSurCDO;
        this.etat = etat;
        this.cPtCREDIT = cPtCREDIT;
        this.cptdebit = cptdebit;
        this.beneficiaire = beneficiaire;
        this.ndeclaration = ndeclaration;
        this.heureSaisie = heureSaisie;
        this.timbre = timbre;
        this.cptcreditTimbre = cptcreditTimbre;
        this.codeG = codeG;
        this.deposant = deposant;
        this.supprimer = supprimer;
        this.logSup = logSup;
        this.dateSup = dateSup;
        this.cptObligatoire = cptObligatoire;
        this.tg = tg;
    }

    public String getNumeroTitre() {
        return numeroTitre;
    }

    public void setNumeroTitre(String numeroTitre) {
        this.numeroTitre = numeroTitre;
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

    public Long getCodeEnc() {
        return codeEnc;
    }

    public void setCodeEnc(Long codeEnc) {
        this.codeEnc = codeEnc;
    }

    public int getIDActionscCaisses() {
        return iDActionscCaisses;
    }

    public void setIDActionscCaisses(int iDActionscCaisses) {
        this.iDActionscCaisses = iDActionscCaisses;
    }

    public short getTypeEncaissement() {
        return typeEncaissement;
    }

    public void setTypeEncaissement(short typeEncaissement) {
        this.typeEncaissement = typeEncaissement;
    }

    public long getCaissier() {
        return caissier;
    }

    public void setCaissier(long caissier) {
        this.caissier = caissier;
    }

    public Date getVisaDest() {
        return visaDest;
    }

    public void setVisaDest(Date visaDest) {
        this.visaDest = visaDest;
    }

    public Date getVisaProv() {
        return visaProv;
    }

    public void setVisaProv(Date visaProv) {
        this.visaProv = visaProv;
    }

    public int getIDEtablissementFinancierDest() {
        return iDEtablissementFinancierDest;
    }

    public void setIDEtablissementFinancierDest(int iDEtablissementFinancierDest) {
        this.iDEtablissementFinancierDest = iDEtablissementFinancierDest;
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

    public String getNumPieceReg() {
        return numPieceReg;
    }

    public void setNumPieceReg(String numPieceReg) {
        this.numPieceReg = numPieceReg;
    }

    public int getDetenuePar() {
        return detenuePar;
    }

    public void setDetenuePar(int detenuePar) {
        this.detenuePar = detenuePar;
    }

    public int getIdmandataires() {
        return idmandataires;
    }

    public void setIdmandataires(int idmandataires) {
        this.idmandataires = idmandataires;
    }

    public String getNumQuit() {
        return numQuit;
    }

    public void setNumQuit(String numQuit) {
        this.numQuit = numQuit;
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

    public Date getDateEncaissement() {
        return dateEncaissement;
    }

    public void setDateEncaissement(Date dateEncaissement) {
        this.dateEncaissement = dateEncaissement;
    }

    public short getTraiter() {
        return traiter;
    }

    public void setTraiter(short traiter) {
        this.traiter = traiter;
    }

    public short getImputerSurCDO() {
        return imputerSurCDO;
    }

    public void setImputerSurCDO(short imputerSurCDO) {
        this.imputerSurCDO = imputerSurCDO;
    }

    public short getEtat() {
        return etat;
    }

    public void setEtat(short etat) {
        this.etat = etat;
    }

    public String getCPtCREDIT() {
        return cPtCREDIT;
    }

    public void setCPtCREDIT(String cPtCREDIT) {
        this.cPtCREDIT = cPtCREDIT;
    }

    public String getCptdebit() {
        return cptdebit;
    }

    public void setCptdebit(String cptdebit) {
        this.cptdebit = cptdebit;
    }

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public String getNdeclaration() {
        return ndeclaration;
    }

    public void setNdeclaration(String ndeclaration) {
        this.ndeclaration = ndeclaration;
    }

    public Date getHeureSaisie() {
        return heureSaisie;
    }

    public void setHeureSaisie(Date heureSaisie) {
        this.heureSaisie = heureSaisie;
    }

    public BigDecimal getTimbre() {
        return timbre;
    }

    public void setTimbre(BigDecimal timbre) {
        this.timbre = timbre;
    }

    public String getCptcreditTimbre() {
        return cptcreditTimbre;
    }

    public void setCptcreditTimbre(String cptcreditTimbre) {
        this.cptcreditTimbre = cptcreditTimbre;
    }

    public String getCodeG() {
        return codeG;
    }

    public void setCodeG(String codeG) {
        this.codeG = codeG;
    }

    public String getDeposant() {
        return deposant;
    }

    public void setDeposant(String deposant) {
        this.deposant = deposant;
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

    public short getCptObligatoire() {
        return cptObligatoire;
    }

    public void setCptObligatoire(short cptObligatoire) {
        this.cptObligatoire = cptObligatoire;
    }

    public short getTg() {
        return tg;
    }

    public void setTg(short tg) {
        this.tg = tg;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    public Pieces getIdPieces() {
        return idPieces;
    }

    public void setIdPieces(Pieces idPieces) {
        this.idPieces = idPieces;
    }

    public Demandes getIddemandes() {
        return iddemandes;
    }

    public void setIddemandes(Demandes iddemandes) {
        this.iddemandes = iddemandes;
    }

    public Tiers getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(Tiers numTiers) {
        this.numTiers = numTiers;
    }

    public Caisses getNumeroCaisse() {
        return numeroCaisse;
    }

    public void setNumeroCaisse(Caisses numeroCaisse) {
        this.numeroCaisse = numeroCaisse;
    }

    public Etablissementfinancier getIDEtablissementFinancierDepart() {
        return iDEtablissementFinancierDepart;
    }

    public void setIDEtablissementFinancierDepart(Etablissementfinancier iDEtablissementFinancierDepart) {
        this.iDEtablissementFinancierDepart = iDEtablissementFinancierDepart;
    }

    public SysMode getIDSYSMode() {
        return iDSYSMode;
    }

    public void setIDSYSMode(SysMode iDSYSMode) {
        this.iDSYSMode = iDSYSMode;
    }

    public DecNatureoperation getIdnatureoperation() {
        return idnatureoperation;
    }

    public void setIdnatureoperation(DecNatureoperation idnatureoperation) {
        this.idnatureoperation = idnatureoperation;
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

    @XmlTransient
    public List<LigneBdo> getLigneBdoList() {
        return ligneBdoList;
    }

    public void setLigneBdoList(List<LigneBdo> ligneBdoList) {
        this.ligneBdoList = ligneBdoList;
    }

    @XmlTransient
    public List<Billetage> getBilletageList() {
        return billetageList;
    }

    public void setBilletageList(List<Billetage> billetageList) {
        this.billetageList = billetageList;
    }

    @XmlTransient
    public List<TreQuittance> getTreQuittanceList() {
        return treQuittanceList;
    }

    public void setTreQuittanceList(List<TreQuittance> treQuittanceList) {
        this.treQuittanceList = treQuittanceList;
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
        hash += (codeEnc != null ? codeEnc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Encaissements)) {
            return false;
        }
        Encaissements other = (Encaissements) object;
        if ((this.codeEnc == null && other.codeEnc != null) || (this.codeEnc != null && !this.codeEnc.equals(other.codeEnc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Encaissements[ codeEnc=" + codeEnc + " ]";
    }
    
}
