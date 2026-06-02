package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.shared.domain.ValueObjectsMother;

public final class EmployeeAddressMother {
    public static EmployeeAddress create(
            String streetName,
            Integer streetNumber,
            Integer flatNumber,
            String localityId
    ) {
        return new EmployeeAddress(
                streetName,
                streetNumber,
                flatNumber,
                localityId
        );
    }

    public static EmployeeAddress random() {
        return create(
                ValueObjectsMother.streetNameRandom(),
                ValueObjectsMother.streetNumberRandom(),
                ValueObjectsMother.flatNumberRandom(),
                ValueObjectsMother.localityIdRandom()
        );
    }
}
