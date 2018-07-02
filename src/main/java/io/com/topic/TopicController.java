package io.com.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//clase controladora Spring
@RestController
public class TopicController {


    //Dependency injection. Instance of topicService available for you
    @Autowired
    private TopicService topicService;

    //Responde y toma accion sobre entradas o request HTTP mediante URL
    @RequestMapping("/topics")
    public List<Topic> topics() {
        return topicService.getAllTopics();
    }


    //GET METHOD TO GET SPECIFIC TOPIC GETING A PATH VARIABLE FROM URL
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    //POST METHOD TO ADD NEW TOPIC. THIS TAKE JSON OBJECT FROM BODY AND MAPPING TO TOPIC OBJECT
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void updateTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
