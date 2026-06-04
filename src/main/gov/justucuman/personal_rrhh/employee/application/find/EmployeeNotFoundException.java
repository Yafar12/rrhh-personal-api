package gov.justucuman.personal_rrhh.employee.application.find;

public final class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String message){
        super(message);
    }
}
