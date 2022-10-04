package com.greenfoxacademy.messageservice.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageProceeder {

    public MessageCollection messageCollection;

    //public EmailService emailService;

    //public TwitterService twitterService;

    @Autowired
    public MessageProceeder(MessageCollection messageCollection) {
        this.messageCollection = messageCollection;

    }
}
