package gov.justucuman.personal_rrhh.employee.application;

import gov.justucuman.personal_rrhh.employee.application.create.EmployeeCreateCommand;
import gov.justucuman.personal_rrhh.employee.domain.*;

public final class EmployeeCreateCommandMother {
    public static EmployeeCreateCommand create(
            EmployeeId id,
            EmployeeLegajo legajo,
            String state,
            EmployeePersonId personId
    ) {
        return new EmployeeCreateCommand(
                id.value(),
                legajo.value(),
                state,
                personId.value()
        );
    }

    public static EmployeeCreateCommand random() {
        return create(
                EmployeeIdMother.random(),
                EmployeeLegajoMother.random(),
                EmployeeStateMother.random().toString(),
                EmployeePersonIdMother.random()
        );
    }
}