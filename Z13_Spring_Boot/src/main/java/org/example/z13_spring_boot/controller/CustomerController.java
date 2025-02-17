package org.example.z13_spring_boot.controller;

import org.example.z13_spring_boot.dto.CustomerDTO;
import org.example.z13_spring_boot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    //property injection
    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "save")
    public Boolean getCustomer(@RequestBody CustomerDTO customerDTO) {
        boolean res= customerService.save(customerDTO);
        return res;
    }
}
