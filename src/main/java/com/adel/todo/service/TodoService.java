package com.adel.todo.service;

import com.adel.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static final List<Todo> todoList = new ArrayList<>();
    static {
        todoList.add(Todo.builder()
                .targetDate(LocalDate.now().plusYears(1))
                .todoID(1L)
                .userID(1L)
                .description("C")
                .done(false).build());
        todoList.add(Todo.builder()
                .targetDate(LocalDate.now().plusYears(2))
                .todoID(2L)
                .userID(1L)
                .description("Java")
                .done(false).build());
        todoList.add(Todo.builder()
                .targetDate(LocalDate.now().plusYears(3))
                .todoID(3L)
                .userID(1L)
                .description("Python")
                .done(false).build());
    }

    public List<Todo> getTodosByUserID(Long userID) {
        return todoList;
    }
}
