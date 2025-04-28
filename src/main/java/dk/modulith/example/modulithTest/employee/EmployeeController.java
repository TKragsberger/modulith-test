package dk.modulith.example.modulithTest.employee;

import dk.modulith.example.modulithTest.department.model.Department;
import dk.modulith.example.modulithTest.employee.model.Employee;
import dk.modulith.example.modulithTest.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
@Log4j2
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping("/")
    public ResponseEntity<String> createPerson(@RequestBody Employee employee) {
        log.info("Creating employee: {}", employee);
        return ResponseEntity.ok(employeeService.createEmployee(employee).toString());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getPersons(@PathVariable long id) {
        return ResponseEntity.ok(employeeService.getEmployee(id));
    }
}
