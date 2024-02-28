package com.adel.todo.controller;

import com.adel.todo.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/todos")
    public String getTodos(ModelMap model) {
        model.put("todos", todoService.getTodosByUserID(1L));
        return "todo-list";
    }
}
