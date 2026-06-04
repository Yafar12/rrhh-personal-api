package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.employee.application.create.EmployeeCreateCommand;

import java.time.LocalDate;

public final class EmployeeMother {
    public static Employee create(
            EmployeeId id,
            EmployeeLegajo legajo,
            LocalDate entryDate,
            EmployeePersonId personId,
            EmployeeStateEnum state
    ) {
        return new Employee(
                id,
                legajo,
                entryDate,
                personId,
                state
        );
    }

    public static Employee fromCommand(EmployeeCreateCommand command) {
        return new Employee(
                new EmployeeId(command.id()),
                new EmployeeLegajo(command.legajo()),
                LocalDate.now(),
                new EmployeePersonId(command.personId()),
                EmployeeStateEnum.fromValue(command.state())
        );
    }

    public static Employee random() {
        return create(
                EmployeeIdMother.random(),
                EmployeeLegajoMother.random(),
                LocalDate.now(),
                EmployeePersonIdMother.random(),
                EmployeeStateMother.random()
        );
    }
}