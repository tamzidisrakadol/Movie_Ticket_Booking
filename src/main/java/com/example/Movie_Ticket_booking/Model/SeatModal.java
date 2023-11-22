package com.example.Movie_Ticket_booking.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "Table_info")
public class SeatModal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int row;
    char column;
    Boolean isBooked;

    public SeatModal() {
    }

    public SeatModal(int id, int row, char column, Boolean isBooked) {
        this.id = id;
        this.row = row;
        this.column = column;
        this.isBooked = isBooked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public void setColumn(char column) {
        this.column = column;
    }

    public Boolean getBooked() {
        return isBooked;
    }

    public void setBooked(Boolean booked) {
        isBooked = booked;
    }
}
