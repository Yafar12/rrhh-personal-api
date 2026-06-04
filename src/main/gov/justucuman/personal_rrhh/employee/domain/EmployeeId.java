package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.shared.domain.Identifier;

public final class EmployeeId extends Identifier {
    public EmployeeId(String value){
        super(value);
        if(value == null || value.isBlank()){
            throw new IllegalArgumentException("El id es obligatorio");
        }
    }
}
