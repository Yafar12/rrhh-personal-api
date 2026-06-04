package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.shared.domain.UuidMother;

public final class EmployeePersonIdMother {
    public static EmployeePersonId create(String value){
        return new EmployeePersonId(value);
    }

    public static EmployeePersonId random(){
        return create(UuidMother.random());
    }
}
