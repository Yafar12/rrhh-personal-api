package gov.justucuman.personal_rrhh.employee.infraestructure.input.controller.health_check;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public final class HealthCheckGetController {

    @GetMapping("/health-check")
    public Map<String,String> execute(){
        Map<String,String> status = new HashMap<>();

        status.put("status","ok");

        return status;
    }
}
