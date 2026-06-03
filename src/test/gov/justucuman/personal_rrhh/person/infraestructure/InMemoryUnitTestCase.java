package gov.justucuman.personal_rrhh.person.infraestructure;

import gov.justucuman.personal_rrhh.person.infraestructure.output.persistence.InMemoryPersonRepository;
import org.junit.jupiter.api.BeforeEach;

public abstract class InMemoryUnitTestCase {

    protected InMemoryPersonRepository repository;

    @BeforeEach
    protected void setUp() {
        this.repository = new InMemoryPersonRepository();
    }
}