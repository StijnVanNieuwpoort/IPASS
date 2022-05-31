package main.java.domeinlaag;

public class Gebruiker {
    private String email;
    private String wachtwoord;
    private String gebruikersnaam;

    public Gebruiker (String em, String ww, String gebr) {
        this.setEmail(em);
        this.setWachtwoord(ww);
        this.setGebruikersnaam(gebr);
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }
}
