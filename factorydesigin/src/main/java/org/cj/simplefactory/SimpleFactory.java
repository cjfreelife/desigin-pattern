package org.cj.simplefactory;

import org.cj.course.ICourse;
import org.cj.course.JavaCourse;
import org.cj.course.PythonCourse;

public class SimpleFactory {
    public static ICourse getBean(Class clz) throws Exception {
        if (JavaCourse.class == clz) {
            return new JavaCourse();
        } else if (PythonCourse.class == clz) {
            return new PythonCourse();
        }
        throw new Exception("類型不存在");
    }
}
