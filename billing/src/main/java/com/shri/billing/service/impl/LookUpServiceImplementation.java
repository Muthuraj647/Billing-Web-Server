package com.shri.billing.service.impl;

import com.shri.billing.dto.LookUpDto;

import java.util.List;

public interface LookUpServiceImplementation {
    List<LookUpDto> getAllLookUpGroupNames(String groupNames);
}
