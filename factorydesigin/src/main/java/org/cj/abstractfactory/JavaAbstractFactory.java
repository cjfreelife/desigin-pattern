package org.cj.abstractfactory;

import org.cj.course.ICourse;
import org.cj.course.JavaCourse;
import org.cj.video.IVideo;
import org.cj.video.JavaVideo;

public class JavaAbstractFactory implements IAbstarctFactory {
    public ICourse createCourse() {
        return new JavaCourse();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}
