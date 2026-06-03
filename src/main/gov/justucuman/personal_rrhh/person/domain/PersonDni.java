package gov.justucuman.personal_rrhh.person.domain;

import gov.justucuman.personal_rrhh.shared.domain.StringValueObject;

public final class PersonDni extends StringValueObject {
    public PersonDni(String value){
        super(value);
        if (value == null || !value.matches("^\\d{7,8}$")) {
            throw new IllegalArgumentException("El DNI debe contener entre 7 y 8 dígitos numéricos.");
        }

    }
}
