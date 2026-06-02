package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.shared.domain.ValueObjectsMother;

public final class EmployeeDniMother {
    public static EmployeeDni create(String value){
        return new EmployeeDni(value);
    }

    public static EmployeeDni random(){
        return create(
                ValueObjectsMother.dniRandom());
    }
}
