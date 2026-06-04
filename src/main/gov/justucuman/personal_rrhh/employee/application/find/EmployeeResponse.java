package gov.justucuman.personal_rrhh.employee.application.find;

import gov.justucuman.personal_rrhh.shared.domain.bus.query.Response;

public record EmployeeResponse(
        String id,
        String legajo,
        String entryDate,
        String state,
        String personId
) implements Response {}
