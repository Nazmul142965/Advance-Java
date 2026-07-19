package com.patu.hellospringboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Slf4j
@Controller
public class indexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/registrationFrom")
    public String registrationFrom() {
        return "registrationFrom";
    }

    @PostMapping("/submit-form") //
    public String submitFrom(@ModelAttribute Contact contact){


        System.out.println("From submit from method");
        log.info("Contact From Submitted: {}" , contact);

        return "redirect:/contact";

    }



    @PostMapping("/registrationSubmit")
    public String registrationFrom(@ModelAttribute Registration registration){
        System.out.println("From registration from method");
        log.info("Registration From Submitted: {}" , registration);
        return "redirect:/registrationFrom";
    }
}

