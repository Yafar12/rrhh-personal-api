package gov.justucuman.personal_rrhh.person.application.find;


import gov.justucuman.personal_rrhh.shared.domain.Service;
import gov.justucuman.personal_rrhh.shared.domain.bus.query.QueryHandler;

@Service
public final class FindPersonQueryHandler implements QueryHandler<FindPersonQuery, PersonResponse> {

    private final PersonFinder finder;

    public FindPersonQueryHandler(PersonFinder finder) {
        this.finder = finder;
    }

    @Override
    public PersonResponse handle(FindPersonQuery query) {
        return finder.find(query.id());
    }
}
