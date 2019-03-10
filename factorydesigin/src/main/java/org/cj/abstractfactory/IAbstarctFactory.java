package org.cj.abstractfactory;

import org.cj.course.ICourse;
import org.cj.video.IVideo;

public interface IAbstarctFactory {
    ICourse createCourse();

    IVideo createVideo();
}
