package gov.justucuman.personal_rrhh.employee.application;

import gov.justucuman.personal_rrhh.employee.application.create.EmployeeCreateCommand;
import gov.justucuman.personal_rrhh.employee.application.create.EmployeeCreator;
import gov.justucuman.personal_rrhh.employee.domain.Employee;
import gov.justucuman.personal_rrhh.employee.domain.EmployeeMother;
import gov.justucuman.personal_rrhh.employee.domain.EmployeeRepository;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

final class EmployeeCreatorTest {
    @Test
    void save_a_valid_employee() {
        EmployeeRepository repository = mock(EmployeeRepository.class);
        EmployeeCreator    creator    = new EmployeeCreator(repository);

        EmployeeCreateCommand command = EmployeeCreateCommandMother.random();

        Employee employee = EmployeeMother.fromCommand(command);

        creator.create(command);

        verify(
                repository,
                times(1)
        ).save(employee);
    }
}