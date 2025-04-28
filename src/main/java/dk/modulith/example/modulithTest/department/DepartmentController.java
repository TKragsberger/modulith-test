package dk.modulith.example.modulithTest.department;

import dk.modulith.example.modulithTest.department.model.Department;
import dk.modulith.example.modulithTest.department.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/api/department")
@RequiredArgsConstructor
@Log4j2
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping("/")
    public ResponseEntity<String> createDepartment(@RequestBody Department department) {
        log.info("Creating department: {}", department);
        return ResponseEntity.ok(departmentService.createDepartment(department).toString());
    }


    @GetMapping("/{id}")
    public ResponseEntity<DepartmentDTO> getDepartment(@PathVariable long id) {
        return ResponseEntity.ok(departmentService.getDepartment(id));
    }
}
