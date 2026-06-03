package gov.justucuman.personal_rrhh.employee.infraestructure.input.controller.health_check;

import gov.justucuman.personal_rrhh.shared.infraestructure.input.controller.RequestTestCase;
import org.junit.jupiter.api.Test;


final class HealthCheckGetControllerTest extends RequestTestCase {
    @Test
    void health_check_is_working() throws Exception{
        assertResponse("/health-check", 200, "{\"status\":\"ok\"}");
    }
}