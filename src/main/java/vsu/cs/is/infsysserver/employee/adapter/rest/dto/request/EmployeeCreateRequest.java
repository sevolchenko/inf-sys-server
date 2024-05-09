package vsu.cs.is.infsysserver.employee.adapter.rest.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeCreateRequest {
    @NotNull
    private String patronymic;
    private String post;
    private String academicTitle;
    private String academicDegree;
    private String experience;
    private String professionalExperience;
    private LocalDate dateOfBirth;
    @NotNull
    private String login;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;
    private String imageUrl;
    private String createdBy;
    private String createdDate;
    private String mainRole;
    private String plan;
    private boolean hasLessons;
}
