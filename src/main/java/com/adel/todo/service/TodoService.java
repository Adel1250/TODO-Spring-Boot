package com.adel.todo.service;

import com.adel.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static final List<Todo> todoList = new ArrayList<>();
    private static long TODOS_COUNT = 0;
    static {
        todoList.add(Todo.builder()
                .targetDate(LocalDate.now().plusYears(1))
                .todoID(++TODOS_COUNT)
                .userID(1L)
                .description("C")
                .done(false).build());
        todoList.add(Todo.builder()
                .targetDate(LocalDate.now().plusYears(2))
                .todoID(++TODOS_COUNT)
                .userID(1L)
                .description("Java")
                .done(false).build());
        todoList.add(Todo.builder()
                .targetDate(LocalDate.now().plusYears(3))
                .todoID(++TODOS_COUNT)
                .userID(1L)
                .description("Python")
                .done(false).build());
    }

    public List<Todo> getTodosByUserID(Long userID) {
        return todoList;
    }

    public void addTodo(String description) {
        todoList.add(Todo.builder()
                .targetDate(LocalDate.now().plusYears(1))
                .todoID(++TODOS_COUNT)
                .userID(1L)
                .description(description)
                .done(false).build());
    }

    public void deleteTodo(Long id) {
        todoList.removeIf(todo -> todo.getTodoID().equals(id));
    }

    public Todo getTodoByID(Long id) {
        return todoList.stream().filter(todo -> todo.getTodoID().equals(id)).findFirst().orElse(null);
    }

    public void updateTodo(Todo todo) {
        deleteTodo(todo.getTodoID());
        todoList.add(todo);
    }
}
