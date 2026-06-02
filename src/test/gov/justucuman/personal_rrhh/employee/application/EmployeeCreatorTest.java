package gov.justucuman.personal_rrhh.employee.application;

import gov.justucuman.personal_rrhh.employee.application.create.EmployeeCreator;
import gov.justucuman.personal_rrhh.employee.application.create.RequestEmployeeCreate;
import gov.justucuman.personal_rrhh.employee.domain.Employee;
import gov.justucuman.personal_rrhh.employee.domain.EmployeeMother;
import gov.justucuman.personal_rrhh.employee.domain.EmployeeRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

final class EmployeeCreatorTest {
    @Test
    void save_a_valid_employee(){
        EmployeeRepository repository = mock(EmployeeRepository.class);
        EmployeeCreator creator = new EmployeeCreator(repository);

        RequestEmployeeCreate request = RequestEmployeeCreateMother.random();

        Employee        employee = EmployeeMother.fromRequest(request);

        creator.create(request);

        verify(repository,times(1)).save(employee);
    }
}
