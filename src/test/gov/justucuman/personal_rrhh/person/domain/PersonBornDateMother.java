package gov.justucuman.personal_rrhh.person.domain;

import gov.justucuman.personal_rrhh.shared.domain.PersonValueObjectMother;

import java.time.LocalDate;

public final class PersonBornDateMother {

    public static PersonBornDate create(LocalDate value){
        return new PersonBornDate(value);
    }

    public static PersonBornDate random(){
        return create(PersonValueObjectMother.bornDateRandom());
    }
}
