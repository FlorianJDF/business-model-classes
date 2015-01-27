package fr.sigl.miwa.model;

import java.io.Serializable;

/**
 * Respo : SWE
 */
public class Paiement implements Serializable{
	
	private static final long serialVersionUID = 5019131141409550332L;
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
