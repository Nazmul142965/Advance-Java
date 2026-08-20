package com.patu.productshop.student;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

//@Table(name = "student_data")

public class Student {
    @Id
    private int id;
    private String name;
    private String createdBy;
    private LocalDate createdAt;



    //@Column(name = "mygpa")
    private double gpa;

    @Embedded
    private Address address;

    @ElementCollection
    private List<String> mobileNumbers;

    @OneToOne
    private Guardian guardian;

    @ManyToOne
    private Department department;

    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Course> courses;

}
