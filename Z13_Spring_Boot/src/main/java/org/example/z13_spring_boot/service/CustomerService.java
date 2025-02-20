package org.example.z13_spring_boot.service;

import org.example.z13_spring_boot.dto.CustomerDTO;
import org.example.z13_spring_boot.entity.Customer;
import org.example.z13_spring_boot.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService  {
    @Autowired
    private CustomerRepo customerRepo;

    public boolean saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getAddress());
        customerRepo.save(customer);
        return true;
    }

    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customerList=customerRepo.findAll();
        List<CustomerDTO> customerDTOList=new ArrayList<>();
        for (Customer customer : customerList) {
            customerDTOList.add(new CustomerDTO(customer.getId(), customer.getName(), customer.getAddress()));
        }
        return customerDTOList;
    }

    public boolean updateCustomer(CustomerDTO customerDTO) {
        if (customerRepo.existsById(customerDTO.getId())) {
            Customer customer = new Customer(
                    customerDTO.getId(),
                    customerDTO.getName(),
                    customerDTO.getAddress());
            customerRepo.save(customer);
            return true;
        }
        return false;
    }

    public Boolean deleteCustomer(int id) {
        customerRepo.deleteById(id);
        return true;
    }
}
