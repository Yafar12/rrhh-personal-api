package gov.justucuman.personal_rrhh.shared.infraestructure.error;

import gov.justucuman.personal_rrhh.employee.application.find.EmployeeNotFoundException;
import gov.justucuman.personal_rrhh.person.application.exception.PersonCuilDuplicateException;
import gov.justucuman.personal_rrhh.person.application.exception.PersonDniDuplicateException;
import gov.justucuman.personal_rrhh.person.application.exception.PersonPhoneDuplicateException;
import gov.justucuman.personal_rrhh.shared.application.DuplicateException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public final class GlobalControlExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<HttpErrorResponse> handleValidationErrors(MethodArgumentNotValidException err) {
        Map<String, String> fields = new HashMap<>();

        for (FieldError error : err.getBindingResult().getFieldErrors()) {
            fields.put(
                    error.getField(),
                    error.getDefaultMessage()
            );
        }

        return new ResponseEntity<>(
                responseWithBody(
                        err.getStatusCode().value(),
                        "Validation Errors",
                        fields
                ),
                HttpStatus.BAD_REQUEST
        );
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<HttpErrorResponse> handleDomainValidationErrors(IllegalArgumentException ex) {
        Map<String, String> fields = new HashMap<>();

        String message = ex.getMessage();
        String field   = "error";

        if (message.toLowerCase().contains("legajo")) {
            field = "legajo";
        }
        else if (message.toLowerCase().contains("estado")) {
            field = "state";
        }
        else if (message.toLowerCase()
                        .contains("persona") || message.toLowerCase()
                                                       .contains("uuid")) {
            field = "personId";
        }
        else if (message.toLowerCase().contains("dni")) {
            field = "dni";
        }
        else if (message.toLowerCase().contains("cuil")) {
            field = "cuil";
        }
        else if (message.toLowerCase()
                        .contains("telefono") || message.toLowerCase()
                                                        .contains("phone")) {
            field = "phone";
        }
        else if (message.toLowerCase()
                        .contains("calle") || message.toLowerCase()
                                                     .contains("numero")) {
            field = "streetNumber";
        }

        fields.put(
                field,
                message
        );
        return new ResponseEntity<>(
                responseWithBody(
                        400,
                        "Domain Validation Errors",
                        fields
                ),
                HttpStatus.BAD_REQUEST
        );
    }

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<HttpErrorResponse> handleEmployeeNotFoundException(EmployeeNotFoundException ex) {


        return new ResponseEntity<>(
                responseWithoutBody(
                        HttpStatus.BAD_REQUEST.value(),
                        ex.getMessage()
                ),
                HttpStatus.BAD_REQUEST
        );
    }

    @ExceptionHandler(DuplicateException.class)
    public ResponseEntity<HttpErrorResponse> handleDuplicateErrors(DuplicateException ex) {
        Map<String, String> fields = new HashMap<>();

        fields.put(ex.field(), ex.toString());

        return new ResponseEntity<>(
                responseWithBody(409, "Conflict Errors", fields),
                HttpStatus.CONFLICT
        );
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<HttpErrorResponse> handleUnexpectedErrors(Exception ex) {
        Map<String, String> fields = new HashMap<>();
        fields.put(
                "server",
                ex.getMessage()
        );

        return new ResponseEntity<>(
                responseWithBody(
                        500,
                        "Internal Server Error",
                        fields
                ),
                HttpStatus.INTERNAL_SERVER_ERROR
        );
    }

    private HttpErrorResponse responseWithBody(
            Integer statusCode,
            String message,
            Map<String, String> fields
    ) {
        Integer status = statusCode == null ? 400 : statusCode;
        String  messageError = message == null || message.isBlank() ? "Error" : message;

        return new HttpErrorResponse(
                LocalDateTime.now(),
                status,
                messageError,
                fields
        );
    }

    private HttpErrorResponse responseWithoutBody(
            Integer statusCode,
            String message
    ) {
        return new HttpErrorResponse(
                LocalDateTime.now(),
                statusCode,
                message,
                null
        );
    }
}