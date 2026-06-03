package gov.justucuman.personal_rrhh.person.domain;

import gov.justucuman.personal_rrhh.shared.domain.PersonValueObjectMother;

public final class PersonPhoneMother {
    public static PersonPhone create(String value){
        return new PersonPhone(value);
    }

    public static PersonPhone random(){
        return create(PersonValueObjectMother.phoneRandom());
    }
}
