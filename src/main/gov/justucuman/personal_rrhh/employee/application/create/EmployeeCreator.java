package gov.justucuman.personal_rrhh.employee.application.create;

import gov.justucuman.personal_rrhh.employee.application.exception.EmployeeLegajoDuplicateException;
import gov.justucuman.personal_rrhh.employee.domain.*;
import gov.justucuman.personal_rrhh.person.domain.*;
import gov.justucuman.personal_rrhh.shared.domain.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public final class EmployeeCreator {
    private final EmployeeRepository repository;

    public EmployeeCreator(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void create(EmployeeCreateCommand command) {

        if(repository.existsByLegajoAndIdNot(command.legajo(),command.id())){
            throw new EmployeeLegajoDuplicateException(command.legajo());
        }

        Employee employee = new Employee(
                new EmployeeId(command.id()),
                new EmployeeLegajo(command.legajo()),
                LocalDateTime.now(),
                new EmployeePersonId(command.personId()),
                EmployeeStateEnum.fromValue(command.state())
        );

        repository.save(employee);
    }
}
