package com.shri.billing.service;

import com.shri.billing.dto.CustomerDto;
import com.shri.billing.dto.LookUpDto;
import com.shri.billing.dto.PurchaseDto;
import com.shri.billing.entity.Customer;
import com.shri.billing.entity.Model;
import com.shri.billing.entity.Purchase;
import com.shri.billing.lookup.Category;
import com.shri.billing.repository.CustomerRepository;
import com.shri.billing.repository.LookUpRepository;
import com.shri.billing.service.impl.CustomerServiceImplementation;
import com.shri.billing.service.impl.LookUpServiceImplementation;
import jakarta.persistence.Tuple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements CustomerServiceImplementation {

    @Autowired private CustomerRepository customerRepository;

    @Override
    public List<CustomerDto> saveCustomer(List<CustomerDto> customers) {
        List<Customer> customerList =new ArrayList<>();
        for(CustomerDto dto :customers){
            Customer customer =new Customer();
            customer.setName(dto.getName());
            customer.setEmail(dto.getEmail());
            customer.setPhone(dto.getPhone());
            customer.setAddress(dto.getAddress());
            customerList.add(customer);
        }
        customerRepository.saveAll(customerList);
        return customers;
    }

}
