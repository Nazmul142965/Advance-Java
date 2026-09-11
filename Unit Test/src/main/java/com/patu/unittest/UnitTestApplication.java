package com.patu.unittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnitTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnitTestApplication.class, args);

        //Student s1= new Student(1, "Patu", "patu@example.com", true);
        Student s1 = Student.builder().id(2).name("Patu").build();
        // to build bebhoar kori updat ekorar laiga, karon eida mgore copy korar option dey,
        // to oi kahini er laiga eida use kora jaite pare
        //na thakle add hobe ar thakle replace hoiya jabe
        Student s2 = s1.toBuilder().email("patu@gmail.com").build();

    }

}
