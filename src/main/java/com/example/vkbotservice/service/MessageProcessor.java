package com.example.vkbotservice.service;

import com.example.vkbotservice.model.Keyboard;
import com.example.vkbotservice.model.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageProcessor {

    private final KafkaProducer kafkaProducer;
    private final KeyboardService keyboardService;

    public MessageProcessor(KafkaProducer kafkaProducer, KeyboardService keyboardService) {
        this.kafkaProducer = kafkaProducer;
        this.keyboardService = keyboardService;
    }

    public void processMessage(Message message) {
        if (message.getText().equals("Дай клаву")) {
            Keyboard keyboard = keyboardService.getKeyboard();
            if (keyboard == null) {
                message.setText("Не дам. Сервис болен");
            } else {
                message.setText("Пожалуйста");
                message.setKeyboard(keyboardService.getKeyboard());
            }
        }
        kafkaProducer.send(message);
    }
}
