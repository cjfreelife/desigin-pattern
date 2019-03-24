package org.cj;

import com.google.common.eventbus.EventBus;

/*
 * 装饰者模式主要是对对象进行一个功能增强，都需要继承同一个父类，主要是写代码之前定好结构
 * 适配器着重于对于原有接口和新接口的适配，主要用于已经成型的代码的修改。
 *
 * 观察者模式，其实就是回调函数，将观察者都放在一个集合里，当被观察者发生动作的时候，便利集合获取所有观察者，去调用注册的回调方法
 * */
public class GuavaTest {
    public static void main(String[] args) {

        Question question = new Question();
        question.setComment("java怎么学！");
        Student student = new Student("cj");
        Teacher tom = new Teacher("tom");
        Teacher mik = new Teacher("mik");


        Object[] objects = new Object[]{tom, mik};
        student.sendQuestion(question, objects);
    }
}
