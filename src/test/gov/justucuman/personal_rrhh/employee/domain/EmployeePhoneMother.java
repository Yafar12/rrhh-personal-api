package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.shared.domain.ValueObjectsMother;

public final class EmployeePhoneMother {
    public static EmployeePhone create(String value){
        return new EmployeePhone(value);
    }

    public static EmployeePhone random(){
        return create(ValueObjectsMother.phoneRandom());
    }
}
