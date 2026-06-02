package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.employee.application.RequestEmployeeCreateMother;
import gov.justucuman.personal_rrhh.employee.application.create.RequestEmployeeCreate;

public final class EmployeeMother {
    public static Employee create(
            EmployeeId id,
            EmployeeDni dni,
            EmployeeLegajo legajo,
            EmployeeCuil cuil,
            EmployeeName name,
            EmployeeLastname lastname,
            EmployeeAddress address,
            EmployeeGender gender,
            EmployeePhone phone,
            EmployeeStateEnum state
    ) {
        return new Employee(
                id,
                dni,
                legajo,
                cuil,
                gender,
                name,
                lastname,
                phone,
                state,
                address
        );
    }

    public static Employee fromRequest(RequestEmployeeCreate request) {
        return new Employee(
                EmployeeIdMother.create(request.id()),
                EmployeeDniMother.create(request.dni()),
                EmployeeLegajoMother.create(request.legajo()),
                EmployeeCuilMother.create(request.cuil()),
                EmployeeGenderMother.create(request.genderId()),
                EmployeeNameMother.create(request.name()),
                EmployeeLastnameMother.create(request.lastname()),
                EmployeePhoneMother.create(request.phone()),
                EmployeeStateMother.createFromCode(request.state()),
                EmployeeAddressMother.create(
                        request.streetName(),
                        request.streetNumber(),
                        request.flatNumber(),
                        request.localityId()
                )
        );
    }

    public static Employee random() {
        return create(
                EmployeeIdMother.random(),
                EmployeeDniMother.random(),
                EmployeeLegajoMother.random(),
                EmployeeCuilMother.random(),
                EmployeeNameMother.random(),
                EmployeeLastnameMother.random(),
                EmployeeAddressMother.random(),
                EmployeeGenderMother.random(),
                EmployeePhoneMother.random(),
                EmployeeStateMother.random()
        );
    }
}
