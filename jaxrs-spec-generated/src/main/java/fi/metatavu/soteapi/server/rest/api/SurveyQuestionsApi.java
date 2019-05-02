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

@Path("/surveyQuestions")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2019-05-02T19:05:47.365+03:00[Europe/Helsinki]")
public interface SurveyQuestionsApi {

    @GET
    @Path("/{surveyQuestionId}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Finds surveyQuestion", description = "Finds single surveyQuestion ", tags={ "SurveyQuestions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns a single surveyQuestion", content = @Content(schema = @Schema(implementation = SurveyQuestion.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = BadRequest.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = Forbidden.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = InternalServerError.class))) })
    Response findSurveyQuestion( @PathParam("surveyQuestionId")

 @Parameter(description = "surveyQuestion id") Long surveyQuestionId
);
    @GET
    @Path("/{surveyQuestionId}/summary")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Finds survey question summary", description = "Finds single surveyQuestion summary ", tags={ "SurveyQuestions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns a single surveyQuestion", content = @Content(schema = @Schema(implementation = SurveyQuestionSummary.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = BadRequest.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = Forbidden.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = InternalServerError.class))) })
    Response findSurveyQuestionSummary( @PathParam("surveyQuestionId")

 @Parameter(description = "surveyQuestion id") Long surveyQuestionId
);
    @GET
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Lists surveyQuestions", description = "Lists surveyQuestions ", tags={ "SurveyQuestions" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns a list of surveyQuestions", content = @Content(array = @ArraySchema(schema = @Schema(implementation = SurveyQuestion.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = BadRequest.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = Forbidden.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = InternalServerError.class))) })
    Response listSurveyQuestions();}
