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
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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
@Table(name = "tiers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiers.findAll", query = "SELECT t FROM Tiers t")
    , @NamedQuery(name = "Tiers.findByNumTiers", query = "SELECT t FROM Tiers t WHERE t.numTiers = :numTiers")
    , @NamedQuery(name = "Tiers.findByNom", query = "SELECT t FROM Tiers t WHERE t.nom = :nom")
    , @NamedQuery(name = "Tiers.findBySociete", query = "SELECT t FROM Tiers t WHERE t.societe = :societe")
    , @NamedQuery(name = "Tiers.findByAdresse", query = "SELECT t FROM Tiers t WHERE t.adresse = :adresse")
    , @NamedQuery(name = "Tiers.findByNumeroCompte", query = "SELECT t FROM Tiers t WHERE t.numeroCompte = :numeroCompte")
    , @NamedQuery(name = "Tiers.findByTelephone", query = "SELECT t FROM Tiers t WHERE t.telephone = :telephone")
    , @NamedQuery(name = "Tiers.findByFax", query = "SELECT t FROM Tiers t WHERE t.fax = :fax")
    , @NamedQuery(name = "Tiers.findByEMail", query = "SELECT t FROM Tiers t WHERE t.eMail = :eMail")
    , @NamedQuery(name = "Tiers.findByPays", query = "SELECT t FROM Tiers t WHERE t.pays = :pays")
    , @NamedQuery(name = "Tiers.findByGsm", query = "SELECT t FROM Tiers t WHERE t.gsm = :gsm")
    , @NamedQuery(name = "Tiers.findByCodePostal", query = "SELECT t FROM Tiers t WHERE t.codePostal = :codePostal")
    , @NamedQuery(name = "Tiers.findByVille", query = "SELECT t FROM Tiers t WHERE t.ville = :ville")
    , @NamedQuery(name = "Tiers.findByCivilite", query = "SELECT t FROM Tiers t WHERE t.civilite = :civilite")
    , @NamedQuery(name = "Tiers.findByPrenom", query = "SELECT t FROM Tiers t WHERE t.prenom = :prenom")
    , @NamedQuery(name = "Tiers.findByNumeroAbrege", query = "SELECT t FROM Tiers t WHERE t.numeroAbrege = :numeroAbrege")
    , @NamedQuery(name = "Tiers.findByAdresseSuite", query = "SELECT t FROM Tiers t WHERE t.adresseSuite = :adresseSuite")
    , @NamedQuery(name = "Tiers.findByRCs", query = "SELECT t FROM Tiers t WHERE t.rCs = :rCs")
    , @NamedQuery(name = "Tiers.findByRib", query = "SELECT t FROM Tiers t WHERE t.rib = :rib")
    , @NamedQuery(name = "Tiers.findByLogin", query = "SELECT t FROM Tiers t WHERE t.login = :login")
    , @NamedQuery(name = "Tiers.findByTitreProfessionnel", query = "SELECT t FROM Tiers t WHERE t.titreProfessionnel = :titreProfessionnel")
    , @NamedQuery(name = "Tiers.findByGroupeGPW", query = "SELECT t FROM Tiers t WHERE t.groupeGPW = :groupeGPW")
    , @NamedQuery(name = "Tiers.findByTypeTiers", query = "SELECT t FROM Tiers t WHERE t.typeTiers = :typeTiers")
    , @NamedQuery(name = "Tiers.findByDateDeCreation", query = "SELECT t FROM Tiers t WHERE t.dateDeCreation = :dateDeCreation")
    , @NamedQuery(name = "Tiers.findByNombreDeJourAnnee", query = "SELECT t FROM Tiers t WHERE t.nombreDeJourAnnee = :nombreDeJourAnnee")
    , @NamedQuery(name = "Tiers.findByPeriodicite", query = "SELECT t FROM Tiers t WHERE t.periodicite = :periodicite")
    , @NamedQuery(name = "Tiers.findByUtiliserMR", query = "SELECT t FROM Tiers t WHERE t.utiliserMR = :utiliserMR")
    , @NamedQuery(name = "Tiers.findByUtiliserAffaires", query = "SELECT t FROM Tiers t WHERE t.utiliserAffaires = :utiliserAffaires")
    , @NamedQuery(name = "Tiers.findByCi", query = "SELECT t FROM Tiers t WHERE t.ci = :ci")
    , @NamedQuery(name = "Tiers.findByTauxDebit", query = "SELECT t FROM Tiers t WHERE t.tauxDebit = :tauxDebit")
    , @NamedQuery(name = "Tiers.findByTauxCredit", query = "SELECT t FROM Tiers t WHERE t.tauxCredit = :tauxCredit")
    , @NamedQuery(name = "Tiers.findByNumeroCompteCourant", query = "SELECT t FROM Tiers t WHERE t.numeroCompteCourant = :numeroCompteCourant")
    , @NamedQuery(name = "Tiers.findByIdservices", query = "SELECT t FROM Tiers t WHERE t.idservices = :idservices")
    , @NamedQuery(name = "Tiers.findByMatricule", query = "SELECT t FROM Tiers t WHERE t.matricule = :matricule")
    , @NamedQuery(name = "Tiers.findByAbreviation", query = "SELECT t FROM Tiers t WHERE t.abreviation = :abreviation")
    , @NamedQuery(name = "Tiers.findByCode", query = "SELECT t FROM Tiers t WHERE t.code = :code")
    , @NamedQuery(name = "Tiers.findBySite", query = "SELECT t FROM Tiers t WHERE t.site = :site")
    , @NamedQuery(name = "Tiers.findByCharge", query = "SELECT t FROM Tiers t WHERE t.charge = :charge")
    , @NamedQuery(name = "Tiers.findByModule", query = "SELECT t FROM Tiers t WHERE t.module = :module")
    , @NamedQuery(name = "Tiers.findByTelephone2", query = "SELECT t FROM Tiers t WHERE t.telephone2 = :telephone2")
    , @NamedQuery(name = "Tiers.findByGestionnaire", query = "SELECT t FROM Tiers t WHERE t.gestionnaire = :gestionnaire")
    , @NamedQuery(name = "Tiers.findByNumeroCompteImputationProvisoire", query = "SELECT t FROM Tiers t WHERE t.numeroCompteImputationProvisoire = :numeroCompteImputationProvisoire")
    , @NamedQuery(name = "Tiers.findByCdo", query = "SELECT t FROM Tiers t WHERE t.cdo = :cdo")
    , @NamedQuery(name = "Tiers.findByNinea", query = "SELECT t FROM Tiers t WHERE t.ninea = :ninea")
    , @NamedQuery(name = "Tiers.findByIDTiersAssocie", query = "SELECT t FROM Tiers t WHERE t.iDTiersAssocie = :iDTiersAssocie")})
