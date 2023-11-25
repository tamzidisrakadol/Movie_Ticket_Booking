package com.example.Movie_Ticket_booking.Controller;


import com.example.Movie_Ticket_booking.Model.UserModel;
import com.example.Movie_Ticket_booking.Service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

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
        model.addAttribute("user",new UserModel());
        return "user/RegisterPage";
    }

    @PostMapping("/signUp")
    public String userSignUp(@ModelAttribute("user")UserModel userModel, @RequestParam MultipartFile img, HttpSession session) throws IOException {
        userModel.setRole("Role_User");
        userModel.setImgUrl(img.getOriginalFilename());
        String result = userService.registerUser(userModel);
        if (result!=null){
            File savefile = new ClassPathResource("static/images").getFile();
            Path path = Paths.get(savefile.getAbsolutePath()+File.separator+img.getOriginalFilename());
            Files.copy(img.getInputStream(),path, StandardCopyOption.REPLACE_EXISTING);
        }

        session.setAttribute("msg","Register Successfully");

        return "redirect:/movieuser/userRegister";
    }



}
