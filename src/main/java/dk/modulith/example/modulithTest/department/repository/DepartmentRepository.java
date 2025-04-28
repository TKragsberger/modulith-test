package dk.modulith.example.modulithTest.department.repository;

import dk.modulith.example.modulithTest.department.DepartmentDTO;
import dk.modulith.example.modulithTest.department.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Query("""
    SELECT new dk.modulith.example.modulithTest.department.DepartmentDTO(d.id, d.name)
    FROM Department d
    WHERE d.id = :id
    """)
    DepartmentDTO findDepartmentDTOById(Long id);
}
