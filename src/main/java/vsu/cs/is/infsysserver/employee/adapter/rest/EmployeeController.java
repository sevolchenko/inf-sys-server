package vsu.cs.is.infsysserver.employee.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vsu.cs.is.infsysserver.employee.EmployeeService;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.request.EmployeeCreateRequest;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.request.EmployeeUpdateRequest;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.response.EmployeeAdminResponse;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.response.EmployeeResponse;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController implements EmployeeApi{
    private final EmployeeService employeeService;

    @Override
    @GetMapping
    public ResponseEntity<List<EmployeeResponse>> getAllEmployees() {
        return null;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeById(@PathVariable Long id) {
        return null;
    }

    @Override
    @GetMapping("/admin/{id}")
    public ResponseEntity<EmployeeAdminResponse> getEmployeeAdminById(@PathVariable Long id) {
        return null;
    }

    @Override
    @PostMapping
    public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody EmployeeCreateRequest employeeCreateRequest) {
        return null;
    }

    @Override
    @PatchMapping("/{id}")
    public ResponseEntity<EmployeeAdminResponse> updateEmployeeById(@PathVariable Long id, @RequestBody EmployeeUpdateRequest employeeUpdateRequest) {
        return null;
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<EmployeeResponse> deleteEmployeeById(@PathVariable Long id) {
        return null;
    }
}
