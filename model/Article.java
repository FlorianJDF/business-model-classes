package fr.sigl.miwa.model;
import java.util.HashSet;

/**
 * respo : FOU - Nicolas GUEUGNON
 * @author Nicolas GUEUGNON
 * @category Model
 * @version 1.0
 * {@link Prix, Promotion}
 */

public class Article {
	
	//Attribute
	private String name; // the ID
	private static HashSet<Article> AList = new HashSet<Article>();
	private Prix price;
	private Promotion promotion;
	
	//Constructor
	public Article( Prix price, String name_article, Promotion promotion){
		this.price=price;
		this.name=name_article;
		this.promotion=promotion;
        AList.add(this);
	}
	
	//Getter
	public Prix getPrix(){
		return this.price;
	}
    public static HashSet<Article> getArticleList(){
        return AList;
    }
    public String getName()
	{
		return name;
	}
	public Promotion getPromotion()
	{
		return promotion;
	}
	public static Article getByName(String name){
        for (Article a : AList){
            if (a.name.equals(name)){
                return a;
            }
        }
        return null;
    }
	
	//Setter
	public void setPrix(Prix price){
		this.price=price;		
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPromotion(Promotion promotion)
	{
		this.promotion = promotion;
	}

	//Functions
	@Override
	public boolean equals(Object o){
		if(o instanceof Article)
		{
			Article a=(Article) o;
			return a.name.equals(this.name);
		}
		return false;
	}
    @Override
    public String toString(){
        return this.getName();
    }
}
