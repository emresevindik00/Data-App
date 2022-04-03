package com.example.demo.api;

import com.example.demo.entities.MessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")

public class MessageController {
    private KafkaTemplate<String, MessageRequest> kafkaTemplate;

    public MessageController(KafkaTemplate<String, MessageRequest> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public void sendMessage(@RequestBody MessageRequest message) {
        kafkaTemplate.send("konu", message);
    }
}
