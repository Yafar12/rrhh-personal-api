package gov.justucuman.personal_rrhh.person.infraestructure;

import gov.justucuman.personal_rrhh.person.domain.Person;
import gov.justucuman.personal_rrhh.person.domain.PersonMother;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

final class InMemoryRepositoryTest extends InMemoryUnitTestCase {
    @Test
    void save_a_valid_person(){
        Person person = PersonMother.random();

        repository.save(person);
    }

    @Test
    void non_save_invalid_person(){

        assertThrows(IllegalArgumentException.class, () -> {
            Person person = PersonMother.withoutDni();

            repository.save(person);}
        );

    }
}
