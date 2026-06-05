package gov.justucuman.personal_rrhh.shared.application;

public abstract class DuplicateException extends RuntimeException{
    private final String field;
    private final String value;

    public DuplicateException(String field,String value){
        super("");
        this.field = field;
        this.value = value;
    }

    public String field(){
        return field;
    }

    public String value(){
        return value;
    }

    @Override
    public String toString(){
        return String.format("El %s %s ya se encuentra registrado por otro usuario",field,value);
    }
}
