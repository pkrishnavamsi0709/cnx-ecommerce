package com.organica.controllers;

import com.organica.services.ConsumerService;
import com.organica.services.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/messaging")
public class MessagingController {

    @Autowired
    private ConsumerService consumer;

    @Autowired
    private ProducerService producer;

    @PostMapping("/send")
    public ResponseEntity<Boolean> sendMessage(@RequestBody String message){
        return new ResponseEntity<>(producer.sendMessage(message) ,HttpStatusCode.valueOf(200));

    }

    @GetMapping("/receive")
    public ResponseEntity<List<String>> receiveMessage(){
        return new ResponseEntity<>(consumer.getMessages() , HttpStatusCode.valueOf(200));

    }



}
