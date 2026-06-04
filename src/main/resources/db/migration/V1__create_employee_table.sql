CREATE TABLE employee (
    id UUID PRIMARY KEY,
    legajo VARCHAR(20) NOT NULL UNIQUE,
    entry_date DATE NOT NULL,
    person_id UUID NOT NULL,
    employee_state VARCHAR(30) NOT NULL,
    photo_path VARCHAR(255)
);