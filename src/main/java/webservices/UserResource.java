package webservices;

import javax.json.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractMap;

@Path("LoginSignin")
public class UserResource {

    @POST
    @Path("signin")
    @Produces(MediaType.APPLICATION_JSON)
    public Response maakGebruiker(@FormParam("emailSignin") String emailNew,
                                  @FormParam("wachtwoordSignin") String wacthwoordNew,
                                  @FormParam("gebruikersnaamSignin") String gebruikersnaamNew) {

        System.out.println(emailNew);
        System.out.println(wacthwoordNew);
        System.out.println(gebruikersnaamNew);


        ContactProgram.sql("INSERT INTO gebruikers (email, wachtwoord, gebruikersnaam, role) VALUES ('" + emailNew + "', '" + wacthwoordNew + "', '" + gebruikersnaamNew + "', 'user')");

        System.out.println("jens");

        return Response.ok().build();
    }
}
