package gov.justucuman.personal_rrhh.person.domain;

import java.util.Optional;

public interface PersonRepository {
    void save(Person person);
    Optional<Person> searchById(String id);
}
