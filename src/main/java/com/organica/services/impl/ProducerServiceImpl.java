package com.organica.services.impl;

import com.organica.services.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    @Override
    public boolean sendMessage(String message) {
        kafkaTemplate.send("cnx-messenger", message);
        return true;
    }
}
