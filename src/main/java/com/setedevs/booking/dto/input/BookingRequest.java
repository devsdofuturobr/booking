package com.setedevs.booking.dto.input;

import com.setedevs.booking.entity.Booking;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookingRequest implements Serializable {
    private String customerName;
    private String customerEmail;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private int numberOfGuests;
    private String roomType;

    // Método para converter DTO em entidade
    public Booking toEntity() {
        return new Booking(customerName, customerEmail, checkIn, checkOut, numberOfGuests, roomType);
    }
}