package gov.justucuman.personal_rrhh.employee.application.create;

public record RequestEmployeeCreate(String id, String legajo, String name,
                                    String lastname, String dni, String cuil,
                                    String genderId, String phone,
                                    String streetName, Integer streetNumber,
                                    Integer flatNumber, String localityId,
                                    String state) {
    public RequestEmployeeCreate withId(String targetId) {
        return new RequestEmployeeCreate(
                targetId,
                legajo(),
                name(),
                lastname(),
                dni(),
                cuil(),
                genderId(),
                phone(),
                streetName(),
                streetNumber(),
                flatNumber(),
                localityId(),
                state()
        );
    }
}