public class Tiers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NumTiers")
    private Long numTiers;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "Societe")
    private String societe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Adresse")
    private String adresse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 51)
    @Column(name = "NumeroCompte")
    private String numeroCompte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Telephone")
    private String telephone;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Fax")
    private String fax;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "EMail")
    private String eMail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Pays")
    private String pays;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "GSM")
    private String gsm;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Observations")
    private String observations;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "CodePostal")
    private String codePostal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Ville")
    private String ville;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "Civilite")
    private String civilite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Prenom")
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroAbrege")
    private String numeroAbrege;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "AdresseSuite")
    private String adresseSuite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "RCs")
    private String rCs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "RIB")
    private String rib;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Login")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "TitreProfessionnel")
    private String titreProfessionnel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "GroupeGPW")
    private String groupeGPW;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TypeTiers")
    private String typeTiers;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateDeCreation")
    @Temporal(TemporalType.DATE)
    private Date dateDeCreation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NombreDeJourAnnee")
    private short nombreDeJourAnnee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Periodicite")
    private short periodicite;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UtiliserMR")
    private short utiliserMR;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UtiliserAffaires")
    private short utiliserAffaires;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CI")
    private short ci;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TauxDebit")
    private double tauxDebit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TauxCredit")
    private double tauxCredit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroCompteCourant")
    private String numeroCompteCourant;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSERVICES")
    private int idservices;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "Logo")
    private byte[] logo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Matricule")
    private String matricule;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "Abreviation")
    private String abreviation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Code")
    private String code;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Site")
    private String site;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Charge")
    private String charge;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Module")
    private short module;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Telephone2")
    private String telephone2;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Gestionnaire")
    private short gestionnaire;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NumeroCompteImputationProvisoire")
    private String numeroCompteImputationProvisoire;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CDO")
    private String cdo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "NINEA")
    private String ninea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTiersAssocie")
    private long iDTiersAssocie;
    @ManyToMany(mappedBy = "tiersList")
    private List<DecNatureoperation> decNatureoperationList;
    @JoinTable(name = "membres_groupes", joinColumns = {
        @JoinColumn(name = "NumTiers", referencedColumnName = "NumTiers")}, inverseJoinColumns = {
        @JoinColumn(name = "NomGroupe", referencedColumnName = "NomGroupe")})
    @ManyToMany
    private List<Groupes> groupesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<Encaissements> encaissementsList;
    @OneToMany(mappedBy = "numTiers")
    private List<Preselection> preselectionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<Produit> produitList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<Representantsgroupe> representantsgroupeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<Courriers> courriersList;
    @JoinColumn(name = "IDCategoriesTiers", referencedColumnName = "IDCategoriesTiers")
    @ManyToOne(optional = false)
    private Categoriestiers iDCategoriesTiers;
    @JoinColumn(name = "IDDEPENDANCE", referencedColumnName = "IDDEPENDANCE")
    @ManyToOne(optional = false)
    private Dependance iddependance;
    @JoinColumn(name = "IDZONES", referencedColumnName = "IDZONES")
    @ManyToOne(optional = false)
    private Zones idzones;
    @JoinColumn(name = "IDSECTEURS_ACTIVITES", referencedColumnName = "IDSECTEURS_ACTIVITES")
    @ManyToOne(optional = false)
    private SecteursActivites idsecteursActivites;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numFournisseur")
    private List<Pieces> piecesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<DemandesRestitution> demandesRestitutionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<Situationdocument> situationdocumentList;
    @OneToMany(mappedBy = "numTiers")
    private List<Contentieux> contentieuxList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<Remarques> remarquesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<Mandataires> mandatairesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<DecReception> decReceptionList;
    @OneToMany(mappedBy = "numTiers")
    private List<Gerer> gererList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<BudEngagement> budEngagementList;
    @OneToMany(mappedBy = "numTiers")
    private List<Contrats> contratsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<DecMouvements> decMouvementsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<Decaissements> decaissementsList;
    @OneToMany(mappedBy = "numTiers")
    private List<Actionsccaisses> actionsccaissesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<BudLiquidation> budLiquidationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<DecRestitution> decRestitutionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<DecAutorisationderestitution> decAutorisationderestitutionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<DecAffaires> decAffairesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numTiers")
    private List<Offres> offresList;

    public Tiers() {
    }

    public Tiers(Long numTiers) {
        this.numTiers = numTiers;
    }

    public Tiers(Long numTiers, String nom, String societe, String adresse, String numeroCompte, String telephone, String fax, String eMail, String pays, String gsm, String observations, String codePostal, String ville, String civilite, String prenom, String numeroAbrege, String adresseSuite, String rCs, String rib, String login, String titreProfessionnel, String groupeGPW, String typeTiers, Date dateDeCreation, short nombreDeJourAnnee, short periodicite, short utiliserMR, short utiliserAffaires, short ci, double tauxDebit, double tauxCredit, String numeroCompteCourant, int idservices, byte[] logo, String matricule, String abreviation, String code, String site, String charge, short module, String telephone2, short gestionnaire, String numeroCompteImputationProvisoire, String cdo, String ninea, long iDTiersAssocie) {
        this.numTiers = numTiers;
        this.nom = nom;
        this.societe = societe;
        this.adresse = adresse;
        this.numeroCompte = numeroCompte;
        this.telephone = telephone;
        this.fax = fax;
        this.eMail = eMail;
        this.pays = pays;
        this.gsm = gsm;
        this.observations = observations;
        this.codePostal = codePostal;
        this.ville = ville;
        this.civilite = civilite;
        this.prenom = prenom;
        this.numeroAbrege = numeroAbrege;
        this.adresseSuite = adresseSuite;
        this.rCs = rCs;
        this.rib = rib;
        this.login = login;
        this.titreProfessionnel = titreProfessionnel;
        this.groupeGPW = groupeGPW;
        this.typeTiers = typeTiers;
        this.dateDeCreation = dateDeCreation;
        this.nombreDeJourAnnee = nombreDeJourAnnee;
        this.periodicite = periodicite;
        this.utiliserMR = utiliserMR;
        this.utiliserAffaires = utiliserAffaires;
        this.ci = ci;
        this.tauxDebit = tauxDebit;
        this.tauxCredit = tauxCredit;
        this.numeroCompteCourant = numeroCompteCourant;
        this.idservices = idservices;
        this.logo = logo;
        this.matricule = matricule;
        this.abreviation = abreviation;
        this.code = code;
        this.site = site;
        this.charge = charge;
        this.module = module;
        this.telephone2 = telephone2;
        this.gestionnaire = gestionnaire;
        this.numeroCompteImputationProvisoire = numeroCompteImputationProvisoire;
        this.cdo = cdo;
        this.ninea = ninea;
        this.iDTiersAssocie = iDTiersAssocie;
    }

    public Long getNumTiers() {
        return numTiers;
    }

    public void setNumTiers(Long numTiers) {
        this.numTiers = numTiers;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroAbrege() {
        return numeroAbrege;
    }

    public void setNumeroAbrege(String numeroAbrege) {
        this.numeroAbrege = numeroAbrege;
    }

    public String getAdresseSuite() {
        return adresseSuite;
    }

    public void setAdresseSuite(String adresseSuite) {
        this.adresseSuite = adresseSuite;
    }

    public String getRCs() {
        return rCs;
    }

    public void setRCs(String rCs) {
        this.rCs = rCs;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getTitreProfessionnel() {
        return titreProfessionnel;
    }

    public void setTitreProfessionnel(String titreProfessionnel) {
        this.titreProfessionnel = titreProfessionnel;
    }

    public String getGroupeGPW() {
        return groupeGPW;
    }

    public void setGroupeGPW(String groupeGPW) {
        this.groupeGPW = groupeGPW;
    }

    public String getTypeTiers() {
        return typeTiers;
    }

    public void setTypeTiers(String typeTiers) {
        this.typeTiers = typeTiers;
    }

    public Date getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(Date dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    public short getNombreDeJourAnnee() {
        return nombreDeJourAnnee;
    }

    public void setNombreDeJourAnnee(short nombreDeJourAnnee) {
        this.nombreDeJourAnnee = nombreDeJourAnnee;
    }

    public short getPeriodicite() {
        return periodicite;
    }

    public void setPeriodicite(short periodicite) {
        this.periodicite = periodicite;
    }

    public short getUtiliserMR() {
        return utiliserMR;
    }

    public void setUtiliserMR(short utiliserMR) {
        this.utiliserMR = utiliserMR;
    }

    public short getUtiliserAffaires() {
        return utiliserAffaires;
    }

    public void setUtiliserAffaires(short utiliserAffaires) {
        this.utiliserAffaires = utiliserAffaires;
    }

    public short getCi() {
        return ci;
    }

    public void setCi(short ci) {
        this.ci = ci;
    }

    public double getTauxDebit() {
        return tauxDebit;
    }

    public void setTauxDebit(double tauxDebit) {
        this.tauxDebit = tauxDebit;
    }

    public double getTauxCredit() {
        return tauxCredit;
    }

    public void setTauxCredit(double tauxCredit) {
        this.tauxCredit = tauxCredit;
    }

    public String getNumeroCompteCourant() {
        return numeroCompteCourant;
    }

    public void setNumeroCompteCourant(String numeroCompteCourant) {
        this.numeroCompteCourant = numeroCompteCourant;
    }

    public int getIdservices() {
        return idservices;
    }

    public void setIdservices(int idservices) {
        this.idservices = idservices;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getAbreviation() {
        return abreviation;
    }

    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public short getModule() {
        return module;
    }

    public void setModule(short module) {
        this.module = module;
    }

    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

    public short getGestionnaire() {
        return gestionnaire;
    }

    public void setGestionnaire(short gestionnaire) {
        this.gestionnaire = gestionnaire;
    }

    public String getNumeroCompteImputationProvisoire() {
        return numeroCompteImputationProvisoire;
    }

    public void setNumeroCompteImputationProvisoire(String numeroCompteImputationProvisoire) {
        this.numeroCompteImputationProvisoire = numeroCompteImputationProvisoire;
    }

    public String getCdo() {
        return cdo;
    }

    public void setCdo(String cdo) {
        this.cdo = cdo;
    }

    public String getNinea() {
        return ninea;
    }

    public void setNinea(String ninea) {
        this.ninea = ninea;
    }

    public long getIDTiersAssocie() {
        return iDTiersAssocie;
    }

    public void setIDTiersAssocie(long iDTiersAssocie) {
        this.iDTiersAssocie = iDTiersAssocie;
    }

    @XmlTransient
    public List<DecNatureoperation> getDecNatureoperationList() {
        return decNatureoperationList;
    }

    public void setDecNatureoperationList(List<DecNatureoperation> decNatureoperationList) {
        this.decNatureoperationList = decNatureoperationList;
    }

    @XmlTransient
    public List<Groupes> getGroupesList() {
        return groupesList;
    }

    public void setGroupesList(List<Groupes> groupesList) {
        this.groupesList = groupesList;
    }

    @XmlTransient
    public List<Encaissements> getEncaissementsList() {
        return encaissementsList;
    }

    public void setEncaissementsList(List<Encaissements> encaissementsList) {
        this.encaissementsList = encaissementsList;
    }

    @XmlTransient
    public List<Preselection> getPreselectionList() {
        return preselectionList;
    }

    public void setPreselectionList(List<Preselection> preselectionList) {
        this.preselectionList = preselectionList;
    }

    @XmlTransient
    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }

    @XmlTransient
    public List<Representantsgroupe> getRepresentantsgroupeList() {
        return representantsgroupeList;
    }

    public void setRepresentantsgroupeList(List<Representantsgroupe> representantsgroupeList) {
        this.representantsgroupeList = representantsgroupeList;
    }

    @XmlTransient
    public List<Courriers> getCourriersList() {
        return courriersList;
    }

    public void setCourriersList(List<Courriers> courriersList) {
        this.courriersList = courriersList;
    }

    public Categoriestiers getIDCategoriesTiers() {
        return iDCategoriesTiers;
    }

    public void setIDCategoriesTiers(Categoriestiers iDCategoriesTiers) {
        this.iDCategoriesTiers = iDCategoriesTiers;
    }

    public Dependance getIddependance() {
        return iddependance;
    }

    public void setIddependance(Dependance iddependance) {
        this.iddependance = iddependance;
    }

    public Zones getIdzones() {
        return idzones;
    }

    public void setIdzones(Zones idzones) {
        this.idzones = idzones;
    }

    public SecteursActivites getIdsecteursActivites() {
        return idsecteursActivites;
    }

    public void setIdsecteursActivites(SecteursActivites idsecteursActivites) {
        this.idsecteursActivites = idsecteursActivites;
    }

    @XmlTransient
    public List<Pieces> getPiecesList() {
        return piecesList;
    }

    public void setPiecesList(List<Pieces> piecesList) {
        this.piecesList = piecesList;
    }

    @XmlTransient
    public List<DemandesRestitution> getDemandesRestitutionList() {
        return demandesRestitutionList;
    }

    public void setDemandesRestitutionList(List<DemandesRestitution> demandesRestitutionList) {
        this.demandesRestitutionList = demandesRestitutionList;
    }

    @XmlTransient
    public List<Situationdocument> getSituationdocumentList() {
        return situationdocumentList;
    }

    public void setSituationdocumentList(List<Situationdocument> situationdocumentList) {
        this.situationdocumentList = situationdocumentList;
    }

    @XmlTransient
    public List<Contentieux> getContentieuxList() {
        return contentieuxList;
    }

    public void setContentieuxList(List<Contentieux> contentieuxList) {
        this.contentieuxList = contentieuxList;
    }

    @XmlTransient
    public List<Remarques> getRemarquesList() {
        return remarquesList;
    }

    public void setRemarquesList(List<Remarques> remarquesList) {
        this.remarquesList = remarquesList;
    }

    @XmlTransient
    public List<Mandataires> getMandatairesList() {
        return mandatairesList;
    }

    public void setMandatairesList(List<Mandataires> mandatairesList) {
        this.mandatairesList = mandatairesList;
    }

    @XmlTransient
    public List<DecReception> getDecReceptionList() {
        return decReceptionList;
    }

    public void setDecReceptionList(List<DecReception> decReceptionList) {
        this.decReceptionList = decReceptionList;
    }

    @XmlTransient
    public List<Gerer> getGererList() {
        return gererList;
    }

    public void setGererList(List<Gerer> gererList) {
        this.gererList = gererList;
    }

    @XmlTransient
    public List<BudEngagement> getBudEngagementList() {
        return budEngagementList;
    }

    public void setBudEngagementList(List<BudEngagement> budEngagementList) {
        this.budEngagementList = budEngagementList;
    }

    @XmlTransient
    public List<Contrats> getContratsList() {
        return contratsList;
    }

    public void setContratsList(List<Contrats> contratsList) {
        this.contratsList = contratsList;
    }

    @XmlTransient
    public List<DecMouvements> getDecMouvementsList() {
        return decMouvementsList;
    }

    public void setDecMouvementsList(List<DecMouvements> decMouvementsList) {
        this.decMouvementsList = decMouvementsList;
    }

    @XmlTransient
    public List<Decaissements> getDecaissementsList() {
        return decaissementsList;
    }

    public void setDecaissementsList(List<Decaissements> decaissementsList) {
        this.decaissementsList = decaissementsList;
    }

    @XmlTransient
    public List<Actionsccaisses> getActionsccaissesList() {
        return actionsccaissesList;
    }

    public void setActionsccaissesList(List<Actionsccaisses> actionsccaissesList) {
        this.actionsccaissesList = actionsccaissesList;
    }

    @XmlTransient
    public List<BudLiquidation> getBudLiquidationList() {
        return budLiquidationList;
    }

    public void setBudLiquidationList(List<BudLiquidation> budLiquidationList) {
        this.budLiquidationList = budLiquidationList;
    }

    @XmlTransient
    public List<DecRestitution> getDecRestitutionList() {
        return decRestitutionList;
    }

    public void setDecRestitutionList(List<DecRestitution> decRestitutionList) {
        this.decRestitutionList = decRestitutionList;
    }

    @XmlTransient
    public List<DecAutorisationderestitution> getDecAutorisationderestitutionList() {
        return decAutorisationderestitutionList;
    }

    public void setDecAutorisationderestitutionList(List<DecAutorisationderestitution> decAutorisationderestitutionList) {
        this.decAutorisationderestitutionList = decAutorisationderestitutionList;
    }

    @XmlTransient
    public List<DecAffaires> getDecAffairesList() {
        return decAffairesList;
    }

    public void setDecAffairesList(List<DecAffaires> decAffairesList) {
        this.decAffairesList = decAffairesList;
    }

    @XmlTransient
    public List<Offres> getOffresList() {
        return offresList;
    }

    public void setOffresList(List<Offres> offresList) {
        this.offresList = offresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numTiers != null ? numTiers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiers)) {
            return false;
        }
        Tiers other = (Tiers) object;
        if ((this.numTiers == null && other.numTiers != null) || (this.numTiers != null && !this.numTiers.equals(other.numTiers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Tiers[ numTiers=" + numTiers + " ]";
    }
    
}
