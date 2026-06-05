package gov.justucuman.personal_rrhh.person.application.exception;

import gov.justucuman.personal_rrhh.shared.application.DuplicateException;

public final class PersonDniDuplicateException extends DuplicateException {
    public PersonDniDuplicateException(String value){
        super("dni",value);
    }
}
