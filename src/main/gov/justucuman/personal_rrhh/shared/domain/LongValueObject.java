package gov.justucuman.personal_rrhh.shared.domain;

import java.util.Objects;

public abstract class LongValueObject {
    private Long value;

    public LongValueObject(Long value){
        this.value = value;
    }

    public Long value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LongValueObject that = (LongValueObject) o;
        return Objects.equals(
                value,
                that.value
        );
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
