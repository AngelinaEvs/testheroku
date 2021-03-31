package ru.itis.springbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.springbootdemo.dto.UserForm;
import ru.itis.springbootdemo.services.SignUpService;

import javax.annotation.security.PermitAll;

/**
 * 10.02.2021
 * spring-boot-demo
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Controller
public class SignUpController {
    @Autowired
    private SignUpService signUpService;

    @PermitAll
    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "sign_up_page";
    }

    @PermitAll
    @PostMapping("/signUp")
    public String signUp(UserForm form) {
        signUpService.signUp(form);
        return "redirect:/signIn";
    }

    @PermitAll
    @GetMapping("/test")
    public String text() {
        //TODO
        return "test";
    }
}
