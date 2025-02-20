package org.example.z13_spring_boot.service;

import org.example.z13_spring_boot.dto.CustomerDTO;
import org.example.z13_spring_boot.entity.Customer;
import org.example.z13_spring_boot.repo.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) {
        customerRepo.save
                (modelMapper.map(customerDTO, Customer.class));
        return true;
    }
    @Override
    public List<CustomerDTO> getAllCustomers() {
        return modelMapper.map(
                customerRepo.findAll(),
                new TypeToken<List<CustomerDTO>>() {}.getType());
    }
    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) {
        if (customerRepo.existsById(customerDTO.getId())) {
            customerRepo.save
                    (modelMapper.map(customerDTO, Customer.class));
            return true;
        }
        return false;
    }

    @Override
    public Boolean deleteCustomer(int id) {
        customerRepo.deleteById(id);
        return true;
    }
}
