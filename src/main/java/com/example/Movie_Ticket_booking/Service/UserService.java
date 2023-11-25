package com.example.Movie_Ticket_booking.Service;

import com.example.Movie_Ticket_booking.Model.UserModel;
import com.example.Movie_Ticket_booking.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String registerUser(@RequestBody UserModel userModel){
        userRepository.save(userModel);
        return "success";
    }
}
