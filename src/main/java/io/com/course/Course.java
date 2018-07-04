package io.com.course;

import io.com.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

    @Id
    private String courseId;
    private String name;
    private String description;
    private Topic topic;

    public Course() {

    }

    public Topic getTopic() {
        return topic;
    }

    public Course setTopic(Topic topic) {
        this.topic = topic;
        return this;
    }

    public Course(String courseId, String name, String description, String topicId) {
        super();
        this.courseId = courseId;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId, "", "");
    }

    public String getId() {
        return this.courseId;
    }

    public void setId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
