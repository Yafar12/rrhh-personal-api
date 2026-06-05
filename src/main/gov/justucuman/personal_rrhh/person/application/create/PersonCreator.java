package gov.justucuman.personal_rrhh.person.application.create;

import gov.justucuman.personal_rrhh.person.application.exception.PersonCuilDuplicateException;
import gov.justucuman.personal_rrhh.person.application.exception.PersonDniDuplicateException;
import gov.justucuman.personal_rrhh.person.application.exception.PersonPhoneDuplicateException;
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

        if(repository.existsByDniAndIdNot(command.dni(),command.id())){
            throw new PersonDniDuplicateException(command.dni());
        }
        if (repository.existsByCuilAndIdNot(command.cuil(),command.id())) {

            throw new PersonCuilDuplicateException(command.cuil());
        }
        if(repository.existsByPhoneAndIdNot(command.phone(),command.id())){
            throw new PersonPhoneDuplicateException(command.phone());
        }


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
                new PersonBornDate(command.bornDate()),
                new PersonPhone(command.phone())
        );
        repository.save(person);
    }
}