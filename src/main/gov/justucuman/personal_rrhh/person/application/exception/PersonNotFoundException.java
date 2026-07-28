package gov.justucuman.personal_rrhh.person.application.exception;

import gov.justucuman.personal_rrhh.shared.application.NotFoundException;

public final class PersonNotFoundException extends NotFoundException {
    public PersonNotFoundException(String value) {
        super("id", value);
    }
}
