package com.adel.todo.model;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
public class Todo {
    private Long todoID;
    @NotBlank(message = "Description is mandatory")
    private String description;
    private Boolean done;
    private LocalDate targetDate;
    private Long userID;
}
