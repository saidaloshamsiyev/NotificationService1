package org.example.notificationservice1.consumer;

import metube.com.dto.request.UserNotificationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class WebSocketService {

    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    public WebSocketService(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    public void sendNotificationToUser(UserNotificationRequest notification) {
        messagingTemplate.convertAndSend("/topic/notifications", notification);
    }
}
