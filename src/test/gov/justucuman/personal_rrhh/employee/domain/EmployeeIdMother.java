package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.shared.domain.UuidMother;

public final class EmployeeIdMother {
    public static EmployeeId create(String value){
        return new EmployeeId(value);
    }

    public static EmployeeId random(){
        return create(UuidMother.random());
    }
}
