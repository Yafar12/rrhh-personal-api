package gov.justucuman.personal_rrhh.person.infraestructure.input.controller.create;

import gov.justucuman.personal_rrhh.shared.infraestructure.input.controller.RequestTestCase;
import org.junit.jupiter.api.Test;

final class PersonPutControllerTest extends RequestTestCase {
    private String body = """
                      {
                      "dni": "40123456",
                      "cuil": "20401234567",
                      "name": "Alejandro",
                      "lastname": "Ahmad",
                      "gender": "550e8400-e29b-41d4-a716-446655440000", 
                      "streetName": "Av. Aconquija",
                      "streetNumber": 1200,
                      "flatNumber": 3,
                      "localityId": "550e8400-e29b-41d4-a716-446655440000",
                      "bornDate": "1998-05-15",
                      "phone": "3815555555"
                      }
                      """;

    @Test
    void create_a_valid_person() throws Exception{
        assertRequestWithBody("PUT","/person/550e8400-e29b-41d4-a716-446655440000",body,201);
    }
}
