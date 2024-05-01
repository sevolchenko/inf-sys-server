package vsu.cs.is.infsysserver.employee.adapter.rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.request.EmployeeCreateRequest;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.request.EmployeeUpdateRequest;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.response.EmployeeAdminResponse;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.response.EmployeeResponse;

import java.util.List;

@Tag(name = "Employee API", description = "API для работы с сотрудниками")
public interface EmployeeApi {
    ResponseEntity<List<EmployeeResponse>> getAllEmployees();

    ResponseEntity<EmployeeResponse> getEmployeeById(Long id);

    ResponseEntity<EmployeeAdminResponse> getEmployeeAdminById(Long id);

    ResponseEntity<EmployeeResponse> createEmployee(EmployeeCreateRequest employeeCreateRequest);

    ResponseEntity<EmployeeAdminResponse> updateEmployeeById(Long id, EmployeeUpdateRequest employeeUpdateRequest);

    ResponseEntity<EmployeeResponse> deleteEmployeeById(Long id);
}
