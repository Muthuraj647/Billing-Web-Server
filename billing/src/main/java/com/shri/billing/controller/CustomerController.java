package com.shri.billing.controller;

import com.shri.billing.dto.CustomerDto;
import com.shri.billing.service.impl.CustomerServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired private CustomerServiceImplementation customerServiceImplementation;

    @CrossOrigin(origins = "*")
    @PostMapping(value = "customers")
    ResponseEntity<List<CustomerDto>> savePurchases(@RequestBody List<CustomerDto> customer){
        try{
            customer = customerServiceImplementation.saveCustomer(customer);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
