package gov.justucuman.personal_rrhh.employee.domain;

public record EmployeeAddress(String streetName, Integer streetNumber,
                              Integer flatNumber, String localityId) {
    public EmployeeAddress {
        if (streetName == null || streetName.isBlank()) {
            throw new IllegalArgumentException("El nombre de la calle no puede estar vacío");
        }
        if (streetNumber != null && streetNumber < 0) {
            throw new IllegalArgumentException("El número de calle no puede ser negativo");
        }
        if (localityId == null || localityId.isBlank()) {
            throw new IllegalArgumentException("La localidad es obligatoria");
        }
    }
}
