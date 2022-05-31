package main.java.domeinlaag;

import java.util.ArrayList;

public class Categorie {
    private String naam;
    private ArrayList<Recept> deRecepten = new ArrayList<>();

    public Categorie (String nm) {
        this.setNaam(nm);
    }


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public ArrayList<Recept> getDeRecepten() {
        return deRecepten;
    }

    public void setDeRecepten(ArrayList<Recept> deRecepten) {
        this.deRecepten = deRecepten;
    }
}
