package net.javaguides.springboot.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(kafkaConsumer.class);
    @KafkaListener(topics="Topic_1", groupId = "myGroup")
    public void consume(String message) //this consume method acts as subscriber to the Topic_1
    {
        LOGGER.info(String.format("Message received %s", message));
    }
}
