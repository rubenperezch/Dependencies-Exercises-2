package com.greenfoxacademy.messageservice.Models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class EmailService implements MessageService {

    @Override
    public void sendMessage(String destination, String message) {
        System.out.println("Email sent to " + destination + " with Message: "
        + message);
    }
}
