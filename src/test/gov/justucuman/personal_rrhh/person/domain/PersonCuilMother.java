package gov.justucuman.personal_rrhh.person.domain;

import gov.justucuman.personal_rrhh.shared.domain.PersonValueObjectMother;

public final class PersonCuilMother {
    public static PersonCuil create(String value) {
        return new PersonCuil(value);
    }

    public static PersonCuil random() {
        return create(PersonValueObjectMother.cuilRandom());
    }
}
