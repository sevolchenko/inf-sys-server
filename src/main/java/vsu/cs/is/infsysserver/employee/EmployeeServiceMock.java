package vsu.cs.is.infsysserver.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.request.EmployeeCreateRequest;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.request.EmployeeUpdateRequest;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.response.EmployeeResponse;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceMock implements EmployeeService {
    @Override
    public List<EmployeeResponse> getAllEmployees() {
        return List.of(
                EmployeeResponse.builder()
                        .id(1L)
                        .email("example@example1.com")
                        .academicDegree("Кандидат наук")
                        .academicTitle("Доцент ")
                        .experience("20")
                        .professionalExperience("18")
                        .firstName("Иванов")
                        .lastName("Иван")
                        .patronymic("Иванович")
                        .mainRole("USER")
                        .build(),

                EmployeeResponse.builder()
                        .id(2L)
                        .email("example@example2.com")
                        .academicDegree("Кандидат наук")
                        .academicTitle("без ученого звания")
                        .experience("10")
                        .professionalExperience("10")
                        .firstName("Петров")
                        .lastName("Петр")
                        .patronymic("Петрович")
                        .mainRole("USER")
                        .build());
    }

    @Override
    public EmployeeResponse getEmployeeById(long id) {
        return EmployeeResponse.builder()
                .id(1L)
                .email("example@example.com")
                .academicDegree("Кандидат наук")
                .academicTitle("Доцент ")
                .experience("20")
                .professionalExperience("18")
                .firstName("Иванов")
                .lastName("Иван")
                .patronymic("Иванович")
                .mainRole("USER")
                .build();
    }

    @Override
    public EmployeeResponse createEmployee(EmployeeCreateRequest employeeCreateRequest) {
        return EmployeeResponse.builder()
                .id(1L)
                .email("example@example.com")
                .academicDegree("Кандидат наук")
                .academicTitle("Доцент ")
                .experience("20")
                .professionalExperience("18")
                .firstName("Иванов")
                .lastName("Иван")
                .patronymic("Иванович")
                .mainRole("USER")
                .build();
    }

    @Override
    public EmployeeResponse updateEmployeeById(long id, EmployeeUpdateRequest employeeUpdateRequest) {
        return EmployeeResponse.builder()
                .id(1L)
                .email("example@example.com")
                .academicDegree("Кандидат наук")
                .academicTitle("Доцент ")
                .experience("20")
                .professionalExperience("18")
                .firstName("Иванов")
                .lastName("Иван")
                .patronymic("Иванович")
                .mainRole("USER")
                .build();
    }

    @Override
    public void deleteEmployeeById(long id) {
    }
}
