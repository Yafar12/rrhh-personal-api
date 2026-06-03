package gov.justucuman.personal_rrhh.person.domain;

import gov.justucuman.personal_rrhh.shared.domain.UuidMother;

public final class PersonGenderMother {
    public static PersonGender create(String value) {
        return new PersonGender(value);
    }

    public static PersonGender random() {
        return create(UuidMother.random());
    }
}
