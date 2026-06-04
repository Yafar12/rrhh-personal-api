package gov.justucuman.personal_rrhh.person.infraestructure.input.controller.find;

import gov.justucuman.personal_rrhh.person.application.find.FindPersonQuery;
import gov.justucuman.personal_rrhh.person.application.find.FindPersonQueryHandler;
import gov.justucuman.personal_rrhh.person.application.find.PersonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class PersonGetController {
    private final FindPersonQueryHandler handler;

    public PersonGetController(FindPersonQueryHandler handler){
        this.handler = handler;
    }

    @GetMapping("/person/{id}")
    public ResponseEntity<PersonResponse> execute(@PathVariable String id){
        PersonResponse response = handler.handle(new FindPersonQuery(id));

        return ResponseEntity.ok(response);
    }
}
