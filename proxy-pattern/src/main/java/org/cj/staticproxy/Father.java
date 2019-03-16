package org.cj.staticproxy;

public class Father implements Person {

    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    public void findLove() {
        System.out.println("before");
        person.findLove();
        System.out.println("after");
    }
}
