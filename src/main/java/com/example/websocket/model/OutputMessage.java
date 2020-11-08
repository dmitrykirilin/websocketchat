package com.example.websocket.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class OutputMessage {

    private String from;
    private String text;
    private String time;

}
