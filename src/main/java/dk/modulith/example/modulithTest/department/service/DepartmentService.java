package dk.modulith.example.modulithTest.department.service;

import dk.modulith.example.modulithTest.department.DepartmentDTO;
import dk.modulith.example.modulithTest.department.model.Department;
import dk.modulith.example.modulithTest.department.repository.DepartmentRepository;
import dk.modulith.example.modulithTest.employee.EmployeeDTO;
import dk.modulith.example.modulithTest.employee.EmployeeInternalAPI;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;
    private final EmployeeInternalAPI employeeInternalAPI;

    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public DepartmentDTO getDepartment(long id){
        DepartmentDTO departmentDTO = departmentRepository.findDepartmentDTOById(id);
        List<EmployeeDTO> employeeDTOList = employeeInternalAPI.getEmployees(id);
        departmentDTO.employees().addAll(employeeDTOList);
        return departmentDTO;
    }
}
