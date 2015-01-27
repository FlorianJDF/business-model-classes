package fr.sigl.miwa.model;
import java.io.Serializable;
import java.util.Date;

/**
 * respo : FID
 */
public class CarteFidelite implements Serializable{
	
	private static final long serialVersionUID = 7506439995045288185L;
	private int id;
	private Client client;
	private int nbPoints;
	private Date dateCreation;
	private Date derniereUtilisation;
	private String sexe;    
	private String nom;
    private String prenom;
    private Date date_de_naissance;
    private String mail;
    private String CB;
    
	public CarteFidelite() {

	}
	
	public CarteFidelite(int id, Client client, int nbPoints, Date derniereUtilisation, Date dateCreation) {
		this.dateCreation = new Date();
		this.client = client;
		this.nbPoints = nbPoints;
		this.derniereUtilisation = derniereUtilisation;
		this.dateCreation = dateCreation;
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCB() {
		return CB;
	}

	public void setCB(String cB) {
		CB = cB;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
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

	public Date getDate_de_naissance() {
		return date_de_naissance;
	}

	public void setDate_de_naissance(Date date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}

	public Client getClient() {
		return this.client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public int getNbPoints() {
		return this.nbPoints;
	}
	
	public void setNbPoints(int nbPoints) {
		this.nbPoints = nbPoints;
	}
	
	public Date getDateCreation() {
		return this.dateCreation;
	}
	
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDerniereUtilisation() {
		return this.derniereUtilisation;
	}
	
	public void setDerniereUtilisation(Date derniereUtilisation) {
		this.derniereUtilisation = derniereUtilisation;
	}
	
	
}
