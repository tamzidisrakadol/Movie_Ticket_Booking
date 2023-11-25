package com.example.Movie_Ticket_booking.Service;


import com.example.Movie_Ticket_booking.Model.MovieModel;
import com.example.Movie_Ticket_booking.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AdminService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(@RequestBody MovieModel movieModel){
        movieRepository.save(movieModel);
        return "Success";
    }




}
