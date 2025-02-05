package org.example.controller;

import org.example.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("form")
public class FormDataController {
    @PostMapping
    public String test1(@ModelAttribute CustomerDTO customerDTO) {
        System.out.println(customerDTO.getFirstName());
        return customerDTO.toString();
    }
}
