package com.example.demo.listener;

import com.example.demo.entities.MessageRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "konu",
            groupId = "groupId"
    )
    public void listen(@Payload MessageRequest message) {
        log.info("Message received.. Message: {} Date : {} Name: {}",
                message.getMessage(),
                message.getMessageDate(),
                message.getUsername()
                );
    }
}