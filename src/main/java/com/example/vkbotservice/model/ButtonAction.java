package com.example.vkbotservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ButtonAction {
    String payload;
    String type;
    String label;
}
