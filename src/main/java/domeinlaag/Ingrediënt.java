package main.java.domeinlaag;

public class Ingrediënt {
    private String type;
    private String hoeveelheid;

    public Ingrediënt (String tp, String hh) {
        this.setType(tp);
        this.setHoeveelheid(hh);
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHoeveelheid() {
        return hoeveelheid;
    }

    public void setHoeveelheid(String hoeveelheid) {
        this.hoeveelheid = hoeveelheid;
    }
}
