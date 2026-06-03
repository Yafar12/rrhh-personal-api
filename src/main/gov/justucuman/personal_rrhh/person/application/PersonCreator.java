package gov.justucuman.personal_rrhh.person.application;

import gov.justucuman.personal_rrhh.person.domain.*;
import gov.justucuman.personal_rrhh.shared.domain.Service;

@Service
public final class PersonCreator {
    private final PersonRepository repository;

    public PersonCreator(PersonRepository repository){
        this.repository = repository;
    }

    public void create(PersonCreateRequest request){
        Person person = new Person(
                new PersonId(request.id()),
                new PersonDni(request.dni()),
                new PersonCuil(request.cuil()),
                new PersonGender(request.gender()),
                new PersonName(request.name()),
                new PersonLastname(request.lastname()),
                new PersonAddress(request.streetName(),request.streetNumber(),request.flatNumber(),new LocalityId(request.localityId())),
                new PersonBornDate(request.bornDate()),
                new PersonPhone(request.phone())
        );
        repository.save(person);
    }
}
