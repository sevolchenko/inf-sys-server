package vsu.cs.is.infsysserver.employee.adapter.rest.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeeUpdateRequest {
    private Long id;
    private String patronymic;
    private String post;
    private String academicTitle;
    private String academicDegree;
    private String experience;
    private String professionalExperience;
    private LocalDate dateOfBirth;
    private String login;
    private String firstName;
    private String lastName;
    private String email;
    private String imageUrl;
    private String createdBy;
    private String createdDate;
    private String mainRole;
    private String plan;
    private boolean hasLessons;
}
