package com.setedevs.booking.controller;

import com.setedevs.booking.dto.input.BookingRequest;
import com.setedevs.booking.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController()
@RequestMapping("/api/v1/bookings")
public class BookingController {

    private final BookingService bookingService;

    @PostMapping
    public ResponseEntity createBooking(@RequestBody BookingRequest request) {
        bookingService.createBooking(request);
        return ResponseEntity.ok("Reserva criada com sucesso!");
    }
}
