package com.example.vkbotservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Keyboard implements Serializable {
    private ArrayList<ArrayList<KeyboardButton>> buttons;
    @JsonProperty("one_time")
    Boolean oneTime;
}
