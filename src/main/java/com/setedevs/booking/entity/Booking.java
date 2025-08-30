package com.setedevs.booking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "customer_name", nullable = false)
    private String customerName;
    
    @Column(name = "customer_email", nullable = false)
    private String customerEmail;
    
    @Column(name = "check_in", nullable = false)
    private LocalDateTime checkIn;
    
    @Column(name = "check_out", nullable = false)
    private LocalDateTime checkOut;
    
    @Column(name = "number_of_guests", nullable = false)
    private int numberOfGuests;
    
    @Column(name = "room_type", nullable = false)
    private String roomType;
    
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
    
    // Construtor customizado para criar a entidade a partir do DTO
    public Booking(String customerName, String customerEmail, LocalDateTime checkIn, 
                   LocalDateTime checkOut, int numberOfGuests, String roomType) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numberOfGuests = numberOfGuests;
        this.roomType = roomType;
    }
}