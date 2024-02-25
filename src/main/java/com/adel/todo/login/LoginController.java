package com.adel.todo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login")
public class LoginController {
    @RequestMapping
    public String login(@RequestParam("name") String name, ModelMap model) {
        model.put("name", name);
        return "login";
    }
}
