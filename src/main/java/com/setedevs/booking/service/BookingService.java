package com.setedevs.booking.service;

import com.setedevs.booking.dto.input.BookingRequest;
import com.setedevs.booking.repository.BookingRepository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void createBooking(BookingRequest request) {
        bookingRepository.save(request.toEntity());
        sendNotification(request);
    }

    private void sendNotification(Object request) {
        rabbitTemplate.convertAndSend("booking.exchange", "", request);
    }
}