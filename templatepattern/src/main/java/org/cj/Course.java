package org.cj;

public abstract class Course {

    public final void createCourse() {
        startCourse();
        startVideo();
        System.out.println(1);
    }

    abstract void startVideo();

    void startCourse() {
        System.out.println("开始上课");
    }


}
