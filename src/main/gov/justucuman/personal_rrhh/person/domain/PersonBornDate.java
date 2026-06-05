package gov.justucuman.personal_rrhh.person.domain;

import gov.justucuman.personal_rrhh.shared.domain.LocalDateValueObject;

import java.time.LocalDate;

public final class PersonBornDate extends LocalDateValueObject {
    public PersonBornDate(String value) {
        super(value);
    }
}