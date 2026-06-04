package gov.justucuman.personal_rrhh.employee.application.create;

import gov.justucuman.personal_rrhh.shared.domain.bus.command.Command;

public record EmployeeCreateCommand (
        String id,
        String legajo,
        String state,
        String personId
) implements Command {}
