package fr.placide.cacmerbsmsaccount.infrastructure.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import fr.placide.cacmerbsmsaccount.domain.topics.TopicsParams;

@Configuration
public class KafkaTopics {
    @Bean
    public NewTopic createTopicAddEvent(){
        return TopicBuilder
                .name(TopicsParams.TOPICS.get(0))
                .partitions(TopicsParams.NB_PARTITIONS)
                .replicas(TopicsParams.NB_REPLICAS)
                .build();
    }
    @Bean
    public NewTopic createTopicUpdateEvent(){
        return TopicBuilder
                .name(TopicsParams.TOPICS.get(1))
                .partitions(TopicsParams.NB_PARTITIONS)
                .replicas(TopicsParams.NB_REPLICAS)
                .build();
    }
    @Bean
    public NewTopic createTopicDeleteEvent(){
        return TopicBuilder
                .name(TopicsParams.TOPICS.get(2))
                .partitions(TopicsParams.NB_PARTITIONS)
                .replicas(TopicsParams.NB_REPLICAS)
                .build();
    }
}
