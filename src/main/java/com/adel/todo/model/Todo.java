package com.adel.todo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Entity
public class Todo {
    @Id
    @GeneratedValue
    @Column(name = "TODO_ID")
    private Long todoID;
    @NotBlank(message = "Description is mandatory")
    private String description;
    private Boolean done;
    @Column(name = "TARGET_DATE")
    private LocalDate targetDate;
    @Column(name = "USER_ID")
    private Long userID;
    private String username;
}
