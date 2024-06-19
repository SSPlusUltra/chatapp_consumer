package com.kafkademo.chatapp_consumer.controllers;

import com.kafkademo.chatapp_consumer.services.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class ConsumerController {

    @Autowired
    private KafkaConsumer kafkaConsumer;



    @GetMapping("/latest")
    public String getLatestMessage() {
        return kafkaConsumer.getLatestMessage(); // Define this method in KafkaConsumer class
    }
}