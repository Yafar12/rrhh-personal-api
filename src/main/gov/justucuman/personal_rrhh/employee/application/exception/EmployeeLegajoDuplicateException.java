package gov.justucuman.personal_rrhh.employee.application.exception;

import gov.justucuman.personal_rrhh.shared.application.DuplicateException;

public final class EmployeeLegajoDuplicateException extends DuplicateException {
    public EmployeeLegajoDuplicateException(String value) {
        super("legajo",value);
    }
}
