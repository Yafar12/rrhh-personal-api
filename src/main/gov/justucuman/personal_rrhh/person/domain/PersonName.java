package gov.justucuman.personal_rrhh.person.domain;

import gov.justucuman.personal_rrhh.shared.domain.StringValueObject;

public final class PersonName extends StringValueObject {
    public PersonName(String value){
        super(value);
        if (value == null || !value.matches("^[a-zA-ZñÑáéíóúÁÉÍÓÚüÜ' ]{2,50}$")) {
            throw new IllegalArgumentException("El nombre debe contener solo letras y tener entre 2 y 50 caracteres.");
        }
    }
}
