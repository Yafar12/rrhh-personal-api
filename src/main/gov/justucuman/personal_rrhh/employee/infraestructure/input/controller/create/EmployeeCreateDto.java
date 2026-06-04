package gov.justucuman.personal_rrhh.employee.infraestructure.input.controller.create;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record EmployeeCreateDto(
        @NotBlank(message = "El legajo es obligatorio")
        @Pattern(regexp = "^LEG-\\d{4,6}$", message = "El legajo debe tener el formato 'LEG-XXXX'")
        String legajo,
        @NotBlank(message = "El estado es obligatorio")
        String state,
        @NotBlank( message = "El ID de la persona asociada es obligatorio")
        @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$", message = "El personaId debe ser un UUID válido")
        String personId
) {}
