package ru.itis.springbootdemo.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.springbootdemo.security.details.UserDetailsImpl;

/**
 * 13.03.2021
 * 03. Spring Security
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Controller
public class ProfileController {

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/profile")
    public String getProfilePage(@AuthenticationPrincipal UserDetailsImpl user, Model model) {
        model.addAttribute("user", user);
        return "profile_page";
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/test")
    public String text() {
        //TODO
        return "test";
    }
}
