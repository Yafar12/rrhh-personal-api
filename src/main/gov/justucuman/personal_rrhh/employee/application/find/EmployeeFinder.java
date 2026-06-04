package gov.justucuman.personal_rrhh.employee.application.find;

import gov.justucuman.personal_rrhh.employee.domain.EmployeeRepository;
import gov.justucuman.personal_rrhh.shared.domain.Service;

@Service
public final class EmployeeFinder {
    private final EmployeeRepository repository;

    public EmployeeFinder(EmployeeRepository repository){
        this.repository = repository;
    }

    public EmployeeResponse find(String id){
        return repository.search(id).map(employee -> new EmployeeResponse(
                employee.getId().value(),
                employee.getLegajo().value(),
                employee.getEntryDate().toString(),
                employee.getEmployeeState().code(),
                employee.getPersonId().value()
        )).orElseThrow(() -> new EmployeeNotFoundException(("No se encontro el empleado: " + id)));
    }
}
