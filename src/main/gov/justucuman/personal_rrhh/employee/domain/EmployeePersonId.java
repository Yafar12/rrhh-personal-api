package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.shared.domain.Identifier;

public final class EmployeePersonId extends Identifier {
    public EmployeePersonId(String value){
        super(value);

        if(value == null || value.isBlank()){
            throw new IllegalArgumentException("El legajo es obligatorio");
        }
    }


}
