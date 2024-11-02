package org.example.notificationservice1.consumer;//package org.example.authservice.service;

import lombok.extern.slf4j.Slf4j;

import metube.com.dto.request.UserNotificationRequest;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "auth", groupId = "auth-service")
    public void consume(UserNotificationRequest  message) {
        log.info("Received user notification: {}",  message);
    }
}

