package com.fstbr.demo.Controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {
    private final static String TOPIC_NAME = "my-replicated-topic";
    private final static String TOPIC_NAME_1 = "my-replicated-topic-1";

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("/send")
    public String send(@RequestParam("msg") String msg) {
        kafkaTemplate.send(TOPIC_NAME, "key", msg);
        return String.format("消息 %s 发送成功！", msg);
    }

    @RequestMapping("/sendGroup2")
    public String sendGroup(@RequestParam("msg") String msg) {
        kafkaTemplate.send(TOPIC_NAME_1, "key", msg);
        return String.format("消息 %s 发送成功！", msg);
    }
}
