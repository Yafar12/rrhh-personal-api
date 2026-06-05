package gov.justucuman.personal_rrhh.person.infraestructure.output.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonJpaRepository extends JpaRepository<PersonEntity, UUID> {
    Boolean existsByDniAndIdNot(String dni,UUID id);
    Boolean existsByPhoneAndIdNot(String phone,UUID id);
    Boolean existsByCuilAndIdNot(String cuil,UUID id);
}
