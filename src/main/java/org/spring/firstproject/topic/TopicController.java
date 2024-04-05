package org.spring.firstproject.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("Spring", "Spring framerwork", "Spring framerwork description"),
                new Topic("Java", "Java core", "Core java description"),
                new Topic("javascript", "javascript framerwork", "javascript framerwork description")
        );
    }
}
