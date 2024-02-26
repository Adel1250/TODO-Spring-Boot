package com.adel.todo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private final AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String welcome(@RequestParam String username, @RequestParam String password, ModelMap model) {
        if (authenticationService.authenticate(username, password)) {
            model.put("username", username);
            model.put("password", password);
            return "welcome";
        } else {
            model.put("errorMessage", "Invalid username or password, Please try again!");
            return "login";
        }
    }
}
