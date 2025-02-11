package org.example.controller;

import org.example.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JSONController {
    @PostMapping
    public String test1(@RequestBody CustomerDTO customerDTO) {
        return customerDTO.getFirstName();
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public CustomerDTO test2() {
        return new CustomerDTO
                ("Udara","San",12);
    }

    @GetMapping(path = "data", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ArrayList<CustomerDTO> tes3(){
        ArrayList<CustomerDTO> customerDTOs = new ArrayList<>();
        customerDTOs.add(new CustomerDTO("Udara","San",12));
        customerDTOs.add(new CustomerDTO("Udara","San",13));
        customerDTOs.add(new CustomerDTO("Udara","San",14));
        return customerDTOs;
    }
}
