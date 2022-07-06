package webservices;

public class toevoegen {
    public static void main(String[] args) {
        String emailNew = "Henk@henk.com";
        String wacthwoordNew = "halo";
        String gebruikersnaamNew = "heer";
        ContactProgram.sql("INSERT INTO gebruikers (email, wachtwoord, gebruikersnaam)" + "VALUES ('%s', '%s', '%s')".formatted(emailNew, wacthwoordNew, gebruikersnaamNew));
    }
}
