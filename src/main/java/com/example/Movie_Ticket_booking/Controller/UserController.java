package com.example.Movie_Ticket_booking.Controller;


import com.example.Movie_Ticket_booking.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movieuser")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/welcome")
    public String firstPage(Model model){
        model.addAttribute("title","Welcome");
        return "user/welcome";
    }

    @GetMapping("/userRegister")
    public String RegisterPage(Model model){
        model.addAttribute("title","Register");
        return "user/RegisterPage";
    }



}
