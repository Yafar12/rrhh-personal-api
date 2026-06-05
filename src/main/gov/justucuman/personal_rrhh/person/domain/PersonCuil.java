package gov.justucuman.personal_rrhh.person.domain;

import gov.justucuman.personal_rrhh.shared.domain.StringValueObject;

public final class PersonCuil extends StringValueObject {
    public PersonCuil(String value){
        super(value);
        if (value == null || !value.matches("^\\d{2}-\\d{8}-\\d{1}$")) {
            throw new IllegalArgumentException("El CUIL debe tener el formato XX-XXXXXXXX-X.");
        }
    }
}