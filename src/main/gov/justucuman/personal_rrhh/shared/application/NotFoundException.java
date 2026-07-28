package gov.justucuman.personal_rrhh.shared.application;

public abstract class NotFoundException extends RuntimeException {
    private final String field;
    private final String value;

    public NotFoundException(String field, String value) {
        super("");
        this.field = field;
        this.value = value;
    }

    public String field() {
        return field;
    }

    public String value() {
        return value;
    }

    public String toString() {
        return String.format("No se encontro un registro con %s: %s", field, value);
    }
}
