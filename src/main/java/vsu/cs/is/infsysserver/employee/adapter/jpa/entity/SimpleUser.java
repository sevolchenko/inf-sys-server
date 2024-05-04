package vsu.cs.is.infsysserver.employee.adapter.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class SimpleUser {
    @Id
    private Long id;
}
