package gov.justucuman.personal_rrhh.person.domain;

public record PersonAddress(String streetName, Integer streetNumber,
                            Integer flatNumber, LocalityId localityId) {
    public PersonAddress {
        if (streetName == null || streetName.isBlank()) {
            throw new IllegalArgumentException("El nombre de la calle no puede estar vacío");
        }
        if (streetNumber != null && streetNumber < 0) {
            throw new IllegalArgumentException("El número de calle no puede ser negativo");
        }
        if (localityId == null) {
            throw new IllegalArgumentException("La localidad es obligatoria");
        }
    }
}
