package net.javaguides.springboot.kafka;

import net.javaguides.springboot.payload.User;
import org.apache.kafka.common.internals.Topic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics="Topic_2_Json", groupId = "myGroup")
    public void consume(User user) //this consume method acts as subscriber to the Topic_2_Json
    {
        LOGGER.info(String.format("Message received -> %s", user.toString()));
    }
}
