package gov.justucuman.personal_rrhh.employee.application.exception;

import gov.justucuman.personal_rrhh.shared.application.NotFoundException;

public final class EmployeeNotFoundException extends NotFoundException {
    public EmployeeNotFoundException(String value) {
        super("id", value);
    }
}
