package vsu.cs.is.infsysserver.employee.adapter.jpa.entity;


import jakarta.persistence.*;
import lombok.*;
import vsu.cs.is.infsysserver.employee.adapter.rest.dto.request.EmployeeUpdateRequest;
import vsu.cs.is.infsysserver.security.entity.temp.User;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table(name = "employees")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence")
    @SequenceGenerator(
            name = "employee_sequence",
            allocationSize = 1)
    private Long id;

    @OneToOne(optional = false)
    @JoinColumn(unique = true)
    private User user;

    private String patronymic;
    private String post;
    private String academicTitle;
    private String academicDegree;
    private String experience;
    private String professionalExperience;
    private LocalDate dateOfBirth;
    private String plan;
    private boolean hasLessons;
    private LocalDateTime createdAt;

    public void updateFromRequest(EmployeeUpdateRequest request) {
        this.user.setFirstName(request.firstName());
        this.user.setLastName(request.lastName());
        this.patronymic = request.patronymic();
        this.post = request.post();
        this.academicTitle = request.academicTitle();
        this.academicDegree = request.academicDegree();
        this.experience = request.experience();
        this.professionalExperience = request.professionalExperience();
        this.dateOfBirth = request.dateOfBirth();
        this.plan = request.plan();
        this.hasLessons = request.hasLessons();
        this.createdAt = LocalDateTime.now();
    }
}
