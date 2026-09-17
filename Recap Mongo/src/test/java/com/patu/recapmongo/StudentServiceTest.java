package com.patu.recapmongo;

import com.patu.recapmongo.Student.Student;
import com.patu.recapmongo.Student.StudentSaveDto;
import com.patu.recapmongo.Student.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void save(){
        StudentSaveDto dto = new StudentSaveDto("NAZMUL",24,3.5, "active");
        Student student = studentService.saveStudent(dto);
        Assertions.assertEquals(dto.name(), student.getName());
     }

     @Test
    public void findById(){
        Student student = studentService.findById("6aa536c680233844add02d81");
        Assertions.assertEquals("NAZMUL", student.getName());
     }
}
