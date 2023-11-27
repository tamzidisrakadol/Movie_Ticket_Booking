package com.example.Movie_Ticket_booking.Repository;

import com.example.Movie_Ticket_booking.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Integer>{

    @Query("select u from UserInfo u where u.emailAddress = :emailAddress")
    public UserModel getUserBYEmail(@Param("emailAddress")String emailAddress);

}
