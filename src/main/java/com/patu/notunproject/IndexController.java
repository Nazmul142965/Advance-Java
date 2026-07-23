package com.patu.notunproject;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class IndexController {

    @GetMapping("/form")
    public String form(){
        return "form";
    }

    @GetMapping("/list")
    public String list(){
        return "list";
    }

    @PostMapping("/form")
     String save(@Valid @ModelAttribute carForm carForm){
        log.info("Saving car form: {}, {}, {}, {}, {}", carForm.getName(), carForm.getYear(), carForm.getPrice(), carForm.getLicense());
        return "redirect:/list";
    }
}
