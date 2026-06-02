package gov.justucuman.personal_rrhh.employee.infraestructure.input.controller.create;

import gov.justucuman.personal_rrhh.employee.application.create.EmployeeCreator;
import gov.justucuman.personal_rrhh.employee.application.create.RequestEmployeeCreate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class EmployeePutController {

    private final EmployeeCreator creator;

    public EmployeePutController(EmployeeCreator creator){
        this.creator = creator;
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<Void> execute(@PathVariable String id, @RequestBody
                                          RequestEmployeeCreate
                                          request){
        creator.create(request.withId(id));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
