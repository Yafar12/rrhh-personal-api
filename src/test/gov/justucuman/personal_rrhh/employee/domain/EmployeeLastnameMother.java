package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.shared.domain.ValueObjectsMother;

public final class EmployeeLastnameMother {
    public static EmployeeLastname create(String value){
        return new EmployeeLastname(value);
    }

    public static EmployeeLastname random(){
        return create(ValueObjectsMother.lastnameRandom());
    }
}
