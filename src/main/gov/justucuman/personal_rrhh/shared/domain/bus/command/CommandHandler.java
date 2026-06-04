package gov.justucuman.personal_rrhh.shared.domain.bus.command;

public interface CommandHandler<T extends Command>{
    void handle(T command);
}
