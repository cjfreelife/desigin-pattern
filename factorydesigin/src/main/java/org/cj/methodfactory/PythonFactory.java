package org.cj.methodfactory;

import org.cj.course.ICourse;
import org.cj.course.PythonCourse;

public class PythonFactory implements IMethonFactory {
    public ICourse getBean() {
        return new PythonCourse();
    }
}
