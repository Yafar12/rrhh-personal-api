package gov.justucuman.personal_rrhh.person.domain;

import gov.justucuman.personal_rrhh.shared.domain.StringValueObject;

public final class PersonPhone extends StringValueObject {
    public PersonPhone(String value){
        super(value);
        if (value == null || !value.matches("^\\d{10,13}$")) {
            throw new IllegalArgumentException("El teléfono debe ser un formato numérico válido de entre 10 y 13 dígitos.");
        }
    }
}
