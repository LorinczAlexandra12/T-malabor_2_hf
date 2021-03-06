/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Book;
import io.swagger.model.Componentsschemasbooks;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-29T20:48:13.993Z[GMT]")
@Validated
public interface BookApi {

    @Operation(summary = "Books GET endpoint", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful opreation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Componentsschemasbooks.class))) })
    @RequestMapping(value = "/book",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Componentsschemasbooks> bookGet(@Parameter(in = ParameterIn.QUERY, description = "The title of the book" ,schema=@Schema()) @Valid @RequestParam(value = "title", required = false) String title, @Parameter(in = ParameterIn.QUERY, description = "The name of the author of the book" ,schema=@Schema()) @Valid @RequestParam(value = "author_name", required = false) String authorName);


    @Operation(summary = "Books POST endpoint", description = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Successful operation") })
    @RequestMapping(value = "/book",
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> bookPost(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Book body);


    @Operation(summary = "Book PUT endpoint", description = "Modify Book", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "202", description = "Successful opreation") })
    @RequestMapping(value = "/book",
        method = RequestMethod.PUT)
    ResponseEntity<Void> bookPut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "The title of the Book" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "title", required = true) String title, @NotNull @Parameter(in = ParameterIn.QUERY, description = "Publishing date of the book" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "publishing_date", required = true) Integer publishingDate);

}

