package com.adel.todo.model;

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
    private String description;
    private Boolean done;
    private LocalDate targetDate;
    private Long userID;
}
