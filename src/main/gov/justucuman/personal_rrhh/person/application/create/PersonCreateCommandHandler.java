package gov.justucuman.personal_rrhh.person.application.create;

import gov.justucuman.personal_rrhh.shared.domain.Service;
import gov.justucuman.personal_rrhh.shared.domain.bus.command.CommandHandler;

@Service
public final class PersonCreateCommandHandler implements CommandHandler<PersonCreateCommand> {
    private final PersonCreator creator;

    public PersonCreateCommandHandler(PersonCreator creator){
        this.creator = creator;
    }

    public void handle(PersonCreateCommand command){
        creator.create(command);
    }
}
