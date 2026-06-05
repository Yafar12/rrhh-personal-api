package gov.justucuman.personal_rrhh.person.application.exception;

import gov.justucuman.personal_rrhh.shared.application.DuplicateException;

public final class PersonPhoneDuplicateException extends DuplicateException {
    public PersonPhoneDuplicateException(String value){
        super("phone",value);
    }
}
