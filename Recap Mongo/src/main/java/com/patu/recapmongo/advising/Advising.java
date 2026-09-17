package com.patu.recapmongo.advising;

import com.patu.recapmongo.Student.Student;
import com.patu.recapmongo.course.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Advising {
    private String id;
    private String semester;
    @DBRef
    private Student student;
    @DBRef
    private Course course;


}
