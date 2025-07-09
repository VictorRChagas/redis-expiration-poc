package com.santander.poc.expiration.expiration_message_poc_producer.controller;

import com.santander.poc.expiration.expiration_message_poc_producer.exceptions.MessageNotFoundException;
import com.santander.poc.expiration.expiration_message_poc_producer.model.Message;
import com.santander.poc.expiration.expiration_message_poc_producer.repository.MessageRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class MessageController {

    private final MessageRepository messageRepository;

    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @PostMapping
    public void save(@RequestBody Message message) {
        this.messageRepository.save(message);
    }

    @GetMapping("{id}")
    public Message get(@PathVariable UUID id) {
        return this.messageRepository.findById(id)
                .orElseThrow(MessageNotFoundException::new);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable UUID id) {
        this.messageRepository.deleteById(id);
    }
}
