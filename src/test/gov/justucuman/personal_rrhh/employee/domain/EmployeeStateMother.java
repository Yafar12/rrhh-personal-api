package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.shared.domain.EmployeeValueObjectMother;

public final class EmployeeStateMother {

    public static EmployeeStateEnum create(EmployeeStateEnum value) {
        return value;
    }

    public static EmployeeStateEnum createFromCode(String value) {
        return EmployeeStateEnum.fromValue(value);
    }

    public static EmployeeStateEnum random() {
        return EmployeeValueObjectMother.enumRandom(EmployeeStateEnum.class);
    }
}