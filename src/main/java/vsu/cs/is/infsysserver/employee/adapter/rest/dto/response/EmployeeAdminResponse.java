package vsu.cs.is.infsysserver.employee.adapter.rest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeAdminResponse {
    private Long id;
    private String patronymic;
    private String post;
    private String academicTitle;
    private String academicDegree;
    private String experience;
    private String professionalExperience;
    private String dateOfBirth;
    private String login;
    private String firstName;
    private String lastName;
    private String email;
    private String imageUrl;

    //private Set<SpecialitiesDTO> specialities = new HashSet<>();
    private Set<String> specialities = new HashSet<>();
    private String mainRole;
}
