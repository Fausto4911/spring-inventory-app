package io.com.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Spring business service. This class work as singleton
@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("pepe", "pepe pablo", "pepe is good person"),
            new Topic("Emmanuel", "Fausto Emmanuel", "Emmanuel es la maldita para"),
            new Topic("clore", "pepe pablo", "pepe is good person")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(tp -> tp.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (Topic to : topics) {
            if (to.getId().equals(id)) {
                topics.set(topics.indexOf(to), topic);
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(to -> to.getId().equals(id));
    }
}
