package com.patu.unittest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
@AllArgsConstructor
public class Student {
    private int id;
    private String name;
    private String email;
    @Builder.Default
    private boolean active = true;

}
