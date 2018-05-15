package de.amos.mamb.model;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Index;


@Entity
public class Vehicle extends PersistentObject{

    @Index
    String bezeichnung;
    String size;
    String modell;

    public Vehicle(){

    }

    public Vehicle(String bezeichnung, String size, String modell){
        this.bezeichnung = bezeichnung;
        this.size = size;
        this.modell = modell;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getSize() {
        return size;
    }

    public String getModell() {
        return modell;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }


    public void setSize(String size) {
        this.size = size;
    }
}
