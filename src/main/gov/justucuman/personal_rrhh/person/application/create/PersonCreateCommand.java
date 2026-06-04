package gov.justucuman.personal_rrhh.person.application.create;

import gov.justucuman.personal_rrhh.shared.domain.bus.command.Command;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

public record PersonCreateCommand(
        String id,
        String dni,
        String cuil,
        String name,
        String lastname,
        String gender,
        String streetName,
        Integer streetNumber,
        Integer flatNumber,
        String localityId,
        String phone,
        String bornDate) implements Command {}
