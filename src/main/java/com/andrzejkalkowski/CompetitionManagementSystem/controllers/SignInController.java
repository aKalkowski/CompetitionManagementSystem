package com.andrzejkalkowski.CompetitionManagementSystem.controllers;

import com.andrzejkalkowski.CompetitionManagementSystem.forms.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignInController {

    @GetMapping("/signin")
    public String signIn(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "signin";
    }
}
