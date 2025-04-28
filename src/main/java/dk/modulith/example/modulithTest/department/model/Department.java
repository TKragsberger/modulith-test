package dk.modulith.example.modulithTest.department.model;

import dk.modulith.example.modulithTest.employee.EmployeeDTO;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
