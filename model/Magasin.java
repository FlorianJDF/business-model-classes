package fr.sigl.miwa.model;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Respo : CAI
 */
public class Magasin {
    private static HashSet<Magasin> MList = new HashSet<Magasin>();
    private static int cptID = 0;

    private String ID; // "magasinX" où X est un nombre supérieur ou égale à 0
    private String adresse;
    private HashSet<Caisse> CList = new HashSet<Caisse>();
    private HashMap<Article, Integer> stock; // HashMap<Article, quantité>

    private String initID(){
        String res = "magasin" + this.getCptID().toString();
        this.IncrCptID();
        return res;
    }

    public Magasin(String adresse,HashMap<Article,Integer> stock){
        this.ID = this.initID();
        this.adresse = adresse;
        this.stock = stock;
        this.MList.add(this);
    }

    public String getID() {
        return ID;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public void addCaisse(Caisse C) {
        this.CList.add(C);
        C.setMagasin(this);
    }

    public void removeCaisse(Caisse C) {
        this.CList.remove(C);
        C.setMagasin(null);
    }

    public HashMap<Article, Integer> getStock() {
        return stock;
    }

    public void setStock(HashMap<Article, Integer> stock) {
        this.stock = stock;
    }

    public HashSet<Caisse> getCList() {
        return CList;
    }

    @Override
    public String toString(){
        return "Magasin (" + ID + ") " + adresse;
    }

    private static Integer getCptID(){
        return new Integer(cptID);
    }

    private static void IncrCptID(){
        cptID++;
    }

    public static HashSet<Magasin> getMList() {
        return MList;
    }
}
