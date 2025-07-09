package com.santander.poc.expiration.expiration_message_poc_producer.repository;

import com.santander.poc.expiration.expiration_message_poc_producer.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MessageRepository extends CrudRepository<Message, UUID> {
}
