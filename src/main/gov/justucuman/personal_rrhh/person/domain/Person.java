package gov.justucuman.personal_rrhh.person.domain;

import java.time.LocalDate;

public final class Person {
    private PersonId id;
    private PersonDni dni;
    private PersonCuil     cuil;
    private PersonGender   genderId;
    private PersonName     name;
    private PersonLastname lastname;
    private PersonAddress  address;
    private PersonBornDate  bornDate;
    private PersonPhone    phone;

    public Person(
            PersonId id,
            PersonDni dni,
            PersonCuil cuil,
            PersonGender genderId,
            PersonName name,
            PersonLastname lastname,
            PersonAddress address,
            PersonBornDate bornDate,
            PersonPhone phone
    ) {
        this.id       = id;
        this.dni      = dni;
        this.cuil     = cuil;
        this.genderId = genderId;
        this.name     = name;
        this.lastname = lastname;
        this.address  = address;
        this.bornDate = bornDate;
        this.phone    = phone;
    }

    public PersonId getId() {
        return id;
    }

    public PersonLastname getLastname() {
        return lastname;
    }

    public PersonName getName() {
        return name;
    }

    public PersonDni getDni() {
        return dni;
    }

    public PersonCuil getCuil() {
        return cuil;
    }

    public PersonBornDate getBornDate() {
        return bornDate;
    }

    public PersonGender getGenderId() {
        return genderId;
    }

    public PersonPhone getPhone() {
        return phone;
    }

    public PersonAddress getAddress() {
        return address;
    }


}
