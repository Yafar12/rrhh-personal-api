package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.shared.domain.ValueObjectsMother;

public final class EmployeeCuilMother {
    public static EmployeeCuil create(String value) {
        return new EmployeeCuil(value);
    }

    public static EmployeeCuil random() {
        return create(ValueObjectsMother.cuilRandom());
    }
}
