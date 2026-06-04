package gov.justucuman.personal_rrhh.person.infraestructure.output.memory;

import gov.justucuman.personal_rrhh.person.domain.Person;
import gov.justucuman.personal_rrhh.person.domain.PersonRepository;
import gov.justucuman.personal_rrhh.shared.domain.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public final class InMemoryPersonRepository implements PersonRepository {
    Map<String, Person> people = new HashMap<>();

    @Override
    public void save(Person person){
        people.put(person.getId().value(),person);
    }

    @Override
    public Optional<Person> search(String id){
        return Optional.ofNullable(people.get(id));
    }
}
