package org.example.z13_spring_boot.service;

import org.example.z13_spring_boot.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    boolean saveCustomer(CustomerDTO customerDTO);
    List<CustomerDTO> getAllCustomers();
    boolean updateCustomer(CustomerDTO customerDTO);
    Boolean deleteCustomer(int id);
}
