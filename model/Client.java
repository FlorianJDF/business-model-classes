package fr.sigl.miwa.model;
import java.util.Date;
import java.util.HashSet;
/**
 * Respo : CAI
 */
public class Client {
    private static HashSet<Client> CList = new HashSet<Client>(); // La liste de tous les clients instanciés
    private static int cptID = 0;

    private String ID; // "clientX" où X est un nombre supérieur ou égale à 0
    private String nom;
    private String prenom;
    private Date date_de_naissance;
    private String sexe; // "M" ou "F"
    private String mail;
    private String CB; // Correspond à l'id de la carte bancaire contenant les 16 chiffres -> exemple : "0123012301230123"
    private boolean isFidel;

    private String initID(){
        String res = "client" + this.getCptID().toString();
        this.IncrCptID();
        return res;
    }

    public Client(String nom, String prenom, Date date_de_naissance, String sexe, String mail, String CB, boolean isFidel) {
        this.ID = initID();
        this.nom = nom;
        this.prenom = prenom;
        this.date_de_naissance = date_de_naissance;
        this.sexe = sexe;
        this.mail = mail;
        this.CB = CB;
        this.isFidel = isFidel;
        CList.add(this);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(Date date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isFidel(){
        return isFidel;
    }

    public void setFidel(boolean b){
        this.isFidel = b;
    }

    public String getCB() {
        return CB;
    }

    public void setCB(String CB) {
        this.CB = CB;
    }


    /**
     *  Cette fonction permet d'avoir la liste de tous les clients instanciés
     * @return un HashSet de Client
     */
    public static HashSet<Client> getClientList(){
        return CList;
    }

    /**
     * Supprime le client c de la liste de tous les clients instanciés
     * @param c l'instance du client a supprimé de la liste
     * @return un booléen confirmant ou non la suppression
     */
    public static boolean remove(Client c){
        return CList.remove(c);
    }

    private static Integer getCptID(){
        return new Integer(cptID);
    }

    private static void IncrCptID(){
        cptID++;
    }
}