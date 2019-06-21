package org.arj.thornbird.demo.app.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.arj.thornbird.demo.app.Greeter;
import org.eclipse.microprofile.openapi.annotations.Operation;

/**
 * @author helio frota
 * 
 * https://labs.consol.de/microservices/2018/09/10/eclipse-microprofile.html
 * 
 * 
 * 
 */
@Path("/")
public class HelloRest {

    @Inject
    private Greeter greeter;
//    @Inject
//    private JsonWebToken jsonWebToken;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(deprecated = false, description = "Returns a greeting.", hidden = false, summary = "Say hello.")
    public String hello() {
        return greeter.getGreeting();
    }
}