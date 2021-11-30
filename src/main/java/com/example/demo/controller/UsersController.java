package com.example.demo.controller;

import com.example.demo.model.UsersModel;
import com.example.demo.repository.UsersRepository;
import com.example.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsersController {
    @Autowired
    private UsersRepository usersRepository;
    private UsersService usersService;
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("loginRequest", new UsersModel());
        return "login_page";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute UsersModel usersModel, Model model) {
        System.out.println("login request" + usersModel);
        UsersModel loginUser = usersService.authenticate(usersModel.getLogin(), usersModel.getPass());
        if (loginUser != null) {
            if (loginUser.getRole().equals("admin")) {
                model.addAttribute("userLogin", loginUser.getLogin());
                return "personal_page";
            } else if (loginUser.getRole().equals("stud")) {
                model.addAttribute("userLogin", loginUser.getLogin());
                return "student_page";
            }
            else{
                return "error_page";
            }
        }
        else {
            return "error_page";
        }
    }
}
