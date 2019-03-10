package org.cj.simplefactory;

import org.cj.course.ICourse;
import org.cj.course.JavaCourse;
import org.cj.course.PythonCourse;
import org.junit.Test;

public class SimpleFactoryTest {
    @Test
    public void testSimpleFactory() {
        ICourse javaCourse = null;
        ICourse pythonCourse = null;
        try {
            javaCourse = SimpleFactory.getBean(JavaCourse.class);
            pythonCourse = SimpleFactory.getBean(PythonCourse.class);
            javaCourse.record();
            pythonCourse.record();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
