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
@Table(name = "pf_supports")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PfSupports.findAll", query = "SELECT p FROM PfSupports p")
    , @NamedQuery(name = "PfSupports.findByIdpfSupports", query = "SELECT p FROM PfSupports p WHERE p.idpfSupports = :idpfSupports")
    , @NamedQuery(name = "PfSupports.findByReference", query = "SELECT p FROM PfSupports p WHERE p.reference = :reference")
    , @NamedQuery(name = "PfSupports.findByMontantGlobal", query = "SELECT p FROM PfSupports p WHERE p.montantGlobal = :montantGlobal")
    , @NamedQuery(name = "PfSupports.findByTaux", query = "SELECT p FROM PfSupports p WHERE p.taux = :taux")
    , @NamedQuery(name = "PfSupports.findByMontantInterets", query = "SELECT p FROM PfSupports p WHERE p.montantInterets = :montantInterets")
    , @NamedQuery(name = "PfSupports.findByNombreTitre", query = "SELECT p FROM PfSupports p WHERE p.nombreTitre = :nombreTitre")
    , @NamedQuery(name = "PfSupports.findByDateValeur", query = "SELECT p FROM PfSupports p WHERE p.dateValeur = :dateValeur")
    , @NamedQuery(name = "PfSupports.findByDateEcheance", query = "SELECT p FROM PfSupports p WHERE p.dateEcheance = :dateEcheance")
    , @NamedQuery(name = "PfSupports.findByMontantTitre", query = "SELECT p FROM PfSupports p WHERE p.montantTitre = :montantTitre")
    , @NamedQuery(name = "PfSupports.findBySens", query = "SELECT p FROM PfSupports p WHERE p.sens = :sens")
    , @NamedQuery(name = "PfSupports.findByPeriode", query = "SELECT p FROM PfSupports p WHERE p.periode = :periode")
    , @NamedQuery(name = "PfSupports.findByModalitepaiement", query = "SELECT p FROM PfSupports p WHERE p.modalitepaiement = :modalitepaiement")
    , @NamedQuery(name = "PfSupports.findByDeblocageAnticipe", query = "SELECT p FROM PfSupports p WHERE p.deblocageAnticipe = :deblocageAnticipe")
    , @NamedQuery(name = "PfSupports.findByDATEDblocage", query = "SELECT p FROM PfSupports p WHERE p.dATEDblocage = :dATEDblocage")
    , @NamedQuery(name = "PfSupports.findByDateSupport", query = "SELECT p FROM PfSupports p WHERE p.dateSupport = :dateSupport")
    , @NamedQuery(name = "PfSupports.findByArreteeAuto", query = "SELECT p FROM PfSupports p WHERE p.arreteeAuto = :arreteeAuto")
    , @NamedQuery(name = "PfSupports.findByTva", query = "SELECT p FROM PfSupports p WHERE p.tva = :tva")
    , @NamedQuery(name = "PfSupports.findByIrc", query = "SELECT p FROM PfSupports p WHERE p.irc = :irc")
    , @NamedQuery(name = "PfSupports.findByNumTiers", query = "SELECT p FROM PfSupports p WHERE p.numTiers = :numTiers")
    , @NamedQuery(name = "PfSupports.findBySystemeAmo", query = "SELECT p FROM PfSupports p WHERE p.systemeAmo = :systemeAmo")
    , @NamedQuery(name = "PfSupports.findByNombreTitreSouscrits", query = "SELECT p FROM PfSupports p WHERE p.nombreTitreSouscrits = :nombreTitreSouscrits")
    , @NamedQuery(name = "PfSupports.findByValeursTitresSouscrits", query = "SELECT p FROM PfSupports p WHERE p.valeursTitresSouscrits = :valeursTitresSouscrits")
    , @NamedQuery(name = "PfSupports.findByDiffere", query = "SELECT p FROM PfSupports p WHERE p.differe = :differe")
    , @NamedQuery(name = "PfSupports.findByIdcedant", query = "SELECT p FROM PfSupports p WHERE p.idcedant = :idcedant")
    , @NamedQuery(name = "PfSupports.findByDateRachat", query = "SELECT p FROM PfSupports p WHERE p.dateRachat = :dateRachat")
    , @NamedQuery(name = "PfSupports.findByNbreJoursCourrus", query = "SELECT p FROM PfSupports p WHERE p.nbreJoursCourrus = :nbreJoursCourrus")
    , @NamedQuery(name = "PfSupports.findByTauxDecote", query = "SELECT p FROM PfSupports p WHERE p.tauxDecote = :tauxDecote")
    , @NamedQuery(name = "PfSupports.findByMontantDecote", query = "SELECT p FROM PfSupports p WHERE p.montantDecote = :montantDecote")
    , @NamedQuery(name = "PfSupports.findByMontantAPayer", query = "SELECT p FROM PfSupports p WHERE p.montantAPayer = :montantAPayer")
    , @NamedQuery(name = "PfSupports.findByCommisIntermHt", query = "SELECT p FROM PfSupports p WHERE p.commisIntermHt = :commisIntermHt")
    , @NamedQuery(name = "PfSupports.findByCommisIntermTtc", query = "SELECT p FROM PfSupports p WHERE p.commisIntermTtc = :commisIntermTtc")
    , @NamedQuery(name = "PfSupports.findByCommisBrvm", query = "SELECT p FROM PfSupports p WHERE p.commisBrvm = :commisBrvm")
    , @NamedQuery(name = "PfSupports.findByTauxCommisInterm", query = "SELECT p FROM PfSupports p WHERE p.tauxCommisInterm = :tauxCommisInterm")
    , @NamedQuery(name = "PfSupports.findByTauxCommisBrvm", query = "SELECT p FROM PfSupports p WHERE p.tauxCommisBrvm = :tauxCommisBrvm")
    , @NamedQuery(name = "PfSupports.findByMontanttotalOblig", query = "SELECT p FROM PfSupports p WHERE p.montanttotalOblig = :montanttotalOblig")
    , @NamedQuery(name = "PfSupports.findByDATEDernierIteret", query = "SELECT p FROM PfSupports p WHERE p.dATEDernierIteret = :dATEDernierIteret")
    , @NamedQuery(name = "PfSupports.findByInteretsCourrus", query = "SELECT p FROM PfSupports p WHERE p.interetsCourrus = :interetsCourrus")
    , @NamedQuery(name = "PfSupports.findByIdIntermedaire", query = "SELECT p FROM PfSupports p WHERE p.idIntermedaire = :idIntermedaire")
    , @NamedQuery(name = "PfSupports.findByNatureTitre", query = "SELECT p FROM PfSupports p WHERE p.natureTitre = :natureTitre")
    , @NamedQuery(name = "PfSupports.findByFiscalite", query = "SELECT p FROM PfSupports p WHERE p.fiscalite = :fiscalite")
    , @NamedQuery(name = "PfSupports.findByPrixCessionTitres", query = "SELECT p FROM PfSupports p WHERE p.prixCessionTitres = :prixCessionTitres")
    , @NamedQuery(name = "PfSupports.findByPrixTotalCession", query = "SELECT p FROM PfSupports p WHERE p.prixTotalCession = :prixTotalCession")
    , @NamedQuery(name = "PfSupports.findByDividende", query = "SELECT p FROM PfSupports p WHERE p.dividende = :dividende")
    , @NamedQuery(name = "PfSupports.findByTauxFfat", query = "SELECT p FROM PfSupports p WHERE p.tauxFfat = :tauxFfat")
    , @NamedQuery(name = "PfSupports.findByTAUXCouvert", query = "SELECT p FROM PfSupports p WHERE p.tAUXCouvert = :tAUXCouvert")
    , @NamedQuery(name = "PfSupports.findByMontantPret", query = "SELECT p FROM PfSupports p WHERE p.montantPret = :montantPret")
    , @NamedQuery(name = "PfSupports.findByMontFlat", query = "SELECT p FROM PfSupports p WHERE p.montFlat = :montFlat")
    , @NamedQuery(name = "PfSupports.findByMntAval", query = "SELECT p FROM PfSupports p WHERE p.mntAval = :mntAval")
    , @NamedQuery(name = "PfSupports.findByMntRembourse", query = "SELECT p FROM PfSupports p WHERE p.mntRembourse = :mntRembourse")
    , @NamedQuery(name = "PfSupports.findByPaiementsurgarantie", query = "SELECT p FROM PfSupports p WHERE p.paiementsurgarantie = :paiementsurgarantie")
    , @NamedQuery(name = "PfSupports.findByTauxRemboursement", query = "SELECT p FROM PfSupports p WHERE p.tauxRemboursement = :tauxRemboursement")
    , @NamedQuery(name = "PfSupports.findByMntDeblocage", query = "SELECT p FROM PfSupports p WHERE p.mntDeblocage = :mntDeblocage")
    , @NamedQuery(name = "PfSupports.findByIdSupDebloc", query = "SELECT p FROM PfSupports p WHERE p.idSupDebloc = :idSupDebloc")
    , @NamedQuery(name = "PfSupports.findByCloturee", query = "SELECT p FROM PfSupports p WHERE p.cloturee = :cloturee")
    , @NamedQuery(name = "PfSupports.findByIdemetteur", query = "SELECT p FROM PfSupports p WHERE p.idemetteur = :idemetteur")
    , @NamedQuery(name = "PfSupports.findByGestion", query = "SELECT p FROM PfSupports p WHERE p.gestion = :gestion")})
