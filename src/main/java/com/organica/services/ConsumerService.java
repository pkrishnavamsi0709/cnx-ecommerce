package com.organica.services;

import java.util.List;

public interface ConsumerService {

    public void recieveMessages(String message);

    public List<String> getMessages();
}
