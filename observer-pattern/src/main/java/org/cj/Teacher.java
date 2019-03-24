package org.cj;

import com.google.common.eventbus.Subscribe;

public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void receiveQuestion(Object obj) {
        Question question = (Question) obj;
        System.out.println(this.name + "老师你好!\r\n收到一个来自" + question.getName() + "的问题\r\n" +
                question.getComment());
    }
}
