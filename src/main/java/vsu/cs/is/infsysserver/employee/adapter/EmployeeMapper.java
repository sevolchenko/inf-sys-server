package vsu.cs.is.infsysserver.employee.adapter;

import org.mapstruct.Mapper;
import vsu.cs.is.infsysserver.employee.adapter.jpa.entity.Employee;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.request.EmployeeCreateRequest;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.request.EmployeeUpdateRequest;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.response.EmployeeResponse;

@Mapper
public interface EmployeeMapper {
    Employee map(final EmployeeResponse employeeResponse);

    EmployeeResponse map(final Employee employee);

    Employee map(final EmployeeCreateRequest employeeCreateRequest);

    Employee map(final EmployeeUpdateRequest employeeUpdateRequest);
}
