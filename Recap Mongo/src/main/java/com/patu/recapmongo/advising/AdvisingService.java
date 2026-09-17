package com.patu.recapmongo.advising;

import com.patu.recapmongo.Student.Student;
import com.patu.recapmongo.Student.StudentService;
import com.patu.recapmongo.course.Course;
import com.patu.recapmongo.course.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdvisingService {
    private final AdvisingRepository advisingRepository;
    private final StudentService studentService;
    private final CourseService courseService;

    public Advising save(AdvisingDto dto){
        Student student = studentService.findById(dto.studentId());
        Course course = courseService.findByCode(dto.courseCode());

        Advising advising = Advising.builder()
                .semester("Spring 2026")
                .student(student)
                .course(course)
                .build();
        return advisingRepository.save(advising);
    }
}
