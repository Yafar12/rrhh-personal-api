package gov.justucuman.personal_rrhh.person.application.create;

import gov.justucuman.personal_rrhh.person.domain.*;

import java.time.LocalDate;

public final class PersonCreateRequestMother {
    public static PersonCreateRequest create(
            String id,
            String dni,
            String cuil,
            String name,
            String lastname,
            String gender,
            String phone,
            String streetName,
            Integer streetNumber,
            Integer flatNumber,
            String localityId,
            LocalDate bornDate
    ) {
        return new PersonCreateRequest(
                id,
                dni,
                cuil,
                name,
                lastname,
                gender,
                phone,
                streetName,
                streetNumber,
                flatNumber,
                localityId,
                bornDate
        );
    }

    public static PersonCreateRequest random() {
        return create(
                PersonIdMother.random().value(),
                PersonDniMother.random().value(),
                PersonCuilMother.random().value(),
                PersonNameMother.random().value(),
                PersonLastnameMother.random().value(),
                PersonGenderMother.random().value(),
                PersonPhoneMother.random().value(),
                PersonAddressMother.random().streetName(),
                PersonAddressMother.random().streetNumber(),
                PersonAddressMother.random().flatNumber(),
                PersonAddressMother.random().localityId().value(),
                PersonBornDateMother.random().value());
    }
}
