package gov.justucuman.personal_rrhh.employee.infraestructure.output.persistence;

import gov.justucuman.personal_rrhh.employee.infraestructure.output.memory.InMemoryRepository;
import org.junit.jupiter.api.BeforeEach;

public abstract class InMemoryUnitTestCase {

    protected InMemoryRepository repository;

    @BeforeEach
    protected void setUp() {
        this.repository = new InMemoryRepository();
    }
}