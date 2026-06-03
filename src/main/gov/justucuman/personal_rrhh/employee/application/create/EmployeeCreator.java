package gov.justucuman.personal_rrhh.employee.application.create;

import gov.justucuman.personal_rrhh.employee.domain.*;
import gov.justucuman.personal_rrhh.person.domain.*;
import gov.justucuman.personal_rrhh.shared.domain.Service;

import java.time.LocalDate;

@Service
public final class EmployeeCreator {
    private final EmployeeRepository repository;

    public EmployeeCreator(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void create(RequestEmployeeCreate request) {

        Employee employee = new Employee(
                new EmployeeId(request.id()),
                new EmployeeLegajo(request.legajo()),
                LocalDate.now(),
                EmployeeStateEnum.fromValue(request.state())
        );

        repository.save(employee);
    }
}
