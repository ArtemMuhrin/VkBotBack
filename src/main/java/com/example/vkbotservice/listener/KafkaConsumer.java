package com.example.vkbotservice.listener;

import com.example.vkbotservice.model.Message;
import com.example.vkbotservice.service.MessageProcessor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private MessageProcessor messageProcessor;

    public KafkaConsumer(MessageProcessor messageProcessor) {
        this.messageProcessor = messageProcessor;
    }

    @KafkaListener(topics = "request", groupId = "group_id", containerFactory = "kafkaListener")
    public void consume(Message message) {
        messageProcessor.processMessage(message);
    }
}
