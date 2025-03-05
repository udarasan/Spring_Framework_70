package org.example.z15_spring_boot_bean_validation.controller;

import jakarta.validation.Valid;
import org.example.z15_spring_boot_bean_validation.dto.CustomerDTO;
import org.example.z15_spring_boot_bean_validation.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @PostMapping("/save")
    public ResponseEntity<ResponseDTO>
    createCustomer(@Valid @RequestBody CustomerDTO customerDTO){
        ResponseDTO responseDTO = new ResponseDTO(
                "User Created Successfully",
                HttpStatus.CREATED.value(),
                customerDTO
        );
        return new ResponseEntity
                (responseDTO, HttpStatus.CREATED);
    }

}
