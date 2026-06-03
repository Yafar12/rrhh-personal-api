package gov.justucuman.personal_rrhh.person.domain;

import gov.justucuman.personal_rrhh.shared.domain.PersonValueObjectMother;

public final class PersonDniMother {
    public static PersonDni create(String value){
        return new PersonDni(value);
    }

    public static PersonDni random(){
        return create(
                PersonValueObjectMother.dniRandom());
    }
}
