package com.organica.services.impl;

import com.organica.services.ConsumerService;
import org.springframework.stereotype.Service;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsumerServiceImpl implements ConsumerService {


    List<String> messages = new ArrayList<>();

    @Override
    @KafkaListener(topics = "cnx-messenger", groupId = "user-group")
    public void recieveMessages(String message) {
        messages.add(message);
    }

    @Override
    public List<String> getMessages() {
        return messages;
    }


}
