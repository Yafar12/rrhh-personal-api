package gov.justucuman.personal_rrhh.employee.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public final class Employee {
    private EmployeeId        id;
    private EmployeeDni       dni;
    private EmployeeLegajo    legajo;
    private EmployeeCuil      cuil;
    private EmployeeGender    genderId;
    private EmployeeName      name;
    private EmployeeLastname  lastname;
    private EmployeePhone     phone;
    private EmployeeStateEnum employeeState;
    private EmployeeAddress   address;
    private LocalDateTime     bornDate;
    private Photo             photoPath;

    public Employee(
            EmployeeId id,
            EmployeeDni dni,
            EmployeeLegajo legajo,
            EmployeeCuil cuil,
            EmployeeGender genderId,
            EmployeeName name,
            EmployeeLastname lastname,
            EmployeePhone phone,
            EmployeeStateEnum employeeState,
            EmployeeAddress address
    ) {
        this.id = id;
        this.dni = dni;
        this.legajo = legajo;
        this.cuil = cuil;
        this.genderId = genderId;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.employeeState = employeeState;
        this.address = address;
    }

    public EmployeeId getId() {
        return id;
    }

    public EmployeeLegajo getLegajo() {
        return legajo;
    }

    public EmployeeLastname getLastname() {
        return lastname;
    }

    public EmployeeName getName() {
        return name;
    }

    public EmployeeDni getDni() {
        return dni;
    }

    public EmployeeCuil getCuil() {
        return cuil;
    }

    public LocalDateTime getBornDate() {
        return bornDate;
    }

    public EmployeeGender getGenderId() {
        return genderId;
    }

    public EmployeeStateEnum getEmployeeState() {
        return employeeState;
    }

    public EmployeePhone getPhone() {
        return phone;
    }

    public EmployeeAddress getAddress() {
        return address;
    }

    public Photo getPhotoPath() {
        return photoPath;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(
                id,
                employee.id
        ) && Objects.equals(
                legajo,
                employee.legajo
        ) && Objects.equals(
                lastname,
                employee.lastname
        ) && Objects.equals(
                name,
                employee.name
        ) && Objects.equals(
                dni,
                employee.dni
        ) && Objects.equals(
                cuil,
                employee.cuil
        ) && Objects.equals(
                bornDate,
                employee.bornDate
        ) && Objects.equals(
                genderId,
                employee.genderId
        ) && employeeState == employee.employeeState && Objects.equals(
                phone,
                employee.phone
        ) && Objects.equals(
                address,
                employee.address
        ) && Objects.equals(
                photoPath,
                employee.photoPath
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                legajo,
                lastname,
                name,
                dni,
                cuil,
                bornDate,
                genderId,
                employeeState,
                phone,
                address,
                photoPath
        );
    }
}
