package gov.justucuman.personal_rrhh.employee.infraestructure.output.persistence;

import gov.justucuman.personal_rrhh.employee.domain.Employee;
import gov.justucuman.personal_rrhh.employee.domain.EmployeeMother;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

final class InMemoryRepositoryTest extends InMemoryUnitTestCase {
    @Test
    void save_a_exist_employee(){
        Employee employee = EmployeeMother.random();

        repository.save(employee);
    }

    @Test
    void search_an_existing_employee(){
        Employee employee = EmployeeMother.random();

        repository.save(employee);

        assertEquals(Optional.of(employee),repository.search(employee.getId().value()));
    }

    @Test
    void non_existing_employee(){
        assertFalse(repository.search("550e8400-e29b-41d4-a716-446655440000").isPresent());
    }

    @Test
    void non_save_a_invalid_employee(){
        Employee employee = null;

        assertThrows(NullPointerException.class, () -> {repository.save(employee);});
    }
}
