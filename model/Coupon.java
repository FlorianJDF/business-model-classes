package fr.sigl.miwa.model;
import java.util.Date;

/**
 * respo : FID
 */
public class Coupon {
	private int id;
	private Article article;
	private float montant;
	private Client client;
	private Date dateEmission;
	private Date dateValidite;
	
	public Coupon() {
		
	}
	
	public Coupon(int id, Article article, float montant, Client client, Date dateValidite, Date dateEmission) {
		this.dateEmission = dateEmission;
		this.article = article;
		this.montant = montant;
		this.client = client;
		this.dateValidite = dateValidite;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Article getArticle() {
		return this.article;
	}
	
	public void setArticle(Article article) {
		this.article = article;
	}
	
	public float getMontant() {
		return this.montant;
	}
	
	public void setMontant(float montant) {
		this.montant = montant;
	}
	
	public Client getClient() {
		return this.client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Date getDateValidite() {
		return this.dateValidite;
	}
	
	public void setDateValidite(Date dateValidite) {
		this.dateValidite = dateValidite;
	}
	
	public Date getDateEmission() {
		return this.dateEmission;
	}

	public void setDateEmission(Date dateEmission) {
		this.dateEmission = dateEmission;
	}
}
