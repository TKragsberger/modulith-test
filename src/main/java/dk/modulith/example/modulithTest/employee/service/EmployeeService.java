package dk.modulith.example.modulithTest.employee.service;

import dk.modulith.example.modulithTest.employee.EmployeeDTO;
import dk.modulith.example.modulithTest.employee.EmployeeInternalAPI;
import dk.modulith.example.modulithTest.employee.model.Employee;
import dk.modulith.example.modulithTest.employee.reposiroty.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService implements EmployeeInternalAPI {

    private final EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeDTO> getEmployees(long id) {
        return employeeRepository.findByDepartmentId(id);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployee(long id) {
        return employeeRepository.findById(id).orElse(null);
    }


}
