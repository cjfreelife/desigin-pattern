package org.cj.methodfactory;

import org.cj.course.ICourse;
import org.cj.course.JavaCourse;

public class JavaFactory implements IMethonFactory {
    public ICourse getBean() {
        return new JavaCourse();
    }
}
