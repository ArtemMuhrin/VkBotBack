package com.example.vkbotservice.service;

import com.example.vkbotservice.model.Message;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private final KafkaTemplate<String, Message> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, Message> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(Message message) {
        kafkaTemplate.send("response", message);
    }
}
