package gov.justucuman.personal_rrhh.employee.application.create;

public record RequestEmployeeCreate(String id, String legajo,
                                    String state) {
    public RequestEmployeeCreate withId(String targetId) {
        return new RequestEmployeeCreate(
                targetId,
                legajo(),
                state()
        );
    }
}
