package fr.sigl.miwa.model;
/**
 * Respo : SWE
 */
public class Paiement {
	private int num_CB;
	private int montant;
	
	public Paiement(int num_CB, int montant) {
		super();
		this.num_CB = num_CB;
		this.montant = montant;
	}
	public int getNum_CB() {
		return num_CB;
	}
	public void setNum_CB(int num_CB) {
		this.num_CB = num_CB;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
}
