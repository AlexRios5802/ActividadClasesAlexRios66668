/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadclasesalexrios66668;

/**
 *
 * @author USUARIOWIN
 */
public class Edificio {
    
    private String Campus;
    private String Area;
    private int ID;
   private  String EncArea;

    public Edificio() {
    }

    public Edificio(String Campus, String Area, int ID, String EncArea) {
        this.Campus = Campus;
        this.Area = Area;
        this.ID = ID;
        this.EncArea = EncArea;
    }

    public String getCampus() {
        return Campus;
    }

    public void setCampus(String Campus) {
        this.Campus = Campus;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEncArea() {
        return EncArea;
    }

    public void setEncArea(String EncArea) {
        this.EncArea = EncArea;
    }

    @Override
    public String toString() {
        return "Edificio{" + "Campus = " + Campus + ", Area = " + Area + ", ID = " + ID + ", EncArea = " + EncArea + '}';
    }
   
   
    
}
