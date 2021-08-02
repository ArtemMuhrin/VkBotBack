package com.example.vkbotservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private Long groupId;
    private Long clientId;
    private String text;
    private Keyboard keyboard;
}
