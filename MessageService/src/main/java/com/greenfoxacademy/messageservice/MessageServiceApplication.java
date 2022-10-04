package com.greenfoxacademy.messageservice;

import com.greenfoxacademy.messageservice.Models.MessageProceeder;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MessageServiceApplication implements CommandLineRunner {

    MessageProceeder messageProceeder;

    @Autowired
    public MessageServiceApplication(MessageProceeder messageProceeder) {
        this.messageProceeder = messageProceeder;
    }

    public static void main(String[] args) {


        SpringApplication.run(MessageServiceApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        for (int i = 0; i < messageProceeder.messageCollection.messageServiceList.size(); i++) {

            messageProceeder.messageCollection.messageServiceList.get(i).sendMessage("greenfox@greenfox.com", "Hello Green Fox");
        }
        

    }
}

