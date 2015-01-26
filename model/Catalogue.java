package fr.sigl.miwa.model;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * respo : REF
 */
public class Catalogue {
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
