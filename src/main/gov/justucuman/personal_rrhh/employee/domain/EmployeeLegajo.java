package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.shared.domain.IntegerValueObject;
import gov.justucuman.personal_rrhh.shared.domain.StringValueObject;

public final class EmployeeLegajo extends StringValueObject {
    public EmployeeLegajo(String value){
        super(value);

        if(value == null || value.isBlank()){
            throw new IllegalArgumentException("El legajo es obligatorio");
        }
    }
}
