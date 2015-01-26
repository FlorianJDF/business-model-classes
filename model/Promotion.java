package fr.sigl.miwa.model;
import java.util.Date;

/**
 * Respo : referentiel (RIO)
 */

public class Promotion
{
	private int rabais; //C'est un pourcentage
	private Date date_debut;
	private Date date_fin;
	
	//Pour pas de promotion, utiliser ce constructeur avec rabais=0
	public Promotion(int rabais)
	{
		this.rabais = rabais;
	}
	
	public Promotion(int rabais, Date date_debut, Date date_fin)
	{
		super();
		this.rabais = rabais;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}
	public int getRabais()
	{
		return rabais;
	}
	public void setRabais(int rabais)
	{
		this.rabais = rabais;
	}
	public Date getDate_debut()
	{
		return date_debut;
	}
	public void setDate_debut(Date date_debut)
	{
		this.date_debut = date_debut;
	}
	public Date getDate_fin()
	{
		return date_fin;
	}
	public void setDate_fin(Date date_fin)
	{
		this.date_fin = date_fin;
	}
	
	
}
