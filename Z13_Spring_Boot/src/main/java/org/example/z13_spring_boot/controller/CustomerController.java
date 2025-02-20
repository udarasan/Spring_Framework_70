package org.example.z13_spring_boot.controller;

import org.example.z13_spring_boot.dto.CustomerDTO;
import org.example.z13_spring_boot.service.impl.CustomerServiceImpl;
import org.example.z13_spring_boot.utill.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/customer")
public class CustomerController {
    //property injection
    @Autowired
    private CustomerServiceImpl customerService;

    @PostMapping(path = "save")
    public ResponseUtil getCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.saveCustomer(customerDTO);
        return new ResponseUtil(201,"Customer is saved",null);
    }
    @GetMapping(path ="getAll")
    public ResponseUtil getAllCustomers() {
        return new ResponseUtil(200, "success", customerService.getAllCustomers());
    }

    @PutMapping(path = "update")
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.updateCustomer(customerDTO);
        return new ResponseUtil(200,"Customer is updated",null);
    }
    @DeleteMapping(path = "delete/{id}")
    public ResponseUtil deleteCustomer(@PathVariable("id") int id) {
        customerService.deleteCustomer(id);
        return new ResponseUtil(200,"Customer is deleted",null);
    }

}
