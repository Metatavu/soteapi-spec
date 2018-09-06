package fi.metatavu.soteapi.server.rest;

import fi.metatavu.soteapi.server.rest.model.BadRequest;
import fi.metatavu.soteapi.server.rest.model.Content;
import fi.metatavu.soteapi.server.rest.model.ContentImage;
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

@Path("/contents")

@Api(description = "the contents API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-09-06T18:12:56.464+03:00")


public interface ContentsApi  {

    @GET
    @Path("/{contentId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Finds content", notes = "Finds single content ", response = Content.class, tags={ "Contents",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single content", response = Content.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findContent(@PathParam("contentId") @ApiParam("content id") Long contentId) throws Exception;

    @GET
    @Path("/{contentId}/images/{imageId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Returns a single content image", notes = "Returns a single content image ", response = ContentImage.class, tags={ "Contents",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an content image", response = ContentImage.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findContentImage(@PathParam("contentId") @ApiParam("Content Id") Long contentId,@PathParam("imageId") @ApiParam("Content image id") Long imageId) throws Exception;

    @GET
    @Path("/{contentId}/images/{imageId}/data")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "Returns an content image data", notes = "Returns an content image data ", response = byte[].class, tags={ "Contents",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an content image data", response = byte[].class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response getContentImageData(@PathParam("contentId") @ApiParam("Content id") Long contentId,@PathParam("imageId") @ApiParam("Content image id") Long imageId,@QueryParam("size")   @ApiParam("Maximum width or height of image")  Integer size) throws Exception;

    @GET
    @Path("/{contentId}/images")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Returns a list of content images", notes = "Returns a list of content images ", response = ContentImage.class, responseContainer = "List", tags={ "Contents",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns list of content images", response = ContentImage.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listContentImages(@PathParam("contentId") @ApiParam("Content id") Long contentId,@QueryParam("type")   @ApiParam("Filter by type")  String type) throws Exception;

    @GET
    
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Lists contents", notes = "Lists contents ", response = Content.class, responseContainer = "List", tags={ "Contents" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of contents", response = Content.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listContents(@QueryParam("parentId")   @ApiParam("Filter results by parent id")  String parentId,@QueryParam("type")   @ApiParam("Filter results by content type")  List<String> type,@QueryParam("categorySlug")   @ApiParam("Filter by category slug")  String categorySlug,@QueryParam("firstResult")   @ApiParam("First result")  Long firstResult,@QueryParam("maxResults")   @ApiParam("Max results")  Long maxResults) throws Exception;
}
