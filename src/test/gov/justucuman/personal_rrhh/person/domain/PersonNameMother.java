package gov.justucuman.personal_rrhh.person.domain;

import gov.justucuman.personal_rrhh.shared.domain.PersonValueObjectMother;

public final class PersonNameMother {
    public static PersonName create(String value){
        return new PersonName(value);
    }

    public static PersonName random(){
        return create(PersonValueObjectMother.nameRandom());
    }
}
