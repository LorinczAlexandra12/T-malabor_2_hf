package io.swagger.api;

import io.swagger.model.Author;
import io.swagger.model.Authors;
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
public class AuthorApiController implements AuthorApi {

    private static final Logger log = LoggerFactory.getLogger(AuthorApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AuthorApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Authors> authorGet(@Parameter(in = ParameterIn.QUERY, description = "The name of the author" ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Authors>(objectMapper.readValue("[ {\n  \"AuthorName\" : \"AuthorName\",\n  \"AuthorBirthDate\" : \"AuthorBirthDate\"\n}, {\n  \"AuthorName\" : \"AuthorName\",\n  \"AuthorBirthDate\" : \"AuthorBirthDate\"\n} ]", Authors.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Authors>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Authors>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> authorPost(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Author body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> authorPut(@NotNull @Parameter(in = ParameterIn.QUERY, description = "The name of the Author" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "name", required = true) String name,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Birth date of the author" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "birhday", required = true) Integer birhday) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
