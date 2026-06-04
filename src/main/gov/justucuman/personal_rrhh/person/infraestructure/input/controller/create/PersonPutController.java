package gov.justucuman.personal_rrhh.person.infraestructure.input.controller.create;

import gov.justucuman.personal_rrhh.person.application.create.PersonCreateCommand;
import gov.justucuman.personal_rrhh.person.application.create.PersonCreateCommandHandler;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public final class PersonPutController {
    private final PersonCreateCommandHandler handler;

    public PersonPutController(PersonCreateCommandHandler handler){
        this.handler = handler;
    }

    @PutMapping("/person/{id}")
    public ResponseEntity<Void> execute(@PathVariable String id,@Valid @RequestBody PersonDto dto){
        PersonCreateCommand command = new PersonCreateCommand(
                id,
                dto.dni(),
                dto.cuil(),
                dto.name(),
                dto.lastname(),
                dto.gender(),
                dto.streetName(),
                dto.streetNumber(),
                dto.flatNumber(),
                dto.localityId(),
                dto.phone(),
                dto.bornDate()
        );

        handler.handle(command);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
