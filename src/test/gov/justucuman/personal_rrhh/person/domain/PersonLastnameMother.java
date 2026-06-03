package gov.justucuman.personal_rrhh.person.domain;

import gov.justucuman.personal_rrhh.shared.domain.PersonValueObjectMother;

public final class PersonLastnameMother {
    public static PersonLastname create(String value){
        return new PersonLastname(value);
    }

    public static PersonLastname random(){
        return create(PersonValueObjectMother.lastnameRandom());
    }
}
