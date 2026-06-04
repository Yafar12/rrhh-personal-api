package gov.justucuman.personal_rrhh.employee.infraestructure.input.controller.find;

import gov.justucuman.personal_rrhh.employee.application.find.EmployeeResponse;
import gov.justucuman.personal_rrhh.employee.application.find.FindEmployeeQuery;
import gov.justucuman.personal_rrhh.employee.application.find.FindEmployeeQueryHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class EmployeeGetController {
    private final FindEmployeeQueryHandler handler;

    public EmployeeGetController(FindEmployeeQueryHandler handler){
        this.handler = handler;
    }


    @GetMapping("/employee/{id}")
    public ResponseEntity<EmployeeResponse> execute(@PathVariable String id){
        EmployeeResponse response = handler.handle(new FindEmployeeQuery(id));
        return ResponseEntity.ok(response);
    }
}
