package org.acme.web;

import org.acme.webclient.flaskweb;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.vertx.core.json.JsonObject;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hello")
public class MainResource {

    @Inject
    @RestClient
    flaskweb flaswebobj;

    @POST
    public JsonObject hello(JsonObject obj) {
        
        JsonObject jsonObject;
        jsonObject = flaswebobj.processJson(obj);
        System.out.println(jsonObject.toString());
        return jsonObject;

    }
        
}
