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

@Path("/reviews")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2019-08-28T07:11:31.821+03:00[Europe/Helsinki]")
public interface ReviewsApi {

    @GET
    @Path("/{reviewId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Finds review", description = "Finds single review ", tags={ "Reviews" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns a single review", content = @Content(schema = @Schema(implementation = Review.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = BadRequest.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = Forbidden.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = InternalServerError.class))) })
    Response findReview( @PathParam("reviewId")

 @Parameter(description = "review id") Long reviewId
);
    @GET
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Lists reviews", description = "Lists reviews ", tags={ "Reviews" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns a list of reviews", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Review.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = BadRequest.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = Forbidden.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = InternalServerError.class))) })
    Response listReviews(  @QueryParam("productId") 

 @Parameter(description = "product id")  Long productId
,  @QueryParam("minRating") 

 @Parameter(description = "min rating")  Integer minRating
,  @QueryParam("maxRating") 

 @Parameter(description = "max rating")  Integer maxRating
,  @QueryParam("minReviewLength") 

 @Parameter(description = "displays only reviews containing at least given amount of characters")  Integer minReviewLength
,  @QueryParam("firstResult") 

 @Parameter(description = "First result")  Long firstResult
,  @QueryParam("maxResults") 

 @Parameter(description = "Max results")  Long maxResults
,  @QueryParam("sort") 

 @Parameter(description = "Sort")  ReviewListSort sort
);}
