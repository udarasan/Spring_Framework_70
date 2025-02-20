package org.example.z13_spring_boot.controller;

import org.example.z13_spring_boot.dto.CustomerDTO;
import org.example.z13_spring_boot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    //property injection
    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "save")
    public Boolean getCustomer(@RequestBody CustomerDTO customerDTO) {
        boolean res= customerService.saveCustomer(customerDTO);
        return res;
    }
    @GetMapping(path ="getAll")
    public List<CustomerDTO> getAllCustomers() {
        return customerService.getAllCustomers();
    }
    @PutMapping(path = "update")
    public Boolean updateCustomer(@RequestBody CustomerDTO customerDTO) {
        boolean res= customerService.updateCustomer(customerDTO);
        return res;
    }
    @DeleteMapping(path = "delete/{id}")
    public Boolean deleteCustomer(@PathVariable("id") int id) {
        return customerService.deleteCustomer(id);
    }

}
