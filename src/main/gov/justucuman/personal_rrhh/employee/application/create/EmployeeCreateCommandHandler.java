package gov.justucuman.personal_rrhh.employee.application.create;

import gov.justucuman.personal_rrhh.shared.domain.Service;
import gov.justucuman.personal_rrhh.shared.domain.bus.command.CommandHandler;

@Service
public final class EmployeeCreateCommandHandler implements CommandHandler<EmployeeCreateCommand> {
    private final EmployeeCreator creator;

    public EmployeeCreateCommandHandler(EmployeeCreator creator){
        this.creator = creator;
    }

    @Override
    public void handle(EmployeeCreateCommand command){
        this.creator.create(command);
    }
}
