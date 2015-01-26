package fr.sigl.miwa.model;
/**
 * Respo : FOU
 * @author Nicolas GUEUGNON
 * @category Model
 * @version 1.0
 * {@link CatalogueFournisseur}
 */


public class Fournisseur {
	//TO FIX en unique
	private int ID;
	private CatalogueFournisseur catalogueFournisseur;
	
	public Fournisseur(CatalogueFournisseur catalogueFournisseur) {
		super();
		this.catalogueFournisseur = catalogueFournisseur;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public CatalogueFournisseur getCatalogue() {
		return catalogueFournisseur;
	}
	public void setCatalogue(CatalogueFournisseur catalogueFournisseur) {
		this.catalogueFournisseur = catalogueFournisseur;
	}
}
