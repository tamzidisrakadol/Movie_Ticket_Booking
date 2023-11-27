package com.example.Movie_Ticket_booking.config;

import com.example.Movie_Ticket_booking.Model.UserModel;
import com.example.Movie_Ticket_booking.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserModel userModel = userRepository.getUserBYEmail(email);
        if (userModel==null){
            throw new UsernameNotFoundException("Could not found user");
        }
        return new UserDetailsInfo(userModel);
    }
}
