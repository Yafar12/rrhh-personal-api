package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.shared.domain.ValueObjectsMother;

public final class EmployeeNameMother {
    public static EmployeeName create(String value){
        return new EmployeeName(value);
    }

    public static EmployeeName random(){
        return create(ValueObjectsMother.nameRandom());
    }
}
