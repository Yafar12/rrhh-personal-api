package gov.justucuman.personal_rrhh.employee.infraestructure.output.create;

import gov.justucuman.personal_rrhh.employee.domain.Employee;
import gov.justucuman.personal_rrhh.employee.domain.EmployeeRepository;
import gov.justucuman.personal_rrhh.shared.domain.Service;
import org.graalvm.collections.EconomicMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public final class InMemoryRepository implements EmployeeRepository {
    Map<String, Employee> employees = new HashMap<>();

    @Override
    public void save(Employee employee){
        employees.put(employee.getId().value(),employee);
    }

    @Override
    public Optional<Employee> search(String id){
        return Optional.ofNullable(employees.get(id));
    }
}
