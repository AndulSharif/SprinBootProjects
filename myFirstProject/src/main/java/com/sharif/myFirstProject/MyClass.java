package com.sharif.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("text")
    public String sayHello(){
        return "Hello World";

    }
}
