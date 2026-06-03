package gov.justucuman.personal_rrhh.person.domain;

import gov.justucuman.personal_rrhh.shared.domain.PersonValueObjectMother;

public final class PersonAddressMother {
    public static PersonAddress create(
            String streetName,
            Integer streetNumber,
            Integer flatNumber,
            LocalityId localityId
    ) {
        return new PersonAddress(
                streetName,
                streetNumber,
                flatNumber,
                localityId
        );
    }

    public static PersonAddress random() {
        return create(
                PersonValueObjectMother.streetNameRandom(),
                PersonValueObjectMother.streetNumberRandom(),
                PersonValueObjectMother.flatNumberRandom(),
                LocalityIdMother.random()
                );
    }
}