public class PfSupports implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPF_SUPPORTS")
    private Integer idpfSupports;
    @Size(max = 150)
    @Column(name = "Reference")
    private String reference;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MontantGlobal")
    private BigDecimal montantGlobal;
    @Column(name = "Taux")
    private Double taux;
    @Column(name = "MontantInterets")
    private Integer montantInterets;
    @Column(name = "NombreTitre")
    private Integer nombreTitre;
    @Column(name = "DateValeur")
    @Temporal(TemporalType.DATE)
    private Date dateValeur;
    @Column(name = "DateEcheance")
    @Temporal(TemporalType.DATE)
    private Date dateEcheance;
    @Column(name = "MontantTitre")
    private Integer montantTitre;
    @Column(name = "SENS")
    private Short sens;
    @Column(name = "periode")
    private Integer periode;
    @Column(name = "Modalitepaiement")
    private Short modalitepaiement;
    @Column(name = "DeblocageAnticipe")
    private Short deblocageAnticipe;
    @Column(name = "DATEDblocage")
    @Temporal(TemporalType.DATE)
    private Date dATEDblocage;
    @Column(name = "DateSupport")
    @Temporal(TemporalType.DATE)
    private Date dateSupport;
    @Column(name = "ArreteeAuto")
    private Short arreteeAuto;
    @Column(name = "TVA")
    private Double tva;
    @Column(name = "IRC")
    private Double irc;
    @Column(name = "NumTiers")
    private BigInteger numTiers;
    @Column(name = "SystemeAmo")
    private Short systemeAmo;
    @Column(name = "NombreTitreSouscrits")
    private Integer nombreTitreSouscrits;
    @Column(name = "ValeursTitresSouscrits")
    private Integer valeursTitresSouscrits;
    @Column(name = "Differe")
    private Integer differe;
    @Column(name = "IDCEDANT")
    private Integer idcedant;
    @Column(name = "DateRachat")
    @Temporal(TemporalType.DATE)
    private Date dateRachat;
    @Column(name = "nbreJoursCourrus")
    private Integer nbreJoursCourrus;
    @Column(name = "TauxDecote")
    private Integer tauxDecote;
    @Column(name = "MontantDecote")
    private Integer montantDecote;
    @Column(name = "MontantAPayer")
    private Integer montantAPayer;
    @Column(name = "COMMIS_INTERM_HT")
    private Integer commisIntermHt;
    @Column(name = "COMMIS_INTERM_TTC")
    private Integer commisIntermTtc;
    @Column(name = "COMMIS_BRVM")
    private Integer commisBrvm;
    @Column(name = "TAUX_COMMIS_INTERM")
    private Integer tauxCommisInterm;
    @Column(name = "TAUX_COMMIS_BRVM")
    private Integer tauxCommisBrvm;
    @Column(name = "MONTANTTOTAL_OBLIG")
    private Integer montanttotalOblig;
    @Column(name = "DATEDernierIteret")
    @Temporal(TemporalType.DATE)
    private Date dATEDernierIteret;
    @Column(name = "InteretsCourrus")
    private Integer interetsCourrus;
    @Column(name = "ID_INTERMEDAIRE")
    private Integer idIntermedaire;
    @Column(name = "NatureTitre")
    private Short natureTitre;
    @Column(name = "Fiscalite")
    private Integer fiscalite;
    @Column(name = "PrixCessionTitres")
    private Integer prixCessionTitres;
    @Column(name = "PrixTotalCession")
    private Integer prixTotalCession;
    @Column(name = "Dividende")
    private Integer dividende;
    @Column(name = "TauxFfat")
    private Double tauxFfat;
    @Column(name = "TAUXCouvert")
    private Integer tAUXCouvert;
    @Column(name = "MontantPret")
    private Double montantPret;
    @Column(name = "MontFlat")
    private Double montFlat;
    @Column(name = "MntAval")
    private Double mntAval;
    @Column(name = "MntRembourse")
    private Double mntRembourse;
    @Column(name = "Paiementsurgarantie")
    private Double paiementsurgarantie;
    @Column(name = "TauxRemboursement")
    private Integer tauxRemboursement;
    @Column(name = "MntDeblocage")
    private Integer mntDeblocage;
    @Column(name = "ID_SUP_DEBLOC")
    private Integer idSupDebloc;
    @Column(name = "Cloturee")
    private Short cloturee;
    @Column(name = "IDEMETTEUR")
    private Integer idemetteur;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpfSupports")
    private List<PfTableauAmo> pfTableauAmoList;
    @OneToMany(mappedBy = "idpfSupports")
    private List<Fiscalite> fiscaliteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpfSupports")
    private List<PfArrete> pfArreteList;
    @JoinColumn(name = "IDNATURE_BIENS", referencedColumnName = "IDNATURE_BIENS")
    @ManyToOne
    private NatureBiens1 idnatureBiens;
    @JoinColumn(name = "IDTYPE_ENC", referencedColumnName = "IDTYPE_ENC")
    @ManyToOne
    private PfTypeEnc idtypeEnc;
    @JoinColumn(name = "EtablissementGestionnaire", referencedColumnName = "EtablissementGestionnaire")
    @ManyToOne
    private Etablissementgestionnaire etablissementGestionnaire;
    @JoinColumn(name = "IDPF_CategorieOperation", referencedColumnName = "IDPF_CategorieOperation")
    @ManyToOne
    private PfCategorieoperation iDPFCategorieOperation;
    @JoinColumn(name = "IDPF_TYPESUPPORTS", referencedColumnName = "IDPF_TYPESUPPORTS")
    @ManyToOne
    private PfTypesupports idpfTypesupports;

    public PfSupports() {
    }

    public PfSupports(Integer idpfSupports) {
        this.idpfSupports = idpfSupports;
    }

    public Integer getIdpfSupports() {
        return idpfSupports;
    }

    public void setIdpfSupports(Integer idpfSupports) {
        this.idpfSupports = idpfSupports;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public BigDecimal getMontantGlobal() {
        return montantGlobal;
    }

    public void setMontantGlobal(BigDecimal montantGlobal) {
        this.montantGlobal = montantGlobal;
    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }

    public Integer getMontantInterets() {
        return montantInterets;
    }

    public void setMontantInterets(Integer montantInterets) {
        this.montantInterets = montantInterets;
    }

    public Integer getNombreTitre() {
        return nombreTitre;
    }

    public void setNombreTitre(Integer nombreTitre) {
        this.nombreTitre = nombreTitre;
    }

    public Date getDateValeur() {
        return dateValeur;
    }

    public void setDateValeur(Date dateValeur) {
        this.dateValeur = dateValeur;
    }

    public Date getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(Date dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public Integer getMontantTitre() {
        return montantTitre;
    }

    public void setMontantTitre(Integer montantTitre) {
        this.montantTitre = montantTitre;
    }

    public Short getSens() {
        return sens;
    }

    public void setSens(Short sens) {
        this.sens = sens;
    }

    public Integer getPeriode() {
        return periode;
    }

    public void setPeriode(Integer periode) {
        this.periode = periode;
    }

    public Short getModalitepaiement() {
        return modalitepaiement;
    }

    public void setModalitepaiement(Short modalitepaiement) {
        this.modalitepaiement = modalitepaiement;
    }

    public Short getDeblocageAnticipe() {
        return deblocageAnticipe;
    }

    public void setDeblocageAnticipe(Short deblocageAnticipe) {
        this.deblocageAnticipe = deblocageAnticipe;
    }

    public Date getDATEDblocage() {
        return dATEDblocage;
    }

    public void setDATEDblocage(Date dATEDblocage) {
        this.dATEDblocage = dATEDblocage;
    }

    public Date getDateSupport() {
        return dateSupport;
    }

    public void setDateSupport(Date dateSupport) {
        this.dateSupport = dateSupport;
    }

    public Short getArreteeAuto() {
        return arreteeAuto;
    }

    public void setArreteeAuto(Short arreteeAuto) {
        this.arreteeAuto = arreteeAuto;
    }

    public Double getTva() {
        return tva;
    }

    public void setTva(Double tva) {
        this.tva = tva;
    }

    public Double getIrc() {
        return irc;
    }

    public void setIrc(Double irc) {
        this.irc = irc;
    }

    public BigInteger getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(BigInteger numTiers) {
        this.numTiers = numTiers;
    }

    public Short getSystemeAmo() {
        return systemeAmo;
    }

    public void setSystemeAmo(Short systemeAmo) {
        this.systemeAmo = systemeAmo;
    }

    public Integer getNombreTitreSouscrits() {
        return nombreTitreSouscrits;
    }

    public void setNombreTitreSouscrits(Integer nombreTitreSouscrits) {
        this.nombreTitreSouscrits = nombreTitreSouscrits;
    }

    public Integer getValeursTitresSouscrits() {
        return valeursTitresSouscrits;
    }

    public void setValeursTitresSouscrits(Integer valeursTitresSouscrits) {
        this.valeursTitresSouscrits = valeursTitresSouscrits;
    }

    public Integer getDiffere() {
        return differe;
    }

    public void setDiffere(Integer differe) {
        this.differe = differe;
    }

    public Integer getIdcedant() {
        return idcedant;
    }

    public void setIdcedant(Integer idcedant) {
        this.idcedant = idcedant;
    }

    public Date getDateRachat() {
        return dateRachat;
    }

    public void setDateRachat(Date dateRachat) {
        this.dateRachat = dateRachat;
    }

    public Integer getNbreJoursCourrus() {
        return nbreJoursCourrus;
    }

    public void setNbreJoursCourrus(Integer nbreJoursCourrus) {
        this.nbreJoursCourrus = nbreJoursCourrus;
    }

    public Integer getTauxDecote() {
        return tauxDecote;
    }

    public void setTauxDecote(Integer tauxDecote) {
        this.tauxDecote = tauxDecote;
    }

    public Integer getMontantDecote() {
        return montantDecote;
    }

    public void setMontantDecote(Integer montantDecote) {
        this.montantDecote = montantDecote;
    }

    public Integer getMontantAPayer() {
        return montantAPayer;
    }

    public void setMontantAPayer(Integer montantAPayer) {
        this.montantAPayer = montantAPayer;
    }

    public Integer getCommisIntermHt() {
        return commisIntermHt;
    }

    public void setCommisIntermHt(Integer commisIntermHt) {
        this.commisIntermHt = commisIntermHt;
    }

    public Integer getCommisIntermTtc() {
        return commisIntermTtc;
    }

    public void setCommisIntermTtc(Integer commisIntermTtc) {
        this.commisIntermTtc = commisIntermTtc;
    }

    public Integer getCommisBrvm() {
        return commisBrvm;
    }

    public void setCommisBrvm(Integer commisBrvm) {
        this.commisBrvm = commisBrvm;
    }

    public Integer getTauxCommisInterm() {
        return tauxCommisInterm;
    }

    public void setTauxCommisInterm(Integer tauxCommisInterm) {
        this.tauxCommisInterm = tauxCommisInterm;
    }

    public Integer getTauxCommisBrvm() {
        return tauxCommisBrvm;
    }

    public void setTauxCommisBrvm(Integer tauxCommisBrvm) {
        this.tauxCommisBrvm = tauxCommisBrvm;
    }

    public Integer getMontanttotalOblig() {
        return montanttotalOblig;
    }

    public void setMontanttotalOblig(Integer montanttotalOblig) {
        this.montanttotalOblig = montanttotalOblig;
    }

    public Date getDATEDernierIteret() {
        return dATEDernierIteret;
    }

    public void setDATEDernierIteret(Date dATEDernierIteret) {
        this.dATEDernierIteret = dATEDernierIteret;
    }

    public Integer getInteretsCourrus() {
        return interetsCourrus;
    }

    public void setInteretsCourrus(Integer interetsCourrus) {
        this.interetsCourrus = interetsCourrus;
    }

    public Integer getIdIntermedaire() {
        return idIntermedaire;
    }

    public void setIdIntermedaire(Integer idIntermedaire) {
        this.idIntermedaire = idIntermedaire;
    }

    public Short getNatureTitre() {
        return natureTitre;
    }

    public void setNatureTitre(Short natureTitre) {
        this.natureTitre = natureTitre;
    }

    public Integer getFiscalite() {
        return fiscalite;
    }

    public void setFiscalite(Integer fiscalite) {
        this.fiscalite = fiscalite;
    }

    public Integer getPrixCessionTitres() {
        return prixCessionTitres;
    }

    public void setPrixCessionTitres(Integer prixCessionTitres) {
        this.prixCessionTitres = prixCessionTitres;
    }

    public Integer getPrixTotalCession() {
        return prixTotalCession;
    }

    public void setPrixTotalCession(Integer prixTotalCession) {
        this.prixTotalCession = prixTotalCession;
    }

    public Integer getDividende() {
        return dividende;
    }

    public void setDividende(Integer dividende) {
        this.dividende = dividende;
    }

    public Double getTauxFfat() {
        return tauxFfat;
    }

    public void setTauxFfat(Double tauxFfat) {
        this.tauxFfat = tauxFfat;
    }

    public Integer getTAUXCouvert() {
        return tAUXCouvert;
    }

    public void setTAUXCouvert(Integer tAUXCouvert) {
        this.tAUXCouvert = tAUXCouvert;
    }

    public Double getMontantPret() {
        return montantPret;
    }

    public void setMontantPret(Double montantPret) {
        this.montantPret = montantPret;
    }

    public Double getMontFlat() {
        return montFlat;
    }

    public void setMontFlat(Double montFlat) {
        this.montFlat = montFlat;
    }

    public Double getMntAval() {
        return mntAval;
    }

    public void setMntAval(Double mntAval) {
        this.mntAval = mntAval;
    }

    public Double getMntRembourse() {
        return mntRembourse;
    }

    public void setMntRembourse(Double mntRembourse) {
        this.mntRembourse = mntRembourse;
    }

    public Double getPaiementsurgarantie() {
        return paiementsurgarantie;
    }

    public void setPaiementsurgarantie(Double paiementsurgarantie) {
        this.paiementsurgarantie = paiementsurgarantie;
    }

    public Integer getTauxRemboursement() {
        return tauxRemboursement;
    }

    public void setTauxRemboursement(Integer tauxRemboursement) {
        this.tauxRemboursement = tauxRemboursement;
    }

    public Integer getMntDeblocage() {
        return mntDeblocage;
    }

    public void setMntDeblocage(Integer mntDeblocage) {
        this.mntDeblocage = mntDeblocage;
    }

    public Integer getIdSupDebloc() {
        return idSupDebloc;
    }

    public void setIdSupDebloc(Integer idSupDebloc) {
        this.idSupDebloc = idSupDebloc;
    }

    public Short getCloturee() {
        return cloturee;
    }

    public void setCloturee(Short cloturee) {
        this.cloturee = cloturee;
    }

    public Integer getIdemetteur() {
        return idemetteur;
    }

    public void setIdemetteur(Integer idemetteur) {
        this.idemetteur = idemetteur;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<PfTableauAmo> getPfTableauAmoList() {
        return pfTableauAmoList;
    }

    public void setPfTableauAmoList(List<PfTableauAmo> pfTableauAmoList) {
        this.pfTableauAmoList = pfTableauAmoList;
    }

    @XmlTransient
    public List<Fiscalite> getFiscaliteList() {
        return fiscaliteList;
    }

    public void setFiscaliteList(List<Fiscalite> fiscaliteList) {
        this.fiscaliteList = fiscaliteList;
    }

    @XmlTransient
    public List<PfArrete> getPfArreteList() {
        return pfArreteList;
    }

    public void setPfArreteList(List<PfArrete> pfArreteList) {
        this.pfArreteList = pfArreteList;
    }

    public NatureBiens1 getIdnatureBiens() {
        return idnatureBiens;
    }

    public void setIdnatureBiens(NatureBiens1 idnatureBiens) {
        this.idnatureBiens = idnatureBiens;
    }

    public PfTypeEnc getIdtypeEnc() {
        return idtypeEnc;
    }

    public void setIdtypeEnc(PfTypeEnc idtypeEnc) {
        this.idtypeEnc = idtypeEnc;
    }

    public Etablissementgestionnaire getEtablissementGestionnaire() {
        return etablissementGestionnaire;
    }

    public void setEtablissementGestionnaire(Etablissementgestionnaire etablissementGestionnaire) {
        this.etablissementGestionnaire = etablissementGestionnaire;
    }

    public PfCategorieoperation getIDPFCategorieOperation() {
        return iDPFCategorieOperation;
    }

    public void setIDPFCategorieOperation(PfCategorieoperation iDPFCategorieOperation) {
        this.iDPFCategorieOperation = iDPFCategorieOperation;
    }

    public PfTypesupports getIdpfTypesupports() {
        return idpfTypesupports;
    }

    public void setIdpfTypesupports(PfTypesupports idpfTypesupports) {
        this.idpfTypesupports = idpfTypesupports;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpfSupports != null ? idpfSupports.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PfSupports)) {
            return false;
        }
        PfSupports other = (PfSupports) object;
        if ((this.idpfSupports == null && other.idpfSupports != null) || (this.idpfSupports != null && !this.idpfSupports.equals(other.idpfSupports))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.PfSupports[ idpfSupports=" + idpfSupports + " ]";
    }
    
}
