package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.shared.domain.ValueObjectsMother;

public abstract class EmployeeLegajoMother {
    public static EmployeeLegajo create(String value){
        return new EmployeeLegajo(value);
    }

    public static EmployeeLegajo random(){
        return create(ValueObjectsMother.legajoRandom());
    }
}
