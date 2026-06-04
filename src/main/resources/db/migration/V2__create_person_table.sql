CREATE TABLE rrhh.person
(
    id            UUID PRIMARY KEY,
    dni           VARCHAR(10)  NOT NULL UNIQUE,
    cuil          VARCHAR(15)  NOT NULL UNIQUE,
    name          VARCHAR(100) NOT NULL,
    lastname      VARCHAR(100) NOT NULL,
    gender_id     UUID         NOT NULL,
    born_date     DATE         NOT NULL,
    phone         VARCHAR(30)  NOT NULL,
    street_name   VARCHAR(150) NOT NULL,
    street_number INT          NOT NULL,
    flat_number   INT,
    locality_id   UUID         NOT NULL
);