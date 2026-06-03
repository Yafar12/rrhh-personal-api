package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.employee.application.create.RequestEmployeeCreate;
import gov.justucuman.personal_rrhh.person.domain.*;

import java.time.LocalDate;

public final class EmployeeMother {
    public static Employee create(
            EmployeeId id,
            EmployeeLegajo legajo,
            LocalDate entryDate,
            EmployeeStateEnum state
    ) {
        return new Employee(
                id,
                legajo,
                entryDate,
                state
        );
    }

    public static Employee fromRequest(RequestEmployeeCreate request) {
        return new Employee(
                EmployeeIdMother.create(request.id()),
                EmployeeLegajoMother.create(request.legajo()),
                LocalDate.now(),
                EmployeeStateMother.createFromCode(request.state())
        );
    }

    public static Employee random() {
        return create(
                EmployeeIdMother.random(),
                EmployeeLegajoMother.random(),
                LocalDate.now(),
                EmployeeStateMother.random()
        );
    }
}
