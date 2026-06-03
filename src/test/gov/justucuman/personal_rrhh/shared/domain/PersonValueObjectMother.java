package gov.justucuman.personal_rrhh.shared.domain;

import net.datafaker.Faker;

import java.time.LocalDate;
import java.util.Locale;

public abstract class PersonValueObjectMother {
    private static final Faker faker = new Faker(new Locale(
            "es",
            "AR"
    ));

    public static String dniRandom() {
        return faker.number().digits(8);
    }

    public static String nameRandom() {
        return faker.name().firstName();
    }

    public static String cuilRandom() {
        return faker.expression("#{number.number_between '20','30'}#{number.digits '8'}#{number.digits '1'}");
    }

    public static String lastnameRandom() {
        return faker.name().lastName();
    }

    public static String phoneRandom() {
        return faker.expression("#{number.digits '3'}#{number.digits '7'}");
    }

    public static String streetNameRandom() {
        return faker.address().streetName();
    }

    public static Integer streetNumberRandom() {
        return faker.number()
                    .numberBetween(
                            1,
                            5001
                    );
    }

    public static Integer flatNumberRandom() {
        return faker.number()
                    .numberBetween(
                            1,
                            20
                    );
    }

    public static LocalDate bornDateRandom(){
        return faker.timeAndDate().birthday(18,65);
    }
}
