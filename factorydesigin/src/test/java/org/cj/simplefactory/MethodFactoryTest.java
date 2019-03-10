package org.cj.simplefactory;

import org.cj.course.ICourse;
import org.cj.methodfactory.IMethonFactory;
import org.cj.methodfactory.JavaFactory;
import org.cj.methodfactory.PythonFactory;
import org.junit.Test;

public class MethodFactoryTest {
    @Test
    public void methodFactoryTest() {
        IMethonFactory javaFactory = new JavaFactory();
        ICourse javaCours = javaFactory.getBean();
        javaCours.record();
        IMethonFactory pythonFactory = new PythonFactory();
        ICourse pythonCours = pythonFactory.getBean();
        pythonCours.record();
    }
}
