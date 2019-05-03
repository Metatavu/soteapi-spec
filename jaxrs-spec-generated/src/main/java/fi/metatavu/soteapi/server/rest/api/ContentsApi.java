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

@Path("/contents")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2019-05-03T10:35:00.151+03:00[Europe/Helsinki]")
public interface ContentsApi {

    @GET
    @Path("/{contentId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Finds content", description = "Finds single content ", tags={ "Contents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns a single content", content = @Content(schema = @Schema(implementation = Content.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = BadRequest.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = Forbidden.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = InternalServerError.class))) })
    Response findContent( @PathParam("contentId")

 @Parameter(description = "content id") Long contentId
);
    @GET
    @Path("/{contentId}/images/{imageId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Returns a single content image", description = "Returns a single content image ", tags={ "Contents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns an content image", content = @Content(schema = @Schema(implementation = ContentImage.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = BadRequest.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = Forbidden.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = InternalServerError.class))) })
    Response findContentImage( @PathParam("contentId")

 @Parameter(description = "Content Id") Long contentId
, @PathParam("imageId")

 @Parameter(description = "Content image id") Long imageId
);
    @GET
    @Path("/{contentId}/images/{imageId}/data")
    @Produces({ "application/octet-stream" })
    @Operation(summary = "Returns an content image data", description = "Returns an content image data ", tags={ "Contents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns an content image data", content = @Content(schema = @Schema(implementation = File.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = BadRequest.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = Forbidden.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = InternalServerError.class))) })
    Response getContentImageData( @PathParam("contentId")

 @Parameter(description = "Content id") Long contentId
, @PathParam("imageId")

 @Parameter(description = "Content image id") Long imageId
,  @QueryParam("size") 

 @Parameter(description = "Maximum width or height of image")  Integer size
);
    @GET
    @Path("/{contentId}/images")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Returns a list of content images", description = "Returns a list of content images ", tags={ "Contents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns list of content images", content = @Content(array = @ArraySchema(schema = @Schema(implementation = ContentImage.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = BadRequest.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = Forbidden.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = InternalServerError.class))) })
    Response listContentImages( @PathParam("contentId")

 @Parameter(description = "Content id") Long contentId
,  @QueryParam("type") 

 @Parameter(description = "Filter by type")  String type
);
    @GET
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Lists contents", description = "Lists contents ", tags={ "Contents" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns a list of contents", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Content.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = BadRequest.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = Forbidden.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = InternalServerError.class))) })
    Response listContents(  @QueryParam("parentId") 

 @Parameter(description = "Filter results by parent id")  String parentId
,  @QueryParam("type") 

 @Parameter(description = "Filter results by content type")  List<String> type
,  @QueryParam("categorySlug") 

 @Parameter(description = "Filter by category slug")  String categorySlug
,  @QueryParam("firstResult") 

 @Parameter(description = "First result")  Long firstResult
,  @QueryParam("maxResults") 

 @Parameter(description = "Max results")  Long maxResults
);}
