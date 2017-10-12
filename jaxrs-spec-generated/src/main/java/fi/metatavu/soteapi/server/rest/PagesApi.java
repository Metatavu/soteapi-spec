package fi.metatavu.soteapi.server.rest;

import fi.metatavu.soteapi.server.rest.model.Attachment;
import fi.metatavu.soteapi.server.rest.model.BadRequest;
import fi.metatavu.soteapi.server.rest.model.Forbidden;
import fi.metatavu.soteapi.server.rest.model.InternalServerError;
import fi.metatavu.soteapi.server.rest.model.LocalizedValue;
import fi.metatavu.soteapi.server.rest.model.Page;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import java.lang.Exception;

@Path("/pages")

@Api(description = "the pages API")
@Consumes({ "application/json;charset=utf-8" })
@Produces({ "application/json;charset=utf-8" })
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-10-12T23:22:33.019+03:00")


public interface PagesApi  {

    @GET
    @Path("/{pageId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Finds page", notes = "Finds single page ", response = Page.class, tags={ "Pages",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a single page", response = Page.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findPage(@PathParam("pageId") @ApiParam("page id") Long pageId) throws Exception;

    @GET
    @Path("/{pageId}/content")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Returns page content in all available languages", notes = "Returns single page content in all available languages ", response = LocalizedValue.class, responseContainer = "List", tags={ "Pages",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns single page content in all available languages", response = LocalizedValue.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findPageContent(@PathParam("pageId") @ApiParam("page id") Long pageId) throws Exception;

    @GET
    @Path("/{pageId}/images/{imageId}")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Returns a single page image", notes = "Returns a single page image ", response = Attachment.class, tags={ "Pages",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an page image", response = Attachment.class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response findPageImage(@PathParam("pageId") @ApiParam("Page Id") Long pageId,@PathParam("imageId") @ApiParam("Page image id") Long imageId) throws Exception;

    @GET
    @Path("/{pageId}/images/{imageId}/data")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "Returns an page image data", notes = "Returns an page image data ", response = byte[].class, tags={ "Pages",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an page image data", response = byte[].class),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response getPageImageData(@PathParam("pageId") @ApiParam("Page id") Long pageId,@PathParam("imageId") @ApiParam("Page image id") Long imageId,@QueryParam("size")   @ApiParam("Maximum width or height of image")  Integer size) throws Exception;

    @GET
    @Path("/{pageId}/images")
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Returns a list of page images", notes = "Returns a list of page images ", response = Attachment.class, responseContainer = "List", tags={ "Pages",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns list of page images", response = Attachment.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listPageImages(@PathParam("pageId") @ApiParam("Page id") Long pageId,@QueryParam("type")   @ApiParam("Filter by type")  String type) throws Exception;

    @GET
    
    @Consumes({ "application/json;charset&#x3D;utf-8" })
    @Produces({ "application/json;charset&#x3D;utf-8" })
    @ApiOperation(value = "Lists pages", notes = "Lists pages ", response = Page.class, responseContainer = "List", tags={ "Pages" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns a list of pages", response = Page.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid request was sent to the server", response = BadRequest.class),
        @ApiResponse(code = 403, message = "Attempted to make a call with unauthorized client", response = Forbidden.class),
        @ApiResponse(code = 500, message = "Internal server error", response = InternalServerError.class) })
    public Response listPages(@QueryParam("parentId")   @ApiParam("Filter results by parent id")  Long parentId,@QueryParam("path")   @ApiParam("Filter results by page path")  String path,@QueryParam("firstResult")   @ApiParam("First result")  Long firstResult,@QueryParam("maxResults")   @ApiParam("Max results")  Long maxResults) throws Exception;
}
