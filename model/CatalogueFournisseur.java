package fr.sigl.miwa.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * respo : FOU
 * @author Nicolas GUEUGNON
 * @category Model
 * @version 1.0
 * {@link Fournisseur, Article}
 */
public class CatalogueFournisseur implements Serializable{
	
	private static final long serialVersionUID = 6110264127606676230L;
	// Attributes
	private Fournisseur fou;// ID
	private ArrayList<Article> Articles;
	
	//Constructor
	public CatalogueFournisseur() {
		this.Articles=new ArrayList<Article>();
	}
	
	//Getter	
	public ArrayList<Article> get_Articles(){
		return this.Articles;
	}
	public Fournisseur get_fournisseur(){
		return this.fou;
	}
	public int get_nbr_article(){
		return this.Articles.size();
	}
	
	// Setter
	public void add_article(Article a){
		this.Articles.add(a);
	}
	public void set_fournisseur(Fournisseur f){
		this.fou=f;
	}
	
}
