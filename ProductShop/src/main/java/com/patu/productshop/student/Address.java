package com.patu.productshop.student;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
   // @Column(name= "Street_address")
    private String streetAddress;
    private String city;
    private String state;
    private String country;

}
