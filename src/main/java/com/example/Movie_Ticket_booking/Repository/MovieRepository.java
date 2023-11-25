package com.example.Movie_Ticket_booking.Repository;

import com.example.Movie_Ticket_booking.Model.MovieModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MovieModel,Integer> {


}
