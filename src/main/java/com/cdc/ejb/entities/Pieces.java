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
@Table(name = "pieces")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pieces.findAll", query = "SELECT p FROM Pieces p")
    , @NamedQuery(name = "Pieces.findByRefPiece", query = "SELECT p FROM Pieces p WHERE p.refPiece = :refPiece")
    , @NamedQuery(name = "Pieces.findByDatePiece", query = "SELECT p FROM Pieces p WHERE p.datePiece = :datePiece")
    , @NamedQuery(name = "Pieces.findByLibelle", query = "SELECT p FROM Pieces p WHERE p.libelle = :libelle")
    , @NamedQuery(name = "Pieces.findByIDDemandeAppro", query = "SELECT p FROM Pieces p WHERE p.iDDemandeAppro = :iDDemandeAppro")
    , @NamedQuery(name = "Pieces.findByIdPieces", query = "SELECT p FROM Pieces p WHERE p.idPieces = :idPieces")
    , @NamedQuery(name = "Pieces.findByNumEng", query = "SELECT p FROM Pieces p WHERE p.numEng = :numEng")
    , @NamedQuery(name = "Pieces.findByNumMAND", query = "SELECT p FROM Pieces p WHERE p.numMAND = :numMAND")
    , @NamedQuery(name = "Pieces.findByIDMouvement", query = "SELECT p FROM Pieces p WHERE p.iDMouvement = :iDMouvement")
    , @NamedQuery(name = "Pieces.findByIdachPhasesMarches", query = "SELECT p FROM Pieces p WHERE p.idachPhasesMarches = :idachPhasesMarches")
    , @NamedQuery(name = "Pieces.findByIDDECAutorisationDeRestitution", query = "SELECT p FROM Pieces p WHERE p.iDDECAutorisationDeRestitution = :iDDECAutorisationDeRestitution")
    , @NamedQuery(name = "Pieces.findByIDDECTitreDePerception", query = "SELECT p FROM Pieces p WHERE p.iDDECTitreDePerception = :iDDECTitreDePerception")
    , @NamedQuery(name = "Pieces.findByIDOrdresDePaiement", query = "SELECT p FROM Pieces p WHERE p.iDOrdresDePaiement = :iDOrdresDePaiement")
    , @NamedQuery(name = "Pieces.findByIDBUDEngagementAnnule", query = "SELECT p FROM Pieces p WHERE p.iDBUDEngagementAnnule = :iDBUDEngagementAnnule")
    , @NamedQuery(name = "Pieces.findByRefPieceExt", query = "SELECT p FROM Pieces p WHERE p.refPieceExt = :refPieceExt")
    , @NamedQuery(name = "Pieces.findByIdmouvements", query = "SELECT p FROM Pieces p WHERE p.idmouvements = :idmouvements")
    , @NamedQuery(name = "Pieces.findByGestion", query = "SELECT p FROM Pieces p WHERE p.gestion = :gestion")})
