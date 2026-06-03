package gov.justucuman.personal_rrhh.person.domain;

import gov.justucuman.personal_rrhh.shared.domain.UuidMother;

public final class PersonIdMother {
    public static PersonId create(String value){
        return new PersonId(value);
    }

    public static PersonId random(){
        return create(UuidMother.random());
    }
}
