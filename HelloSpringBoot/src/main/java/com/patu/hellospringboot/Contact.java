package com.patu.hellospringboot;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Contact {
    private String name;
    private String email;
    private String message;


}
