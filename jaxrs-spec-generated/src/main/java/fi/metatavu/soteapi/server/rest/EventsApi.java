package fi.metatavu.soteapi.server.rest;

import fi.metatavu.soteapi.server.rest.model.BadRequest;
import fi.metatavu.soteapi.server.rest.model.Event;
import fi.metatavu.soteapi.server.rest.model.Forbidden;
import fi.metatavu.soteapi.server.rest.model.InternalServerError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.lang.Exception;

@Path("/events")

@Api(description = "the events API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-11-12T13:51:47.044+02:00")


public interface EventsApi  {

    @GET
    @Path("/{eventId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Finds event", notes = "Finds single event ", response = Event.class, tags={ "Events",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single event", response = Event.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findEvent(@PathParam("eventId") @ApiParam("event id") Long eventId) throws Exception;

    @GET
    
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Lists events", notes = "Lists events ", response = Event.class, responseContainer = "List", tags={ "Events" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of events", response = Event.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listEvents(@QueryParam("endsAfter")    String endsAfter,@QueryParam("startsBefore")    String startsBefore,@QueryParam("categorySlug")   @ApiParam("Filter by category slug")  String categorySlug,@QueryParam("firstResult")   @ApiParam("First result")  Long firstResult,@QueryParam("maxResults")   @ApiParam("Max results")  Long maxResults) throws Exception;
}
