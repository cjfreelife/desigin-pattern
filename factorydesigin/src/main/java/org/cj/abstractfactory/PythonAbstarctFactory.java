package org.cj.abstractfactory;

import org.cj.course.ICourse;
import org.cj.course.PythonCourse;
import org.cj.video.IVideo;
import org.cj.video.PythonVideo;

public class PythonAbstarctFactory implements IAbstarctFactory {
    public ICourse createCourse() {
        return new PythonCourse();
    }

    public IVideo createVideo() {
        return new PythonVideo();
    }

}
