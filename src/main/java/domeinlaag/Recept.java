package main.java.domeinlaag;

import java.util.ArrayList;

public class Recept {
    private String naam;
    private int personen;
    private String beschrijving;
    private double tijdsduur;
    private ArrayList<Ingrediënt> deIngrediënten = new ArrayList<>();
    private ArrayList<Recept> deRecepten = new ArrayList<>();

    public Recept (String nm, int per, String bes, double td) {
        this.setNaam(nm);
        this.setPersonen(per);
        this.setBeschrijving(bes);
        this.setTijdsduur(td);
    }


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getPersonen() {
        return personen;
    }

    public void setPersonen(int personen) {
        this.personen = personen;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public double getTijdsduur() {
        return tijdsduur;
    }

    public void setTijdsduur(double tijdsduur) {
        this.tijdsduur = tijdsduur;
    }

    public ArrayList<Ingrediënt> getDeIngrediënten() {
        return deIngrediënten;
    }

    public void setDeIngrediënten(ArrayList<Ingrediënt> deIngrediënten) {
        this.deIngrediënten = deIngrediënten;
    }

    public ArrayList<Recept> getDeRecepten() {
        return deRecepten;
    }

    public void setDeRecepten(ArrayList<Recept> deRecepten) {
        this.deRecepten = deRecepten;
    }
}
