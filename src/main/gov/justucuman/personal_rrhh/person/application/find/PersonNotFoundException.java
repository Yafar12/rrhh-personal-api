package gov.justucuman.personal_rrhh.person.application.find;

public final class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException(String message){
        super(message);
    }
}
