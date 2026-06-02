package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.shared.domain.ValueObjectsMother;

public final class EmployeeGenderMother {
    public static EmployeeGender create(String value) {
        return new EmployeeGender(value);
    }

    public static EmployeeGender random() {
        return create(ValueObjectsMother.uuidRandom());
    }
}