public class Pieces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "REF_PIECE")
    private String refPiece;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_PIECE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datePiece;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "LIBELLE")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDemandeAppro")
    private int iDDemandeAppro;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PIECES")
    private Integer idPieces;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NUM_ENG")
    private String numEng;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Num_MAND")
    private String numMAND;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMouvement")
    private long iDMouvement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDACH_PHASES_MARCHES")
    private int idachPhasesMarches;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_AutorisationDeRestitution")
    private int iDDECAutorisationDeRestitution;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDEC_TitreDePerception")
    private int iDDECTitreDePerception;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDOrdresDePaiement")
    private int iDOrdresDePaiement;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBUD_EngagementAnnule")
    private int iDBUDEngagementAnnule;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "RefPieceExt")
    private String refPieceExt;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMOUVEMENTS")
    private int idmouvements;
    @Size(max = 50)
    @Column(name = "Gestion")
    private String gestion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPieces")
    private List<Encaissements> encaissementsList;
    @JoinColumn(name = "CODE_PIECE", referencedColumnName = "CODE_PIECE")
    @ManyToOne(optional = false)
    private TypePieces codePiece;
    @JoinColumn(name = "IDDEC_Reception", referencedColumnName = "IDDEC_Reception")
    @ManyToOne(optional = false)
    private DecReception iDDECReception;
    @JoinColumn(name = "NumFournisseur", referencedColumnName = "NumTiers")
    @ManyToOne(optional = false)
    private Tiers numFournisseur;
    @JoinColumn(name = "ID_Marche", referencedColumnName = "ID_Marche")
    @ManyToOne(optional = false)
    private AchMarches iDMarche;
    @JoinColumn(name = "IDDocuments", referencedColumnName = "IDDocuments")
    @ManyToOne(optional = false)
    private Courriers iDDocuments;
    @JoinColumn(name = "NumContrat", referencedColumnName = "NumContrat")
    @ManyToOne(optional = false)
    private Contrats numContrat;
    @JoinColumn(name = "IDContentieux", referencedColumnName = "IDContentieux")
    @ManyToOne(optional = false)
    private Contentieux iDContentieux;
    @JoinColumn(name = "IDBUD_Engagement", referencedColumnName = "IDBUD_Engagement")
    @ManyToOne(optional = false)
    private BudEngagement iDBUDEngagement;
    @JoinColumn(name = "IDBUD_Liquidation", referencedColumnName = "IDBUD_Liquidation")
    @ManyToOne(optional = false)
    private BudLiquidation iDBUDLiquidation;
    @JoinColumn(name = "IDDEC_Restitution", referencedColumnName = "IDDEC_Restitution")
    @ManyToOne(optional = false)
    private DecRestitution iDDECRestitution;

    public Pieces() {
    }

    public Pieces(Integer idPieces) {
        this.idPieces = idPieces;
    }

    public Pieces(Integer idPieces, String refPiece, Date datePiece, String libelle, int iDDemandeAppro, String numEng, String numMAND, long iDMouvement, int idachPhasesMarches, int iDDECAutorisationDeRestitution, int iDDECTitreDePerception, int iDOrdresDePaiement, int iDBUDEngagementAnnule, String refPieceExt, int idmouvements) {
        this.idPieces = idPieces;
        this.refPiece = refPiece;
        this.datePiece = datePiece;
        this.libelle = libelle;
        this.iDDemandeAppro = iDDemandeAppro;
        this.numEng = numEng;
        this.numMAND = numMAND;
        this.iDMouvement = iDMouvement;
        this.idachPhasesMarches = idachPhasesMarches;
        this.iDDECAutorisationDeRestitution = iDDECAutorisationDeRestitution;
        this.iDDECTitreDePerception = iDDECTitreDePerception;
        this.iDOrdresDePaiement = iDOrdresDePaiement;
        this.iDBUDEngagementAnnule = iDBUDEngagementAnnule;
        this.refPieceExt = refPieceExt;
        this.idmouvements = idmouvements;
    }

    public String getRefPiece() {
        return refPiece;
    }

    public void setRefPiece(String refPiece) {
        this.refPiece = refPiece;
    }

    public Date getDatePiece() {
        return datePiece;
    }

    public void setDatePiece(Date datePiece) {
        this.datePiece = datePiece;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getIDDemandeAppro() {
        return iDDemandeAppro;
    }

    public void setIDDemandeAppro(int iDDemandeAppro) {
        this.iDDemandeAppro = iDDemandeAppro;
    }

    public Integer getIdPieces() {
        return idPieces;
    }

    public void setIdPieces(Integer idPieces) {
        this.idPieces = idPieces;
    }

    public String getNumEng() {
        return numEng;
    }

    public void setNumEng(String numEng) {
        this.numEng = numEng;
    }

    public String getNumMAND() {
        return numMAND;
    }

    public void setNumMAND(String numMAND) {
        this.numMAND = numMAND;
    }

    public long getIDMouvement() {
        return iDMouvement;
    }

    public void setIDMouvement(long iDMouvement) {
        this.iDMouvement = iDMouvement;
    }

    public int getIdachPhasesMarches() {
        return idachPhasesMarches;
    }

    public void setIdachPhasesMarches(int idachPhasesMarches) {
        this.idachPhasesMarches = idachPhasesMarches;
    }

    public int getIDDECAutorisationDeRestitution() {
        return iDDECAutorisationDeRestitution;
    }

    public void setIDDECAutorisationDeRestitution(int iDDECAutorisationDeRestitution) {
        this.iDDECAutorisationDeRestitution = iDDECAutorisationDeRestitution;
    }

    public int getIDDECTitreDePerception() {
        return iDDECTitreDePerception;
    }

    public void setIDDECTitreDePerception(int iDDECTitreDePerception) {
        this.iDDECTitreDePerception = iDDECTitreDePerception;
    }

    public int getIDOrdresDePaiement() {
        return iDOrdresDePaiement;
    }

    public void setIDOrdresDePaiement(int iDOrdresDePaiement) {
        this.iDOrdresDePaiement = iDOrdresDePaiement;
    }

    public int getIDBUDEngagementAnnule() {
        return iDBUDEngagementAnnule;
    }

    public void setIDBUDEngagementAnnule(int iDBUDEngagementAnnule) {
        this.iDBUDEngagementAnnule = iDBUDEngagementAnnule;
    }

    public String getRefPieceExt() {
        return refPieceExt;
    }

    public void setRefPieceExt(String refPieceExt) {
        this.refPieceExt = refPieceExt;
    }

    public int getIdmouvements() {
        return idmouvements;
    }

    public void setIdmouvements(int idmouvements) {
        this.idmouvements = idmouvements;
    }

    public String getGestion() {
        return gestion;
    }

    public void setGestion(String gestion) {
        this.gestion = gestion;
    }

    @XmlTransient
    public List<Encaissements> getEncaissementsList() {
        return encaissementsList;
    }

    public void setEncaissementsList(List<Encaissements> encaissementsList) {
        this.encaissementsList = encaissementsList;
    }

    public TypePieces getCodePiece() {
        return codePiece;
    }

    public void setCodePiece(TypePieces codePiece) {
        this.codePiece = codePiece;
    }

    public DecReception getIDDECReception() {
        return iDDECReception;
    }

    public void setIDDECReception(DecReception iDDECReception) {
        this.iDDECReception = iDDECReception;
    }

    public Tiers getNumFournisseur() {
        return numFournisseur;
    }

    public void setNumFournisseur(Tiers numFournisseur) {
        this.numFournisseur = numFournisseur;
    }

    public AchMarches getIDMarche() {
        return iDMarche;
    }

    public void setIDMarche(AchMarches iDMarche) {
        this.iDMarche = iDMarche;
    }

    public Courriers getIDDocuments() {
        return iDDocuments;
    }

    public void setIDDocuments(Courriers iDDocuments) {
        this.iDDocuments = iDDocuments;
    }

    public Contrats getNumContrat() {
        return numContrat;
    }

    public void setNumContrat(Contrats numContrat) {
        this.numContrat = numContrat;
    }

    public Contentieux getIDContentieux() {
        return iDContentieux;
    }

    public void setIDContentieux(Contentieux iDContentieux) {
        this.iDContentieux = iDContentieux;
    }

    public BudEngagement getIDBUDEngagement() {
        return iDBUDEngagement;
    }

    public void setIDBUDEngagement(BudEngagement iDBUDEngagement) {
        this.iDBUDEngagement = iDBUDEngagement;
    }

    public BudLiquidation getIDBUDLiquidation() {
        return iDBUDLiquidation;
    }

    public void setIDBUDLiquidation(BudLiquidation iDBUDLiquidation) {
        this.iDBUDLiquidation = iDBUDLiquidation;
    }

    public DecRestitution getIDDECRestitution() {
        return iDDECRestitution;
    }

    public void setIDDECRestitution(DecRestitution iDDECRestitution) {
        this.iDDECRestitution = iDDECRestitution;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPieces != null ? idPieces.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pieces)) {
            return false;
        }
        Pieces other = (Pieces) object;
        if ((this.idPieces == null && other.idPieces != null) || (this.idPieces != null && !this.idPieces.equals(other.idPieces))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Pieces[ idPieces=" + idPieces + " ]";
    }
    
}
