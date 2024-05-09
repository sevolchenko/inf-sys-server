package vsu.cs.is.infsysserver.employee.adapter.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vsu.cs.is.infsysserver.employee.EmployeeServiceImplementation;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.request.EmployeeCreateRequest;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.request.EmployeeUpdateRequest;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.response.EmployeeAdminResponse;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.response.EmployeeResponse;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
@CrossOrigin
public class EmployeeController implements EmployeeApi {
    private final EmployeeServiceImplementation employeeService;

    @Override
    @GetMapping
    public ResponseEntity<List<EmployeeResponse>> getAllEmployees() {
        return ok(employeeService.getAllEmployees());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeById(@PathVariable Long id) {
        return ok(employeeService.getEmployeeById(id));
    }

    @Override
    @GetMapping("/admin/{id}")
    public ResponseEntity<EmployeeAdminResponse> getAdminEmployeeById(@PathVariable Long id) {
        return ok(employeeService.getEmployeeAdminById(id));
    }

    @Override
    @GetMapping("/admin/{id}")
    public ResponseEntity<EmployeeAdminResponse> getEmployeeAdminById(@PathVariable Long id) {
        return ok(employeeService.getEmployeeAdminById(id));
    }

    @Override
    @PostMapping
    public ResponseEntity<EmployeeResponse> createEmployee(@RequestBody EmployeeCreateRequest employeeCreateRequest) {
        return ok(employeeService.createEmployee(employeeCreateRequest));
    }

    @Override
    @PatchMapping("/{id}")
    public ResponseEntity<EmployeeAdminResponse> updateEmployeeById(@PathVariable Long id,
                                                                    @RequestBody EmployeeUpdateRequest employeeUpdateRequest) {
        return ok(employeeService.updateEmployeeById(id, employeeUpdateRequest));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<EmployeeResponse> deleteEmployeeById(@PathVariable Long id) {
        employeeService.deleteEmployeeById(id);
        return ok().build();
    }
}
