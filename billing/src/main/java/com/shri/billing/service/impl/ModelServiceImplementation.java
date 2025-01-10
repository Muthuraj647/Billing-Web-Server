package com.shri.billing.service.impl;

import com.shri.billing.dto.ModelDto;

import java.util.List;

public interface ModelServiceImplementation {
    List<ModelDto> getModels(Long id, String search,String brand);
}
