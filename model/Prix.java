package fr.sigl.miwa.model;
/**
 * 
 * @author Nicolas GUEUGNON
 * @category Model
 * @version 1.0
 */
public class Prix {
	//Attribut
	private float prixHT;
	private float taux;
	
	//Constructor
	public Prix(){
		
	}
	public Prix(float prix){
		this.prixHT=prix;
	}
	public Prix(float prix, float t){
		this.prixHT=prix;
		this.taux=t;
	}
	
	//Getter
	public float get_prixHT(){
		return this.prixHT;
	}
	public float get_taux(){
		return this.taux;
	}
	public float get_prixTTC(){
		return this.prixHT*this.taux;
	}
	
	//Setter
	public void set_prixHT(float prix){
		this.prixHT=prix;
	}
	public void set_taux(float t){
		this.taux=t;
	}
	public void set_prixTTC(float prix){
		this.taux=prix/this.prixHT;
	}
}
