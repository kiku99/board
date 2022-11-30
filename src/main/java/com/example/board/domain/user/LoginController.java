package com.example.board.domain.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@AllArgsConstructor
public class LoginController {

    private final UserService userService;

    @GetMapping("/")
    public String home(){
        return "user/login";
    }
    @GetMapping("/login")
    public String login(HttpServletRequest request){
        return "user/login";
    }

    @GetMapping("/signUp")
    public String signUp(Model model){
        model.addAttribute("userDto", new User());
        return "user/signUp";
    }

    @PostMapping("/signUp")
    public String signUp(@ModelAttribute("userDto") User user){
        userService.insert(user);
        return "redirect:/login";
    }
}
