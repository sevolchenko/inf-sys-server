package vsu.cs.is.infsysserver.employee.adapter.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import vsu.cs.is.infsysserver.employee.adapter.jpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
