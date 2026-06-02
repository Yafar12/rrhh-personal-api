package gov.justucuman.personal_rrhh.shared.domain;

import net.datafaker.Faker;

import java.util.Locale;
import java.util.UUID;

public abstract class ValueObjectsMother {
    private static final Faker faker = new Faker(new Locale("es","AR"));

    public static String uuidRandom(){
        return UUID.randomUUID().toString();
    }

    public static String dniRandom(){
        return faker.idNumber().valid();
    }

    public static String legajoRandom(){
        return faker.number().digits(5);
    }

    public static String nameRandom(){
        return faker.name().firstName();
    }

    public static String lastnameRandom(){
        return faker.name().lastName();
    }

    public static String cuilRandom(){
        return faker.expression("#{number.number_between '20','30'}-#{number.digits '8'}-#{number.digits '1'}");
    }

    public static String phoneRandom(){
        return faker.phoneNumber().cellPhone();
    }

    public static String streetNameRandom(){
        return faker.address().streetName();
    }

    public static Integer streetNumberRandom(){
        return faker.number().numberBetween(1,5001);
    }

    public static Integer flatNumberRandom(){
        return faker.number().numberBetween(1,20);
    }

    public static String localityIdRandom(){
        return faker.locality().displayName();
    }

    public static <T extends Enum<?>> T enumRandom(Class<T> enumClass){
        T[] values = enumClass.getEnumConstants();
        int randomIndex = faker.number().numberBetween(0,values.length);
        return values[randomIndex];
    }
}
