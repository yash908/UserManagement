
package com.yash.smartportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "home";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "admin/dashboard";
    }

    @GetMapping("/moderator/dashboard")
    public String moderatorDashboard() {
        return "moderator/dashboard";
    }

    @GetMapping("/user/dashboard")
    public String userDashboard() {
        return "user/dashboard";
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "access-denied";
    }

    @GetMapping("/default")
    public String defaultAfterLogin() {
        return "redirect:/home";
    }
}
