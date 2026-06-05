package gov.justucuman.personal_rrhh.employee.domain;

import java.util.Optional;

public interface EmployeeRepository {
    void save(Employee employee);
    Optional<Employee> search(String id);
    Boolean existsByLegajoAndIdNot(String legajo,String id);
}
