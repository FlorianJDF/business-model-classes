package fr.sigl.miwa.model;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Respo : CAI
 */
public class TicketDeVente implements Serializable{
   
	private static final long serialVersionUID = -8425255401761255831L;
	private static int cptID = 0; // compteur pour le nombre des tickets générés
    public static HashSet<TicketDeVente> TDVList = new HashSet<TicketDeVente>();

    private String ID; // "ticketX" où X est un nombre supérieur ou égale à 0
    private Paiement paiement;
    private CarteFidelite carteFidelite;
    private Caisse caisse; //caisse qui génère le ticket
    private Magasin magasin; // magasin contenant la caisse génératrice du ticket
    private Date date;

    private static float tauxTVA = 20;
    private float prixTTC; // addition des tous les prix des articles de la liste "articles"
    private float prixTVA;
    private float prixHT;

    public HashMap<Article, Integer> articles; // liste d'articles et sa quantité achetés


    public TicketDeVente(Paiement paiement, CarteFidelite carteFidelite, Caisse caisse,
                         Date date, HashMap<Article, Integer> articles,
                         float prixTTC) {
        this.ID = this.initID();
        this.paiement = paiement;
        this.carteFidelite = carteFidelite;
        this.caisse = caisse;
        this.magasin = caisse.getMagasin();
        this.date = date;
        this.articles = articles;
        this.prixTTC = prixTTC;
        this.prixTVA = prixTTC * tauxTVA;
        this.prixHT = prixTTC - prixTVA;
        TicketDeVente.TDVList.add(this);
    }

    public TicketDeVente(Paiement paiement, Caisse caisse,
                         Date date, HashMap<Article, Integer> articles,
                         float prixTTC) {
        this.ID = this.initID();
        this.paiement = paiement;
        this.caisse = caisse;
        this.magasin = caisse.getMagasin();
        this.date = date;
        this.articles = articles;
        this.prixTTC = prixTTC;
        this.prixTVA = prixTTC * tauxTVA;
        this.prixHT = prixTTC - prixTVA;
    }

    public HashMap<Article, Integer> getArticles() {
        return articles;
    }

    public void setArticles(HashMap<Article, Integer> articles) {
        this.articles = articles;
    }

    public Paiement getPaiement() {
        return paiement;
    }

    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }

    public CarteFidelite getCarteFidelite() {
        return carteFidelite;
    }

    public void setCarteFidelite(CarteFidelite carteFidelite) {
        this.carteFidelite = carteFidelite;
    }

    public Caisse getCaisse() {
        return caisse;
    }

    public void setCaisse(Caisse caisse) {
        this.caisse = caisse;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getPrixTTC() {
        return prixTTC;
    }

    public void setPrixTTC(float prixTTC) {
        this.prixTTC = prixTTC;
    }

    public float getPrixTVA() {
        return prixTVA;
    }

    public void setPrixTVA(float prixTVA) {
        this.prixTVA = prixTVA;
    }

    public float getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(float prixHT) {
        this.prixHT = prixHT;
    }
    private static Integer getCptID(){
        return new Integer(cptID);
    }

    private static void IncrCptID(){
        cptID++;
    }
    private String initID(){
        String res = "ticket" + this.getCptID().toString();
        this.IncrCptID();
        return res;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString(){
        return "Ticket de vente: ID=" + this.ID +
                " Paiement=" + this.paiement.getNum_CB() +"("+this.paiement.getMontant() + "€)" +
                (this.carteFidelite != null?" CarteFidelite=" + this.carteFidelite.getId():"")+
                " caisse=" + this.caisse.getID() +
                " magasin=" + this.magasin.getID() +
                " date=" + date.toString()+
                " prixTTC" + (new Float(this.prixTTC)).toString();
    }
}
