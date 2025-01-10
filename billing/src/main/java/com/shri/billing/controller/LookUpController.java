package com.shri.billing.controller;

import com.shri.billing.dto.LookUpDto;
import com.shri.billing.service.impl.LookUpServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("conf")
public class LookUpController {

    @Autowired private LookUpServiceImplementation lookUpServiceImplementation;

    @CrossOrigin(origins = "*")
    @GetMapping(value="/look-up")
    ResponseEntity<List<LookUpDto>> getLookUpByGroupNames(@RequestParam(required = false) String groupNames){
        List<LookUpDto> lookUps=lookUpServiceImplementation.getAllLookUpGroupNames(groupNames);
        return new ResponseEntity<>(lookUps,HttpStatus.OK);
    }

}
