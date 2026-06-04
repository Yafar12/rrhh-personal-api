package gov.justucuman.personal_rrhh.person.infraestructure.output.persistence;

import gov.justucuman.personal_rrhh.person.domain.*;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Repository
@Primary
public class PersonPostgresRepository implements PersonRepository {
    private final PersonJpaRepository jpaRepository;

    public PersonPostgresRepository(PersonJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    @Transactional
    public void save(Person person) {
        PersonEntity entity = new PersonEntity(
                UUID.fromString(person.getId().value()),
                person.getDni().value(),
                person.getCuil().value(),
                person.getAddress().streetName(),
                person.getAddress().streetNumber(),
                person.getAddress().flatNumber(),
                UUID.fromString(person.getAddress().localityId().value()),
                UUID.fromString(person.getGenderId().value()),
                person.getName().value(),
                person.getLastname().value(),
                person.getPhone().value(),
                person.getBornDate().value()
        );
        jpaRepository.save(entity);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Person> search(String id) {
        return jpaRepository.findById(UUID.fromString(id))
                            .map(entity -> new Person(
                                    new PersonId(entity.getId().toString()),
                                    new PersonDni(entity.getDni()),
                                    new PersonCuil(entity.getCuil()),
                                    new PersonGender(entity.getGender()
                                                           .toString()),
                                    new PersonName(entity.getName()),
                                    new PersonLastname(entity.getLastname()),
                                    new PersonAddress(
                                            entity.getStreetName(),
                                            entity.getStreetNumber(),
                                            entity.getFlatNumber(),
                                            new LocalityId(entity.getLocalityId()
                                                                 .toString())
                                    ),
                                    new PersonBornDate(entity.getBornDate()),
                                    new PersonPhone(entity.getPhone())
                            ));
    }
}