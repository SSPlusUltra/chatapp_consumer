package com.kafkademo.chatapp_consumer.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    private String latestMessage;

    @KafkaListener(topics = "chatapp_messages", groupId = "myGroup")
    public void consume(String eventMessage){
        LOGGER.info(String.format("Message received->%s", eventMessage));
        latestMessage= eventMessage;
    }


    public String getLatestMessage() {
        return latestMessage;
    }

}
