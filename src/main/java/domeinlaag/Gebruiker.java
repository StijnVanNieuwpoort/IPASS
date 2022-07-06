package domeinlaag;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

public class Gebruiker implements Principal {

    static {
        List<Gebruiker> alleGebuikers = new ArrayList<>();
        alleGebuikers.add(new Gebruiker("stijn.vannieuwpoort@student.hu.nl","StinvdBuurt", "Stijn", "admin"));
    }
    private String email;
    private String wachtwoord;
    private String gebruikersnaam;
    private String role;


    public Gebruiker (String em, String ww, String gebr, String role) {
        this.setEmail(em);
        this.setWachtwoord(ww);
        this.setGebruikersnaam(gebr);
        this.role = role;
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

    public String getName() {
        return null;
    }

    public String getRole(){
        return role;
    }
}
