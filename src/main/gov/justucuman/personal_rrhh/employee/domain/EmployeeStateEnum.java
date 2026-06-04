package gov.justucuman.personal_rrhh.employee.domain;

public enum EmployeeStateEnum {
    REGISTRADO("REGISTRADO"),
    ACTIVO("ACTIVO"),
    BAJA("BAJA"),
    LICENCIA("LICENCIA");

    private final String code;

    EmployeeStateEnum(String code) {
        this.code = code;
    }

    public String code() {
        return code;
    }

    public static EmployeeStateEnum fromValue(String value) {
        for (EmployeeStateEnum state : EmployeeStateEnum.values()) {
            if (state.code.equalsIgnoreCase(value)) {
                return state;
            }
        }
        throw new IllegalArgumentException(value + ": No es un tipo de estado valido para el empleado");
    }
}