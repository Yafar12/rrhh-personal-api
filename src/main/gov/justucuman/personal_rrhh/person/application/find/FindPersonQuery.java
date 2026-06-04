package gov.justucuman.personal_rrhh.person.application.find;

import gov.justucuman.personal_rrhh.shared.domain.bus.query.Query;

public record FindPersonQuery(String id) implements Query {}
