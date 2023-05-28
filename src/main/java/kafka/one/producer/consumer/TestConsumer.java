package kafka.one.producer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestConsumer {
    // 해당 토픽을 소비하는 consumer
    @KafkaListener(topics = "test-1", groupId = "foo")
    public void consume(String message) {
        log.info("consumer ={}",message);

    }
}
