package com.example.vkbotservice.service;

import com.example.vkbotservice.model.KafkaMessage;
import org.springframework.stereotype.Service;

@Service
public class MessageProcessor {

    private KafkaProducer kafkaProducer;

    public MessageProcessor(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    public void processMessage(KafkaMessage kafkaMessage) {
        kafkaProducer.send(kafkaMessage);
    }
}
