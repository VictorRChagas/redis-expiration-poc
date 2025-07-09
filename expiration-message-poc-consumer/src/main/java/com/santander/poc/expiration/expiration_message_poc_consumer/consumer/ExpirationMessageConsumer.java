package com.santander.poc.expiration.expiration_message_poc_consumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.data.redis.core.RedisKeyExpiredEvent;
import org.springframework.data.redis.core.RedisKeyValueAdapter;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.stereotype.Component;

@Component
@EnableRedisRepositories(enableKeyspaceEvents = RedisKeyValueAdapter.EnableKeyspaceEvents.ON_STARTUP)
public class ExpirationMessageConsumer {

    private static Logger log = LoggerFactory.getLogger(ExpirationMessageConsumer.class);

    @EventListener
    public void handleRedisKeyExpiredEvent(RedisKeyExpiredEvent<String> event) {
        log.info("Event: {}", event);
        final var id = new String(event.getId());
        //Continue the process here
    }

}
