package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.shared.domain.ValueObjectsMother;

public final class EmployeeLocalityIdMother {
    public static EmployeeLocalityId create(String value) {
        return new EmployeeLocalityId(value);
    }

    public static EmployeeLocalityId random() {
        return create(ValueObjectsMother.localityIdRandom());
    }
}
