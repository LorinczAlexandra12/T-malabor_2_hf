package io.swagger.api;

import io.swagger.model.Book;
import io.swagger.model.Componentsschemasbooks;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-29T20:48:13.993Z[GMT]")
@RestController
public class BookApiController implements BookApi {

    private static final Logger log = LoggerFactory.getLogger(BookApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BookApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Componentsschemasbooks> bookGet(@Parameter(in = ParameterIn.QUERY, description = "The title of the book" ,schema=@Schema()) @Valid @RequestParam(value = "title", required = false) String title,@Parameter(in = ParameterIn.QUERY, description = "The name of the author of the book" ,schema=@Schema()) @Valid @RequestParam(value = "author_name", required = false) String authorName) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Componentsschemasbooks>(objectMapper.readValue("\"{}\"", Componentsschemasbooks.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Componentsschemasbooks>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Componentsschemasbooks>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> bookPost(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Book body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> bookPut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "The title of the Book" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "title", required = true) String title,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Publishing date of the book" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "publishing_date", required = true) Integer publishingDate) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
