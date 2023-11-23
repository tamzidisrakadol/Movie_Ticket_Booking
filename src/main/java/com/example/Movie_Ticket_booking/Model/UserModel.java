package com.example.Movie_Ticket_booking.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "UserInfo")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String fName;
    String lName;
    String emailAddress;
    String password;
    String phoneNumber;
    String imgUrl;
    String role;

    @OneToMany(mappedBy = "userModel")
    List<TicketModal> ticketList= new ArrayList<>();


    public UserModel() {
    }

    public UserModel(int id, String fName, String lName, String emailAddress, String password, String phoneNumber, String imgUrl, String role) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.imgUrl = imgUrl;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<TicketModal> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<TicketModal> ticketList) {
        this.ticketList = ticketList;
    }
}
