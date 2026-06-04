package gov.justucuman.personal_rrhh.person.application.find;

import gov.justucuman.personal_rrhh.shared.domain.bus.query.Response;

public record PersonResponse(
        String id,
        String dni,
        String cuil,
        String name,
        String lastname,
        String bornDate,
        String genderId,
        String streetName,
        Integer streetNumber,
        Integer flatNumber,
        String localityId,
        String phone
) implements Response {}
