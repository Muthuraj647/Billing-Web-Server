package com.shri.billing.service;

import com.shri.billing.dto.ModelDto;
import com.shri.billing.dto.PurchaseDto;
import com.shri.billing.repository.ModelRepository;
import com.shri.billing.service.impl.ModelServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService implements ModelServiceImplementation {

    @Autowired ModelRepository modelRepository;
    @Override
    public List<ModelDto> getModels(Long id, String search,String brand) {
        List<ModelDto> models = modelRepository.getAllModels(id, search == null ? null : "%" + search + "%",brand);
        return models;
    }
}
