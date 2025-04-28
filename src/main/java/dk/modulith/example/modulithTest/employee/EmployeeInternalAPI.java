package dk.modulith.example.modulithTest.employee;

import dk.modulith.example.modulithTest.employee.model.Employee;

import java.util.List;

public interface EmployeeInternalAPI {
    List<EmployeeDTO> getEmployees(long id);
}
