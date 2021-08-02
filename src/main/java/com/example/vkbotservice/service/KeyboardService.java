package com.example.vkbotservice.service;


import com.example.vkbotservice.model.Keyboard;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class KeyboardService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final CircuitBreakerFactory circuitBreakerFactory;
    @Value("${keyboard.server.host}/keyboard")
    String getKeyboardUrl;

    public KeyboardService(CircuitBreakerFactory circuitBreakerFactory) {
        this.circuitBreakerFactory = circuitBreakerFactory;
    }

    public Keyboard getKeyboard() {
        return circuitBreakerFactory.create("circuitbreaker").run(() -> restTemplate.getForEntity(getKeyboardUrl, Keyboard.class).getBody(), throwable -> null);
    }
}
