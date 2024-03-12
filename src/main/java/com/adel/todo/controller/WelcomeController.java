package com.adel.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("username")
public class WelcomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goToWelcomePage(ModelMap model) {
        model.put("username", "adel");
        return "welcome";
    }
}
