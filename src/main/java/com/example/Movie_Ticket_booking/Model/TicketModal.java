package com.example.Movie_Ticket_booking.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Ticket_info")
public class TicketModal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String time;
    String date;
    String payment;

    @OneToMany
    List<SeatModal> seatList;

    public TicketModal() {
    }

    public TicketModal(int id, String time, String date, String payment) {
        this.id = id;
        this.time = time;
        this.date = date;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
