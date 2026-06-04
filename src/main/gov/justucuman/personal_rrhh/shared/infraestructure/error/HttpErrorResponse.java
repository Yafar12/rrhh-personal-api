package gov.justucuman.personal_rrhh.shared.infraestructure.error;

import java.time.LocalDateTime;
import java.util.Map;

public record HttpErrorResponse(LocalDateTime timestamp, Integer statusCode, String message,
                                Map<String,String> fields) {}
