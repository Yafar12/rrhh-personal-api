package gov.justucuman.personal_rrhh.employee.infraestructure.input.controller.create;

import gov.justucuman.personal_rrhh.shared.infraestructure.input.controller.RequestTestCase;
import org.junit.jupiter.api.Test;


final class EmployeePutControllerTest extends RequestTestCase {

    String body = """
                  {
                  "id": "550e8400-e29b-41d4-a716-446655440000",
                  "legajo": "54",
                  "state": "ACTIVO",
                  }
                  """;

    @Test
    void create_a_valid_employee() throws Exception{
        assertRequestWithBody(
                "PUT",
                "/employee/550e8400-e29b-41d4-a716-446655440000",
                body,
                201
        );

    }
}