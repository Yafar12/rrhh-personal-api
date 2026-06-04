package gov.justucuman.personal_rrhh.person.infraestructure.output.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "person")
@Data
@AllArgsConstructor
public class PersonEntity {
    public PersonEntity(){}

    @Id
    private UUID id;

    @Column(nullable = false, unique = true)
    private String dni;

    @Column(nullable = false, unique = true)
    private String cuil;

    @Column(name = "street_name", nullable = false)
    private String streetName;

    @Column(name = "street_number", nullable = false)
    private Integer streetNumber;

    @Column(name = "flat_number")
    private Integer flatNumber;

    @Column(name = "locality_id", nullable = false)
    private UUID localityId;

    @Column(name = "gender_id", nullable = false)
    private UUID gender;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(nullable = false, unique = true)
    private String phone;

    @Column(name = "born_date", nullable = false)
    private LocalDate bornDate;
}
