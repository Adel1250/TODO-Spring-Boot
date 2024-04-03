package com.adel.todo.controller;

import com.adel.todo.model.Todo;
import com.adel.todo.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/todos")
    public String getTodos(ModelMap model) {
        model.put("todos", todoService.getTodosByUsername(getLoggedInUsername()));
        model.put("username", getLoggedInUsername());
        return "todo-list";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showAddTodo(ModelMap model) {
        Todo todo = new Todo(0L, "", false, LocalDate.now(), 1L, getLoggedInUsername());
        model.put("todo", todo);
        model.put("username", getLoggedInUsername());
        return "todo";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addTodo(@Valid Todo todo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "todo";
        }
        todoService.addTodo(todo);
        return "redirect:todos";
    }

    @RequestMapping(value = "/delete-todo")
    public String deleteTodo(@RequestParam(name = "id") String id) {
        todoService.deleteTodo(Long.valueOf(id));
        return "redirect:todos";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.GET)
    public String showUpdateTodo(ModelMap model, @RequestParam(name = "id") String id) {
        Todo todo = todoService.getTodoByID(Long.valueOf(id));
        model.put("todo", todo);
        model.put("username", getLoggedInUsername());
        return "todo";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.POST)
    public String updateTodo(@Valid Todo todo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "todo";
        }
        todoService.updateTodo(todo);
        return "redirect:todos";
    }

    private String getLoggedInUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
}
