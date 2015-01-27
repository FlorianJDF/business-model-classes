package fr.sigl.miwa.model;

import java.io.Serializable;

/**
 * Respo : CAI
 */
public class Caisse implements Serializable{
	
	private static final long serialVersionUID = 3717197955786933338L;

	private static int cptID = 0;

    private String ID;// "caisseX" où X est un nombre supérieur ou égale à 0
    private Magasin magasin;

    private String initID(){
        String res = "caisse" + this.getCptID().toString();
        this.IncrCptID();
        return res;
    }

    public Caisse(Magasin mag){
        this.magasin = mag;
        this.ID = this.initID();
        mag.addCaisse(this);
    }

    public Caisse(){
        this.ID = this.initID();
    }

    public Caisse(String id, Magasin magasin){
        this.ID = this.initID();
        this.magasin = magasin;
        this.magasin.addCaisse(this);
    }

    public String getID() {
        return ID;
    }

    public Magasin getMagasin() {
        return magasin;
    }

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    @Override
    public String toString(){
        return "Caisse (" + ID + ")";
    }
    private static Integer getCptID(){
        return new Integer(cptID);
    }

    private static void IncrCptID(){
        cptID++;
    }
}
