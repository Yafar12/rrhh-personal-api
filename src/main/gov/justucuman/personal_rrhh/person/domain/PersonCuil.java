package gov.justucuman.personal_rrhh.person.domain;

import gov.justucuman.personal_rrhh.shared.domain.StringValueObject;

public final class PersonCuil extends StringValueObject {
    public PersonCuil(String value){
        super(value);
        if (value == null || !value.matches("^\\d{11}$")) {
            throw new IllegalArgumentException("El CUIL debe contener exactamente 11 dígitos numéricos sin guiones.");
        }
    }
}
