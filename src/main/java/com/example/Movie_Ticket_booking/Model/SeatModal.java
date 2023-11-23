package com.example.Movie_Ticket_booking.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "Seat_info")
public class SeatModal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int seatRow;
    char seatColumn;
    Boolean isBooked;

    @ManyToOne
    TicketModal ticketModal;

    public SeatModal() {
    }

    public SeatModal(int id, int seatRow, char column, Boolean isBooked) {
        this.id = id;
        this.seatRow = seatRow;
        this.seatColumn = column;
        this.isBooked = isBooked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(int seatRow) {
        this.seatRow = seatRow;
    }

    public char getSeatColumn() {
        return seatColumn;
    }

    public void setSeatColumn(char seatColumn) {
        this.seatColumn = seatColumn;
    }

    public Boolean getBooked() {
        return isBooked;
    }

    public void setBooked(Boolean booked) {
        isBooked = booked;
    }

    public TicketModal getTicketModal() {
        return ticketModal;
    }

    public void setTicketModal(TicketModal ticketModal) {
        this.ticketModal = ticketModal;
    }
}
