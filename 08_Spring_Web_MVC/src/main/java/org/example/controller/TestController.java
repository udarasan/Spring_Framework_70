package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("test")
public class TestController {
    //mapping method,handler method
    @GetMapping
    public String test() {
        return "Test";
    }
}
