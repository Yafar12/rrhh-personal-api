package gov.justucuman.personal_rrhh.shared.domain;

import net.datafaker.Faker;

import java.util.Locale;

public abstract class EmployeeValueObjectMother {
    private static final Faker faker = new Faker(new Locale(
            "es",
            "AR"
    ));

    public static String legajoRandom(){
        return faker.number().digits(5);
    }

    public static <T extends Enum<?>> T enumRandom(Class<T> enumClass){
        T[] values = enumClass.getEnumConstants();
        int randomIndex = faker.number().numberBetween(0,values.length);
        return values[randomIndex];
    }
}
