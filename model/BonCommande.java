package fr.sigl.miwa.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

/**
 * respo : BAC
 */
public class BonCommande implements Serializable{
	
	private static final long serialVersionUID = -2533686978382057464L;
	private Magasin magEmetteur;
	private Magasin magDestinataire;
	private Date dateEmission;
	private Prix prixCommande;
	private HashMap<Article, Integer> listArticle;
	
	public BonCommande(Magasin magEmetteur, Magasin magDestinataire, Date dateEmission, Prix prixCommande)
	{
		this.magEmetteur = magEmetteur;
		this.magDestinataire = magDestinataire;
		this.dateEmission = dateEmission;
		this.prixCommande = prixCommande;
		this.listArticle = new HashMap<Article, Integer>();
	}
	
	public Magasin getMagEmetteur() {
		return magEmetteur;
	}

	public void setMagEmetteur(Magasin magEmetteur) {
		this.magEmetteur = magEmetteur;
	}

	public Magasin getMagDestinataire() {
		return magDestinataire;
	}

	public void setMagDestinataire(Magasin magDestinataire) {
		this.magDestinataire = magDestinataire;
	}

	public Date getDateEmission() {
		return dateEmission;
	}

	public void setDateEmission(Date dateEmission) {
		this.dateEmission = dateEmission;
	}

	public Prix getPrixCommande() {
		return prixCommande;
	}

	public void setPrixCommande(Prix prixCommande) {
		this.prixCommande = prixCommande;
	}

	public HashMap<Article, Integer> getListArticle() {
		return listArticle;
	}

	public void setListArticle(HashMap<Article, Integer> listArticle) {
		this.listArticle = listArticle;
	}
}
