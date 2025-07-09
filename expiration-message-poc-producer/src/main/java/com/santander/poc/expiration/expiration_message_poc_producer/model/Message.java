package com.santander.poc.expiration.expiration_message_poc_producer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.UUID;

@RedisHash(value = "Message", timeToLive = 60L)
public record Message(@Id UUID id, String message) implements Serializable {
}
