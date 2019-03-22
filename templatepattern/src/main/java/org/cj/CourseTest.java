package org.cj;

/*
 * 模板方法一定是抽象类
 * */
public class CourseTest {

    public static void main(String[] args) {
        Course javaCourse = new JavaCourse();
        Course pythonCourse = new PythonCourse();
        javaCourse.createCourse();
        pythonCourse.createCourse();

    }
}
