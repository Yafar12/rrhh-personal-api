package gov.justucuman.personal_rrhh.employee.application;

import gov.justucuman.personal_rrhh.employee.application.create.RequestEmployeeCreate;
import gov.justucuman.personal_rrhh.employee.domain.*;
import gov.justucuman.personal_rrhh.person.domain.*;


public final class RequestEmployeeCreateMother {
    public static RequestEmployeeCreate create(
            EmployeeId id,
            EmployeeLegajo legajo,
            String state
    ) {
        return new RequestEmployeeCreate(
                id.value(),
                legajo.value(),
                state
        );
    }
    public static RequestEmployeeCreate random(){
        return create(
                EmployeeIdMother.random(),
                EmployeeLegajoMother.random(),
                EmployeeStateMother.random().toString()
        );
    }
}
