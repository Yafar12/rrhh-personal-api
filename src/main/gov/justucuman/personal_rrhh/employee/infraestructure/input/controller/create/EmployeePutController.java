package gov.justucuman.personal_rrhh.employee.infraestructure.input.controller.create;

import gov.justucuman.personal_rrhh.employee.application.create.EmployeeCreateCommand;
import gov.justucuman.personal_rrhh.employee.application.create.EmployeeCreateCommandHandler;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class EmployeePutController {

    private final EmployeeCreateCommandHandler handler;

    public EmployeePutController(EmployeeCreateCommandHandler handler){
        this.handler = handler;
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<Void> execute(@PathVariable String id,@Valid @RequestBody
                                          EmployeeCreateDto
                                          request){
        EmployeeCreateCommand command = new EmployeeCreateCommand(
                id,
                request.legajo(),
                request.state(),
                request.personId()
        );

        handler.handle(command);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
