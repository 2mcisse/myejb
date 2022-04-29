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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "utilisateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u")
    , @NamedQuery(name = "Utilisateur.findByIDUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.iDUtilisateur = :iDUtilisateur")
    , @NamedQuery(name = "Utilisateur.findByLogin", query = "SELECT u FROM Utilisateur u WHERE u.login = :login")
    , @NamedQuery(name = "Utilisateur.findByMotDePasse", query = "SELECT u FROM Utilisateur u WHERE u.motDePasse = :motDePasse")
    , @NamedQuery(name = "Utilisateur.findByNom", query = "SELECT u FROM Utilisateur u WHERE u.nom = :nom")
    , @NamedQuery(name = "Utilisateur.findByPrenom", query = "SELECT u FROM Utilisateur u WHERE u.prenom = :prenom")
    , @NamedQuery(name = "Utilisateur.findByEmail", query = "SELECT u FROM Utilisateur u WHERE u.email = :email")
    , @NamedQuery(name = "Utilisateur.findByEstAdministrateur", query = "SELECT u FROM Utilisateur u WHERE u.estAdministrateur = :estAdministrateur")
    , @NamedQuery(name = "Utilisateur.findByEstModerateur", query = "SELECT u FROM Utilisateur u WHERE u.estModerateur = :estModerateur")
    , @NamedQuery(name = "Utilisateur.findByNomAffiche", query = "SELECT u FROM Utilisateur u WHERE u.nomAffiche = :nomAffiche")
    , @NamedQuery(name = "Utilisateur.findByDateHeureCreation", query = "SELECT u FROM Utilisateur u WHERE u.dateHeureCreation = :dateHeureCreation")
    , @NamedQuery(name = "Utilisateur.findByDateHeureConnexion", query = "SELECT u FROM Utilisateur u WHERE u.dateHeureConnexion = :dateHeureConnexion")
    , @NamedQuery(name = "Utilisateur.findByQuestionMotDePasse", query = "SELECT u FROM Utilisateur u WHERE u.questionMotDePasse = :questionMotDePasse")
    , @NamedQuery(name = "Utilisateur.findByReponseMotDePasse", query = "SELECT u FROM Utilisateur u WHERE u.reponseMotDePasse = :reponseMotDePasse")
    , @NamedQuery(name = "Utilisateur.findByEstSupprime", query = "SELECT u FROM Utilisateur u WHERE u.estSupprime = :estSupprime")
    , @NamedQuery(name = "Utilisateur.findByEmailAutorise", query = "SELECT u FROM Utilisateur u WHERE u.emailAutorise = :emailAutorise")
    , @NamedQuery(name = "Utilisateur.findByEstConnecte", query = "SELECT u FROM Utilisateur u WHERE u.estConnecte = :estConnecte")
    , @NamedQuery(name = "Utilisateur.findByAgendaPublic", query = "SELECT u FROM Utilisateur u WHERE u.agendaPublic = :agendaPublic")
    , @NamedQuery(name = "Utilisateur.findByEstGestionnaireDocCDC", query = "SELECT u FROM Utilisateur u WHERE u.estGestionnaireDocCDC = :estGestionnaireDocCDC")})
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDUtilisateur")
    private Integer iDUtilisateur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "Login")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "MotDePasse")
    private String motDePasse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Prenom")
    private String prenom;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 160)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "Avatar")
    private byte[] avatar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstAdministrateur")
    private short estAdministrateur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstModerateur")
    private short estModerateur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "NomAffiche")
    private String nomAffiche;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureCreation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureCreation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DateHeureConnexion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHeureConnexion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QuestionMotDePasse")
    private short questionMotDePasse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 160)
    @Column(name = "ReponseMotDePasse")
    private String reponseMotDePasse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstSupprime")
    private short estSupprime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EmailAutorise")
    private short emailAutorise;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstConnecte")
    private short estConnecte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "AgendaPublic")
    private short agendaPublic;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 2147483647)
    @Column(name = "Signature")
    private String signature;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EstGestionnaireDocCDC")
    private short estGestionnaireDocCDC;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Commentaire> commentaireList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDExpediteur")
    private List<Spim> spimList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDProprietaire")
    private List<Partage> partageList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Post> postList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Contact> contactList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private Parametreemail parametreemail;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Piecejointe> piecejointeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Lien> lienList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Destinataire> destinataireList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDExpediteur")
    private List<Message> messageList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Forum> forumList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Partagedroit> partagedroitList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Parametre> parametreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Agenda> agendaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Etiquette> etiquetteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Wiki> wikiList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Blog> blogList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDemandeur")
    private List<Discussioninvitation> discussioninvitationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDDemande")
    private List<Discussioninvitation> discussioninvitationList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Topic> topicList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDAuteurDernierPost")
    private List<Topic> topicList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Billet> billetList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Actualite> actualiteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Liennote> liennoteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDUtilisateur")
    private List<Groupe> groupeList;

    public Utilisateur() {
    }

    public Utilisateur(Integer iDUtilisateur) {
        this.iDUtilisateur = iDUtilisateur;
    }

    public Utilisateur(Integer iDUtilisateur, String login, String motDePasse, String nom, String prenom, String email, byte[] avatar, short estAdministrateur, short estModerateur, String nomAffiche, Date dateHeureCreation, Date dateHeureConnexion, short questionMotDePasse, String reponseMotDePasse, short estSupprime, short emailAutorise, short estConnecte, short agendaPublic, String signature, short estGestionnaireDocCDC) {
        this.iDUtilisateur = iDUtilisateur;
        this.login = login;
        this.motDePasse = motDePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.avatar = avatar;
        this.estAdministrateur = estAdministrateur;
        this.estModerateur = estModerateur;
        this.nomAffiche = nomAffiche;
        this.dateHeureCreation = dateHeureCreation;
        this.dateHeureConnexion = dateHeureConnexion;
        this.questionMotDePasse = questionMotDePasse;
        this.reponseMotDePasse = reponseMotDePasse;
        this.estSupprime = estSupprime;
        this.emailAutorise = emailAutorise;
        this.estConnecte = estConnecte;
        this.agendaPublic = agendaPublic;
        this.signature = signature;
        this.estGestionnaireDocCDC = estGestionnaireDocCDC;
    }

    public Integer getIDUtilisateur() {
        return iDUtilisateur;
    }

    public void setIDUtilisateur(Integer iDUtilisateur) {
        this.iDUtilisateur = iDUtilisateur;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getAvatar() {
        return avatar;
    }

    public void setAvatar(byte[] avatar) {
        this.avatar = avatar;
    }

    public short getEstAdministrateur() {
        return estAdministrateur;
    }

    public void setEstAdministrateur(short estAdministrateur) {
        this.estAdministrateur = estAdministrateur;
    }

    public short getEstModerateur() {
        return estModerateur;
    }

    public void setEstModerateur(short estModerateur) {
        this.estModerateur = estModerateur;
    }

    public String getNomAffiche() {
        return nomAffiche;
    }

    public void setNomAffiche(String nomAffiche) {
        this.nomAffiche = nomAffiche;
    }

    public Date getDateHeureCreation() {
        return dateHeureCreation;
    }

    public void setDateHeureCreation(Date dateHeureCreation) {
        this.dateHeureCreation = dateHeureCreation;
    }

    public Date getDateHeureConnexion() {
        return dateHeureConnexion;
    }

    public void setDateHeureConnexion(Date dateHeureConnexion) {
        this.dateHeureConnexion = dateHeureConnexion;
    }

    public short getQuestionMotDePasse() {
        return questionMotDePasse;
    }

    public void setQuestionMotDePasse(short questionMotDePasse) {
        this.questionMotDePasse = questionMotDePasse;
    }

    public String getReponseMotDePasse() {
        return reponseMotDePasse;
    }

    public void setReponseMotDePasse(String reponseMotDePasse) {
        this.reponseMotDePasse = reponseMotDePasse;
    }

    public short getEstSupprime() {
        return estSupprime;
    }

    public void setEstSupprime(short estSupprime) {
        this.estSupprime = estSupprime;
    }

    public short getEmailAutorise() {
        return emailAutorise;
    }

    public void setEmailAutorise(short emailAutorise) {
        this.emailAutorise = emailAutorise;
    }

    public short getEstConnecte() {
        return estConnecte;
    }

    public void setEstConnecte(short estConnecte) {
        this.estConnecte = estConnecte;
    }

    public short getAgendaPublic() {
        return agendaPublic;
    }

    public void setAgendaPublic(short agendaPublic) {
        this.agendaPublic = agendaPublic;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public short getEstGestionnaireDocCDC() {
        return estGestionnaireDocCDC;
    }

    public void setEstGestionnaireDocCDC(short estGestionnaireDocCDC) {
        this.estGestionnaireDocCDC = estGestionnaireDocCDC;
    }

    @XmlTransient
    public List<Commentaire> getCommentaireList() {
        return commentaireList;
    }

    public void setCommentaireList(List<Commentaire> commentaireList) {
        this.commentaireList = commentaireList;
    }

    @XmlTransient
    public List<Spim> getSpimList() {
        return spimList;
    }

    public void setSpimList(List<Spim> spimList) {
        this.spimList = spimList;
    }

    @XmlTransient
    public List<Partage> getPartageList() {
        return partageList;
    }

    public void setPartageList(List<Partage> partageList) {
        this.partageList = partageList;
    }

    @XmlTransient
    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    @XmlTransient
    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public Parametreemail getParametreemail() {
        return parametreemail;
    }

    public void setParametreemail(Parametreemail parametreemail) {
        this.parametreemail = parametreemail;
    }

    @XmlTransient
    public List<Piecejointe> getPiecejointeList() {
        return piecejointeList;
    }

    public void setPiecejointeList(List<Piecejointe> piecejointeList) {
        this.piecejointeList = piecejointeList;
    }

    @XmlTransient
    public List<Lien> getLienList() {
        return lienList;
    }

    public void setLienList(List<Lien> lienList) {
        this.lienList = lienList;
    }

    @XmlTransient
    public List<Destinataire> getDestinataireList() {
        return destinataireList;
    }

    public void setDestinataireList(List<Destinataire> destinataireList) {
        this.destinataireList = destinataireList;
    }

    @XmlTransient
    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    @XmlTransient
    public List<Forum> getForumList() {
        return forumList;
    }

    public void setForumList(List<Forum> forumList) {
        this.forumList = forumList;
    }

    @XmlTransient
    public List<Partagedroit> getPartagedroitList() {
        return partagedroitList;
    }

    public void setPartagedroitList(List<Partagedroit> partagedroitList) {
        this.partagedroitList = partagedroitList;
    }

    @XmlTransient
    public List<Parametre> getParametreList() {
        return parametreList;
    }

    public void setParametreList(List<Parametre> parametreList) {
        this.parametreList = parametreList;
    }

    @XmlTransient
    public List<Agenda> getAgendaList() {
        return agendaList;
    }

    public void setAgendaList(List<Agenda> agendaList) {
        this.agendaList = agendaList;
    }

    @XmlTransient
    public List<Etiquette> getEtiquetteList() {
        return etiquetteList;
    }

    public void setEtiquetteList(List<Etiquette> etiquetteList) {
        this.etiquetteList = etiquetteList;
    }

    @XmlTransient
    public List<Wiki> getWikiList() {
        return wikiList;
    }

    public void setWikiList(List<Wiki> wikiList) {
        this.wikiList = wikiList;
    }

    @XmlTransient
    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }

    @XmlTransient
    public List<Discussioninvitation> getDiscussioninvitationList() {
        return discussioninvitationList;
    }

    public void setDiscussioninvitationList(List<Discussioninvitation> discussioninvitationList) {
        this.discussioninvitationList = discussioninvitationList;
    }

    @XmlTransient
    public List<Discussioninvitation> getDiscussioninvitationList1() {
        return discussioninvitationList1;
    }

    public void setDiscussioninvitationList1(List<Discussioninvitation> discussioninvitationList1) {
        this.discussioninvitationList1 = discussioninvitationList1;
    }

    @XmlTransient
    public List<Topic> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }

    @XmlTransient
    public List<Topic> getTopicList1() {
        return topicList1;
    }

    public void setTopicList1(List<Topic> topicList1) {
        this.topicList1 = topicList1;
    }

    @XmlTransient
    public List<Billet> getBilletList() {
        return billetList;
    }

    public void setBilletList(List<Billet> billetList) {
        this.billetList = billetList;
    }

    @XmlTransient
    public List<Actualite> getActualiteList() {
        return actualiteList;
    }

    public void setActualiteList(List<Actualite> actualiteList) {
        this.actualiteList = actualiteList;
    }

    @XmlTransient
    public List<Liennote> getLiennoteList() {
        return liennoteList;
    }

    public void setLiennoteList(List<Liennote> liennoteList) {
        this.liennoteList = liennoteList;
    }

    @XmlTransient
    public List<Groupe> getGroupeList() {
        return groupeList;
    }

    public void setGroupeList(List<Groupe> groupeList) {
        this.groupeList = groupeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDUtilisateur != null ? iDUtilisateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.iDUtilisateur == null && other.iDUtilisateur != null) || (this.iDUtilisateur != null && !this.iDUtilisateur.equals(other.iDUtilisateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cdc.ejb.entities.Utilisateur[ iDUtilisateur=" + iDUtilisateur + " ]";
    }
    
}
