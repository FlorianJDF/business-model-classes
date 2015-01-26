package fr.sigl.miwa.model;

import java.sql.Date;
import java.util.ArrayList;
/**
 * Respo: FOU- Nicolas GUEUGNON
 * @author Nicolas GUEUGNON
 * @version 1.0
 * {@link Article, Client}
 */

public class BonLivraisonClient {
	
	//Attribute
	private Client c;
	private Date exp;
	private ArrayList<Article> articles;
	private int[] quantity;
	
	//constructor
	public BonLivraisonClient(Date date){
		this.exp=date;
	}
	public BonLivraisonClient(Client cl,Date date){
		this.c=cl;
		this.exp=date;
	}
	
	//Getter
	public Client get_client(){
		return this.c;
	}
	public Date get_exp(){
		return this.exp;
	}
	public int get_quant( Article art){
		if(this.articles.contains(art)==false){
			return 0;
		}
		return this.quantity[this.articles.indexOf(art)];
	}
	
	//Setter
	public void set_client(Client cl){
		this.c=cl;
	}
	public void set_exp(Date date){
		this.exp=date;
	}
	public void add_article(Article art, int quant){
		if (quant>0){
			this.quantity[this.quantity.length]=quant;
			this.articles.add(art);
			}
	}
	public void set_quant( Article art, int q){
		if(q>0){
			if(this.articles.contains(art)==false){
				this.articles.add(art);
				this.quantity[this.articles.size()]=q;
			}
			else{
				this.quantity[this.articles.indexOf(this.articles.indexOf(art))]=q;
			}
		}
	}
}
