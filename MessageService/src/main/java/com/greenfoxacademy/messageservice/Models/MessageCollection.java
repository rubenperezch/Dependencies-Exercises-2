package com.greenfoxacademy.messageservice.Models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageCollection {

    public List<MessageService> messageServiceList;



    @Autowired
    public MessageCollection(List<MessageService> messageServiceList) {
        this.messageServiceList = messageServiceList;

    }
}
