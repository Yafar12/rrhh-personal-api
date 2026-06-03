package gov.justucuman.personal_rrhh.employee.domain;

import gov.justucuman.personal_rrhh.person.domain.*;

import java.time.LocalDate;
import java.util.Objects;

public final class Employee {
    private EmployeeId        id;
    private EmployeeLegajo    legajo;
    private EmployeeStateEnum employeeState;
    private LocalDate entryDate;
    private Photo photoPath;


    public LocalDate getEntryDate() {
        return entryDate;
    }

    public Employee(
            EmployeeId id,
            EmployeeLegajo legajo,
            LocalDate entryDate,
            EmployeeStateEnum employeeState
    ) {
        this.id = id;
        this.legajo = legajo;
        this.employeeState = employeeState;
        this.entryDate = entryDate;
    }

    public EmployeeId getId() {
        return id;
    }

    public EmployeeLegajo getLegajo() {
        return legajo;
    }

    public EmployeeStateEnum getEmployeeState() {
        return employeeState;
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
        ) && employeeState == employee.employeeState && Objects.equals(
                photoPath,
                employee.photoPath
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                legajo,
                employeeState,
                photoPath
        );
    }
}
