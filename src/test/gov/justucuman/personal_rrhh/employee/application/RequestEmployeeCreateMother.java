package gov.justucuman.personal_rrhh.employee.application;

import gov.justucuman.personal_rrhh.employee.application.create.RequestEmployeeCreate;
import gov.justucuman.personal_rrhh.employee.domain.*;

public final class RequestEmployeeCreateMother {
    public static RequestEmployeeCreate create(
            EmployeeId id,
            EmployeeLegajo legajo,
            EmployeeName name,
            EmployeeLastname lastname,
            EmployeeDni dni,
            EmployeeCuil cuil,
            EmployeeGender genderId,
            EmployeePhone phone,
            String streetName,
            Integer streetNumber,
            Integer flatNumber,
            String localityId,
            String state
    ) {
        return new RequestEmployeeCreate(
                id.value(),
                legajo.value(),
                name.value(),
                lastname.value(),
                dni.value(),
                cuil.value(),
                genderId.value(),
                phone.value(),
                streetName,
                streetNumber,
                flatNumber,
                localityId,
                state
        );
    }
    public static RequestEmployeeCreate random(){
        return create(
                EmployeeIdMother.random(),
                EmployeeLegajoMother.random(),
                EmployeeNameMother.random(),
                EmployeeLastnameMother.random(),
                EmployeeDniMother.random(),
                EmployeeCuilMother.random(),
                EmployeeGenderMother.random(),
                EmployeePhoneMother.random(),
                EmployeeAddressMother.random().streetName(),
                EmployeeAddressMother.random().streetNumber(),
                EmployeeAddressMother.random().flatNumber(),
                EmployeeAddressMother.random().localityId(),
                EmployeeStateMother.random().toString()
        );
    }
}
