package gov.justucuman.personal_rrhh.employee.infraestructure.output.persistence;

import gov.justucuman.personal_rrhh.employee.domain.*;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Repository
@Primary
public class EmployeePostgresRepository implements EmployeeRepository{
    private final EmployeeJpaRepository jpaRepository;

    public EmployeePostgresRepository(EmployeeJpaRepository repository){
        this.jpaRepository = repository;
    }

    @Override
    @Transactional
    public void save(Employee employee){
        EmployeeEntity entity = new EmployeeEntity(
                UUID.fromString(employee.getId().value()),
                employee.getLegajo().value(),
                employee.getEntryDate().atStartOfDay(),
                UUID.fromString(employee.getPersonId().value()),
                employee.getEmployeeState().code(),
                employee.getPhotoPath() != null ? employee.getPhotoPath().value() : null
        );
        jpaRepository.save(entity);
    }

    @Override
    public Optional<Employee> search(String id) {
        return jpaRepository.findById(UUID.fromString(id))
                            .map(entity -> new Employee(
                                    new EmployeeId(entity.getId().toString()),
                                    new EmployeeLegajo(entity.getLegajo()),
                                    entity.getEntryDate().toLocalDate(),
                                    new EmployeePersonId(entity.getPersonId().toString()),
                                    EmployeeStateEnum.fromValue(entity.getEmployeeState())
                            ));
    }
}
