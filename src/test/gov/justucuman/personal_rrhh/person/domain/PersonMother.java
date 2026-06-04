package gov.justucuman.personal_rrhh.person.domain;

public final class PersonMother {
    public static Person create(
            PersonId id,
            PersonDni dni,
            PersonCuil cuil,
            PersonGender gender,
            PersonName name,
            PersonLastname lastname,
            PersonAddress address,
            PersonBornDate bornDate,
            PersonPhone phone
    ) {
        return new Person(
                id,
                dni,
                cuil,
                gender,
                name,
                lastname,
                address,
                bornDate,
                phone
        );
    }

    public static Person fromRequest(PersonCreateRequest request) {
        Person person = new Person(
                PersonIdMother.create(request.id()),
                PersonDniMother.create(request.dni()),
                PersonCuilMother.create(request.cuil()),
                PersonGenderMother.create(request.gender()),
                PersonNameMother.create(request.name()),
                PersonLastnameMother.create(request.lastname()),
                PersonAddressMother.create(
                        request.streetName(),
                        request.streetNumber(),
                        request.flatNumber(),
                        LocalityIdMother.create(request.localityId())
                ),
                PersonBornDateMother.create(request.bornDate()),
                PersonPhoneMother.create(request.phone())
        );

        return person;
    }

    public static Person withoutDni(){
        return new Person(PersonIdMother.random(),
                          PersonDniMother.create(null),
                          PersonCuilMother.random(),
                          PersonGenderMother.random(),
                          PersonNameMother.random(),
                          PersonLastnameMother.random(),
                          PersonAddressMother.random(),
                          PersonBornDateMother.random(),
                          PersonPhoneMother.random());
    }

    public static Person random() {
        return create(
                PersonIdMother.random(),
                PersonDniMother.random(),
                PersonCuilMother.random(),
                PersonGenderMother.random(),
                PersonNameMother.random(),
                PersonLastnameMother.random(),
                PersonAddressMother.random(),
                PersonBornDateMother.random(),
                PersonPhoneMother.random()
        );
    }
}
