package kafka.one.producer.controller;

import kafka.one.producer.TestProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestProducer testProducer;

    @PostMapping("/kafka/test")
    public String sendMessage(@RequestParam("message") String message) {

        testProducer.sendMessage(message);
        return "success";
    }
}
