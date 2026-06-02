package gov.justucuman.personal_rrhh.employee.application.create;

import gov.justucuman.personal_rrhh.employee.domain.*;
import gov.justucuman.personal_rrhh.shared.domain.Service;

@Service
public final class EmployeeCreator {
    private final EmployeeRepository repository;

    public EmployeeCreator(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void create(RequestEmployeeCreate request) {
        EmployeeAddress address = new EmployeeAddress(
                request.streetName(),
                request.streetNumber(),
                request.flatNumber(),
                request.localityId()
        );

        Employee employee = new Employee(
                new EmployeeId(request.id()),
                new EmployeeDni(request.dni()),
                new EmployeeLegajo(request.legajo()),
                new EmployeeCuil(request.cuil()),
                new EmployeeGender(request.genderId()),
                new EmployeeName(request.name()),
                new EmployeeLastname(request.lastname()),
                new EmployeePhone(request.phone()),
                EmployeeStateEnum.fromValue(request.state()),
                address
        );

        repository.save(employee);
    }
}
