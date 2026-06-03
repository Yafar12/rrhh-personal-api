package gov.justucuman.personal_rrhh.person.application;

import java.time.LocalDate;

public record PersonCreateRequest(String id, String dni, String cuil,
                                  String name, String lastname, String gender,
                                  String phone, String streetName,
                                  Integer streetNumber, Integer flatNumber,
                                  String localityId, LocalDate bornDate) {
    public PersonCreateRequest withId(String targetId) {
        return new PersonCreateRequest(
                targetId,
                dni(),
                cuil(),
                name(),
                lastname(),
                gender(),
                phone(),
                streetName(),
                streetNumber(),
                flatNumber(),
                localityId(),
                bornDate()
        );
    }
}
