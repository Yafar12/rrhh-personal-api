package gov.justucuman.personal_rrhh.person.domain;

import gov.justucuman.personal_rrhh.shared.domain.UuidMother;


public final class LocalityIdMother {
    public static LocalityId create(String value){
        return new LocalityId(value);
    }

    public static LocalityId random(){
        return create(UuidMother.random());
    }
}
