package com.kafkademo.chatapp_consumer.controllers;

import com.kafkademo.chatapp_consumer.Dto;
import com.kafkademo.chatapp_consumer.services.KafkaConsumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
@CrossOrigin(origins = "*")
public class ConsumerController {

    @Autowired
    private KafkaConsumer kafkaConsumer;


    @GetMapping("/latest")
    public Dto getLatestMessage() {
        return kafkaConsumer.getLatestRecord();
    }
}