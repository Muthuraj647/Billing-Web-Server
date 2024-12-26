package com.shri.billing.service;

import com.shri.billing.dto.LookUpDto;
import com.shri.billing.repository.LookUpRepository;
import com.shri.billing.service.impl.LookUpServiceImplementation;
import com.shri.billing.service.impl.ModelServiceImplementation;
import jakarta.persistence.Tuple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LookUpService implements LookUpServiceImplementation {

    @Autowired private LookUpRepository lookUpRepository;
    @Override
    public List<LookUpDto> getAllLookUpGroupNames(String groupNames) {
        List<Tuple> tuples = lookUpRepository.getAllLookUpGroupNames(groupNames);
        List<LookUpDto> lookUps = new ArrayList<>();
        for(Tuple tuple :tuples){
            LookUpDto look =new LookUpDto((String) tuple.get(0), (String) tuple.get(1), (String) tuple.get(2), (String) tuple.get(3));
            lookUps.add(look);
        }
        return lookUps;
    }
}
