/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.7.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package cm.xenonbyte.farmbyte.catalog.adapter.rest.api.generated.uom;

import cm.xenonbyte.farmbyte.catalog.adapter.rest.api.generated.uom.view.ApiErrorResponse;
import cm.xenonbyte.farmbyte.catalog.adapter.rest.api.generated.uom.view.ApiSuccessResponse;
import cm.xenonbyte.farmbyte.catalog.adapter.rest.api.generated.uom.view.CreateUomViewRequest;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-08-09T15:14:46.030994+02:00[Europe/Paris]", comments = "Generator version: 7.7.0")
@Validated
@Tag(name = "Uom", description = "the Uom API")
@RequestMapping("${openapi.unitOfMeasure.base-path:/api/v1/catalog}")
public interface UomsApi {

    /**
     * POST /uoms : create an unit of measure
     *
     * @param createUomViewRequest uom object to be created (required)
     * @return successful operation (status code 201)
     *         or bad operation (status code 400)
     *         or not found operation (status code 404)
     *         or conflict operation (status code 409)
     */
    @Operation(
        operationId = "createUom",
        summary = "create an unit of measure",
        tags = { "Uom" },
        responses = {
            @ApiResponse(responseCode = "201", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiSuccessResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "bad operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiErrorResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "not found operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiErrorResponse.class))
            }),
            @ApiResponse(responseCode = "409", description = "conflict operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ApiErrorResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/uoms",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    ResponseEntity<ApiSuccessResponse> createUom(
        @Parameter(name = "CreateUomViewRequest", description = "uom object to be created", required = true) @Valid @RequestBody CreateUomViewRequest createUomViewRequest
    );

}
