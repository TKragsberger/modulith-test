package dk.modulith.example.modulithTest.employee.reposiroty;

import dk.modulith.example.modulithTest.employee.EmployeeDTO;
import dk.modulith.example.modulithTest.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<EmployeeDTO> findByDepartmentId(Long deparmentId);

}
