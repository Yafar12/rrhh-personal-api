package gov.justucuman.personal_rrhh.employee.infraestructure.input.controller.create;

import gov.justucuman.personal_rrhh.employee.infraestructure.input.controller.RequestTestCase;
import org.junit.jupiter.api.Test;


final class EmployeePutControllerTest extends RequestTestCase {

    String body = """
                  {
                  "id": "550e8400-e29b-41d4-a716-446655440000",
                  "dni": "44028109",
                  "legajo": "54",
                  "cuil": "20-6516565-2",
                  "genderId": "550e8400-e29b-41d4-a716-446655440000",
                  "name": "lkasd",
                  "lastname": "sadf",
                  "phone": "5+651651651",
                  "state": "ACTIVO",
                  "streetName": "adf",
                  "streetNumber": 5,
                  "flatNumber": 2,
                  "localityId": "550e8400-e29b-41d4-a716-446655440000"
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