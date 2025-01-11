package com.shri.billing.service.impl;

import com.shri.billing.dto.CustomerDto;

import java.util.List;

public interface CustomerServiceImplementation {
    List<CustomerDto> saveCustomer(List<CustomerDto> customer);
}
