package gov.justucuman.personal_rrhh.person.application.find;

import gov.justucuman.personal_rrhh.person.application.exception.PersonNotFoundException;
import gov.justucuman.personal_rrhh.person.domain.PersonRepository;
import gov.justucuman.personal_rrhh.shared.domain.Service;

@Service
public final class PersonFinder {
    private final PersonRepository repository;

    public PersonFinder(PersonRepository repository) {
        this.repository = repository;
    }

    public PersonResponse find(String id) {
        return repository.search(id)
                         .map(person -> new PersonResponse(person.getId()
                                                                 .value(),
                                                           person.getDni()
                                                                 .value(),
                                                           person.getCuil()
                                                                 .value(),
                                                           person.getName()
                                                                 .value(),
                                                           person.getLastname()
                                                                 .value(),
                                                           person.getBornDate()
                                                                 .value(),
                                                           person.getGenderId()
                                                                 .value(),
                                                           person.getAddress()
                                                                 .streetName(),
                                                           person.getAddress()
                                                                 .streetNumber(),
                                                           person.getAddress()
                                                                 .flatNumber(),
                                                           person.getAddress()
                                                                 .localityId()
                                                                 .value(),
                                                           person.getPhone()
                                                                 .value()))
                         .orElseThrow(() -> new PersonNotFoundException(id));
    }
}
