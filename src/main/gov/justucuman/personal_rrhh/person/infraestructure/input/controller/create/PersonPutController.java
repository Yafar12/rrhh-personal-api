package gov.justucuman.personal_rrhh.person.infraestructure.input.controller.create;

import gov.justucuman.personal_rrhh.person.application.PersonCreateRequest;
import gov.justucuman.personal_rrhh.person.application.PersonCreator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class PersonPutController {
    private final PersonCreator creator;

    public PersonPutController(PersonCreator creator){
        this.creator = creator;
    }

    @PutMapping("/person/{id}")
    public ResponseEntity<Void> execute(@PathVariable String id, @RequestBody PersonCreateRequest request){
        creator.create(request.withId(id));

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
