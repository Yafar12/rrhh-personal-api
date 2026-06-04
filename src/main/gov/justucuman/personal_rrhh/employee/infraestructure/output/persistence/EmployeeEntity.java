package gov.justucuman.personal_rrhh.employee.infraestructure.output.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
public class EmployeeEntity {
    @Id
    private UUID id;

    @Column(nullable = false, unique = true)
    private String legajo;

    @Column(name = "entry_date", nullable = false)
    private LocalDateTime entryDate;

    @Column(name = "person_id", nullable = false)
    private UUID personId;

    @Column(name = "employee_state", nullable = false)
    private String employeeState;

    @Column(name = "photo_path")
    private String photoPath;

    public EmployeeEntity(){}
}
