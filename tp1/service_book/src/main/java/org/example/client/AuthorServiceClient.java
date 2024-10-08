package org.example.client;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.example.dto.author.AuthorDtoGet;

@Path("/api/authors")
@RegisterRestClient(configKey = "service_author")
public interface AuthorServiceClient {

    @GET
    @Path("{id}")
    public AuthorDtoGet getAuthorById(@PathParam("id") long id);
}
