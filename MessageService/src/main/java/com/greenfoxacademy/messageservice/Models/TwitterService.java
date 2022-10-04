package com.greenfoxacademy.messageservice.Models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class TwitterService implements MessageService {

    @Override
    public void sendMessage(String destination, String message) {
        System.out.println("Twitter sent to " + destination + " with Message: "
                + message);
    }
}
