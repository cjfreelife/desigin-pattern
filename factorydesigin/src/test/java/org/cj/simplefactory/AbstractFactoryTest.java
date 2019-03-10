package org.cj.simplefactory;

import org.cj.abstractfactory.IAbstarctFactory;
import org.cj.abstractfactory.JavaAbstractFactory;
import org.cj.course.ICourse;
import org.cj.video.IVideo;
import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void testAbstractFactory() {
        IAbstarctFactory javaFactory = new JavaAbstractFactory();
        ICourse course = javaFactory.createCourse();
        course.record();
        IVideo video = javaFactory.createVideo();
        video.player();
    }
}
