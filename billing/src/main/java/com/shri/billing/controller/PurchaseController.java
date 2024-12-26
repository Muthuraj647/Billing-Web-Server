package com.shri.billing.controller;

import com.shri.billing.dto.LookUpDto;
import com.shri.billing.entity.Purchase;
import com.shri.billing.service.impl.PurchaseServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    @Autowired private PurchaseServiceImplementation purchaseServiceImplementation;

    @GetMapping(value = "purchase")
    ResponseEntity<Object> savePurchase(){
        System.out.printf("Hello World");
        List<LookUpDto> look =new ArrayList<>();
        LookUpDto lo =new LookUpDto("1","2","3","4");
        //look.add(lo);
//        purchase = purchaseServiceImplementation.savePurchase(purchase);
        String s = "Sample";
        return new ResponseEntity<>(lo,HttpStatus.OK);
    }
}
