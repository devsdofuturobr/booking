package com.setedevs.booking.exchange;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryExchangeConfiguration {

    @Bean
    public TopicExchange categoryExchange() {
        return new TopicExchange("booking.exchange", true, false);
    }
}