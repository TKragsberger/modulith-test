package dk.modulith.example.modulithTest.department;

import dk.modulith.example.modulithTest.employee.EmployeeDTO;

import java.util.ArrayList;
import java.util.List;


public record DepartmentDTO(long id, String name, List<EmployeeDTO> employees) {
    public DepartmentDTO(long id, String name){
        this(id, name, new ArrayList<>());
    }
}

