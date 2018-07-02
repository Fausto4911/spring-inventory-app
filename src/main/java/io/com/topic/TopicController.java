package io.com.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> topics() {
        return Arrays.asList(
                new Topic("pepe", "pepe pablo", "pepe is good person"),
                new Topic("Emmanuel", "Fausto Emmanuel", "Emmanuel es la maldita para"),
                new Topic("pepe", "pepe pablo", "pepe is good person")
        );
    }
}
