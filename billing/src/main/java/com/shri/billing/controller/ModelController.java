package com.shri.billing.controller;

import com.shri.billing.dto.ModelDto;
import com.shri.billing.dto.PurchaseDto;
import com.shri.billing.service.impl.ModelServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/model")
public class ModelController {

    @Autowired ModelServiceImplementation modelServiceImplementation;

    @CrossOrigin(origins = "*")
    @GetMapping("/models")
    ResponseEntity<List<ModelDto>> getAllModels(@RequestParam(required = false) Long id,
                                                @RequestParam(required = false) String search,
                                                @RequestParam(required = false) String brand){
        List<ModelDto> models =modelServiceImplementation.getModels(id,search,brand);
        return new ResponseEntity<>(models, HttpStatus.OK);
    }
}
