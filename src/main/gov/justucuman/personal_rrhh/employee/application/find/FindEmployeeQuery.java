package gov.justucuman.personal_rrhh.employee.application.find;

import gov.justucuman.personal_rrhh.shared.domain.bus.query.Query;

public record FindEmployeeQuery(String id) implements Query {}
