package fi.metatavu.soteapi.server.rest.api;

import java.util.UUID;
import fi.metatavu.soteapi.server.rest.model.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.File;

import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/reviewProducts")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2019-06-03T16:07:35.024+03:00[Europe/Helsinki]")
public interface ReviewProductsApi {

    @GET
    @Path("/{reviewProductId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Finds reviewProduct", description = "Finds single reviewProduct ", tags={ "ReviewProducts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns a single reviewProduct", content = @Content(schema = @Schema(implementation = ReviewProduct.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = BadRequest.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = Forbidden.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = InternalServerError.class))) })
    Response findReviewProduct( @PathParam("reviewProductId")

 @Parameter(description = "reviewProduct id") Long reviewProductId
);
    @GET
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Lists reviewProducts", description = "Lists reviewProducts ", tags={ "ReviewProducts" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns a list of reviewProducts", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ReviewProduct.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = BadRequest.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = Forbidden.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = InternalServerError.class))) })
    Response listReviewProducts();}
