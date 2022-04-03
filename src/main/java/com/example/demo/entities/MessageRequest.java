package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class MessageRequest {
    public String message;
    public String username;
    private LocalDate messageDate = LocalDate.now();
}
