package com.example.Movie_Ticket_booking.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Movie_info")
public class MovieModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    String description;
    String rating;
    int releaseYear;
    String directorName;
    String category;
    List<String> imgUrl = new ArrayList<>();
    @OneToMany(mappedBy = "movieModel")
    List<TicketModal> ticketList = new ArrayList<>();

    public MovieModel(int id, String name, String description, String rating, int releaseYear, String directorName, String category, List<String> imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.releaseYear = releaseYear;
        this.directorName = directorName;
        this.category = category;
        this.imgUrl = imgUrl;
    }

    public MovieModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(List<String> imgUrl) {
        this.imgUrl = imgUrl;
    }

    public List<TicketModal> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<TicketModal> ticketList) {
        this.ticketList = ticketList;
    }
}
