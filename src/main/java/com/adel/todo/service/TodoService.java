package com.adel.todo.service;

import com.adel.todo.model.Todo;
import com.adel.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    private static long TODOS_COUNT = 0;
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getTodosByUsername(String username) {
        return todoRepository.findByUsername(username);
    }

    public void addTodo(Todo todo) {
        todoRepository.save(Todo.builder()
                .targetDate(todo.getTargetDate())
                .todoID(++TODOS_COUNT)
                .userID(1L)
                .description(todo.getDescription())
                .done(false)
                .username(todo.getUsername()).build());
    }

    public void deleteTodo(Long id) {
        Optional<Todo> todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            todoRepository.delete(todo.get());
        } else {
            System.out.println("Failed");
        }
    }

    public Todo getTodoByID(Long id) {
        Optional<Todo> todo = todoRepository.findById(id);
        return todo.orElse(null);
    }

    public void updateTodo(Todo todo) {
        System.out.println(todo);
        deleteTodo(todo.getTodoID());
        todoRepository.save(todo);
    }
}
