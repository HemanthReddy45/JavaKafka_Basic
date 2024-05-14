package net.javaguides.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic hemanthTopic() {
        return TopicBuilder.name("Topic_1").build();
    }

    @Bean
    public NewTopic hemanthTopic2() {
        return TopicBuilder.name("Topic_2_Json").partitions(5).build();
    }
}
