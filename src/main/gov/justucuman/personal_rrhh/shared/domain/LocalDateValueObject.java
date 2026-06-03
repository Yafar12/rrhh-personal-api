package gov.justucuman.personal_rrhh.shared.domain;

import java.time.LocalDate;
import java.time.Period;

public abstract class LocalDateValueObject {
    private final LocalDate value;

    public LocalDateValueObject(LocalDate value) {
        ensureIsValidBornDate(value);
        this.value = value;
    }

    public LocalDate value(){
        return value;
    }

    private void ensureIsValidBornDate(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("La fecha de nacimiento es obligatoria.");
        }

        if (date.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser una fecha futura.");
        }

        int age = Period.between(
                date,
                LocalDate.now()
        ).getYears();

        if (age < 16) {
            throw new IllegalArgumentException("La persona debe ser mayor de 16 años para formar parte del sistema.");
        }

        if (age > 100) {
            throw new IllegalArgumentException("La fecha de nacimiento ingresada no es válida para una persona activa.");
        }
    }
}
