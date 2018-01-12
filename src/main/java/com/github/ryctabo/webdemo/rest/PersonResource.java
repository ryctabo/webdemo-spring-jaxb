package com.github.ryctabo.webdemo.rest;

import com.github.ryctabo.webdemo.core.ListResponse;
import com.github.ryctabo.webdemo.core.Person;
import com.github.ryctabo.webdemo.service.PersonService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author Gustavo Pacheco (ryctabo at gmail.com)
 * @version 1.0-SNAPSHOT
 */
@Controller
@Path("persons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class PersonResource {

    private PersonService personService;

    @Inject
    public PersonResource(PersonService personService) {
        this.personService = personService;
    }

    @GET
    public ListResponse<Person> get() {
        return this.personService.get();
    }

    @GET
    @Path("{id}")
    public Person get(@PathParam("id") int id) {
        return this.personService.get(id);
    }

}
