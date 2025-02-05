package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("one")
public class WildCardMappingOptionOne {
    //one/test/1/hello
    //one/test//hello
    //one/test/asv/hello/asdasd
    @GetMapping(path = "test/*/hello")
    public String test() {
        return "Get Mapping Option One";
    }
    @GetMapping(path = "test1/*/*")
    public String test2() {
        return "Get Mapping Option One";
    }
}
