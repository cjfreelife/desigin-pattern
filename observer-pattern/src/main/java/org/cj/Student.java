package org.cj;

import com.google.common.eventbus.EventBus;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void sendQuestion(Question question, Object[] objects) {
        question.setName(this.name);
        EventBus eventBus = new EventBus();
        for (Object object : objects) {
            eventBus.register(object);
        }
        eventBus.post(question);
    }
}
