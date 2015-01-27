package fr.sigl.miwa.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * respo : REF
 */
public class Catalogue implements Serializable{
	
	private static final long serialVersionUID = -7179209237741125464L;
	private ArrayList<CatalogueFournisseur> cataloguesFournisseur;
	
	
	public Catalogue() {
		this.cataloguesFournisseur=new ArrayList<CatalogueFournisseur>();
	}
	
	
	public ArrayList<CatalogueFournisseur> get_cataloguesFournisseur(){
		return this.cataloguesFournisseur;
	}
	
	public void add_catalogue (CatalogueFournisseur catalogueFournisseur){
		this.cataloguesFournisseur.add(catalogueFournisseur);
	}
	
	
}
