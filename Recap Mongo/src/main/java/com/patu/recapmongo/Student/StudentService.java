package com.patu.recapmongo.Student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student saveStudent(StudentSaveDto dto){
        Student student = Student.builder().name(dto.name())
                .age(dto.age())
                .CGPA(dto.CGPA())
                .build();
        return studentRepository.save(student);

    }

    public Student findById(String id){
        return studentRepository.findById(id).orElse(null);
    }
}
