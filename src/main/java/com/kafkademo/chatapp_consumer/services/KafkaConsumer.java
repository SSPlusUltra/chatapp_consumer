package com.kafkademo.chatapp_consumer.services;


import com.kafkademo.chatapp_consumer.Dto;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    private final Dto dto = new Dto();


    @KafkaListener(topics = "chatapp_messages", groupId = "myGroup")
    public void consume(ConsumerRecord<String, String> record){
        LOGGER.info("Received Message:");
        LOGGER.info("Timestamp: " + record.timestamp());
        LOGGER.info("Offset: " + record.offset());
        LOGGER.info("Partition: " + record.partition());
        LOGGER.info("Key: " + record.key());
        LOGGER.info("Value: " + record.value());
        LOGGER.info("--------------------------------------");
        dto.setTimestamp(record.timestamp());
        dto.setRecordoffset(record.offset());
        dto.setPartition(record.partition());
        dto.setRecordkey(record.key());
        dto.setRecordvalue(record.value());

    }


    public Dto getLatestRecord() {
        return dto;
    }

}
