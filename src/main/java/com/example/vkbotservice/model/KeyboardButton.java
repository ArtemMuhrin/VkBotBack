package com.example.vkbotservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class KeyboardButton {
    ButtonAction action;
    String color;
}
