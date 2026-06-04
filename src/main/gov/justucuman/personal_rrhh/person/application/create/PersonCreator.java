package gov.justucuman.personal_rrhh.person.application.create;

import gov.justucuman.personal_rrhh.person.domain.*;
import gov.justucuman.personal_rrhh.shared.domain.Service;

import java.time.LocalDate;

@Service
public final class PersonCreator {
    private final PersonRepository repository;

    public PersonCreator(PersonRepository repository) {
        this.repository = repository;
    }

    public void create(PersonCreateCommand command) {
        Person person = new Person(
                new PersonId(command.id()),
                new PersonDni(command.dni()),
                new PersonCuil(command.cuil()),
                new PersonGender(command.gender()),
                new PersonName(command.name()),
                new PersonLastname(command.lastname()),
                new PersonAddress(
                        command.streetName(),
                        command.streetNumber(),
                        command.flatNumber(),
                        new LocalityId(command.localityId())
                ),
                new PersonBornDate(LocalDate.parse(command.bornDate())),
                new PersonPhone(command.phone())
        );
        repository.save(person);
    }
}