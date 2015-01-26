package fr.sigl.miwa.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * Respo: FOU- Nicolas GUEUGNON
 * @author Nicolas GUEUGNON
 * @version 1.0
 * {@link Magasin, Article}
 */

public class BonLivraisonMagasin{
	
	//attribute
	private Magasin mag;
	private Date exp;
	private HashMap<Article, Integer> articles;

	
	//constructor
	public BonLivraisonMagasin(Date date){
		this.exp=date;
	}
	public BonLivraisonMagasin(Magasin m,Date date){
		this.mag=m;
		this.exp=date;
	}
	//Getter
	public Magasin get_magasin(){
		return this.mag;
	}
	public Date get_exp(){
		return this.exp;
	}
	public int get_quant( Article art){
		if(this.articles.containsKey(art)==false){
			return 0;
		}
		return this.articles.get(art);
	}
	
	//Setter
	public void set_magasin(Magasin ma){
		this.mag=ma;
	}
	public void set_exp(Date date){
		this.exp=date;
	}
	public void add_article(Article art, int quant){
		if (quant>0){
			this.articles.put(art,quant);
			}
	}
	public void set_quant( Article art, int q){
		if(q>0){
			if(this.articles.containsKey(art)==false){
				this.articles.put(art,q);
			}
			else
				{
				this.articles.replace(art,q);
			}
		}
	}
}
