package dk.modulith.example.modulithTest.employee;

public record EmployeeDTO(long id, String fname, String lname, long departmentId) {
    public EmployeeDTO(long id, String fname, String lname, long departmentId) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.departmentId = departmentId;
    }
}
