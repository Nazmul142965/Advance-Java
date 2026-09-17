package com.patu.recapmongo;

import com.patu.recapmongo.course.Course;
import com.patu.recapmongo.course.CourseService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseServiceTest {
    private CourseService courseService;

    @Test
    public void save(){
        Course course = new Course("CSE101", "Introduction to Computer Science", 3);
        courseService.save(course);
    }

}
