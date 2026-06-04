package gov.justucuman.personal_rrhh.employee.application.find;

import gov.justucuman.personal_rrhh.shared.domain.Service;
import gov.justucuman.personal_rrhh.shared.domain.bus.query.QueryHandler;

@Service
public final class FindEmployeeQueryHandler implements QueryHandler<FindEmployeeQuery,EmployeeResponse> {
    private final EmployeeFinder finder;

    public FindEmployeeQueryHandler(EmployeeFinder finder){
        this.finder = finder;
    }

    @Override
    public EmployeeResponse handle(FindEmployeeQuery query){
        return finder.find(query.id());
    }
}
