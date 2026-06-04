package gov.justucuman.personal_rrhh.employee.infraestructure.output.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmployeeJpaRepository extends JpaRepository<EmployeeEntity,UUID> {}
