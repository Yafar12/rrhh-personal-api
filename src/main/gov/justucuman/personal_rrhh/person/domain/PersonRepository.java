package gov.justucuman.personal_rrhh.person.domain;

import java.util.Optional;

public interface PersonRepository {
    void save(Person person);
    Optional<Person> search(String id);
    Boolean existsByDniAndIdNot(String dni,String id);
    Boolean existsByPhoneAndIdNot(String phone,String id);
    Boolean existsByCuilAndIdNot(String cuil,String id);
}
