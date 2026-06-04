package gov.justucuman.personal_rrhh.person.application.create;

import gov.justucuman.personal_rrhh.person.domain.Person;
import gov.justucuman.personal_rrhh.person.domain.PersonMother;
import gov.justucuman.personal_rrhh.person.domain.PersonRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

final class PersonCreatorTest {
    @Test
    void create_a_valid_person(){
        PersonRepository repository = mock(PersonRepository.class);
        PersonCreator creator = new PersonCreator(repository);
        PersonCreateRequest request = PersonCreateRequestMother.random();
        Person              person = PersonMother.fromRequest(request);

        creator.create(request);

        repository.save(person);
    }
}
