package fi.metatavu.soteapi.server.rest;

import fi.metatavu.soteapi.server.rest.model.BadRequest;
import fi.metatavu.soteapi.server.rest.model.EmergencyCongestionStatus;
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

@Path("/emergencyCongestionStatuses")

@Api(description = "the emergencyCongestionStatuses API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-09-06T18:12:56.464+03:00")


public interface EmergencyCongestionStatusesApi  {

    @GET
    
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Lists emergency congestion statuses", notes = "List of emergency congestion statuses", response = EmergencyCongestionStatus.class, responseContainer = "List", tags={ "EmergencyCongestionStatuses" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a lists emergency congestion statuses", response = EmergencyCongestionStatus.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listEmergencyCongestionStatuses(@QueryParam("sort")   @ApiParam("Sort results. See EmergencyCongestionStatusListSort for sort options")  String sort,@QueryParam("firstResult")   @ApiParam("First result")  Long firstResult,@QueryParam("maxResults")   @ApiParam("Max results")  Long maxResults) throws Exception;
}
