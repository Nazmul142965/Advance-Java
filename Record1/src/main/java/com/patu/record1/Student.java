package com.patu.record1;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Student {
    private  int id;
    private String name;
    private double cgpa;
    private String createdBy;
    private LocalDateTime updatedAt;
}
