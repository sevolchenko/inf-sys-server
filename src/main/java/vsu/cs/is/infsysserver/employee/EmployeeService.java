package vsu.cs.is.infsysserver.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vsu.cs.is.infsysserver.employee.adapter.EmployeeMapper;
import vsu.cs.is.infsysserver.employee.adapter.jpa.EmployeeRepository;
import vsu.cs.is.infsysserver.employee.adapter.jpa.entity.Employee;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.request.EmployeeCreateRequest;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.request.EmployeeUpdateRequest;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public List<Employee> getAllEmployeesMock() {
        return new ArrayList<>();
    }

    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id).orElseThrow();
    }

    public Employee createEmployee(EmployeeCreateRequest employeeCreateRequest) {
        return employeeRepository.save(employeeMapper.map(employeeCreateRequest));
    }

    public Employee updateEmployee(long id, EmployeeUpdateRequest employeeUpdateRequest) {
        return null;
    }

    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }
}
