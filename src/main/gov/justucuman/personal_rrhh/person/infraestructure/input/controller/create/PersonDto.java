package gov.justucuman.personal_rrhh.person.infraestructure.input.controller.create;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public record PersonDto(

        @NotBlank(message = "El DNI es obligatorio")
        @Pattern(regexp = "^\\d{7,8}$", message = "El DNI debe tener entre 7 y 8 dígitos numéricos")
        String dni,

        @NotBlank(message = "El CUIL es obligatorio")
        @Pattern(regexp = "^\\d{2}-\\d{8}-\\d{1}$", message = "El CUIL debe contener exactamente 11 digitos con formato XX-XXXXXXXX-X")
        String cuil,

        @NotBlank(message = "El nombre es obligatorio")
        String name,

        @NotBlank(message = "El apellido es obligatorio")
        String lastname,

        @NotBlank(message = "El género es obligatorio")
        @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$", message = "El gender debe ser un UUID válido")
        String gender,

        @NotBlank(message = "El nombre de la calle es obligatorio")
        String streetName,

        @NotNull(message = "El número de calle es obligatorio")
        @Positive(message = "El número de calle debe ser un valor positivo")
        Integer streetNumber,

        @Positive(message = "El número de departamento/piso debe ser un valor positivo")
        Integer flatNumber,

        @NotBlank(message = "El ID de la localidad es obligatorio")
        @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$", message = "El localityId debe ser un UUID válido")
        String localityId,

        @NotBlank(message = "El teléfono es obligatorio")
        @Pattern(regexp = "^\\+?\\d{10,15}$", message = "El teléfono debe ser un número válido (ej: 3814123456 o con código de país)")
        String phone,

        @NotBlank(message = "La fecha de nacimiento es obligatoria")
        @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "La fecha de nacimiento debe tener el formato YYYY-MM-DD") String bornDate
) {}