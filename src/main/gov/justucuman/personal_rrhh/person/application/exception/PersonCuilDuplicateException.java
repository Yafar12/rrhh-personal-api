package gov.justucuman.personal_rrhh.person.application.exception;

import gov.justucuman.personal_rrhh.shared.application.DuplicateException;

public final class PersonCuilDuplicateException extends DuplicateException {
    public PersonCuilDuplicateException(String value){
        super("cuil",value);
    }
}
